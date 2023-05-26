// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class SearchTracesRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. Unit: milliseconds.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The filter conditions.</p>
     */
    @NameInMap("ExclusionFilters")
    public java.util.List<SearchTracesRequestExclusionFilters> exclusionFilters;

    /**
     * <p>The minimum amount of time consumed by traces. Unit: milliseconds.</p>
     */
    @NameInMap("MinDuration")
    public Long minDuration;

    /**
     * <p>The name of the traced span.</p>
     */
    @NameInMap("OperationName")
    public String operationName;

    /**
     * <p>The application ID.</p>
     */
    @NameInMap("Pid")
    public String pid;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to sort the query results in chronological order or reverse chronological order. Default value: `false`.</p>
     * <br>
     * <p>*   `true`: sorts the query results in reverse chronological order.</p>
     * <p>*   `false`: sorts the query results in chronological order.</p>
     */
    @NameInMap("Reverse")
    public Boolean reverse;

    /**
     * <p>The IP address of the host where the application resides.</p>
     */
    @NameInMap("ServiceIp")
    public String serviceIp;

    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("ServiceName")
    public String serviceName;

    /**
     * <p>The beginning of the time range to query. Unit: milliseconds.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<SearchTracesRequestTag> tag;

    public static SearchTracesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchTracesRequest self = new SearchTracesRequest();
        return TeaModel.build(map, self);
    }

    public SearchTracesRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public SearchTracesRequest setExclusionFilters(java.util.List<SearchTracesRequestExclusionFilters> exclusionFilters) {
        this.exclusionFilters = exclusionFilters;
        return this;
    }
    public java.util.List<SearchTracesRequestExclusionFilters> getExclusionFilters() {
        return this.exclusionFilters;
    }

    public SearchTracesRequest setMinDuration(Long minDuration) {
        this.minDuration = minDuration;
        return this;
    }
    public Long getMinDuration() {
        return this.minDuration;
    }

    public SearchTracesRequest setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }
    public String getOperationName() {
        return this.operationName;
    }

    public SearchTracesRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public SearchTracesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SearchTracesRequest setReverse(Boolean reverse) {
        this.reverse = reverse;
        return this;
    }
    public Boolean getReverse() {
        return this.reverse;
    }

    public SearchTracesRequest setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
        return this;
    }
    public String getServiceIp() {
        return this.serviceIp;
    }

    public SearchTracesRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public SearchTracesRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SearchTracesRequest setTag(java.util.List<SearchTracesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<SearchTracesRequestTag> getTag() {
        return this.tag;
    }

    public static class SearchTracesRequestExclusionFilters extends TeaModel {
        /**
         * <p>The key that is used to filter the query results.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the key that is used to filter the query results.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SearchTracesRequestExclusionFilters build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesRequestExclusionFilters self = new SearchTracesRequestExclusionFilters();
            return TeaModel.build(map, self);
        }

        public SearchTracesRequestExclusionFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchTracesRequestExclusionFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SearchTracesRequestTag extends TeaModel {
        /**
         * <p>The tag key. The following system preset fields are provided:</p>
         * <br>
         * <p>*   serverApp: the name of the server application.</p>
         * <p>*   clientApp: the name of the client application.</p>
         * <p>*   service: the name of the operation.</p>
         * <p>*   rpc: the type of the call.</p>
         * <p>*   msOfSpan: the duration exceeds a specific value.</p>
         * <p>*   clientIp: the IP address of the client.</p>
         * <p>*   serverIp: the IP address of the server.</p>
         * <p>*   isError: specifies whether the call is abnormal.</p>
         * <p>*   hasTprof: contains only thread profiling.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static SearchTracesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            SearchTracesRequestTag self = new SearchTracesRequestTag();
            return TeaModel.build(map, self);
        }

        public SearchTracesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SearchTracesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
