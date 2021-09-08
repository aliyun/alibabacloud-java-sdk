// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListAnalyticsDataResponse extends TeaModel {
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
    public ListAnalyticsDataResponseData data;

    public static ListAnalyticsDataResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnalyticsDataResponse self = new ListAnalyticsDataResponse();
        return TeaModel.build(map, self);
    }

    public ListAnalyticsDataResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnalyticsDataResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAnalyticsDataResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAnalyticsDataResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAnalyticsDataResponse setData(ListAnalyticsDataResponseData data) {
        this.data = data;
        return this;
    }
    public ListAnalyticsDataResponseData getData() {
        return this.data;
    }

    public static class ListAnalyticsDataResponseData extends TeaModel {
        @NameInMap("HasNext")
        @Validation(required = true)
        public Boolean hasNext;

        @NameInMap("ResultJson")
        @Validation(required = true)
        public String resultJson;

        @NameInMap("Count")
        @Validation(required = true)
        public Long count;

        @NameInMap("PageNum")
        @Validation(required = true)
        public Integer pageNum;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        public static ListAnalyticsDataResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListAnalyticsDataResponseData self = new ListAnalyticsDataResponseData();
            return TeaModel.build(map, self);
        }

        public ListAnalyticsDataResponseData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListAnalyticsDataResponseData setResultJson(String resultJson) {
            this.resultJson = resultJson;
            return this;
        }
        public String getResultJson() {
            return this.resultJson;
        }

        public ListAnalyticsDataResponseData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListAnalyticsDataResponseData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListAnalyticsDataResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

}
