// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ListCloudGtmAvailableAlertGroupsResponseBody extends TeaModel {
    @NameInMap("AlertGroups")
    public ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroups alertGroups;

    @NameInMap("RequestId")
    public String requestId;

    public static ListCloudGtmAvailableAlertGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCloudGtmAvailableAlertGroupsResponseBody self = new ListCloudGtmAvailableAlertGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCloudGtmAvailableAlertGroupsResponseBody setAlertGroups(ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroups alertGroups) {
        this.alertGroups = alertGroups;
        return this;
    }
    public ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroups getAlertGroups() {
        return this.alertGroups;
    }

    public ListCloudGtmAvailableAlertGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroupsAlertGroup extends TeaModel {
        @NameInMap("GroupName")
        public String groupName;

        public static ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroupsAlertGroup build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroupsAlertGroup self = new ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroupsAlertGroup();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroupsAlertGroup setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

    }

    public static class ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroups extends TeaModel {
        @NameInMap("AlertGroup")
        public java.util.List<ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroupsAlertGroup> alertGroup;

        public static ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroups build(java.util.Map<String, ?> map) throws Exception {
            ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroups self = new ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroups();
            return TeaModel.build(map, self);
        }

        public ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroups setAlertGroup(java.util.List<ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroupsAlertGroup> alertGroup) {
            this.alertGroup = alertGroup;
            return this;
        }
        public java.util.List<ListCloudGtmAvailableAlertGroupsResponseBodyAlertGroupsAlertGroup> getAlertGroup() {
            return this.alertGroup;
        }

    }

}
