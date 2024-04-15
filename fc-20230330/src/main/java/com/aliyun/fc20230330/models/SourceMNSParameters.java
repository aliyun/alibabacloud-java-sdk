// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class SourceMNSParameters extends TeaModel {
    @NameInMap("IsBase64Decode")
    public Boolean isBase64Decode;

    @NameInMap("QueueName")
    public String queueName;

    @NameInMap("RegionId")
    public String regionId;

    public static SourceMNSParameters build(java.util.Map<String, ?> map) throws Exception {
        SourceMNSParameters self = new SourceMNSParameters();
        return TeaModel.build(map, self);
    }

    public SourceMNSParameters setIsBase64Decode(Boolean isBase64Decode) {
        this.isBase64Decode = isBase64Decode;
        return this;
    }
    public Boolean getIsBase64Decode() {
        return this.isBase64Decode;
    }

    public SourceMNSParameters setQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }
    public String getQueueName() {
        return this.queueName;
    }

    public SourceMNSParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
