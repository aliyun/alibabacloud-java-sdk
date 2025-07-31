// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiErrorImpactResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetDataServiceApiErrorImpactResponseBodyData data;

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

    public static GetDataServiceApiErrorImpactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiErrorImpactResponseBody self = new GetDataServiceApiErrorImpactResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiErrorImpactResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceApiErrorImpactResponseBody setData(GetDataServiceApiErrorImpactResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetDataServiceApiErrorImpactResponseBodyData getData() {
        return this.data;
    }

    public GetDataServiceApiErrorImpactResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceApiErrorImpactResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceApiErrorImpactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceApiErrorImpactResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceApiErrorImpactResponseBodyDataErrorApiList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ApiName")
        public String apiName;

        /**
         * <strong>example:</strong>
         * <p>2012</p>
         */
        @NameInMap("AppId")
        public Long appId;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ErrorCount")
        public Long errorCount;

        public static GetDataServiceApiErrorImpactResponseBodyDataErrorApiList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiErrorImpactResponseBodyDataErrorApiList self = new GetDataServiceApiErrorImpactResponseBodyDataErrorApiList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiErrorImpactResponseBodyDataErrorApiList setApiName(String apiName) {
            this.apiName = apiName;
            return this;
        }
        public String getApiName() {
            return this.apiName;
        }

        public GetDataServiceApiErrorImpactResponseBodyDataErrorApiList setAppId(Long appId) {
            this.appId = appId;
            return this;
        }
        public Long getAppId() {
            return this.appId;
        }

        public GetDataServiceApiErrorImpactResponseBodyDataErrorApiList setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

    }

    public static class GetDataServiceApiErrorImpactResponseBodyDataErrorAppList extends TeaModel {
        /**
         * <p>appId</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>appKey</p>
         * 
         * <strong>example:</strong>
         * <p>100211</p>
         */
        @NameInMap("AppKey")
        public Long appKey;

        /**
         * <strong>example:</strong>
         * <p>app1</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("ErrorCount")
        public Long errorCount;

        public static GetDataServiceApiErrorImpactResponseBodyDataErrorAppList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiErrorImpactResponseBodyDataErrorAppList self = new GetDataServiceApiErrorImpactResponseBodyDataErrorAppList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiErrorImpactResponseBodyDataErrorAppList setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public GetDataServiceApiErrorImpactResponseBodyDataErrorAppList setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public GetDataServiceApiErrorImpactResponseBodyDataErrorAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetDataServiceApiErrorImpactResponseBodyDataErrorAppList setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

    }

    public static class GetDataServiceApiErrorImpactResponseBodyData extends TeaModel {
        @NameInMap("ErrorApiList")
        public java.util.List<GetDataServiceApiErrorImpactResponseBodyDataErrorApiList> errorApiList;

        @NameInMap("ErrorAppList")
        public java.util.List<GetDataServiceApiErrorImpactResponseBodyDataErrorAppList> errorAppList;

        public static GetDataServiceApiErrorImpactResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiErrorImpactResponseBodyData self = new GetDataServiceApiErrorImpactResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiErrorImpactResponseBodyData setErrorApiList(java.util.List<GetDataServiceApiErrorImpactResponseBodyDataErrorApiList> errorApiList) {
            this.errorApiList = errorApiList;
            return this;
        }
        public java.util.List<GetDataServiceApiErrorImpactResponseBodyDataErrorApiList> getErrorApiList() {
            return this.errorApiList;
        }

        public GetDataServiceApiErrorImpactResponseBodyData setErrorAppList(java.util.List<GetDataServiceApiErrorImpactResponseBodyDataErrorAppList> errorAppList) {
            this.errorAppList = errorAppList;
            return this;
        }
        public java.util.List<GetDataServiceApiErrorImpactResponseBodyDataErrorAppList> getErrorAppList() {
            return this.errorAppList;
        }

    }

}
