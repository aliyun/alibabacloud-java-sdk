// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohUserInfoRequest extends TeaModel {
    /**
     * <p>The end date of the query. Use the \<code>YYYY-MM-DD\\</code> format.</p>
     * <p>If you do not specify this parameter, the current date is used.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The start date of the query. Use the \<code>YYYY-MM-DD\\</code> format.</p>
     * <p>You can query data from the last 90 days. The date must be within the last 90 days.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-07-04</p>
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
