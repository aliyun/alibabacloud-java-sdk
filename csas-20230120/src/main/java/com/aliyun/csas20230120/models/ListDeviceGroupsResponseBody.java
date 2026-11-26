// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListDeviceGroupsResponseBody extends TeaModel {
    /**
     * <p>The list of device groups.</p>
     */
    @NameInMap("DeviceGroups")
    public java.util.List<ListDeviceGroupsResponseBodyDeviceGroups> deviceGroups;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FD724DBC-CD76-5235-BF76-59C51B73296D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of device groups.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNum")
    public Long totalNum;

    public static ListDeviceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGroupsResponseBody self = new ListDeviceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDeviceGroupsResponseBody setDeviceGroups(java.util.List<ListDeviceGroupsResponseBodyDeviceGroups> deviceGroups) {
        this.deviceGroups = deviceGroups;
        return this;
    }
    public java.util.List<ListDeviceGroupsResponseBodyDeviceGroups> getDeviceGroups() {
        return this.deviceGroups;
    }

    public ListDeviceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceGroupsResponseBody setTotalNum(Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }
    public Long getTotalNum() {
        return this.totalNum;
    }

    public static class ListDeviceGroupsResponseBodyDeviceGroups extends TeaModel {
        /**
         * <p>The description of the device group.</p>
         * 
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the device group.</p>
         * 
         * <strong>example:</strong>
         * <p>device-group-5191cf830a5e****</p>
         */
        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        /**
         * <p>The operator for the dynamic device group rule.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("DynamicOperator")
        @Deprecated
        public String dynamicOperator;

        /**
         * <p>The matching rule for the dynamic device group.</p>
         */
        @NameInMap("DynamicRule")
        public Rule dynamicRule;

        /**
         * <p>The type of the device group. Valid values:</p>
         * <ul>
         * <li><strong>static</strong>: A static device group. Its members are manually added terminal devices.</li>
         * <li><strong>dynamic</strong>: A dynamic device group. Its members are automatically calculated based on matching rules when terminal devices report heartbeats.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>Specifies whether the device group is a built-in system device group. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The device group is a built-in system device group.</li>
         * <li><strong>false</strong>: The device group is a custom device group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The IDs of the terminal devices associated with the device group.</p>
         */
        @NameInMap("MatchDevTags")
        public java.util.List<String> matchDevTags;

        /**
         * <p>The name of the device group.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Name")
        public String name;

        public static ListDeviceGroupsResponseBodyDeviceGroups build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceGroupsResponseBodyDeviceGroups self = new ListDeviceGroupsResponseBodyDeviceGroups();
            return TeaModel.build(map, self);
        }

        public ListDeviceGroupsResponseBodyDeviceGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListDeviceGroupsResponseBodyDeviceGroups setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        @Deprecated
        public ListDeviceGroupsResponseBodyDeviceGroups setDynamicOperator(String dynamicOperator) {
            this.dynamicOperator = dynamicOperator;
            return this;
        }
        public String getDynamicOperator() {
            return this.dynamicOperator;
        }

        public ListDeviceGroupsResponseBodyDeviceGroups setDynamicRule(Rule dynamicRule) {
            this.dynamicRule = dynamicRule;
            return this;
        }
        public Rule getDynamicRule() {
            return this.dynamicRule;
        }

        public ListDeviceGroupsResponseBodyDeviceGroups setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public ListDeviceGroupsResponseBodyDeviceGroups setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public ListDeviceGroupsResponseBodyDeviceGroups setMatchDevTags(java.util.List<String> matchDevTags) {
            this.matchDevTags = matchDevTags;
            return this;
        }
        public java.util.List<String> getMatchDevTags() {
            return this.matchDevTags;
        }

        public ListDeviceGroupsResponseBodyDeviceGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
