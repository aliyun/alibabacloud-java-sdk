// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetOverviewRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The query time. Unit: days. For example, if you set this parameter to 30, the governance rules within the last 30 days are queried.</p>
     */
    @NameInMap("Period")
    public Integer period;

    /**
     * <p>The ID of the region.</p>
     */
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
