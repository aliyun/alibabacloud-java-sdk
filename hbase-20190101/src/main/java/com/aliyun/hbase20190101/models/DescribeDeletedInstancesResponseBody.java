// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class DescribeDeletedInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeDeletedInstancesResponseBodyInstances instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDeletedInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDeletedInstancesResponseBody self = new DescribeDeletedInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDeletedInstancesResponseBody setInstances(DescribeDeletedInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeDeletedInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeDeletedInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDeletedInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDeletedInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDeletedInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDeletedInstancesResponseBodyInstancesInstance extends TeaModel {
        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("DeleteTime")
        public String deleteTime;

        @NameInMap("Engine")
        public String engine;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("MajorVersion")
        public String majorVersion;

        @NameInMap("ModuleStackVersion")
        public String moduleStackVersion;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Status")
        public String status;

        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeDeletedInstancesResponseBodyInstancesInstance build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeletedInstancesResponseBodyInstancesInstance self = new DescribeDeletedInstancesResponseBodyInstancesInstance();
            return TeaModel.build(map, self);
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setDeleteTime(String deleteTime) {
            this.deleteTime = deleteTime;
            return this;
        }
        public String getDeleteTime() {
            return this.deleteTime;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setEngine(String engine) {
            this.engine = engine;
            return this;
        }
        public String getEngine() {
            return this.engine;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setMajorVersion(String majorVersion) {
            this.majorVersion = majorVersion;
            return this;
        }
        public String getMajorVersion() {
            return this.majorVersion;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setModuleStackVersion(String moduleStackVersion) {
            this.moduleStackVersion = moduleStackVersion;
            return this;
        }
        public String getModuleStackVersion() {
            return this.moduleStackVersion;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDeletedInstancesResponseBodyInstancesInstance setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeDeletedInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Instance")
        public java.util.List<DescribeDeletedInstancesResponseBodyInstancesInstance> instance;

        public static DescribeDeletedInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeDeletedInstancesResponseBodyInstances self = new DescribeDeletedInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeDeletedInstancesResponseBodyInstances setInstance(java.util.List<DescribeDeletedInstancesResponseBodyInstancesInstance> instance) {
            this.instance = instance;
            return this;
        }
        public java.util.List<DescribeDeletedInstancesResponseBodyInstancesInstance> getInstance() {
            return this.instance;
        }

    }

}
