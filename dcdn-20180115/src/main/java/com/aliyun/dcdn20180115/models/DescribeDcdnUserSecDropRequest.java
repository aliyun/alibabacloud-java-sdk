// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Data")
    public String data;

    @NameInMap("SecFunc")
    public String secFunc;

    @NameInMap("Metric")
    public String metric;

    public static DescribeDcdnUserSecDropRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserSecDropRequest self = new DescribeDcdnUserSecDropRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserSecDropRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnUserSecDropRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeDcdnUserSecDropRequest setSecFunc(String secFunc) {
        this.secFunc = secFunc;
        return this;
    }
    public String getSecFunc() {
        return this.secFunc;
    }

    public DescribeDcdnUserSecDropRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

}
