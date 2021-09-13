// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListBriefSkillGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListBriefSkillGroupsResponseBodyData data;

    public static ListBriefSkillGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBriefSkillGroupsResponseBody self = new ListBriefSkillGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBriefSkillGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListBriefSkillGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListBriefSkillGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListBriefSkillGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBriefSkillGroupsResponseBody setData(ListBriefSkillGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBriefSkillGroupsResponseBodyData getData() {
        return this.data;
    }

    public static class ListBriefSkillGroupsResponseBodyDataList extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("Description")
        public String description;

        @NameInMap("PhoneNumberCount")
        public Integer phoneNumberCount;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("UserCount")
        public Integer userCount;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ListBriefSkillGroupsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListBriefSkillGroupsResponseBodyDataList self = new ListBriefSkillGroupsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListBriefSkillGroupsResponseBodyDataList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListBriefSkillGroupsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListBriefSkillGroupsResponseBodyDataList setPhoneNumberCount(Integer phoneNumberCount) {
            this.phoneNumberCount = phoneNumberCount;
            return this;
        }
        public Integer getPhoneNumberCount() {
            return this.phoneNumberCount;
        }

        public ListBriefSkillGroupsResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListBriefSkillGroupsResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListBriefSkillGroupsResponseBodyDataList setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

        public ListBriefSkillGroupsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListBriefSkillGroupsResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("List")
        public java.util.List<ListBriefSkillGroupsResponseBodyDataList> list;

        public static ListBriefSkillGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBriefSkillGroupsResponseBodyData self = new ListBriefSkillGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBriefSkillGroupsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBriefSkillGroupsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBriefSkillGroupsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public ListBriefSkillGroupsResponseBodyData setList(java.util.List<ListBriefSkillGroupsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListBriefSkillGroupsResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
