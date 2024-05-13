// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCronClearOrderShrinkRequest extends TeaModel {
    /**
     * <p>The key of the attachment for the ticket. The attachment provides more instructions for this operation.</p>
     * <br>
     * <p>You can call the [GetUserUploadFileJob](https://help.aliyun.com/document_detail/206069.html) operation to query the key of the attachment.</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>The purpose or objective of the data change. This reduces unnecessary communication.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The parameters of the ticket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Param")
    public String paramShrink;

    /**
     * <p>The stakeholders of this operation. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than Data Management (DMS) administrators and database administrators (DBAs) are not allowed to view the ticket details.</p>
     */
    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  The ID of the tenant is displayed when you move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the [View information about the current tenant](https://help.aliyun.com/document_detail/181330.html) section of the Manage DMS tenants topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateDataCronClearOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCronClearOrderShrinkRequest self = new CreateDataCronClearOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataCronClearOrderShrinkRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataCronClearOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataCronClearOrderShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public CreateDataCronClearOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateDataCronClearOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
