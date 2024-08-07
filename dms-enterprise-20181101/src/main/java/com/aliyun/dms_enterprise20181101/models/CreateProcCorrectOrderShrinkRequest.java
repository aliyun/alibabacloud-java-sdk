// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateProcCorrectOrderShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>order_attachment.txt</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Param")
    public String paramShrink;

    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    /**
     * <strong>example:</strong>
     * <p>4***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateProcCorrectOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateProcCorrectOrderShrinkRequest self = new CreateProcCorrectOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateProcCorrectOrderShrinkRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateProcCorrectOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateProcCorrectOrderShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public CreateProcCorrectOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateProcCorrectOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
