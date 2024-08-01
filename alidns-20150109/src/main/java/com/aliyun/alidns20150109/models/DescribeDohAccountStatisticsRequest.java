// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohAccountStatisticsRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Specify the time in the YYYY-MM-DD format.</p>
     * <p>The default value is the day when you perform the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language type.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The beginning of the time range to query. Specify the time in the YYYY-MM-DD format.</p>
     * <p>You can query only the DNS records of the latest 90 days.<code>The value of StartDate must be greater than or equal to the difference between the current date and 90</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
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
