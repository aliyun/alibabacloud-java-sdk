// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataExportOrderShrinkRequest extends TeaModel {
    /**
     * <p>The key of the attachment that provides more instructions for the ticket. You can call the <a href="https://help.aliyun.com/document_detail/206069.html">GetUserUploadFileJob</a> operation to obtain the attachment key.</p>
     * 
     * <strong>example:</strong>
     * <p>order_attachment.txt</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The purpose or objective of the ticket. This parameter helps reduce unnecessary communication.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>business_test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The ID of the parent ticket.</p>
     * 
     * <strong>example:</strong>
     * <p>877****</p>
     */
    @NameInMap("ParentId")
    public Long parentId;

    /**
     * <p>The parameters of the ticket.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PluginParam")
    public String pluginParamShrink;

    /**
     * <p>The UID of the Alibaba Cloud account that actually calls the API.</p>
     * 
     * <strong>example:</strong>
     * <p>21400447956867****</p>
     */
    @NameInMap("RealLoginUserUid")
    public String realLoginUserUid;

    /**
     * <p>The stakeholders involved in this operation.</p>
     */
    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    /**
     * <p>The tenant ID.</p>
     * <blockquote>
     * <p>To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateDataExportOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataExportOrderShrinkRequest self = new CreateDataExportOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataExportOrderShrinkRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataExportOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataExportOrderShrinkRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

    public CreateDataExportOrderShrinkRequest setPluginParamShrink(String pluginParamShrink) {
        this.pluginParamShrink = pluginParamShrink;
        return this;
    }
    public String getPluginParamShrink() {
        return this.pluginParamShrink;
    }

    public CreateDataExportOrderShrinkRequest setRealLoginUserUid(String realLoginUserUid) {
        this.realLoginUserUid = realLoginUserUid;
        return this;
    }
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
    }

    public CreateDataExportOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateDataExportOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
