// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceMaintenanceAttributesResponseBody extends TeaModel {
    @NameInMap("MaintenanceAttributes")
    public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes maintenanceAttributes;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceMaintenanceAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMaintenanceAttributesResponseBody self = new DescribeInstanceMaintenanceAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMaintenanceAttributesResponseBody setMaintenanceAttributes(DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes maintenanceAttributes) {
        this.maintenanceAttributes = maintenanceAttributes;
        return this;
    }
    public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes getMaintenanceAttributes() {
        return this.maintenanceAttributes;
    }

    public DescribeInstanceMaintenanceAttributesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceMaintenanceAttributesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceMaintenanceAttributesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceMaintenanceAttributesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues extends TeaModel {
        @NameInMap("SupportedValue")
        public java.util.List<String> supportedValue;

        public static DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues self = new DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues setSupportedValue(java.util.List<String> supportedValue) {
            this.supportedValue = supportedValue;
            return this;
        }
        public java.util.List<String> getSupportedValue() {
            return this.supportedValue;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenance extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("SupportedValues")
        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues supportedValues;

        @NameInMap("Value")
        public String value;

        public static DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenance self = new DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenance setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenance setSupportedValues(DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues supportedValues) {
            this.supportedValues = supportedValues;
            return this;
        }
        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues getSupportedValues() {
            return this.supportedValues;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenance setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow self = new DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindows extends TeaModel {
        @NameInMap("MaintenanceWindow")
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow> maintenanceWindow;

        public static DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindows build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindows self = new DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindows();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindows setMaintenanceWindow(java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow> getMaintenanceWindow() {
            return this.maintenanceWindow;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute extends TeaModel {
        @NameInMap("ActionOnMaintenance")
        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenance actionOnMaintenance;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MaintenanceWindows")
        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindows maintenanceWindows;

        @NameInMap("NotifyOnMaintenance")
        public Boolean notifyOnMaintenance;

        public static DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute self = new DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute setActionOnMaintenance(DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenance actionOnMaintenance) {
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }
        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeActionOnMaintenance getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute setMaintenanceWindows(DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindows maintenanceWindows) {
            this.maintenanceWindows = maintenanceWindows;
            return this;
        }
        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttributeMaintenanceWindows getMaintenanceWindows() {
            return this.maintenanceWindows;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute setNotifyOnMaintenance(Boolean notifyOnMaintenance) {
            this.notifyOnMaintenance = notifyOnMaintenance;
            return this;
        }
        public Boolean getNotifyOnMaintenance() {
            return this.notifyOnMaintenance;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes extends TeaModel {
        @NameInMap("MaintenanceAttribute")
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute> maintenanceAttribute;

        public static DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes self = new DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes setMaintenanceAttribute(java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute> maintenanceAttribute) {
            this.maintenanceAttribute = maintenanceAttribute;
            return this;
        }
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceAttribute> getMaintenanceAttribute() {
            return this.maintenanceAttribute;
        }

    }

}
