// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPrivilegesOfUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListPrivilegesOfUserResponseBodyData> data;

    public static ListPrivilegesOfUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPrivilegesOfUserResponseBody self = new ListPrivilegesOfUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPrivilegesOfUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPrivilegesOfUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPrivilegesOfUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPrivilegesOfUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPrivilegesOfUserResponseBody setData(java.util.List<ListPrivilegesOfUserResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPrivilegesOfUserResponseBodyData> getData() {
        return this.data;
    }

    public static class ListPrivilegesOfUserResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Scope")
        public String scope;

        @NameInMap("Name")
        public String name;

        public static ListPrivilegesOfUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPrivilegesOfUserResponseBodyData self = new ListPrivilegesOfUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPrivilegesOfUserResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPrivilegesOfUserResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

        public ListPrivilegesOfUserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
