// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeTextLibRequest extends TeaModel {
    @NameInMap("BizTypeName")
    public String bizTypeName;

    @NameInMap("Black")
    public String black;

    @NameInMap("Ignore")
    public String ignore;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Review")
    public String review;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("White")
    public String white;

    public static UpdateBizTypeTextLibRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeTextLibRequest self = new UpdateBizTypeTextLibRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeTextLibRequest setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName;
        return this;
    }
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    public UpdateBizTypeTextLibRequest setBlack(String black) {
        this.black = black;
        return this;
    }
    public String getBlack() {
        return this.black;
    }

    public UpdateBizTypeTextLibRequest setIgnore(String ignore) {
        this.ignore = ignore;
        return this;
    }
    public String getIgnore() {
        return this.ignore;
    }

    public UpdateBizTypeTextLibRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateBizTypeTextLibRequest setReview(String review) {
        this.review = review;
        return this;
    }
    public String getReview() {
        return this.review;
    }

    public UpdateBizTypeTextLibRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public UpdateBizTypeTextLibRequest setWhite(String white) {
        this.white = white;
        return this;
    }
    public String getWhite() {
        return this.white;
    }

}
