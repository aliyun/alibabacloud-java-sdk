// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceMaintenanceAttributesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("MaintenanceAttributes")
    @Validation(required = true)
    public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes maintenanceAttributes;

    public static DescribeInstanceMaintenanceAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMaintenanceAttributesResponse self = new DescribeInstanceMaintenanceAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMaintenanceAttributesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceMaintenanceAttributesResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstanceMaintenanceAttributesResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceMaintenanceAttributesResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceMaintenanceAttributesResponse setMaintenanceAttributes(DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes maintenanceAttributes) {
        this.maintenanceAttributes = maintenanceAttributes;
        return this;
    }
    public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes getMaintenanceAttributes() {
        return this.maintenanceAttributes;
    }

    public static class DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow extends TeaModel {
        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow self = new DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows extends TeaModel {
        @NameInMap("MaintenanceWindow")
        @Validation(required = true)
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow> maintenanceWindow;

        public static DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows self = new DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows setMaintenanceWindow(java.util.List<DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow> getMaintenanceWindow() {
            return this.maintenanceWindow;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues extends TeaModel {
        // SupportedValue
        @NameInMap("SupportedValue")
        @Validation(required = true)
        public java.util.List<String> supportedValue;

        public static DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues self = new DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues setSupportedValue(java.util.List<String> supportedValue) {
            this.supportedValue = supportedValue;
            return this;
        }
        public java.util.List<String> getSupportedValue() {
            return this.supportedValue;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenance extends TeaModel {
        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        @NameInMap("DefaultValue")
        @Validation(required = true)
        public String defaultValue;

        @NameInMap("SupportedValues")
        @Validation(required = true)
        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues supportedValues;

        public static DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenance self = new DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenance setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenance setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenance setSupportedValues(DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues supportedValues) {
            this.supportedValues = supportedValues;
            return this;
        }
        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenanceSupportedValues getSupportedValues() {
            return this.supportedValues;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("MaintenanceWindows")
        @Validation(required = true)
        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows maintenanceWindows;

        @NameInMap("ActionOnMaintenance")
        @Validation(required = true)
        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenance actionOnMaintenance;

        public static DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute self = new DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute setMaintenanceWindows(DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows maintenanceWindows) {
            this.maintenanceWindows = maintenanceWindows;
            return this;
        }
        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows getMaintenanceWindows() {
            return this.maintenanceWindows;
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute setActionOnMaintenance(DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenance actionOnMaintenance) {
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }
        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeActionOnMaintenance getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes extends TeaModel {
        @NameInMap("MaintenanceAttribute")
        @Validation(required = true)
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute> maintenanceAttribute;

        public static DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes self = new DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes setMaintenanceAttribute(java.util.List<DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute> maintenanceAttribute) {
            this.maintenanceAttribute = maintenanceAttribute;
            return this;
        }
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute> getMaintenanceAttribute() {
            return this.maintenanceAttribute;
        }

    }

}
