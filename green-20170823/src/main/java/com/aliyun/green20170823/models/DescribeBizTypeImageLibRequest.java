// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypeImageLibRequest extends TeaModel {
    @NameInMap("BizTypeName")
    public String bizTypeName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scene")
    public String scene;

    public static DescribeBizTypeImageLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypeImageLibRequest self = new DescribeBizTypeImageLibRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypeImageLibRequest setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName;
        return this;
    }
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    public DescribeBizTypeImageLibRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeBizTypeImageLibRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
