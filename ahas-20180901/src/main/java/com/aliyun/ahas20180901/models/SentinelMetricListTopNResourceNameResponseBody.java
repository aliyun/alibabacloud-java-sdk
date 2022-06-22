// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class SentinelMetricListTopNResourceNameResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SentinelMetricListTopNResourceNameResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SentinelMetricListTopNResourceNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SentinelMetricListTopNResourceNameResponseBody self = new SentinelMetricListTopNResourceNameResponseBody();
        return TeaModel.build(map, self);
    }

    public SentinelMetricListTopNResourceNameResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SentinelMetricListTopNResourceNameResponseBody setData(SentinelMetricListTopNResourceNameResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SentinelMetricListTopNResourceNameResponseBodyData getData() {
        return this.data;
    }

    public SentinelMetricListTopNResourceNameResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SentinelMetricListTopNResourceNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SentinelMetricListTopNResourceNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SentinelMetricListTopNResourceNameResponseBodyDataMetrics extends TeaModel {
        @NameInMap("blockedQps")
        public Float blockedQps;

        @NameInMap("exception")
        public Float exception;

        @NameInMap("favorite")
        public Boolean favorite;

        @NameInMap("hasRule")
        public Boolean hasRule;

        @NameInMap("passedQps")
        public Float passedQps;

        @NameInMap("resource")
        public String resource;

        @NameInMap("rt")
        public Float rt;

        @NameInMap("trafficType")
        public String trafficType;

        @NameInMap("type")
        public Integer type;

        public static SentinelMetricListTopNResourceNameResponseBodyDataMetrics build(java.util.Map<String, ?> map) throws Exception {
            SentinelMetricListTopNResourceNameResponseBodyDataMetrics self = new SentinelMetricListTopNResourceNameResponseBodyDataMetrics();
            return TeaModel.build(map, self);
        }

        public SentinelMetricListTopNResourceNameResponseBodyDataMetrics setBlockedQps(Float blockedQps) {
            this.blockedQps = blockedQps;
            return this;
        }
        public Float getBlockedQps() {
            return this.blockedQps;
        }

        public SentinelMetricListTopNResourceNameResponseBodyDataMetrics setException(Float exception) {
            this.exception = exception;
            return this;
        }
        public Float getException() {
            return this.exception;
        }

        public SentinelMetricListTopNResourceNameResponseBodyDataMetrics setFavorite(Boolean favorite) {
            this.favorite = favorite;
            return this;
        }
        public Boolean getFavorite() {
            return this.favorite;
        }

        public SentinelMetricListTopNResourceNameResponseBodyDataMetrics setHasRule(Boolean hasRule) {
            this.hasRule = hasRule;
            return this;
        }
        public Boolean getHasRule() {
            return this.hasRule;
        }

        public SentinelMetricListTopNResourceNameResponseBodyDataMetrics setPassedQps(Float passedQps) {
            this.passedQps = passedQps;
            return this;
        }
        public Float getPassedQps() {
            return this.passedQps;
        }

        public SentinelMetricListTopNResourceNameResponseBodyDataMetrics setResource(String resource) {
            this.resource = resource;
            return this;
        }
        public String getResource() {
            return this.resource;
        }

        public SentinelMetricListTopNResourceNameResponseBodyDataMetrics setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public SentinelMetricListTopNResourceNameResponseBodyDataMetrics setTrafficType(String trafficType) {
            this.trafficType = trafficType;
            return this;
        }
        public String getTrafficType() {
            return this.trafficType;
        }

        public SentinelMetricListTopNResourceNameResponseBodyDataMetrics setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class SentinelMetricListTopNResourceNameResponseBodyData extends TeaModel {
        @NameInMap("metrics")
        public java.util.List<SentinelMetricListTopNResourceNameResponseBodyDataMetrics> metrics;

        @NameInMap("pageIndex")
        public Integer pageIndex;

        @NameInMap("pageSize")
        public Integer pageSize;

        @NameInMap("totalCount")
        public Integer totalCount;

        @NameInMap("totalPage")
        public Integer totalPage;

        public static SentinelMetricListTopNResourceNameResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SentinelMetricListTopNResourceNameResponseBodyData self = new SentinelMetricListTopNResourceNameResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SentinelMetricListTopNResourceNameResponseBodyData setMetrics(java.util.List<SentinelMetricListTopNResourceNameResponseBodyDataMetrics> metrics) {
            this.metrics = metrics;
            return this;
        }
        public java.util.List<SentinelMetricListTopNResourceNameResponseBodyDataMetrics> getMetrics() {
            return this.metrics;
        }

        public SentinelMetricListTopNResourceNameResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public SentinelMetricListTopNResourceNameResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public SentinelMetricListTopNResourceNameResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public SentinelMetricListTopNResourceNameResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
