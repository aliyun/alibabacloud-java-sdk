// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropRequest extends TeaModel {
    @NameInMap("Data")
    public String data;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("SecFunc")
    public String secFunc;

    public static DescribeDcdnUserSecDropRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserSecDropRequest self = new DescribeDcdnUserSecDropRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserSecDropRequest setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeDcdnUserSecDropRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeDcdnUserSecDropRequest setSecFunc(String secFunc) {
        this.secFunc = secFunc;
        return this;
    }
    public String getSecFunc() {
        return this.secFunc;
    }

}
