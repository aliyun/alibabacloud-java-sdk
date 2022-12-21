// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCronClearOrderShrinkRequest extends TeaModel {
    // The key of the attachment for the ticket. The attachment provides more instructions for this operation.
    // 
    // You can call the [GetUserUploadFileJob](~~206069~~) operation to query the key of the attachment.
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    // The purpose or objective of the data change. This reduces unnecessary communication.
    @NameInMap("Comment")
    public String comment;

    // The parameters of the ticket.
    @NameInMap("Param")
    public String paramShrink;

    // The stakeholders of this operation. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than Data Management (DMS) administrators and database administrators (DBAs) are not allowed to view the ticket details.
    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    // The ID of the tenant.
    // 
    // >  The ID of the tenant is displayed when you move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the [View information about the current tenant](~~181330~~) section of the Manage DMS tenants topic.
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
