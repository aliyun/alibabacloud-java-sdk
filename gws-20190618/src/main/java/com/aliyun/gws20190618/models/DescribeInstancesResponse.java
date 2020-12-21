// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("Instances")
    @Validation(required = true)
    public java.util.List<DescribeInstancesResponseInstances> instances;

    public static DescribeInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstancesResponse self = new DescribeInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstancesResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeInstancesResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeInstancesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeInstancesResponse setInstances(java.util.List<DescribeInstancesResponseInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeInstancesResponseInstances> getInstances() {
        return this.instances;
    }

    public static class DescribeInstancesResponseInstancesAppList extends TeaModel {
        @NameInMap("AppName")
        @Validation(required = true)
        public String appName;

        @NameInMap("AppPath")
        @Validation(required = true)
        public String appPath;

        @NameInMap("AppArgs")
        @Validation(required = true)
        public String appArgs;

        public static DescribeInstancesResponseInstancesAppList build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstancesAppList self = new DescribeInstancesResponseInstancesAppList();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstancesAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeInstancesResponseInstancesAppList setAppPath(String appPath) {
            this.appPath = appPath;
            return this;
        }
        public String getAppPath() {
            return this.appPath;
        }

        public DescribeInstancesResponseInstancesAppList setAppArgs(String appArgs) {
            this.appArgs = appArgs;
            return this;
        }
        public String getAppArgs() {
            return this.appArgs;
        }

    }

    public static class DescribeInstancesResponseInstances extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ClusterId")
        @Validation(required = true)
        public String clusterId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("WorkMode")
        @Validation(required = true)
        public String workMode;

        @NameInMap("StoppedMode")
        @Validation(required = true)
        public String stoppedMode;

        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("InstanceChargeType")
        @Validation(required = true)
        public String instanceChargeType;

        @NameInMap("InstanceType")
        @Validation(required = true)
        public String instanceType;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public String createTime;

        @NameInMap("ExpireTime")
        @Validation(required = true)
        public String expireTime;

        @NameInMap("UserUid")
        @Validation(required = true)
        public Long userUid;

        @NameInMap("UserName")
        @Validation(required = true)
        public String userName;

        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("MaxBandwidthIn")
        @Validation(required = true)
        public Long maxBandwidthIn;

        @NameInMap("MaxBandwidthOut")
        @Validation(required = true)
        public Long maxBandwidthOut;

        @NameInMap("IsBoundUser")
        @Validation(required = true)
        public Boolean isBoundUser;

        @NameInMap("AppList")
        @Validation(required = true)
        public java.util.List<DescribeInstancesResponseInstancesAppList> appList;

        public static DescribeInstancesResponseInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstancesResponseInstances self = new DescribeInstancesResponseInstances();
            return TeaModel.build(map, self);
        }

        public DescribeInstancesResponseInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstancesResponseInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeInstancesResponseInstances setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeInstancesResponseInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeInstancesResponseInstances setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public DescribeInstancesResponseInstances setStoppedMode(String stoppedMode) {
            this.stoppedMode = stoppedMode;
            return this;
        }
        public String getStoppedMode() {
            return this.stoppedMode;
        }

        public DescribeInstancesResponseInstances setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeInstancesResponseInstances setInstanceChargeType(String instanceChargeType) {
            this.instanceChargeType = instanceChargeType;
            return this;
        }
        public String getInstanceChargeType() {
            return this.instanceChargeType;
        }

        public DescribeInstancesResponseInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeInstancesResponseInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeInstancesResponseInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeInstancesResponseInstances setUserUid(Long userUid) {
            this.userUid = userUid;
            return this;
        }
        public Long getUserUid() {
            return this.userUid;
        }

        public DescribeInstancesResponseInstances setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeInstancesResponseInstances setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeInstancesResponseInstances setMaxBandwidthIn(Long maxBandwidthIn) {
            this.maxBandwidthIn = maxBandwidthIn;
            return this;
        }
        public Long getMaxBandwidthIn() {
            return this.maxBandwidthIn;
        }

        public DescribeInstancesResponseInstances setMaxBandwidthOut(Long maxBandwidthOut) {
            this.maxBandwidthOut = maxBandwidthOut;
            return this;
        }
        public Long getMaxBandwidthOut() {
            return this.maxBandwidthOut;
        }

        public DescribeInstancesResponseInstances setIsBoundUser(Boolean isBoundUser) {
            this.isBoundUser = isBoundUser;
            return this;
        }
        public Boolean getIsBoundUser() {
            return this.isBoundUser;
        }

        public DescribeInstancesResponseInstances setAppList(java.util.List<DescribeInstancesResponseInstancesAppList> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<DescribeInstancesResponseInstancesAppList> getAppList() {
            return this.appList;
        }

    }

}
