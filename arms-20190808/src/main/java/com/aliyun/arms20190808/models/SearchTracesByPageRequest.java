// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTracesByPageRequest extends TeaModel {
    // The end of the time range to query. Unit: milliseconds.
    @NameInMap("EndTime")
    public Long endTime;

    // The filter conditions.
    @NameInMap("ExclusionFilters")
    public java.util.List<SearchTracesByPageRequestExclusionFilters> exclusionFilters;

    // The minimum amount of time consumed by traces. Unit: milliseconds.
    @NameInMap("MinDuration")
    public Long minDuration;

    // The name of the traced span.
    @NameInMap("OperationName")
    public String operationName;

    // The number of the page to return.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of entries to return on each page. Maximum value: 100.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the application.
    @NameInMap("Pid")
    public String pid;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    // Specifies whether to sort the query results in chronological order or reverse chronological order. Default value: `false`.
    // 
    // *   `true`: sorts the query results in reverse chronological order.
    // *   `false`: sorts the query results in chronological order.
    @NameInMap("Reverse")
    public Boolean reverse;

    // The IP address of the host where the application resides.
    @NameInMap("ServiceIp")
    public String serviceIp;

    // The name of the application.
    @NameInMap("ServiceName")
    public String serviceName;

    // The beginning of the time range to query. Unit: milliseconds.
    @NameInMap("StartTime")
    public Long startTime;

    // The tags of the instances you want to query.
    @NameInMap("Tags")
    public java.util.List<SearchTracesByPageRequestTags> tags;

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

    public SearchTracesByPageRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
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

    public SearchTracesByPageRequest setTags(java.util.List<SearchTracesByPageRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<SearchTracesByPageRequestTags> getTags() {
        return this.tags;
    }

    public static class SearchTracesByPageRequestExclusionFilters extends TeaModel {
        // The key that is used to filter the query results.
        @NameInMap("Key")
        public String key;

        // The value of the key that is used to filter the query results.
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

    public static class SearchTracesByPageRequestTags extends TeaModel {
        // The key of the tag.
        @NameInMap("Key")
        public String key;

        // The value of the tag.
        @NameInMap("Value")
        public String value;

        public static SearchTracesByPageRequestTags build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesByPageRequestTags self = new SearchTracesByPageRequestTags();
            return TeaModel.build(map, self);
        }

        public SearchTracesByPageRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchTracesByPageRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
