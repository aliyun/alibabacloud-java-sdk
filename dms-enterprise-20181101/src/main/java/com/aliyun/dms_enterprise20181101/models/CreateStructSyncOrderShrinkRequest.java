// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateStructSyncOrderShrinkRequest extends TeaModel {
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>Specifies whether to skip an error that occurs in executing an SQL statement. Valid values:</p>
     * <br>
     * <p>*   **true**: continues to execute subsequent SQL statements if an error occurs in executing an SQL statement.</p>
     * <p>*   **false**: stops executing subsequent SQL statements if an error occurs in executing an SQL statement.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The name of the source table.</p>
     */
    @NameInMap("Param")
    public String paramShrink;

    /**
     * <p>The information about the table of which you want to synchronize the schema.</p>
     */
    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    @NameInMap("Tid")
    public Long tid;

    public static CreateStructSyncOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStructSyncOrderShrinkRequest self = new CreateStructSyncOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateStructSyncOrderShrinkRequest setAttachmentKey(String attachmentKey) {
        this.attachmentKey = attachmentKey;
        return this;
    }
    public String getAttachmentKey() {
        return this.attachmentKey;
    }

    public CreateStructSyncOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateStructSyncOrderShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public CreateStructSyncOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateStructSyncOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
