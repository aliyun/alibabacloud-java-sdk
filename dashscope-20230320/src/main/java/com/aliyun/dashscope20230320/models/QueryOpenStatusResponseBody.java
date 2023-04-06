// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashscope20230320.models;

import com.aliyun.tea.*;

public class QueryOpenStatusResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    @NameInMap("Data")
    public QueryOpenStatusResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryOpenStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryOpenStatusResponseBody self = new QueryOpenStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryOpenStatusResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public QueryOpenStatusResponseBody setData(QueryOpenStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryOpenStatusResponseBodyData getData() {
        return this.data;
    }

    public QueryOpenStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryOpenStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryOpenStatusResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public QueryOpenStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryOpenStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryOpenStatusResponseBodyDataCommoditiesOpenStatus extends TeaModel {
        @NameInMap("CnName")
        public String cnName;

        @NameInMap("Commodity")
        public String commodity;

        @NameInMap("Describe")
        public String describe;

        @NameInMap("DetailPage")
        public String detailPage;

        @NameInMap("Open")
        public Boolean open;

        @NameInMap("OpenPage")
        public String openPage;

        @NameInMap("OpenTime")
        public String openTime;

        @NameInMap("Stop")
        public Boolean stop;

        public static QueryOpenStatusResponseBodyDataCommoditiesOpenStatus build(java.util.Map<String, ?> map) throws Exception {
            QueryOpenStatusResponseBodyDataCommoditiesOpenStatus self = new QueryOpenStatusResponseBodyDataCommoditiesOpenStatus();
            return TeaModel.build(map, self);
        }

        public QueryOpenStatusResponseBodyDataCommoditiesOpenStatus setCnName(String cnName) {
            this.cnName = cnName;
            return this;
        }
        public String getCnName() {
            return this.cnName;
        }

        public QueryOpenStatusResponseBodyDataCommoditiesOpenStatus setCommodity(String commodity) {
            this.commodity = commodity;
            return this;
        }
        public String getCommodity() {
            return this.commodity;
        }

        public QueryOpenStatusResponseBodyDataCommoditiesOpenStatus setDescribe(String describe) {
            this.describe = describe;
            return this;
        }
        public String getDescribe() {
            return this.describe;
        }

        public QueryOpenStatusResponseBodyDataCommoditiesOpenStatus setDetailPage(String detailPage) {
            this.detailPage = detailPage;
            return this;
        }
        public String getDetailPage() {
            return this.detailPage;
        }

        public QueryOpenStatusResponseBodyDataCommoditiesOpenStatus setOpen(Boolean open) {
            this.open = open;
            return this;
        }
        public Boolean getOpen() {
            return this.open;
        }

        public QueryOpenStatusResponseBodyDataCommoditiesOpenStatus setOpenPage(String openPage) {
            this.openPage = openPage;
            return this;
        }
        public String getOpenPage() {
            return this.openPage;
        }

        public QueryOpenStatusResponseBodyDataCommoditiesOpenStatus setOpenTime(String openTime) {
            this.openTime = openTime;
            return this;
        }
        public String getOpenTime() {
            return this.openTime;
        }

        public QueryOpenStatusResponseBodyDataCommoditiesOpenStatus setStop(Boolean stop) {
            this.stop = stop;
            return this;
        }
        public Boolean getStop() {
            return this.stop;
        }

    }

    public static class QueryOpenStatusResponseBodyData extends TeaModel {
        @NameInMap("CommoditiesOpenStatus")
        public java.util.List<QueryOpenStatusResponseBodyDataCommoditiesOpenStatus> commoditiesOpenStatus;

        public static QueryOpenStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryOpenStatusResponseBodyData self = new QueryOpenStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryOpenStatusResponseBodyData setCommoditiesOpenStatus(java.util.List<QueryOpenStatusResponseBodyDataCommoditiesOpenStatus> commoditiesOpenStatus) {
            this.commoditiesOpenStatus = commoditiesOpenStatus;
            return this;
        }
        public java.util.List<QueryOpenStatusResponseBodyDataCommoditiesOpenStatus> getCommoditiesOpenStatus() {
            return this.commoditiesOpenStatus;
        }

    }

}
