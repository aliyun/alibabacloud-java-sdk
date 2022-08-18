// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribePdnsThreatStatisticsRequest extends TeaModel {
    @NameInMap("Direction")
    public String direction;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("OrderBy")
    public String orderBy;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("SubDomain")
    public String subDomain;

    @NameInMap("ThreatLevel")
    public String threatLevel;

    @NameInMap("ThreatSourceIp")
    public String threatSourceIp;

    @NameInMap("ThreatType")
    public String threatType;

    @NameInMap("Type")
    public String type;

    public static DescribePdnsThreatStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePdnsThreatStatisticsRequest self = new DescribePdnsThreatStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePdnsThreatStatisticsRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribePdnsThreatStatisticsRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribePdnsThreatStatisticsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DescribePdnsThreatStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribePdnsThreatStatisticsRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }
    public String getOrderBy() {
        return this.orderBy;
    }

    public DescribePdnsThreatStatisticsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribePdnsThreatStatisticsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePdnsThreatStatisticsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DescribePdnsThreatStatisticsRequest setSubDomain(String subDomain) {
        this.subDomain = subDomain;
        return this;
    }
    public String getSubDomain() {
        return this.subDomain;
    }

    public DescribePdnsThreatStatisticsRequest setThreatLevel(String threatLevel) {
        this.threatLevel = threatLevel;
        return this;
    }
    public String getThreatLevel() {
        return this.threatLevel;
    }

    public DescribePdnsThreatStatisticsRequest setThreatSourceIp(String threatSourceIp) {
        this.threatSourceIp = threatSourceIp;
        return this;
    }
    public String getThreatSourceIp() {
        return this.threatSourceIp;
    }

    public DescribePdnsThreatStatisticsRequest setThreatType(String threatType) {
        this.threatType = threatType;
        return this;
    }
    public String getThreatType() {
        return this.threatType;
    }

    public DescribePdnsThreatStatisticsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
