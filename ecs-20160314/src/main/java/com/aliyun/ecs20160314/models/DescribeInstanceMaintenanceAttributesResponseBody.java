// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class DescribeInstanceMaintenanceAttributesResponseBody extends TeaModel {
    @NameInMap("MaintenanceAttributes")
    public MaintenanceAttributes maintenanceAttributes;

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

    public DescribeInstanceMaintenanceAttributesResponseBody setMaintenanceAttributes(MaintenanceAttributes maintenanceAttributes) {
        this.maintenanceAttributes = maintenanceAttributes;
        return this;
    }
    public MaintenanceAttributes getMaintenanceAttributes() {
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

    public static class SupportedValues extends TeaModel {
        @NameInMap("SupportedValue")
        public java.util.List<String> supportedValue;

        public static SupportedValues build(java.util.Map<String, ?> map) throws Exception {
            SupportedValues self = new SupportedValues();
            return TeaModel.build(map, self);
        }

        public SupportedValues setSupportedValue(java.util.List<String> supportedValue) {
            this.supportedValue = supportedValue;
            return this;
        }
        public java.util.List<String> getSupportedValue() {
            return this.supportedValue;
        }

    }

    public static class ActionOnMaintenance extends TeaModel {
        @NameInMap("DefaultValue")
        public String defaultValue;

        @NameInMap("SupportedValues")
        public SupportedValues supportedValues;

        @NameInMap("Value")
        public String value;

        public static ActionOnMaintenance build(java.util.Map<String, ?> map) throws Exception {
            ActionOnMaintenance self = new ActionOnMaintenance();
            return TeaModel.build(map, self);
        }

        public ActionOnMaintenance setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

        public ActionOnMaintenance setSupportedValues(SupportedValues supportedValues) {
            this.supportedValues = supportedValues;
            return this;
        }
        public SupportedValues getSupportedValues() {
            return this.supportedValues;
        }

        public ActionOnMaintenance setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class MaintenanceWindow extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static MaintenanceWindow build(java.util.Map<String, ?> map) throws Exception {
            MaintenanceWindow self = new MaintenanceWindow();
            return TeaModel.build(map, self);
        }

        public MaintenanceWindow setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public MaintenanceWindow setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class MaintenanceWindows extends TeaModel {
        @NameInMap("MaintenanceWindow")
        public java.util.List<MaintenanceWindow> maintenanceWindow;

        public static MaintenanceWindows build(java.util.Map<String, ?> map) throws Exception {
            MaintenanceWindows self = new MaintenanceWindows();
            return TeaModel.build(map, self);
        }

        public MaintenanceWindows setMaintenanceWindow(java.util.List<MaintenanceWindow> maintenanceWindow) {
            this.maintenanceWindow = maintenanceWindow;
            return this;
        }
        public java.util.List<MaintenanceWindow> getMaintenanceWindow() {
            return this.maintenanceWindow;
        }

    }

    public static class MaintenanceAttribute extends TeaModel {
        @NameInMap("ActionOnMaintenance")
        public ActionOnMaintenance actionOnMaintenance;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LiveMigration")
        public Boolean liveMigration;

        @NameInMap("MaintenanceWindows")
        public MaintenanceWindows maintenanceWindows;

        public static MaintenanceAttribute build(java.util.Map<String, ?> map) throws Exception {
            MaintenanceAttribute self = new MaintenanceAttribute();
            return TeaModel.build(map, self);
        }

        public MaintenanceAttribute setActionOnMaintenance(ActionOnMaintenance actionOnMaintenance) {
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }
        public ActionOnMaintenance getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

        public MaintenanceAttribute setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public MaintenanceAttribute setLiveMigration(Boolean liveMigration) {
            this.liveMigration = liveMigration;
            return this;
        }
        public Boolean getLiveMigration() {
            return this.liveMigration;
        }

        public MaintenanceAttribute setMaintenanceWindows(MaintenanceWindows maintenanceWindows) {
            this.maintenanceWindows = maintenanceWindows;
            return this;
        }
        public MaintenanceWindows getMaintenanceWindows() {
            return this.maintenanceWindows;
        }

    }

    public static class MaintenanceAttributes extends TeaModel {
        @NameInMap("MaintenanceAttribute")
        public java.util.List<MaintenanceAttribute> maintenanceAttribute;

        public static MaintenanceAttributes build(java.util.Map<String, ?> map) throws Exception {
            MaintenanceAttributes self = new MaintenanceAttributes();
            return TeaModel.build(map, self);
        }

        public MaintenanceAttributes setMaintenanceAttribute(java.util.List<MaintenanceAttribute> maintenanceAttribute) {
            this.maintenanceAttribute = maintenanceAttribute;
            return this;
        }
        public java.util.List<MaintenanceAttribute> getMaintenanceAttribute() {
            return this.maintenanceAttribute;
        }

    }

}
