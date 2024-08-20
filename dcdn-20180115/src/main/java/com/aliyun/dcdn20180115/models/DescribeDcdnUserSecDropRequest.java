// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropRequest extends TeaModel {
    /**
     * <p>The date or month that you want to query.</p>
     * <ul>
     * <li>If data is collected every day, set Data in the format of yyyymmdd, such as 20201203.</li>
     * <li>If data is collected every month, set Data in the format of yyyymm, such as 202012.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20201203</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The time interval at which data is collected.</p>
     * <ul>
     * <li>If data is collected every day, the number of blocked packets on the specified day is calculated.</li>
     * <li>If data is collected every month, the number of blocked packets in the specified month is calculated.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1day</p>
     */
    @NameInMap("Metric")
    public String metric;

    /**
     * <p>The security feature. Valid values:</p>
     * <ul>
     * <li>waf: WAF</li>
     * <li>tmd: rate limiting</li>
     * <li>robot: bot traffic recognition</li>
     * <li>l4_dm_drop: domain name blocking at Layer 4</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf</p>
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
