// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeBizTypeSettingRequest extends TeaModel {
    @NameInMap("BizTypeName")
    public String bizTypeName;

    @NameInMap("ResourceType")
    public String resourceType;

    public static DescribeBizTypeSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBizTypeSettingRequest self = new DescribeBizTypeSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBizTypeSettingRequest setBizTypeName(String bizTypeName) {
        this.bizTypeName = bizTypeName;
        return this;
    }
    public String getBizTypeName() {
        return this.bizTypeName;
    }

    public DescribeBizTypeSettingRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
