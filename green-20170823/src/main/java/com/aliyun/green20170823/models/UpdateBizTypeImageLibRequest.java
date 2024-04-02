// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateBizTypeImageLibRequest extends TeaModel {
    @NameInMap("BizTypeName")
    public String bizTypeName;

    @NameInMap("Black")
    public String black;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Review")
    public String review;

    @NameInMap("Scene")
    public String scene;

    @NameInMap("White")
    public String white;

    public static UpdateBizTypeImageLibRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateBizTypeImageLibRequest self = new UpdateBizTypeImageLibRequest();
        return TeaModel.build(map, self);
    }

    public UpdateBizTypeImageLibRequest setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName;
        return this;
    }
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    public UpdateBizTypeImageLibRequest setBlack(String black) {
        this.black = black;
        return this;
    }
    public String getBlack() {
        return this.black;
    }

    public UpdateBizTypeImageLibRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UpdateBizTypeImageLibRequest setReview(String review) {
        this.review = review;
        return this;
    }
    public String getReview() {
        return this.review;
    }

    public UpdateBizTypeImageLibRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

    public UpdateBizTypeImageLibRequest setWhite(String white) {
        this.white = white;
        return this;
    }
    public String getWhite() {
        return this.white;
    }

}
