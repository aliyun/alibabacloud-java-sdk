// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListSkillGroupsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSkillGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupsResponseBody self = new ListSkillGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupsResponseBody setData(ListSkillGroupsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSkillGroupsResponseBodyData getData() {
        return this.data;
    }

    public ListSkillGroupsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSkillGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSkillGroupsResponseBodyDataList extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MediaType")
        public String mediaType;

        @NameInMap("PhoneNumberCount")
        public Integer phoneNumberCount;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("UserCount")
        public Integer userCount;

        public static ListSkillGroupsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsResponseBodyDataList self = new ListSkillGroupsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsResponseBodyDataList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSkillGroupsResponseBodyDataList setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListSkillGroupsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupsResponseBodyDataList setMediaType(String mediaType) {
            this.mediaType = mediaType;
            return this;
        }
        public String getMediaType() {
            return this.mediaType;
        }

        public ListSkillGroupsResponseBodyDataList setPhoneNumberCount(Integer phoneNumberCount) {
            this.phoneNumberCount = phoneNumberCount;
            return this;
        }
        public Integer getPhoneNumberCount() {
            return this.phoneNumberCount;
        }

        public ListSkillGroupsResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupsResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListSkillGroupsResponseBodyDataList setUserCount(Integer userCount) {
            this.userCount = userCount;
            return this;
        }
        public Integer getUserCount() {
            return this.userCount;
        }

    }

    public static class ListSkillGroupsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListSkillGroupsResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSkillGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupsResponseBodyData self = new ListSkillGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupsResponseBodyData setList(java.util.List<ListSkillGroupsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListSkillGroupsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListSkillGroupsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSkillGroupsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSkillGroupsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
