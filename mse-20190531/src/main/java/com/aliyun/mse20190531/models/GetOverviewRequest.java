// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetOverviewRequest extends TeaModel {
    // The language of the response. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    // The subscription period of the instance. Unit: months. Valid values: 1, 2, 3, 6, and 12.
    @NameInMap("Period")
    public Integer period;

    // The region ID.
    @NameInMap("Region")
    public String region;

    public static GetOverviewRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOverviewRequest self = new GetOverviewRequest();
        return TeaModel.build(map, self);
    }

    public GetOverviewRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public GetOverviewRequest setPeriod(Integer period) {
        this.period = period;
        return this;
    }
    public Integer getPeriod() {
        return this.period;
    }

    public GetOverviewRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
