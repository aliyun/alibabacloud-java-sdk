// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20210422.models;

import com.aliyun.tea.*;

public class SearchTracesByPageRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("ExclusionFilters")
    public java.util.List<SearchTracesByPageRequestExclusionFilters> exclusionFilters;

    @NameInMap("MinDuration")
    public Long minDuration;

    @NameInMap("OperationName")
    public String operationName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Reverse")
    public Boolean reverse;

    @NameInMap("ServiceIp")
    public String serviceIp;

    @NameInMap("ServiceName")
    public String serviceName;

    @NameInMap("StartTime")
    public Long startTime;

    public static SearchTracesByPageRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesByPageRequest self = new SearchTracesByPageRequest();
        return TeaModel.build(map, self);
    }

    public SearchTracesByPageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchTracesByPageRequest setExclusionFilters(java.util.List<SearchTracesByPageRequestExclusionFilters> exclusionFilters) {
        this.exclusionFilters = exclusionFilters;
        return this;
    }
    public java.util.List<SearchTracesByPageRequestExclusionFilters> getExclusionFilters() {
        return this.exclusionFilters;
    }

    public SearchTracesByPageRequest setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Long getMinDuration() {
        return this.minDuration;
    }

    public SearchTracesByPageRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public SearchTracesByPageRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public SearchTracesByPageRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public SearchTracesByPageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchTracesByPageRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public SearchTracesByPageRequest setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public SearchTracesByPageRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public SearchTracesByPageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public static class SearchTracesByPageRequestExclusionFilters extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static SearchTracesByPageRequestExclusionFilters build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesByPageRequestExclusionFilters self = new SearchTracesByPageRequestExclusionFilters();
            return TeaModel.build(map, self);
        }

        public SearchTracesByPageRequestExclusionFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchTracesByPageRequestExclusionFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
