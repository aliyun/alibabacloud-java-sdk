// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateDataCronClearOrderShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the ticket.</p>
     */
    @NameInMap("AttachmentKey")
    public String attachmentKey;

    /**
     * <p>Indicates whether the database is a logical database. Valid values:</p>
     * <br>
     * <p>*   **true**: The database is a logical database.</p>
     * <p>*   **false**: The database is not a logical database.</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>The databases for which you want to clear historical data.</p>
     */
    @NameInMap("Param")
    public String paramShrink;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  The ID of the tenant is displayed when you move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the [View information about the current tenant](~~181330~~) section of the Manage DMS tenants topic.</p>
     */
    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    /**
     * <p>The reason for the data change.</p>
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
