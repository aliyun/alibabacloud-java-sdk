// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_appmonitor20190611.models;

import com.aliyun.tea.*;

public class GetErrorsRequest extends TeaModel {
    /**
     * <p>appKey</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>24780725</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crash</p>
     */
    @NameInMap("BizModule")
    public String bizModule;

    /**
     * <strong>example:</strong>
     * <p>-3481243636390427020</p>
     */
    @NameInMap("DigestHash")
    public String digestHash;

    @NameInMap("Filter")
    public GetErrorsRequestFilter filter;

    /**
     * <strong>example:</strong>
     * <p>android</p>
     */
    @NameInMap("Os")
    public String os;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageIndex")
    public Integer pageIndex;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TimeRange")
    public GetErrorsRequestTimeRange timeRange;

    /**
     * <p>utdid</p>
     * 
     * <strong>example:</strong>
     * <p>Z70g6V/MXJ8DABtD53eHzn4X</p>
     */
    @NameInMap("Utdid")
    public String utdid;

    public static GetErrorsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetErrorsRequest self = new GetErrorsRequest();
        return TeaModel.build(map, self);
    }

    public GetErrorsRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public GetErrorsRequest setBizModule(String bizModule) {
        this.bizModule = bizModule;
        return this;
    }
    public String getBizModule() {
        return this.bizModule;
    }

    public GetErrorsRequest setDigestHash(String digestHash) {
        this.digestHash = digestHash;
        return this;
    }
    public String getDigestHash() {
        return this.digestHash;
    }

    public GetErrorsRequest setFilter(GetErrorsRequestFilter filter) {
        this.filter = filter;
        return this;
    }
    public GetErrorsRequestFilter getFilter() {
        return this.filter;
    }

    public GetErrorsRequest setOs(String os) {
        this.os = os;
        return this;
    }
    public String getOs() {
        return this.os;
    }

    public GetErrorsRequest setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    public GetErrorsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetErrorsRequest setTimeRange(GetErrorsRequestTimeRange timeRange) {
        this.timeRange = timeRange;
        return this;
    }
    public GetErrorsRequestTimeRange getTimeRange() {
        return this.timeRange;
    }

    public GetErrorsRequest setUtdid(String utdid) {
        this.utdid = utdid;
        return this;
    }
    public String getUtdid() {
        return this.utdid;
    }

    public static class GetErrorsRequestFilter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>osVersion</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("Operator")
        public String operator;

        @NameInMap("SubFilters")
        public java.util.List<String> subFilters;

        @NameInMap("Values")
        public java.util.List<?> values;

        public static GetErrorsRequestFilter build(java.util.Map<String, ?> map) throws Exception {
            GetErrorsRequestFilter self = new GetErrorsRequestFilter();
            return TeaModel.build(map, self);
        }

        public GetErrorsRequestFilter setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetErrorsRequestFilter setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetErrorsRequestFilter setSubFilters(java.util.List<String> subFilters) {
            this.subFilters = subFilters;
            return this;
        }
        public java.util.List<String> getSubFilters() {
            return this.subFilters;
        }

        public GetErrorsRequestFilter setValues(java.util.List<?> values) {
            this.values = values;
            return this;
        }
        public java.util.List<?> getValues() {
            return this.values;
        }

    }

    public static class GetErrorsRequestTimeRange extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1740499200000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1739894400000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static GetErrorsRequestTimeRange build(java.util.Map<String, ?> map) throws Exception {
            GetErrorsRequestTimeRange self = new GetErrorsRequestTimeRange();
            return TeaModel.build(map, self);
        }

        public GetErrorsRequestTimeRange setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetErrorsRequestTimeRange setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

}
