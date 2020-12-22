// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class SearchBodyTraceShrinkRequest extends TeaModel {
    // 数据库ID
    @NameInMap("DbId")
    public Long dbId;

    // Trace图片信息列表
    @NameInMap("Images")
    public String imagesShrink;

    // 结果Trace数量上限，默认10，取值范围[1, 100]
    @NameInMap("Limit")
    public Long limit;

    // score阈值，只返回大于等于该score的数据，取值范围[-1.0, 1.0]，默认为空
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
