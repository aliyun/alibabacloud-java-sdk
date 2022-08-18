// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohAccountStatisticsRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartDate")
    public String startDate;

    public static DescribeDohAccountStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohAccountStatisticsRequest self = new DescribeDohAccountStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDohAccountStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeDohAccountStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDohAccountStatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
