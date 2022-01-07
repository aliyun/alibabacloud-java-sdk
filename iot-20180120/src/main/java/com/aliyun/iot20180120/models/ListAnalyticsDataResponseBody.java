// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class ListAnalyticsDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListAnalyticsDataResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListAnalyticsDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnalyticsDataResponseBody self = new ListAnalyticsDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnalyticsDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAnalyticsDataResponseBody setData(ListAnalyticsDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListAnalyticsDataResponseBodyData getData() {
        return this.data;
    }

    public ListAnalyticsDataResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListAnalyticsDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnalyticsDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAnalyticsDataResponseBodyData extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("HasNext")
        public Boolean hasNext;

        @NameInMap("PageNum")
        public Integer pageNum;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("ResultJson")
        public String resultJson;

        public static ListAnalyticsDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAnalyticsDataResponseBodyData self = new ListAnalyticsDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAnalyticsDataResponseBodyData setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListAnalyticsDataResponseBodyData setHasNext(Boolean hasNext) {
            this.hasNext = hasNext;
            return this;
        }
        public Boolean getHasNext() {
            return this.hasNext;
        }

        public ListAnalyticsDataResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListAnalyticsDataResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAnalyticsDataResponseBodyData setResultJson(String resultJson) {
            this.resultJson = resultJson;
            return this;
        }
        public String getResultJson() {
            return this.resultJson;
        }

    }

}
