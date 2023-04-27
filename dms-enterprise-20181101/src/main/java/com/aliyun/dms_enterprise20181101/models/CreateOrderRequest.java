// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    /**
     * <p>test_AttachmentKey</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The key of an attachment that is returned after the attachment is uploaded. You can call the [GetUserUploadFileJob](~~206069~~) operation to query the key of the attachment.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("PluginParam")
    public java.util.Map<String, ?> pluginParam;

    /**
     * <p>The ID of the ticket.</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    /**
     * <p>The IDs of the stakeholders that are involved in the ticket. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("RelatedUserList")
    public String relatedUserList;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderRequest self = new CreateOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrderRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateOrderRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateOrderRequest setPluginParam(java.util.Map<String, ?> pluginParam) {
        this.pluginParam = pluginParam;
        return this;
    }
    public java.util.Map<String, ?> getPluginParam() {
        return this.pluginParam;
    }

    public CreateOrderRequest setPluginType(String pluginType) {
        this.pluginType = pluginType;
        return this;
    }
    public String getPluginType() {
        return this.pluginType;
    }

    public CreateOrderRequest setRelatedUserList(String relatedUserList) {
        this.relatedUserList = relatedUserList;
        return this;
    }
    public String getRelatedUserList() {
        return this.relatedUserList;
    }

    public CreateOrderRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
