// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPrivilegesOfUserResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPrivilegesOfUserResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public ListPrivilegesOfUserResponseBody setData(java.util.List<ListPrivilegesOfUserResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPrivilegesOfUserResponseBodyData> getData() {
        return this.data;
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

    public static class ListPrivilegesOfUserResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>Workbench:Call</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>SELF_ONLY</p>
         */
        @NameInMap("Scope")
        public String scope;

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

        public ListPrivilegesOfUserResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPrivilegesOfUserResponseBodyData setScope(String scope) {
            this.scope = scope;
            return this;
        }
        public String getScope() {
            return this.scope;
        }

    }

}
