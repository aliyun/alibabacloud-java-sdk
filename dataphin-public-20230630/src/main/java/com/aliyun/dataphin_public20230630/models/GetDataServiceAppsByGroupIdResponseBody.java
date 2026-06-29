// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceAppsByGroupIdResponseBody extends TeaModel {
    /**
     * <p>The list of application groups.</p>
     */
    @NameInMap("AppInfoList")
    public java.util.List<GetDataServiceAppsByGroupIdResponseBodyAppInfoList> appInfoList;

    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
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

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetDataServiceAppsByGroupIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceAppsByGroupIdResponseBody self = new GetDataServiceAppsByGroupIdResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceAppsByGroupIdResponseBody setAppInfoList(java.util.List<GetDataServiceAppsByGroupIdResponseBodyAppInfoList> appInfoList) {
        this.appInfoList = appInfoList;
        return this;
    }
    public java.util.List<GetDataServiceAppsByGroupIdResponseBodyAppInfoList> getAppInfoList() {
        return this.appInfoList;
    }

    public GetDataServiceAppsByGroupIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceAppsByGroupIdResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceAppsByGroupIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceAppsByGroupIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceAppsByGroupIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceAppsByGroupIdResponseBodyAppInfoList extends TeaModel {
        /**
         * <p>AppId</p>
         * 
         * <strong>example:</strong>
         * <p>1021</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetDataServiceAppsByGroupIdResponseBodyAppInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceAppsByGroupIdResponseBodyAppInfoList self = new GetDataServiceAppsByGroupIdResponseBodyAppInfoList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceAppsByGroupIdResponseBodyAppInfoList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetDataServiceAppsByGroupIdResponseBodyAppInfoList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
