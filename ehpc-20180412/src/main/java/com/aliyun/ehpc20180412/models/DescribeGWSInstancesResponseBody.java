// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSInstancesResponseBody extends TeaModel {
    @NameInMap("Instances")
    public java.util.List<DescribeGWSInstancesResponseBodyInstances> instances;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static DescribeGWSInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGWSInstancesResponseBody self = new DescribeGWSInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGWSInstancesResponseBody setInstances(java.util.List<DescribeGWSInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<DescribeGWSInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public DescribeGWSInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeGWSInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class DescribeGWSInstancesResponseBodyInstancesAppList extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("AppPath")
        public String appPath;

        @NameInMap("AppArgs")
        public String appArgs;

        public static DescribeGWSInstancesResponseBodyInstancesAppList build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSInstancesResponseBodyInstancesAppList self = new DescribeGWSInstancesResponseBodyInstancesAppList();
            return TeaModel.build(map, self);
        }

        public DescribeGWSInstancesResponseBodyInstancesAppList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeGWSInstancesResponseBodyInstancesAppList setAppPath(String appPath) {
            this.appPath = appPath;
            return this;
        }
        public String getAppPath() {
            return this.appPath;
        }

        public DescribeGWSInstancesResponseBodyInstancesAppList setAppArgs(String appArgs) {
            this.appArgs = appArgs;
            return this;
        }
        public String getAppArgs() {
            return this.appArgs;
        }

    }

    public static class DescribeGWSInstancesResponseBodyInstances extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("AppList")
        public java.util.List<DescribeGWSInstancesResponseBodyInstancesAppList> appList;

        @NameInMap("WorkMode")
        public String workMode;

        @NameInMap("ExpireTime")
        public String expireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("ClusterId")
        public String clusterId;

        public static DescribeGWSInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeGWSInstancesResponseBodyInstances self = new DescribeGWSInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public DescribeGWSInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeGWSInstancesResponseBodyInstances setAppList(java.util.List<DescribeGWSInstancesResponseBodyInstancesAppList> appList) {
            this.appList = appList;
            return this;
        }
        public java.util.List<DescribeGWSInstancesResponseBodyInstancesAppList> getAppList() {
            return this.appList;
        }

        public DescribeGWSInstancesResponseBodyInstances setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

        public DescribeGWSInstancesResponseBodyInstances setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public DescribeGWSInstancesResponseBodyInstances setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeGWSInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGWSInstancesResponseBodyInstances setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGWSInstancesResponseBodyInstances setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribeGWSInstancesResponseBodyInstances setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeGWSInstancesResponseBodyInstances setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
