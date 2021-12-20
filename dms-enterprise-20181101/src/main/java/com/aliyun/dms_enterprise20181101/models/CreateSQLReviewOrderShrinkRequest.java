// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateSQLReviewOrderShrinkRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Param")
    public String paramShrink;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RelatedUserList")
    public String relatedUserListShrink;

    @NameInMap("Tid")
    public Long tid;

    public static CreateSQLReviewOrderShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSQLReviewOrderShrinkRequest self = new CreateSQLReviewOrderShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSQLReviewOrderShrinkRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CreateSQLReviewOrderShrinkRequest setParamShrink(String paramShrink) {
        this.paramShrink = paramShrink;
        return this;
    }
    public String getParamShrink() {
        return this.paramShrink;
    }

    public CreateSQLReviewOrderShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSQLReviewOrderShrinkRequest setRelatedUserListShrink(String relatedUserListShrink) {
        this.relatedUserListShrink = relatedUserListShrink;
        return this;
    }
    public String getRelatedUserListShrink() {
        return this.relatedUserListShrink;
    }

    public CreateSQLReviewOrderShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
