// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetProjectOptionResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Successful")
    public Boolean successful;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public java.util.List<GetProjectOptionResponseBodyObject> object;

    public static GetProjectOptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectOptionResponseBody self = new GetProjectOptionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectOptionResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public GetProjectOptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetProjectOptionResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public GetProjectOptionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetProjectOptionResponseBody setObject(java.util.List<GetProjectOptionResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<GetProjectOptionResponseBodyObject> getObject() {
        return this.object;
    }

    public static class GetProjectOptionResponseBodyObject extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("Name")
        public String name;

        @NameInMap("ScopeName")
        public String scopeName;

        @NameInMap("Kind")
        public String kind;

        public static GetProjectOptionResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            GetProjectOptionResponseBodyObject self = new GetProjectOptionResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public GetProjectOptionResponseBodyObject setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public GetProjectOptionResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectOptionResponseBodyObject setScopeName(String scopeName) {
            this.scopeName = scopeName;
            return this;
        }
        public String getScopeName() {
            return this.scopeName;
        }

        public GetProjectOptionResponseBodyObject setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

    }

}
