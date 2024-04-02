// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypeTextLibRequest extends TeaModel {
    @NameInMap("BizTypeName")
    public String bizTypeName;

    @NameInMap("ResourceType")
    public String resourceType;

    @NameInMap("Scene")
    public String scene;

    public static DescribeBizTypeTextLibRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypeTextLibRequest self = new DescribeBizTypeTextLibRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypeTextLibRequest setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName;
        return this;
    }
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    public DescribeBizTypeTextLibRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeBizTypeTextLibRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
