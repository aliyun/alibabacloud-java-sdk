// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListServiceGroupsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ServiceGroupsList")
    public ListServiceGroupsResponseBodyServiceGroupsList serviceGroupsList;

    public static ListServiceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListServiceGroupsResponseBody self = new ListServiceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListServiceGroupsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public ListServiceGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListServiceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListServiceGroupsResponseBody setServiceGroupsList(ListServiceGroupsResponseBodyServiceGroupsList serviceGroupsList) {
        this.serviceGroupsList = serviceGroupsList;
        return this;
    }
    public ListServiceGroupsResponseBodyServiceGroupsList getServiceGroupsList() {
        return this.serviceGroupsList;
    }

    public static class ListServiceGroupsResponseBodyServiceGroupsListListServiceGroups extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("GroupName")
        public String groupName;

        public static ListServiceGroupsResponseBodyServiceGroupsListListServiceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListServiceGroupsResponseBodyServiceGroupsListListServiceGroups self = new ListServiceGroupsResponseBodyServiceGroupsListListServiceGroups();
            return TeaModel.build(map, self);
        }

        public ListServiceGroupsResponseBodyServiceGroupsListListServiceGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListServiceGroupsResponseBodyServiceGroupsListListServiceGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListServiceGroupsResponseBodyServiceGroupsListListServiceGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class ListServiceGroupsResponseBodyServiceGroupsList extends TeaModel {
        @NameInMap("ListServiceGroups")
        public java.util.List<ListServiceGroupsResponseBodyServiceGroupsListListServiceGroups> listServiceGroups;

        public static ListServiceGroupsResponseBodyServiceGroupsList build(java.util.Map<String, ?> map) throws Exception {
            ListServiceGroupsResponseBodyServiceGroupsList self = new ListServiceGroupsResponseBodyServiceGroupsList();
            return TeaModel.build(map, self);
        }

        public ListServiceGroupsResponseBodyServiceGroupsList setListServiceGroups(java.util.List<ListServiceGroupsResponseBodyServiceGroupsListListServiceGroups> listServiceGroups) {
            this.listServiceGroups = listServiceGroups;
            return this;
        }
        public java.util.List<ListServiceGroupsResponseBodyServiceGroupsListListServiceGroups> getListServiceGroups() {
            return this.listServiceGroups;
        }

    }

}
