// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class DescribeDiagnosisRecordsRequest extends TeaModel {
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("QueryCondition")
    public String queryCondition;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("MinPeakMemory")
    public Long minPeakMemory;

    @NameInMap("MaxPeakMemory")
    public Long maxPeakMemory;

    @NameInMap("MinScanSize")
    public Long minScanSize;

    @NameInMap("MaxScanSize")
    public Long maxScanSize;

    @NameInMap("ResourceGroup")
    public String resourceGroup;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("Database")
    public String database;

    @NameInMap("ClientIp")
    public String clientIp;

    @NameInMap("Order")
    public String order;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PatternId")
    public Long patternId;

    public static DescribeDiagnosisRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDiagnosisRecordsRequest self = new DescribeDiagnosisRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDiagnosisRecordsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDiagnosisRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDiagnosisRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDiagnosisRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDiagnosisRecordsRequest setQueryCondition(String queryCondition) {
        this.queryCondition = queryCondition;
        return this;
    }
    public String getQueryCondition() {
        return this.queryCondition;
    }

    public DescribeDiagnosisRecordsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeDiagnosisRecordsRequest setMinPeakMemory(Long minPeakMemory) {
        this.minPeakMemory = minPeakMemory;
        return this;
    }
    public Long getMinPeakMemory() {
        return this.minPeakMemory;
    }

    public DescribeDiagnosisRecordsRequest setMaxPeakMemory(Long maxPeakMemory) {
        this.maxPeakMemory = maxPeakMemory;
        return this;
    }
    public Long getMaxPeakMemory() {
        return this.maxPeakMemory;
    }

    public DescribeDiagnosisRecordsRequest setMinScanSize(Long minScanSize) {
        this.minScanSize = minScanSize;
        return this;
    }
    public Long getMinScanSize() {
        return this.minScanSize;
    }

    public DescribeDiagnosisRecordsRequest setMaxScanSize(Long maxScanSize) {
        this.maxScanSize = maxScanSize;
        return this;
    }
    public Long getMaxScanSize() {
        return this.maxScanSize;
    }

    public DescribeDiagnosisRecordsRequest setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    public DescribeDiagnosisRecordsRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public DescribeDiagnosisRecordsRequest setDatabase(String database) {
        this.database = database;
        return this;
    }
    public String getDatabase() {
        return this.database;
    }

    public DescribeDiagnosisRecordsRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeDiagnosisRecordsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeDiagnosisRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDiagnosisRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDiagnosisRecordsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDiagnosisRecordsRequest setPatternId(Long patternId) {
        this.patternId = patternId;
        return this;
    }
    public Long getPatternId() {
        return this.patternId;
    }

}
