// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeBgpPackElasticThresholdResponseBody extends TeaModel {
    @NameInMap("MaxThreshold")
    public Integer maxThreshold;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Openable")
    public Boolean openable;

    public static DescribeBgpPackElasticThresholdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBgpPackElasticThresholdResponseBody self = new DescribeBgpPackElasticThresholdResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBgpPackElasticThresholdResponseBody setMaxThreshold(Integer maxThreshold) {
        this.maxThreshold = maxThreshold;
        return this;
    }
    public Integer getMaxThreshold() {
        return this.maxThreshold;
    }

    public DescribeBgpPackElasticThresholdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBgpPackElasticThresholdResponseBody setOpenable(Boolean openable) {
        this.openable = openable;
        return this;
    }
    public Boolean getOpenable() {
        return this.openable;
    }

}
