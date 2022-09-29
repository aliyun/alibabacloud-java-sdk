// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchBodyTraceShrinkRequest extends TeaModel {
    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("Images")
    public String imagesShrink;

    @NameInMap("Limit")
    public Long limit;

    @NameInMap("MinScore")
    public Float minScore;

    public static SearchBodyTraceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchBodyTraceShrinkRequest self = new SearchBodyTraceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SearchBodyTraceShrinkRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public SearchBodyTraceShrinkRequest setImagesShrink(String imagesShrink) {
        this.imagesShrink = imagesShrink;
        return this;
    }
    public String getImagesShrink() {
        return this.imagesShrink;
    }

    public SearchBodyTraceShrinkRequest setLimit(Long limit) {
        this.limit = limit;
        return this;
    }
    public Long getLimit() {
        return this.limit;
    }

    public SearchBodyTraceShrinkRequest setMinScore(Float minScore) {
        this.minScore = minScore;
        return this;
    }
    public Float getMinScore() {
        return this.minScore;
    }

}
