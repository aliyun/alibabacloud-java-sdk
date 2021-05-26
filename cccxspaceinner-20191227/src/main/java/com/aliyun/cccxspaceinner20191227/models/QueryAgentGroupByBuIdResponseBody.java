// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class QueryAgentGroupByBuIdResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("Data")
    public java.util.List<QueryAgentGroupByBuIdResponseBodyData> data;

    @NameInMap("Code")
    public String code;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAgentGroupByBuIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAgentGroupByBuIdResponseBody self = new QueryAgentGroupByBuIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAgentGroupByBuIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAgentGroupByBuIdResponseBody setData(java.util.List<QueryAgentGroupByBuIdResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAgentGroupByBuIdResponseBodyData> getData() {
        return this.data;
    }

    public QueryAgentGroupByBuIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAgentGroupByBuIdResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAgentGroupByBuIdResponseBodyData extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("ShowName")
        public String showName;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("IsPublic")
        public Boolean isPublic;

        public static QueryAgentGroupByBuIdResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAgentGroupByBuIdResponseBodyData self = new QueryAgentGroupByBuIdResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAgentGroupByBuIdResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryAgentGroupByBuIdResponseBodyData setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryAgentGroupByBuIdResponseBodyData setShowName(String showName) {
            this.showName = showName;
            return this;
        }
        public String getShowName() {
            return this.showName;
        }

        public QueryAgentGroupByBuIdResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAgentGroupByBuIdResponseBodyData setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryAgentGroupByBuIdResponseBodyData setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryAgentGroupByBuIdResponseBodyData setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public QueryAgentGroupByBuIdResponseBodyData setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

    }

}
