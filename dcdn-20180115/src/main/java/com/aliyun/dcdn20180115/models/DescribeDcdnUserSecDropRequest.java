// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropRequest extends TeaModel {
    /**
     * <p>The date or month that you want to query.</p>
     * <br>
     * <p>*   If data is collected every day, set Data in the format of yyyymmdd, such as 20201203.</p>
     * <p>*   If data is collected every month, set Data in the format of yyyymm, such as 202012.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The time interval at which data is collected.</p>
     * <br>
     * <p>*   If data is collected every day, the number of blocked packets on the specified day is calculated.</p>
     * <p>*   If data is collected every month, the number of blocked packets in the specified month is calculated.</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The security feature. Valid values:</p>
     * <br>
     * <p>*   waf: WAF</p>
     * <p>*   tmd: rate limiting</p>
     * <p>*   robot: bot traffic recognition</p>
     * <p>*   l4\_dm_drop: domain name blocking at Layer 4</p>
     */
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
