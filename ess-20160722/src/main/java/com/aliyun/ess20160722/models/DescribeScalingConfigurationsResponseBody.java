// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ess20160722.models;

import com.aliyun.tea.*;

public class DescribeScalingConfigurationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScalingConfigurations")
    public DescribeScalingConfigurationsResponseBodyScalingConfigurations scalingConfigurations;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeScalingConfigurationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScalingConfigurationsResponseBody self = new DescribeScalingConfigurationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScalingConfigurationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeScalingConfigurationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeScalingConfigurationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScalingConfigurationsResponseBody setScalingConfigurations(DescribeScalingConfigurationsResponseBodyScalingConfigurations scalingConfigurations) {
        this.scalingConfigurations = scalingConfigurations;
        return this;
    }
    public DescribeScalingConfigurationsResponseBodyScalingConfigurations getScalingConfigurations() {
        return this.scalingConfigurations;
    }

    public DescribeScalingConfigurationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Device")
        public String device;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("SnapshotId")
        public String snapshotId;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk setSnapshotId(String snapshotId) {
            this.snapshotId = snapshotId;
            return this;
        }
        public String getSnapshotId() {
            return this.snapshotId;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks extends TeaModel {
        @NameInMap("DataDisk")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk> dataDisk;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks setDataDisk(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk> dataDisk) {
            this.dataDisk = dataDisk;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisksDataDisk> getDataDisk() {
            return this.dataDisk;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DataDisks")
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks dataDisks;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("InstanceGeneration")
        public String instanceGeneration;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("InternetChargeType")
        public String internetChargeType;

        @NameInMap("InternetMaxBandwidthIn")
        public Integer internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        public Integer internetMaxBandwidthOut;

        @NameInMap("IoOptimized")
        public String ioOptimized;

        @NameInMap("LifecycleState")
        public String lifecycleState;

        @NameInMap("ScalingConfigurationId")
        public String scalingConfigurationId;

        @NameInMap("ScalingConfigurationName")
        public String scalingConfigurationName;

        @NameInMap("ScalingGroupId")
        public String scalingGroupId;

        @NameInMap("SecurityGroupId")
        public String securityGroupId;

        @NameInMap("SystemDiskCategory")
        public String systemDiskCategory;

        @NameInMap("SystemDiskSize")
        public Integer systemDiskSize;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration self = new DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setDataDisks(DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks dataDisks) {
            this.dataDisks = dataDisks;
            return this;
        }
        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfigurationDataDisks getDataDisks() {
            return this.dataDisks;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInstanceGeneration(String instanceGeneration) {
            this.instanceGeneration = instanceGeneration;
            return this;
        }
        public String getInstanceGeneration() {
            return this.instanceGeneration;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInternetChargeType(String internetChargeType) {
            this.internetChargeType = internetChargeType;
            return this;
        }
        public String getInternetChargeType() {
            return this.internetChargeType;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInternetMaxBandwidthIn(Integer internetMaxBandwidthIn) {
            this.internetMaxBandwidthIn = internetMaxBandwidthIn;
            return this;
        }
        public Integer getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
            this.internetMaxBandwidthOut = internetMaxBandwidthOut;
            return this;
        }
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setIoOptimized(String ioOptimized) {
            this.ioOptimized = ioOptimized;
            return this;
        }
        public String getIoOptimized() {
            return this.ioOptimized;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setLifecycleState(String lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }
        public String getLifecycleState() {
            return this.lifecycleState;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setScalingConfigurationId(String scalingConfigurationId) {
            this.scalingConfigurationId = scalingConfigurationId;
            return this;
        }
        public String getScalingConfigurationId() {
            return this.scalingConfigurationId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setScalingConfigurationName(String scalingConfigurationName) {
            this.scalingConfigurationName = scalingConfigurationName;
            return this;
        }
        public String getScalingConfigurationName() {
            return this.scalingConfigurationName;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setScalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSecurityGroupId(String securityGroupId) {
            this.securityGroupId = securityGroupId;
            return this;
        }
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSystemDiskCategory(String systemDiskCategory) {
            this.systemDiskCategory = systemDiskCategory;
            return this;
        }
        public String getSystemDiskCategory() {
            return this.systemDiskCategory;
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration setSystemDiskSize(Integer systemDiskSize) {
            this.systemDiskSize = systemDiskSize;
            return this;
        }
        public Integer getSystemDiskSize() {
            return this.systemDiskSize;
        }

    }

    public static class DescribeScalingConfigurationsResponseBodyScalingConfigurations extends TeaModel {
        @NameInMap("ScalingConfiguration")
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration> scalingConfiguration;

        public static DescribeScalingConfigurationsResponseBodyScalingConfigurations build(java.util.Map<String, ?> map) throws Exception {
            DescribeScalingConfigurationsResponseBodyScalingConfigurations self = new DescribeScalingConfigurationsResponseBodyScalingConfigurations();
            return TeaModel.build(map, self);
        }

        public DescribeScalingConfigurationsResponseBodyScalingConfigurations setScalingConfiguration(java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration> scalingConfiguration) {
            this.scalingConfiguration = scalingConfiguration;
            return this;
        }
        public java.util.List<DescribeScalingConfigurationsResponseBodyScalingConfigurationsScalingConfiguration> getScalingConfiguration() {
            return this.scalingConfiguration;
        }

    }

}
