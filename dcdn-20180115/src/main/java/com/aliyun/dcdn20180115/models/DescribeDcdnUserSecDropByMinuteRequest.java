// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserSecDropByMinuteRequest extends TeaModel {
    /**
     * <p>The number of the page to return. Pages start from page 1.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     */
    @NameInMap("Object")
    public String object;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The description of HTTP responses.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0. Example: 2006-01-02T15:05:04Z.</p>
     * <br>
     * <p>>  The end time must be later than the start time.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0. Example: 2006-01-02T15:04:04Z.</p>
     */
    @NameInMap("SecFunc")
    public String secFunc;

    /**
     * <p>The language. Valid values: en and zh. Default value: en</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDcdnUserSecDropByMinuteRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserSecDropByMinuteRequest self = new DescribeDcdnUserSecDropByMinuteRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserSecDropByMinuteRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnUserSecDropByMinuteRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDcdnUserSecDropByMinuteRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDcdnUserSecDropByMinuteRequest setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public DescribeDcdnUserSecDropByMinuteRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDcdnUserSecDropByMinuteRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDcdnUserSecDropByMinuteRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeDcdnUserSecDropByMinuteRequest setSecFunc(String secFunc) {
        this.secFunc = secFunc;
        return this;
    }
    public String getSecFunc() {
        return this.secFunc;
    }

    public DescribeDcdnUserSecDropByMinuteRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
