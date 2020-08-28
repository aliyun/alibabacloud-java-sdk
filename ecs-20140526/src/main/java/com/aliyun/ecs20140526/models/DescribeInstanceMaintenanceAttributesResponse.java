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

    }

    public static class DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows extends TeaModel {
        @NameInMap("MaintenanceWindow")
        @Validation(required = true)
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindowsMaintenanceWindow> maintenanceWindow;

        public static DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows self = new DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttributeMaintenanceWindows();
            return TeaModel.build(map, self);
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

    }

    public static class DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes extends TeaModel {
        @NameInMap("MaintenanceAttribute")
        @Validation(required = true)
        public java.util.List<DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributesMaintenanceAttribute> maintenanceAttribute;

        public static DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes self = new DescribeInstanceMaintenanceAttributesResponseMaintenanceAttributes();
            return TeaModel.build(map, self);
        }

    }

}
