// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeGWSInstancesResponseBody extends TeaModel {
    /**
     * <p>The list of visualization instances.</p>
     */
    @NameInMap("Instances")
    public DescribeGWSInstancesResponseBodyInstances instances;

    /**
     * <p>The page number of the current page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
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

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The execution directory of the application.</p>
         */
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
        /**
         * <p>The list of application information.</p>
         * <br>
         * <p>>  If the WorkMode parameter is set to Desktop, an empty value is returned in this parameter.</p>
         */
        @NameInMap("AppList")
        public DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppList appList;

        /**
         * <p>The ID of the visualizatio service.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The time when the visualization instance was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the visualization instance expires.</p>
         */
        @NameInMap("ExpireTime")
        public String expireTime;

        /**
         * <p>The ID of the visualization instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The type of the visualization instance.</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The name of the visualization instance.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The status of the visualization instance. Valid values:</p>
         * <br>
         * <p>*   Creating: The instance is being created.</p>
         * <p>*   Starting: The instance is being started.</p>
         * <p>*   Stopping: The instance is being stopped.</p>
         * <p>*   Stopped: The instance is stopped.</p>
         * <p>*   Initializing: The instance is being initialized.</p>
         * <p>*   Unregistered: The instance is not registered.</p>
         * <p>*   Registered: The instance is registered.</p>
         * <p>*   InUse: The instance is in use.</p>
         * <p>*   Missing: The instance cannot be found.</p>
         * <p>*   Cloning: An image is being generated based on the instance.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The username of the entity to which the visualization instance is assigned.</p>
         * <br>
         * <p>>  If the instance is not assigned to a specified user, this parameter is empty.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The working mode of the visualization instance. Valid values:</p>
         * <br>
         * <p>*   Desktop</p>
         * <p>*   Application</p>
         */
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
