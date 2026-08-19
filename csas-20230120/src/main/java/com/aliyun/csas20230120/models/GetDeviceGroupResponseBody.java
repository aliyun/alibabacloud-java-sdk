// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDeviceGroupResponseBody extends TeaModel {
    /**
     * <p>The device label details.</p>
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
         * <p>The device label description.</p>
         * 
         * <strong>example:</strong>
         * <p>Test device group description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The device label ID.</p>
         * 
         * <strong>example:</strong>
         * <p>device-group-5191cf830a5e****</p>
         */
        @NameInMap("DeviceGroupId")
        public String deviceGroupId;

        /**
         * <p>The dynamic device group rule operator.</p>
         * 
         * <strong>example:</strong>
         * <p>AND</p>
         */
        @NameInMap("DynamicOperator")
        @Deprecated
        public String dynamicOperator;

        /**
         * <p>The matching rule of the dynamic device label.</p>
         */
        @NameInMap("DynamicRule")
        public Rule dynamicRule;

        /**
         * <p>The device label type. Valid values:</p>
         * <ul>
         * <li><strong>static</strong>: Static device label. Members consist of manually added terminal devices.</li>
         * <li><strong>dynamic</strong>: Dynamic device label.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>static</p>
         */
        @NameInMap("GroupType")
        public String groupType;

        /**
         * <p>Indicates whether the device label is a system built-in device label. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: System built-in device label.</li>
         * <li><strong>false</strong>: User-defined device label.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public String isDefault;

        /**
         * <p>The collection of terminal device IDs associated with the device label.</p>
         */
        @NameInMap("MatchDevTags")
        public java.util.List<String> matchDevTags;

        /**
         * <p>The device label name.</p>
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
