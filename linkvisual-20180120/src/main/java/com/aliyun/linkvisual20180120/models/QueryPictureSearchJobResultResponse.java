// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryPictureSearchJobResultResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryPictureSearchJobResultResponseData data;

    public static QueryPictureSearchJobResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryPictureSearchJobResultResponse self = new QueryPictureSearchJobResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryPictureSearchJobResultResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryPictureSearchJobResultResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryPictureSearchJobResultResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryPictureSearchJobResultResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryPictureSearchJobResultResponse setData(QueryPictureSearchJobResultResponseData data) {
        this.data = data;
        return this;
    }
    public QueryPictureSearchJobResultResponseData getData() {
        return this.data;
    }

    public static class QueryPictureSearchJobResultResponseDataPageData extends TeaModel {
        @NameInMap("VectorId")
        @Validation(required = true)
        public String vectorId;

        @NameInMap("EventTime")
        @Validation(required = true)
        public Long eventTime;

        @NameInMap("Threshold")
        @Validation(required = true)
        public Float threshold;

        @NameInMap("PicUrl")
        @Validation(required = true)
        public String picUrl;

        @NameInMap("IotId")
        @Validation(required = true)
        public String iotId;

        @NameInMap("GatewayIotId")
        @Validation(required = true)
        public String gatewayIotId;

        @NameInMap("DeviceNickName")
        @Validation(required = true)
        public String deviceNickName;

        public static QueryPictureSearchJobResultResponseDataPageData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchJobResultResponseDataPageData self = new QueryPictureSearchJobResultResponseDataPageData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchJobResultResponseDataPageData setVectorId(String vectorId) {
            this.vectorId = vectorId;
            return this;
        }
        public String getVectorId() {
            return this.vectorId;
        }

        public QueryPictureSearchJobResultResponseDataPageData setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public QueryPictureSearchJobResultResponseDataPageData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public QueryPictureSearchJobResultResponseDataPageData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public QueryPictureSearchJobResultResponseDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public QueryPictureSearchJobResultResponseDataPageData setGatewayIotId(String gatewayIotId) {
            this.gatewayIotId = gatewayIotId;
            return this;
        }
        public String getGatewayIotId() {
            return this.gatewayIotId;
        }

        public QueryPictureSearchJobResultResponseDataPageData setDeviceNickName(String deviceNickName) {
            this.deviceNickName = deviceNickName;
            return this;
        }
        public String getDeviceNickName() {
            return this.deviceNickName;
        }

    }

    public static class QueryPictureSearchJobResultResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageCount")
        @Validation(required = true)
        public Integer pageCount;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("PageData")
        @Validation(required = true)
        public java.util.List<QueryPictureSearchJobResultResponseDataPageData> pageData;

        public static QueryPictureSearchJobResultResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryPictureSearchJobResultResponseData self = new QueryPictureSearchJobResultResponseData();
            return TeaModel.build(map, self);
        }

        public QueryPictureSearchJobResultResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryPictureSearchJobResultResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public QueryPictureSearchJobResultResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryPictureSearchJobResultResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryPictureSearchJobResultResponseData setPageData(java.util.List<QueryPictureSearchJobResultResponseDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<QueryPictureSearchJobResultResponseDataPageData> getPageData() {
            return this.pageData;
        }

    }

}
