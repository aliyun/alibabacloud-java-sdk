// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohUserInfoRequest extends TeaModel {
    /**
     * <p>The end time for the query. Format: YYYY-MM-DD</p>
     * <br>
     * <p>If you do not specify this parameter, the default value is the time when you perform the query.</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The start time for the query. Format: YYYY-MM-DD</p>
     * <br>
     * <p>You can query the user information of the last 90 days only. `Set the parameter to a value no earlier than 90 days from the current time`.</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    public static DescribeDohUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohUserInfoRequest self = new DescribeDohUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDohUserInfoRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribeDohUserInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDohUserInfoRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

}
