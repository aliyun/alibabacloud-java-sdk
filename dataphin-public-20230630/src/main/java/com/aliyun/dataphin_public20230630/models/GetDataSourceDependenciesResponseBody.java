// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetDataSourceDependenciesResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The dependency records.</p>
     */
    @NameInMap("DependencyList")
    public java.util.List<GetDataSourceDependenciesResponseBodyDependencyList> dependencyList;

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

    public static GetDataSourceDependenciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceDependenciesResponseBody self = new GetDataSourceDependenciesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDataSourceDependenciesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetDataSourceDependenciesResponseBody setDependencyList(java.util.List<GetDataSourceDependenciesResponseBodyDependencyList> dependencyList) {
        this.dependencyList = dependencyList;
        return this;
    }
    public java.util.List<GetDataSourceDependenciesResponseBodyDependencyList> getDependencyList() {
        return this.dependencyList;
    }

    public GetDataSourceDependenciesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetDataSourceDependenciesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetDataSourceDependenciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDataSourceDependenciesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDataSourceDependenciesResponseBodyDependencyList extends TeaModel {
        /**
         * <p>The ID of the dependency record.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the dependency record.</p>
         * 
         * <strong>example:</strong>
         * <p>jytest</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the dependency record.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The type code of the dependency record.</p>
         * 
         * <strong>example:</strong>
         * <p>pipeline</p>
         */
        @NameInMap("TypeCode")
        public String typeCode;

        public static GetDataSourceDependenciesResponseBodyDependencyList build(java.util.Map<String, ?> map) throws Exception {
            GetDataSourceDependenciesResponseBodyDependencyList self = new GetDataSourceDependenciesResponseBodyDependencyList();
            return TeaModel.build(map, self);
        }

        public GetDataSourceDependenciesResponseBodyDependencyList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDataSourceDependenciesResponseBodyDependencyList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetDataSourceDependenciesResponseBodyDependencyList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetDataSourceDependenciesResponseBodyDependencyList setTypeCode(String typeCode) {
            this.typeCode = typeCode;
            return this;
        }
        public String getTypeCode() {
            return this.typeCode;
        }

    }

}
