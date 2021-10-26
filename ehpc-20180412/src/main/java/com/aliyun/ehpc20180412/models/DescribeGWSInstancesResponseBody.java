// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public DescribeGWSInstancesResponseBodyInstances instances;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGWSInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSInstancesResponseBody self = new DescribeGWSInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGWSInstancesResponseBody setInstances(DescribeGWSInstancesResponseBodyInstances instances) {
        this.instances = instances;
        return this;
    }
    public DescribeGWSInstancesResponseBodyInstances getInstances() {
        return this.instances;
    }

    public DescribeGWSInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGWSInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGWSInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGWSInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppListAppInfo extends TeaModel {
        @NameInMap("AppArgs")
        public String appArgs;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppPath")
        public String appPath;

        public static DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppListAppInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppListAppInfo self = new DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppListAppInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppListAppInfo setAppArgs(String appArgs) {
            this.appArgs = appArgs;
            return this;
        }
        public String getAppArgs() {
            return this.appArgs;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppListAppInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppListAppInfo setAppPath(String appPath) {
            this.appPath = appPath;
            return this;
        }
        public String getAppPath() {
            return this.appPath;
        }

    }

    public static class DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppList extends TeaModel {
        @NameInMap("AppInfo")
        public java.util.List<DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppListAppInfo> appInfo;

        public static DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppList self = new DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppList();
            return TeaModel.build(map, self);
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppList setAppInfo(java.util.List<DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppListAppInfo> appInfo) {
            this.appInfo = appInfo;
            return this;
        }
        public java.util.List<DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppListAppInfo> getAppInfo() {
            return this.appInfo;
        }

    }

    public static class DescribeGWSInstancesResponseBodyInstancesInstanceInfo extends TeaModel {
        @NameInMap("AppList")
        public DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppList appList;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("WorkMode")
        public String workMode;

        public static DescribeGWSInstancesResponseBodyInstancesInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSInstancesResponseBodyInstancesInstanceInfo self = new DescribeGWSInstancesResponseBodyInstancesInstanceInfo();
            return TeaModel.build(map, self);
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfo setAppList(DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppList appList) {
            this.appList = appList;
            return this;
        }
        public DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppList getAppList() {
            return this.appList;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfo setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfo setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfo setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeGWSInstancesResponseBodyInstancesInstanceInfo setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class DescribeGWSInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("InstanceInfo")
        public java.util.List<DescribeGWSInstancesResponseBodyInstancesInstanceInfo> instanceInfo;

        public static DescribeGWSInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSInstancesResponseBodyInstances self = new DescribeGWSInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGWSInstancesResponseBodyInstances setInstanceInfo(java.util.List<DescribeGWSInstancesResponseBodyInstancesInstanceInfo> instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public java.util.List<DescribeGWSInstancesResponseBodyInstancesInstanceInfo> getInstanceInfo() {
            return this.instanceInfo;
        }

    }

}
