// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateOrderRequest extends TeaModel {
    /**
     * <p>The key of an attachment that is returned after the attachment is uploaded. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to query the key of the attachment.</p>
     * 
     * <strong>example:</strong>
     * <p>test_AttachmentKey</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The description of the ticket to be created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ticket creation parameter. The value is a JSON string. The value of this parameter differs based on the type of the ticket. For more information, see the <strong>PluginParam parameter</strong> section in this topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{PluginParam_test}</p>
     */
    @NameInMap("PluginParam")
    public java.util.Map<String, ?> pluginParam;

    /**
     * <p>The type of the ticket. For more information, see <a href="https://help.aliyun.com/document_detail/429109.html">PluginType parameter</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_EXPORT</p>
     */
    @NameInMap("PluginType")
    public String pluginType;

    /**
     * <p>The IDs of the stakeholders that are involved in the ticket. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>user1,user2</p>
     */
    @NameInMap("RelatedUserList")
    public String relatedUserList;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> or <a href="https://help.aliyun.com/document_detail/198074.html">ListUserTenants</a> operation to obtain the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
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
