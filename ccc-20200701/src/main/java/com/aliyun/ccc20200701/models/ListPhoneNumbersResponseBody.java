// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListPhoneNumbersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListPhoneNumbersResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListPhoneNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPhoneNumbersResponseBody self = new ListPhoneNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPhoneNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPhoneNumbersResponseBody setData(ListPhoneNumbersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPhoneNumbersResponseBodyData getData() {
        return this.data;
    }

    public ListPhoneNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListPhoneNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPhoneNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPhoneNumbersResponseBodyDataListSkillGroups extends TeaModel {
        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        public static ListPhoneNumbersResponseBodyDataListSkillGroups build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyDataListSkillGroups self = new ListPhoneNumbersResponseBodyDataListSkillGroups();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyDataListSkillGroups setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ListPhoneNumbersResponseBodyDataListSkillGroups setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPhoneNumbersResponseBodyDataListSkillGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPhoneNumbersResponseBodyDataListSkillGroups setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

    }

    public static class ListPhoneNumbersResponseBodyDataList extends TeaModel {
        @NameInMap("Active")
        public Boolean active;

        @NameInMap("City")
        public String city;

        @NameInMap("ContactFlowId")
        public String contactFlowId;

        @NameInMap("ContactFlowName")
        public String contactFlowName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Number")
        public String number;

        @NameInMap("Provider")
        public String provider;

        @NameInMap("Province")
        public String province;

        @NameInMap("SkillGroups")
        public java.util.List<ListPhoneNumbersResponseBodyDataListSkillGroups> skillGroups;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Usage")
        public String usage;

        @NameInMap("UserId")
        public String userId;

        public static ListPhoneNumbersResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyDataList self = new ListPhoneNumbersResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyDataList setActive(Boolean active) {
            this.active = active;
            return this;
        }
        public Boolean getActive() {
            return this.active;
        }

        public ListPhoneNumbersResponseBodyDataList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public ListPhoneNumbersResponseBodyDataList setContactFlowId(String contactFlowId) {
            this.contactFlowId = contactFlowId;
            return this;
        }
        public String getContactFlowId() {
            return this.contactFlowId;
        }

        public ListPhoneNumbersResponseBodyDataList setContactFlowName(String contactFlowName) {
            this.contactFlowName = contactFlowName;
            return this;
        }
        public String getContactFlowName() {
            return this.contactFlowName;
        }

        public ListPhoneNumbersResponseBodyDataList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListPhoneNumbersResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListPhoneNumbersResponseBodyDataList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListPhoneNumbersResponseBodyDataList setProvider(String provider) {
            this.provider = provider;
            return this;
        }
        public String getProvider() {
            return this.provider;
        }

        public ListPhoneNumbersResponseBodyDataList setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public ListPhoneNumbersResponseBodyDataList setSkillGroups(java.util.List<ListPhoneNumbersResponseBodyDataListSkillGroups> skillGroups) {
            this.skillGroups = skillGroups;
            return this;
        }
        public java.util.List<ListPhoneNumbersResponseBodyDataListSkillGroups> getSkillGroups() {
            return this.skillGroups;
        }

        public ListPhoneNumbersResponseBodyDataList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public ListPhoneNumbersResponseBodyDataList setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

        public ListPhoneNumbersResponseBodyDataList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class ListPhoneNumbersResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListPhoneNumbersResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListPhoneNumbersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPhoneNumbersResponseBodyData self = new ListPhoneNumbersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPhoneNumbersResponseBodyData setList(java.util.List<ListPhoneNumbersResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListPhoneNumbersResponseBodyDataList> getList() {
            return this.list;
        }

        public ListPhoneNumbersResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPhoneNumbersResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPhoneNumbersResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
