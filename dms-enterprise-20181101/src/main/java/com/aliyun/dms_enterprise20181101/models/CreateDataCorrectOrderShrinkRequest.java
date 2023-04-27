// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCorrectOrderShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the ticket.</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <br>
     * <p>*   **true**: The database is a logical database.</p>
     * <p>*   **false**: The database is a physical database.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The databases in which you want to change data.</p>
     */
    @NameInMap("Param")
    public String paramShrink;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.</p>
     */
    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    /**
     * <p>The estimated number of data rows to be affected by the data change.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CreateDataCorrectOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataCorrectOrderShrinkRequest self = new CreateDataCorrectOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataCorrectOrderShrinkRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateDataCorrectOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateDataCorrectOrderShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public CreateDataCorrectOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateDataCorrectOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
