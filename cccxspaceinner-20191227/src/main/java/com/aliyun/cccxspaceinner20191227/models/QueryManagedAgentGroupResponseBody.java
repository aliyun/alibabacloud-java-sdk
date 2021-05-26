// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryManagedAgentGroupResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public java.util.List<QueryManagedAgentGroupResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryManagedAgentGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryManagedAgentGroupResponseBody self = new QueryManagedAgentGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryManagedAgentGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryManagedAgentGroupResponseBody setData(java.util.List<QueryManagedAgentGroupResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryManagedAgentGroupResponseBodyData> getData() {
        return this.data;
    }

    public QueryManagedAgentGroupResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryManagedAgentGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryManagedAgentGroupResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("IsPublic")
        public Boolean isPublic;

        public static QueryManagedAgentGroupResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryManagedAgentGroupResponseBodyData self = new QueryManagedAgentGroupResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryManagedAgentGroupResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryManagedAgentGroupResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryManagedAgentGroupResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryManagedAgentGroupResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryManagedAgentGroupResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryManagedAgentGroupResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryManagedAgentGroupResponseBodyData setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

    }

}
