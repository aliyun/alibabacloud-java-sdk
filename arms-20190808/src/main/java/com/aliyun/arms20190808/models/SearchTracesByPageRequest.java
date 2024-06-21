// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTracesByPageRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1595210400000</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("ExclusionFilters")
    public java.util.List<SearchTracesByPageRequestExclusionFilters> exclusionFilters;

    /**
     * <p>Specifies whether to include the traces of abnormal calls.</p>
     * <ul>
     * <li><code>true</code>: No</li>
     * <li><code>false</code> (default): Yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsError")
    public Boolean isError;

    /**
     * <p>The minimum amount of time consumed by traces. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MinDuration")
    public Long minDuration;

    /**
     * <p>The name of the traced span.</p>
     * 
     * <strong>example:</strong>
     * <p>/demo/queryNotExistDB/11</p>
     */
    @NameInMap("OperationName")
    public String operationName;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>b590lhguqs@9781be0f44dXXXX</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to sort the query results in chronological order or reverse chronological order. Default value: <code>false</code>.</p>
     * <ul>
     * <li><code>true</code>: sorts the query results in reverse chronological order.</li>
     * <li><code>false</code>: sorts the query results in chronological order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The IP address of the host where the application resides.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.XX.XX</p>
     */
    @NameInMap("ServiceIp")
    public String serviceIp;

    /**
     * <p>The name of the application.</p>
     * 
     * <strong>example:</strong>
     * <p>arms-k8s-demo-subcomponent</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1595174400000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The tags.</p>
     */
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

    public SearchTracesByPageRequest setIsError(Boolean isError) {
        this.isError = isError;
        return this;
    }
    public Boolean getIsError() {
        return this.isError;
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
        /**
         * <p>The key that is used to filter the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>http.status_code</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the key that is used to filter the query results.</p>
         * 
         * <strong>example:</strong>
         * <p>404</p>
         */
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
        /**
         * <p>The key of the tag. The following system preset fields are provided:</p>
         * <ul>
         * <li>traceId: the ID of the trace.</li>
         * <li>serverApp: the name of the server application.</li>
         * <li>clientApp: the name of the client application.</li>
         * <li>service: the name of the API operation.</li>
         * <li>rpc: the type of the call.</li>
         * <li>msOfSpan: the duration exceeds a specific value.</li>
         * <li>clientIp: the IP address of the client.</li>
         * <li>serverIp: the IP address of the server.</li>
         * <li>isError: specifies whether the call is abnormal.</li>
         * <li>hasTprof: contains only thread profiling.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http.status_code</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
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
