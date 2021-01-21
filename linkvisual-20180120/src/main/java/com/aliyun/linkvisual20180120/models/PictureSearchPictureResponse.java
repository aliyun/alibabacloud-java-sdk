// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class PictureSearchPictureResponse extends TeaModel {
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
    public PictureSearchPictureResponseData data;

    public static PictureSearchPictureResponse build(java.util.Map<String, ?> map) throws Exception {
        PictureSearchPictureResponse self = new PictureSearchPictureResponse();
        return TeaModel.build(map, self);
    }

    public PictureSearchPictureResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PictureSearchPictureResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public PictureSearchPictureResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PictureSearchPictureResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PictureSearchPictureResponse setData(PictureSearchPictureResponseData data) {
        this.data = data;
        return this;
    }
    public PictureSearchPictureResponseData getData() {
        return this.data;
    }

    public static class PictureSearchPictureResponseDataPageData extends TeaModel {
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

        public static PictureSearchPictureResponseDataPageData build(java.util.Map<String, ?> map) throws Exception {
            PictureSearchPictureResponseDataPageData self = new PictureSearchPictureResponseDataPageData();
            return TeaModel.build(map, self);
        }

        public PictureSearchPictureResponseDataPageData setVectorId(String vectorId) {
            this.vectorId = vectorId;
            return this;
        }
        public String getVectorId() {
            return this.vectorId;
        }

        public PictureSearchPictureResponseDataPageData setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public PictureSearchPictureResponseDataPageData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public PictureSearchPictureResponseDataPageData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public PictureSearchPictureResponseDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

        public PictureSearchPictureResponseDataPageData setGatewayIotId(String gatewayIotId) {
            this.gatewayIotId = gatewayIotId;
            return this;
        }
        public String getGatewayIotId() {
            return this.gatewayIotId;
        }

    }

    public static class PictureSearchPictureResponseData extends TeaModel {
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
        public java.util.List<PictureSearchPictureResponseDataPageData> pageData;

        public static PictureSearchPictureResponseData build(java.util.Map<String, ?> map) throws Exception {
            PictureSearchPictureResponseData self = new PictureSearchPictureResponseData();
            return TeaModel.build(map, self);
        }

        public PictureSearchPictureResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public PictureSearchPictureResponseData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

        public PictureSearchPictureResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public PictureSearchPictureResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public PictureSearchPictureResponseData setPageData(java.util.List<PictureSearchPictureResponseDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<PictureSearchPictureResponseDataPageData> getPageData() {
            return this.pageData;
        }

    }

}
