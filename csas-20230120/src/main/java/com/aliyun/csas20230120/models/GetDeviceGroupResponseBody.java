// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDeviceGroupResponseBody extends TeaModel {
    /**
     * <p>The device group details.</p>
     */
    @NameInMap("DeviceGroup")
    public GetDeviceGroupResponseBodyDeviceGroup deviceGroup;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>BE4FB974-11BC-5453-9BE1-1606A73EACA6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetDeviceGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceGroupResponseBody self = new GetDeviceGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDeviceGroupResponseBody setDeviceGroup(GetDeviceGroupResponseBodyDeviceGroup deviceGroup) {
        this.deviceGroup = deviceGroup;
        return this;
    }
    public GetDeviceGroupResponseBodyDeviceGroup getDeviceGroup() {
        return this.deviceGroup;
    }

    public GetDeviceGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetDeviceGroupResponseBodyDeviceGroup extends TeaModel {
        /**
         * <p>The description of the device group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test device group description</p>
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
         * <li><strong>static</strong>: A static device group. Members are terminal devices that are manually added.</li>
         * <li><strong>dynamic</strong>: A dynamic device group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>Indicates whether the device group is a built-in system device group. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The device group is a built-in system device group.</li>
         * <li><strong>false</strong>: The device group is a custom device group.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The IDs of the devices associated with the device group.</p>
         */
        @NameInMap("MatchDevTags")
        public java.util.List<String> matchDevTags;

        /**
         * <p>The name of the device group.</p>
         * 
         * <strong>example:</strong>
         * <p>autotest_a1b2bfd0</p>
         */
        @NameInMap("Name")
        public String name;

        public static GetDeviceGroupResponseBodyDeviceGroup build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceGroupResponseBodyDeviceGroup self = new GetDeviceGroupResponseBodyDeviceGroup();
            return TeaModel.build(map, self);
        }

        public GetDeviceGroupResponseBodyDeviceGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetDeviceGroupResponseBodyDeviceGroup setDeviceGroupId(String deviceGroupId) {
            this.deviceGroupId = deviceGroupId;
            return this;
        }
        public String getDeviceGroupId() {
            return this.deviceGroupId;
        }

        @Deprecated
        public GetDeviceGroupResponseBodyDeviceGroup setDynamicOperator(String dynamicOperator) {
            this.dynamicOperator = dynamicOperator;
            return this;
        }
        public String getDynamicOperator() {
            return this.dynamicOperator;
        }

        public GetDeviceGroupResponseBodyDeviceGroup setDynamicRule(Rule dynamicRule) {
            this.dynamicRule = dynamicRule;
            return this;
        }
        public Rule getDynamicRule() {
            return this.dynamicRule;
        }

        public GetDeviceGroupResponseBodyDeviceGroup setGroupType(String groupType) {
            this.groupType = groupType;
            return this;
        }
        public String getGroupType() {
            return this.groupType;
        }

        public GetDeviceGroupResponseBodyDeviceGroup setIsDefault(String isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public String getIsDefault() {
            return this.isDefault;
        }

        public GetDeviceGroupResponseBodyDeviceGroup setMatchDevTags(java.util.List<String> matchDevTags) {
            this.matchDevTags = matchDevTags;
            return this;
        }
        public java.util.List<String> getMatchDevTags() {
            return this.matchDevTags;
        }

        public GetDeviceGroupResponseBodyDeviceGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
