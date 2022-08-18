// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsThreatStatisticRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("ThreatSourceIp")
    public String threatSourceIp;

    public static DescribePdnsThreatStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsThreatStatisticRequest self = new DescribePdnsThreatStatisticRequest();
        return TeaModel.build(map, self);
    }

    public DescribePdnsThreatStatisticRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribePdnsThreatStatisticRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePdnsThreatStatisticRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribePdnsThreatStatisticRequest setThreatSourceIp(String threatSourceIp) {
        this.threatSourceIp = threatSourceIp;
        return this;
    }
    public String getThreatSourceIp() {
        return this.threatSourceIp;
    }

}
