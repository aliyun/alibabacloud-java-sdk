// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListHotlineRecordDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EE338D98-9BD3-4413-B165</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultData")
    public ListHotlineRecordDetailResponseBodyResultData resultData;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListHotlineRecordDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordDetailResponseBody self = new ListHotlineRecordDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotlineRecordDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListHotlineRecordDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotlineRecordDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotlineRecordDetailResponseBody setResultData(ListHotlineRecordDetailResponseBodyResultData resultData) {
        this.resultData = resultData;
        return this;
    }
    public ListHotlineRecordDetailResponseBodyResultData getResultData() {
        return this.resultData;
    }

    public ListHotlineRecordDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListHotlineRecordDetailResponseBodyResultDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1614578410000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx.xxxxx/xx.wav">http://xxx.xxxxx/xx.wav</a></p>
         */
        @NameInMap("OssUrl")
        public String ossUrl;

        /**
         * <strong>example:</strong>
         * <p><a href="mailto:123@123.com">123@123.com</a></p>
         */
        @NameInMap("ServicerName")
        public String servicerName;

        /**
         * <strong>example:</strong>
         * <p>1614578400000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        public static ListHotlineRecordDetailResponseBodyResultDataData build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineRecordDetailResponseBodyResultDataData self = new ListHotlineRecordDetailResponseBodyResultDataData();
            return TeaModel.build(map, self);
        }

        public ListHotlineRecordDetailResponseBodyResultDataData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListHotlineRecordDetailResponseBodyResultDataData setOssUrl(String ossUrl) {
            this.ossUrl = ossUrl;
            return this;
        }
        public String getOssUrl() {
            return this.ossUrl;
        }

        public ListHotlineRecordDetailResponseBodyResultDataData setServicerName(String servicerName) {
            this.servicerName = servicerName;
            return this;
        }
        public String getServicerName() {
            return this.servicerName;
        }

        public ListHotlineRecordDetailResponseBodyResultDataData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

    }

    public static class ListHotlineRecordDetailResponseBodyResultData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Long currentPage;

        @NameInMap("Data")
        public java.util.List<ListHotlineRecordDetailResponseBodyResultDataData> data;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("OnePageSize")
        public Long onePageSize;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalPage")
        public Long totalPage;

        /**
         * <strong>example:</strong>
         * <p>945</p>
         */
        @NameInMap("TotalResults")
        public Long totalResults;

        public static ListHotlineRecordDetailResponseBodyResultData build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineRecordDetailResponseBodyResultData self = new ListHotlineRecordDetailResponseBodyResultData();
            return TeaModel.build(map, self);
        }

        public ListHotlineRecordDetailResponseBodyResultData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public ListHotlineRecordDetailResponseBodyResultData setData(java.util.List<ListHotlineRecordDetailResponseBodyResultDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListHotlineRecordDetailResponseBodyResultDataData> getData() {
            return this.data;
        }

        public ListHotlineRecordDetailResponseBodyResultData setOnePageSize(Long onePageSize) {
            this.onePageSize = onePageSize;
            return this;
        }
        public Long getOnePageSize() {
            return this.onePageSize;
        }

        public ListHotlineRecordDetailResponseBodyResultData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

        public ListHotlineRecordDetailResponseBodyResultData setTotalResults(Long totalResults) {
            this.totalResults = totalResults;
            return this;
        }
        public Long getTotalResults() {
            return this.totalResults;
        }

    }

}
