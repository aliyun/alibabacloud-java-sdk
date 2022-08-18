// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsThreatLogsRequest extends TeaModel {
    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("ThreatLevel")
    public String threatLevel;

    @NameInMap("ThreatSourceIp")
    public String threatSourceIp;

    @NameInMap("ThreatType")
    public String threatType;

    public static DescribePdnsThreatLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsThreatLogsRequest self = new DescribePdnsThreatLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePdnsThreatLogsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribePdnsThreatLogsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribePdnsThreatLogsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePdnsThreatLogsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePdnsThreatLogsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePdnsThreatLogsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribePdnsThreatLogsRequest setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public String getThreatLevel() {
        return this.threatLevel;
    }

    public DescribePdnsThreatLogsRequest setThreatSourceIp(String threatSourceIp) {
        this.threatSourceIp = threatSourceIp;
        return this;
    }
    public String getThreatSourceIp() {
        return this.threatSourceIp;
    }

    public DescribePdnsThreatLogsRequest setThreatType(String threatType) {
        this.threatType = threatType;
        return this;
    }
    public String getThreatType() {
        return this.threatType;
    }

}
