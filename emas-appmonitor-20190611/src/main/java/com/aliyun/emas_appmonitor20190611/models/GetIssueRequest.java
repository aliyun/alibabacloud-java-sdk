// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetIssueRequest extends TeaModel {
    /**
     * <p>AppKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>233588686</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h5Resource</p>
     */
    @NameInMap("BizModule")
    public String bizModule;

    /**
     * <strong>example:</strong>
     * <p>2963475858785631</p>
     */
    @NameInMap("DigestHash")
    public String digestHash;

    @NameInMap("Filter")
    public GetIssueRequestFilter filter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h5</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimeRange")
    public GetIssueRequestTimeRange timeRange;

    public static GetIssueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIssueRequest self = new GetIssueRequest();
        return TeaModel.build(map, self);
    }

    public GetIssueRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetIssueRequest setBizModule(String bizModule) {
        this.bizModule = bizModule;
        return this;
    }
    public String getBizModule() {
        return this.bizModule;
    }

    public GetIssueRequest setDigestHash(String digestHash) {
        this.digestHash = digestHash;
        return this;
    }
    public String getDigestHash() {
        return this.digestHash;
    }

    public GetIssueRequest setFilter(GetIssueRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public GetIssueRequestFilter getFilter() {
        return this.filter;
    }

    public GetIssueRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetIssueRequest setTimeRange(GetIssueRequestTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public GetIssueRequestTimeRange getTimeRange() {
        return this.timeRange;
    }

    public static class GetIssueRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MySQL_IOPS</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>Equal</p>
         */
        @NameInMap("Operator")
        public String operator;

        @NameInMap("SubFilters")
        public java.util.List<String> subFilters;

        @NameInMap("Values")
        public java.util.List<?> values;

        public static GetIssueRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetIssueRequestFilter self = new GetIssueRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetIssueRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetIssueRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetIssueRequestFilter setSubFilters(java.util.List<String> subFilters) {
            this.subFilters = subFilters;
            return this;
        }
        public java.util.List<String> getSubFilters() {
            return this.subFilters;
        }

        public GetIssueRequestFilter setValues(java.util.List<?> values) {
            this.values = values;
            return this;
        }
        public java.util.List<?> getValues() {
            return this.values;
        }

    }

    public static class GetIssueRequestTimeRange extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2024-08-23T02:12:00Z</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>Host</p>
         */
        @NameInMap("Granularity")
        public Integer granularity;

        /**
         * <strong>example:</strong>
         * <p>minute</p>
         */
        @NameInMap("GranularityUnit")
        public String granularityUnit;

        /**
         * <strong>example:</strong>
         * <p>2024-12-18 00:00:00</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static GetIssueRequestTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetIssueRequestTimeRange self = new GetIssueRequestTimeRange();
            return TeaModel.build(map, self);
        }

        public GetIssueRequestTimeRange setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetIssueRequestTimeRange setGranularity(Integer granularity) {
            this.granularity = granularity;
            return this;
        }
        public Integer getGranularity() {
            return this.granularity;
        }

        public GetIssueRequestTimeRange setGranularityUnit(String granularityUnit) {
            this.granularityUnit = granularityUnit;
            return this;
        }
        public String getGranularityUnit() {
            return this.granularityUnit;
        }

        public GetIssueRequestTimeRange setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
