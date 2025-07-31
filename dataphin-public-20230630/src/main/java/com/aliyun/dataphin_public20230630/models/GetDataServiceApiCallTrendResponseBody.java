// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiCallTrendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataServiceApiCallTrendResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetDataServiceApiCallTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiCallTrendResponseBody self = new GetDataServiceApiCallTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiCallTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceApiCallTrendResponseBody setData(GetDataServiceApiCallTrendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApiCallTrendResponseBodyData getData() {
        return this.data;
    }

    public GetDataServiceApiCallTrendResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceApiCallTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceApiCallTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceApiCallTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList extends TeaModel {
        @NameInMap("ApiIdList")
        public java.util.List<Long> apiIdList;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ErrorApiCount")
        public Integer errorApiCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorAppCount")
        public Integer errorAppCount;

        /**
         * <strong>example:</strong>
         * <p>2025-06-30 08:00</p>
         */
        @NameInMap("Minute")
        public String minute;

        public static GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList self = new GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList setApiIdList(java.util.List<Long> apiIdList) {
            this.apiIdList = apiIdList;
            return this;
        }
        public java.util.List<Long> getApiIdList() {
            return this.apiIdList;
        }

        public GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList setErrorApiCount(Integer errorApiCount) {
            this.errorApiCount = errorApiCount;
            return this;
        }
        public Integer getErrorApiCount() {
            return this.errorApiCount;
        }

        public GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList setErrorAppCount(Integer errorAppCount) {
            this.errorAppCount = errorAppCount;
            return this;
        }
        public Integer getErrorAppCount() {
            return this.errorAppCount;
        }

        public GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList setMinute(String minute) {
            this.minute = minute;
            return this;
        }
        public String getMinute() {
            return this.minute;
        }

    }

    public static class GetDataServiceApiCallTrendResponseBodyDataCallErrorTrendList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("CallCount")
        public Long callCount;

        /**
         * <strong>example:</strong>
         * <p>102</p>
         */
        @NameInMap("ErrorCount")
        public Long errorCount;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Minute")
        public String minute;

        public static GetDataServiceApiCallTrendResponseBodyDataCallErrorTrendList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiCallTrendResponseBodyDataCallErrorTrendList self = new GetDataServiceApiCallTrendResponseBodyDataCallErrorTrendList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiCallTrendResponseBodyDataCallErrorTrendList setCallCount(Long callCount) {
            this.callCount = callCount;
            return this;
        }
        public Long getCallCount() {
            return this.callCount;
        }

        public GetDataServiceApiCallTrendResponseBodyDataCallErrorTrendList setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public GetDataServiceApiCallTrendResponseBodyDataCallErrorTrendList setMinute(String minute) {
            this.minute = minute;
            return this;
        }
        public String getMinute() {
            return this.minute;
        }

    }

    public static class GetDataServiceApiCallTrendResponseBodyData extends TeaModel {
        @NameInMap("CallErrorImpactTrendList")
        public java.util.List<GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList> callErrorImpactTrendList;

        @NameInMap("CallErrorTrendList")
        public java.util.List<GetDataServiceApiCallTrendResponseBodyDataCallErrorTrendList> callErrorTrendList;

        public static GetDataServiceApiCallTrendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiCallTrendResponseBodyData self = new GetDataServiceApiCallTrendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiCallTrendResponseBodyData setCallErrorImpactTrendList(java.util.List<GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList> callErrorImpactTrendList) {
            this.callErrorImpactTrendList = callErrorImpactTrendList;
            return this;
        }
        public java.util.List<GetDataServiceApiCallTrendResponseBodyDataCallErrorImpactTrendList> getCallErrorImpactTrendList() {
            return this.callErrorImpactTrendList;
        }

        public GetDataServiceApiCallTrendResponseBodyData setCallErrorTrendList(java.util.List<GetDataServiceApiCallTrendResponseBodyDataCallErrorTrendList> callErrorTrendList) {
            this.callErrorTrendList = callErrorTrendList;
            return this;
        }
        public java.util.List<GetDataServiceApiCallTrendResponseBodyDataCallErrorTrendList> getCallErrorTrendList() {
            return this.callErrorTrendList;
        }

    }

}
