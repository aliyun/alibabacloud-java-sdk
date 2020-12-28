// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeInstanceMaintenanceAttributesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("MaintenanceAttributes")
    public java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes> maintenanceAttributes;

    public static DescribeInstanceMaintenanceAttributesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceMaintenanceAttributesResponseBody self = new DescribeInstanceMaintenanceAttributesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceMaintenanceAttributesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeInstanceMaintenanceAttributesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstanceMaintenanceAttributesResponseBody setMaintenanceAttributes(java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes> maintenanceAttributes) {
        this.maintenanceAttributes = maintenanceAttributes;
        return this;
    }
    public java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes> getMaintenanceAttributes() {
        return this.maintenanceAttributes;
    }

    public static class DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceWindows extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceWindows build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceWindows self = new DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceWindows();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceWindows setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceWindows setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesActionOnMaintenance extends TeaModel {
        @NameInMap("Value")
        public String value;

        @NameInMap("SupportedValues")
        public java.util.List<String> supportedValues;

        @NameInMap("DefaultValue")
        public String defaultValue;

        public static DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesActionOnMaintenance build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesActionOnMaintenance self = new DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesActionOnMaintenance();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesActionOnMaintenance setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesActionOnMaintenance setSupportedValues(java.util.List<String> supportedValues) {
            this.supportedValues = supportedValues;
            return this;
        }
        public java.util.List<String> getSupportedValues() {
            return this.supportedValues;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesActionOnMaintenance setDefaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }
        public String getDefaultValue() {
            return this.defaultValue;
        }

    }

    public static class DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes extends TeaModel {
        @NameInMap("MaintenanceWindows")
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceWindows> maintenanceWindows;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ActionOnMaintenance")
        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesActionOnMaintenance actionOnMaintenance;

        public static DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes self = new DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes setMaintenanceWindows(java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceWindows> maintenanceWindows) {
            this.maintenanceWindows = maintenanceWindows;
            return this;
        }
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesMaintenanceWindows> getMaintenanceWindows() {
            return this.maintenanceWindows;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributes setActionOnMaintenance(DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesActionOnMaintenance actionOnMaintenance) {
            this.actionOnMaintenance = actionOnMaintenance;
            return this;
        }
        public DescribeInstanceMaintenanceAttributesResponseBodyMaintenanceAttributesActionOnMaintenance getActionOnMaintenance() {
            return this.actionOnMaintenance;
        }

    }

}
