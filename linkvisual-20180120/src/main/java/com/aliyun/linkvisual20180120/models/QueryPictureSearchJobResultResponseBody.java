// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryPictureSearchJobResultResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryPictureSearchJobResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchJobResultResponseBody self = new QueryPictureSearchJobResultResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchJobResultResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchJobResultResponseBody setData(QueryPictureSearchJobResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchJobResultResponseBodyData getData() {
        return this.data;
    }

    public QueryPictureSearchJobResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchJobResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchJobResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryPictureSearchJobResultResponseBodyDataPageData extends TeaModel {
        @NameInMap("DeviceNickName")
        public String deviceNickName;

        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("GatewayIotId")
        public String gatewayIotId;

        @NameInMap("IotId")
        public String iotId;

        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("VectorId")
        public String vectorId;

        public static QueryPictureSearchJobResultResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchJobResultResponseBodyDataPageData self = new QueryPictureSearchJobResultResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setDeviceNickName(String deviceNickName) {
            this.deviceNickName = deviceNickName;
            return this;
        }
        public String getDeviceNickName() {
            return this.deviceNickName;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setGatewayIotId(String gatewayIotId) {
            this.gatewayIotId = gatewayIotId;
            return this;
        }
        public String getGatewayIotId() {
            return this.gatewayIotId;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public QueryPictureSearchJobResultResponseBodyDataPageData setVectorId(String vectorId) {
            this.vectorId = vectorId;
            return this;
        }
        public String getVectorId() {
            return this.vectorId;
        }

    }

    public static class QueryPictureSearchJobResultResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageCount")
        public Integer pageCount;

        @NameInMap("PageData")
        public java.util.List<QueryPictureSearchJobResultResponseBodyDataPageData> pageData;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryPictureSearchJobResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchJobResultResponseBodyData self = new QueryPictureSearchJobResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchJobResultResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchJobResultResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryPictureSearchJobResultResponseBodyData setPageData(java.util.List<QueryPictureSearchJobResultResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchJobResultResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public QueryPictureSearchJobResultResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchJobResultResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
