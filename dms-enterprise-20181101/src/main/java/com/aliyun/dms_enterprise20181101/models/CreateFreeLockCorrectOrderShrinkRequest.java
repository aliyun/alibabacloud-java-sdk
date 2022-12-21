// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateFreeLockCorrectOrderShrinkRequest extends TeaModel {
    // The key of the attachment that provides more instructions for the ticket. You can call the [GetUserUploadFileJob](~~206069~~) operation to obtain the attachment key from the value of the AttachmentKey parameter.
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    // The purpose or objective of the data change. This parameter is used to help reduce unnecessary communication.
    @NameInMap("Comment")
    public String comment;

    // The parameters of the ticket.
    @NameInMap("Param")
    public String paramShrink;

    // The stakeholders of the data change. All stakeholders can view the ticket details and assist in the approval process. Irrelevant users other than DMS administrators and database administrators (DBAs) are not allowed to view the ticket details.
    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    public static CreateFreeLockCorrectOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFreeLockCorrectOrderShrinkRequest self = new CreateFreeLockCorrectOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFreeLockCorrectOrderShrinkRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateFreeLockCorrectOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateFreeLockCorrectOrderShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public CreateFreeLockCorrectOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateFreeLockCorrectOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
