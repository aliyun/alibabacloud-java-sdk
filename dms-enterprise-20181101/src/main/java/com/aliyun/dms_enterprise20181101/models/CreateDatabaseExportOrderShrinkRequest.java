// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDatabaseExportOrderShrinkRequest extends TeaModel {
    /**
     * <p>The key of the attachment that provides more instructions for the ticket. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key.</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The purpose or objective of the ticket. This parameter helps reduce unnecessary communication.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the parent ticket.</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The parameters of the ticket.</p>
     */
    @NameInMap("PluginParam")
    public String pluginParamShrink;

    /**
     * <p>The stakeholders involved in this operation.</p>
     */
    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    /**
     * <p>The tenant ID.</p>
     * <br>
     * <p>> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the [View information about the current tenant](~~181330~~) section of the "Manage DMS tenants" topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateDatabaseExportOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatabaseExportOrderShrinkRequest self = new CreateDatabaseExportOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatabaseExportOrderShrinkRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDatabaseExportOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDatabaseExportOrderShrinkRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateDatabaseExportOrderShrinkRequest setPluginParamShrink(String pluginParamShrink) {
        this.pluginParamShrink = pluginParamShrink;
        return this;
    }
    public String getPluginParamShrink() {
        return this.pluginParamShrink;
    }

    public CreateDatabaseExportOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateDatabaseExportOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
