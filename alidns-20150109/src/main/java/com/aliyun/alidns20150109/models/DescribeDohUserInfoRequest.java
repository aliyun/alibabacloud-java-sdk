// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDohUserInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    public static DescribeDohUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDohUserInfoRequest self = new DescribeDohUserInfoRequest();
        return TeaModel.build(map, self);
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

    public DescribeDohUserInfoRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

}
