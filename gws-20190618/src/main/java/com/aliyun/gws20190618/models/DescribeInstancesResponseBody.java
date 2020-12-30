// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeInstancesResponseBodyInstances> instances;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Long pageNumber;

    public static DescribeInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponseBody self = new DescribeInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponseBody setInstances(java.util.List<DescribeInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeInstancesResponseBodyInstancesAppList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppPath")
        public String appPath;

        @NameInMap("AppArgs")
        public String appArgs;

        public static DescribeInstancesResponseBodyInstancesAppList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstancesAppList self = new DescribeInstancesResponseBodyInstancesAppList();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstancesAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeInstancesResponseBodyInstancesAppList setAppPath(String appPath) {
            this.appPath = appPath;
            return this;
        }
        public String getAppPath() {
            return this.appPath;
        }

        public DescribeInstancesResponseBodyInstancesAppList setAppArgs(String appArgs) {
            this.appArgs = appArgs;
            return this;
        }
        public String getAppArgs() {
            return this.appArgs;
        }

    }

    public static class DescribeInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("WorkMode")
        public String workMode;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("StoppedMode")
        public String stoppedMode;

        @NameInMap("UserUid")
        public Long userUid;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("InstanceChargeType")
        public String instanceChargeType;

        @NameInMap("AppList")
        public java.util.List<DescribeInstancesResponseBodyInstancesAppList> appList;

        @NameInMap("MaxBandwidthIn")
        public Long maxBandwidthIn;

        @NameInMap("IsBoundUser")
        public Boolean isBoundUser;

        @NameInMap("MaxBandwidthOut")
        public Long maxBandwidthOut;

        @NameInMap("Name")
        public String name;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseBodyInstances self = new DescribeInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseBodyInstances setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public DescribeInstancesResponseBodyInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseBodyInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstancesResponseBodyInstances setStoppedMode(String stoppedMode) {
            this.stoppedMode = stoppedMode;
            return this;
        }
        public String getStoppedMode() {
            return this.stoppedMode;
        }

        public DescribeInstancesResponseBodyInstances setUserUid(Long userUid) {
            this.userUid = userUid;
            return this;
        }
        public Long getUserUid() {
            return this.userUid;
        }

        public DescribeInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseBodyInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesResponseBodyInstances setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeInstancesResponseBodyInstances setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeInstancesResponseBodyInstances setAppList(java.util.List<DescribeInstancesResponseBodyInstancesAppList> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<DescribeInstancesResponseBodyInstancesAppList> getAppList() {
            return this.appList;
        }

        public DescribeInstancesResponseBodyInstances setMaxBandwidthIn(Long maxBandwidthIn) {
            this.maxBandwidthIn = maxBandwidthIn;
            return this;
        }
        public Long getMaxBandwidthIn() {
            return this.maxBandwidthIn;
        }

        public DescribeInstancesResponseBodyInstances setIsBoundUser(Boolean isBoundUser) {
            this.isBoundUser = isBoundUser;
            return this;
        }
        public Boolean getIsBoundUser() {
            return this.isBoundUser;
        }

        public DescribeInstancesResponseBodyInstances setMaxBandwidthOut(Long maxBandwidthOut) {
            this.maxBandwidthOut = maxBandwidthOut;
            return this;
        }
        public Long getMaxBandwidthOut() {
            return this.maxBandwidthOut;
        }

        public DescribeInstancesResponseBodyInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesResponseBodyInstances setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeInstancesResponseBodyInstances setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstancesResponseBodyInstances setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
