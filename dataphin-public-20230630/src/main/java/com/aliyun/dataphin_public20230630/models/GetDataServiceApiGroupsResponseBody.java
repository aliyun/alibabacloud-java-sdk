// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataServiceApiGroupsResponseBody extends TeaModel {
    /**
     * <p>The list of API groups.</p>
     */
    @NameInMap("ApiGroupList")
    public java.util.List<GetDataServiceApiGroupsResponseBodyApiGroupList> apiGroupList;

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

    public static GetDataServiceApiGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiGroupsResponseBody self = new GetDataServiceApiGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiGroupsResponseBody setApiGroupList(java.util.List<GetDataServiceApiGroupsResponseBodyApiGroupList> apiGroupList) {
        this.apiGroupList = apiGroupList;
        return this;
    }
    public java.util.List<GetDataServiceApiGroupsResponseBodyApiGroupList> getApiGroupList() {
        return this.apiGroupList;
    }

    public GetDataServiceApiGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataServiceApiGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataServiceApiGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataServiceApiGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataServiceApiGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataServiceApiGroupsResponseBodyApiGroupList extends TeaModel {
        /**
         * <p>The group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101231</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetDataServiceApiGroupsResponseBodyApiGroupList build(java.util.Map<String, ?> map) throws Exception {
            GetDataServiceApiGroupsResponseBodyApiGroupList self = new GetDataServiceApiGroupsResponseBodyApiGroupList();
            return TeaModel.build(map, self);
        }

        public GetDataServiceApiGroupsResponseBodyApiGroupList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public GetDataServiceApiGroupsResponseBodyApiGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
