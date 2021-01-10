// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class PictureSearchPictureResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public PictureSearchPictureResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static PictureSearchPictureResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PictureSearchPictureResponseBody self = new PictureSearchPictureResponseBody();
        return TeaModel.build(map, self);
    }

    public PictureSearchPictureResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PictureSearchPictureResponseBody setData(PictureSearchPictureResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PictureSearchPictureResponseBodyData getData() {
        return this.data;
    }

    public PictureSearchPictureResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public PictureSearchPictureResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public PictureSearchPictureResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PictureSearchPictureResponseBodyDataPageData extends TeaModel {
        @NameInMap("PicUrl")
        public String picUrl;

        @NameInMap("EventTime")
        public Long eventTime;

        @NameInMap("GatewayIotId")
        public String gatewayIotId;

        @NameInMap("VectorId")
        public String vectorId;

        @NameInMap("Threshold")
        public Float threshold;

        @NameInMap("IotId")
        public String iotId;

        public static PictureSearchPictureResponseBodyDataPageData build(java.util.Map<String, ?> map) throws Exception {
            PictureSearchPictureResponseBodyDataPageData self = new PictureSearchPictureResponseBodyDataPageData();
            return TeaModel.build(map, self);
        }

        public PictureSearchPictureResponseBodyDataPageData setPicUrl(String picUrl) {
            this.picUrl = picUrl;
            return this;
        }
        public String getPicUrl() {
            return this.picUrl;
        }

        public PictureSearchPictureResponseBodyDataPageData setEventTime(Long eventTime) {
            this.eventTime = eventTime;
            return this;
        }
        public Long getEventTime() {
            return this.eventTime;
        }

        public PictureSearchPictureResponseBodyDataPageData setGatewayIotId(String gatewayIotId) {
            this.gatewayIotId = gatewayIotId;
            return this;
        }
        public String getGatewayIotId() {
            return this.gatewayIotId;
        }

        public PictureSearchPictureResponseBodyDataPageData setVectorId(String vectorId) {
            this.vectorId = vectorId;
            return this;
        }
        public String getVectorId() {
            return this.vectorId;
        }

        public PictureSearchPictureResponseBodyDataPageData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public PictureSearchPictureResponseBodyDataPageData setIotId(String iotId) {
            this.iotId = iotId;
            return this;
        }
        public String getIotId() {
            return this.iotId;
        }

    }

    public static class PictureSearchPictureResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageData")
        public java.util.List<PictureSearchPictureResponseBodyDataPageData> pageData;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        @NameInMap("PageCount")
        public Integer pageCount;

        public static PictureSearchPictureResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PictureSearchPictureResponseBodyData self = new PictureSearchPictureResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PictureSearchPictureResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public PictureSearchPictureResponseBodyData setPageData(java.util.List<PictureSearchPictureResponseBodyDataPageData> pageData) {
            this.pageData = pageData;
            return this;
        }
        public java.util.List<PictureSearchPictureResponseBodyDataPageData> getPageData() {
            return this.pageData;
        }

        public PictureSearchPictureResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public PictureSearchPictureResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public PictureSearchPictureResponseBodyData setPageCount(Integer pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Integer getPageCount() {
            return this.pageCount;
        }

    }

}
