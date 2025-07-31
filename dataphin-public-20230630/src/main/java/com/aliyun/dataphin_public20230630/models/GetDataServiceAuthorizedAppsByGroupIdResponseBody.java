// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAuthorizedAppsByGroupIdResponseBody extends TeaModel {
    @NameInMap("AppInfoList")
    public java.util.List<GetDataServiceAuthorizedAppsByGroupIdResponseBodyAppInfoList> appInfoList;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
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

    public static GetDataServiceAuthorizedAppsByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAuthorizedAppsByGroupIdResponseBody self = new GetDataServiceAuthorizedAppsByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAuthorizedAppsByGroupIdResponseBody setAppInfoList(java.util.List<GetDataServiceAuthorizedAppsByGroupIdResponseBodyAppInfoList> appInfoList) {
        this.appInfoList = appInfoList;
        return this;
    }
    public java.util.List<GetDataServiceAuthorizedAppsByGroupIdResponseBodyAppInfoList> getAppInfoList() {
        return this.appInfoList;
    }

    public GetDataServiceAuthorizedAppsByGroupIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceAuthorizedAppsByGroupIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceAuthorizedAppsByGroupIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceAuthorizedAppsByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceAuthorizedAppsByGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceAuthorizedAppsByGroupIdResponseBodyAppInfoList extends TeaModel {
        /**
         * <p>AppKey</p>
         * 
         * <strong>example:</strong>
         * <p>202212</p>
         */
        @NameInMap("AppKey")
        public Long appKey;

        /**
         * <p>AppId</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetDataServiceAuthorizedAppsByGroupIdResponseBodyAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceAuthorizedAppsByGroupIdResponseBodyAppInfoList self = new GetDataServiceAuthorizedAppsByGroupIdResponseBodyAppInfoList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceAuthorizedAppsByGroupIdResponseBodyAppInfoList setAppKey(Long appKey) {
            this.appKey = appKey;
            return this;
        }
        public Long getAppKey() {
            return this.appKey;
        }

        public GetDataServiceAuthorizedAppsByGroupIdResponseBodyAppInfoList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetDataServiceAuthorizedAppsByGroupIdResponseBodyAppInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
