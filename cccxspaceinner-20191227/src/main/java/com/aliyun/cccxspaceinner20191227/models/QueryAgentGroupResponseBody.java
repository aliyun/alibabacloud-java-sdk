// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryAgentGroupResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public java.util.List<QueryAgentGroupResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAgentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentGroupResponseBody self = new QueryAgentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAgentGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAgentGroupResponseBody setData(java.util.List<QueryAgentGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAgentGroupResponseBodyData> getData() {
        return this.data;
    }

    public QueryAgentGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAgentGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAgentGroupResponseBodyData extends TeaModel {
        @NameInMap("BuId")
        public Long buId;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("DepartmentId")
        public Long departmentId;

        public static QueryAgentGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAgentGroupResponseBodyData self = new QueryAgentGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAgentGroupResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryAgentGroupResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryAgentGroupResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

    }

}
