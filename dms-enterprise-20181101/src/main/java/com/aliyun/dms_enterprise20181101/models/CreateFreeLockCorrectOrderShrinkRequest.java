// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateFreeLockCorrectOrderShrinkRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    @NameInMap("Param")
    public String paramShrink;

    @NameInMap("AttachmentKey")
    public String attachmentKey;

    @NameInMap("Tid")
    public Long tid;

    public static CreateFreeLockCorrectOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFreeLockCorrectOrderShrinkRequest self = new CreateFreeLockCorrectOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFreeLockCorrectOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateFreeLockCorrectOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateFreeLockCorrectOrderShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public CreateFreeLockCorrectOrderShrinkRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateFreeLockCorrectOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
