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
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of the information.</p>
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
        /**
         * <p>The runtime parameters of the application.</p>
         */
        @NameInMap("AppArgs")
        public String appArgs;

        /**
         * <p>The name of the application.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The running path of the application.</p>
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
         * <p>The application information.</p>
         * <br>
         * <p>>  This parameter is emtryp if the working mode is Desktop.</p>
         */
        @NameInMap("AppList")
        public DescribeGWSInstancesResponseBodyInstancesInstanceInfoAppList appList;

        /**
         * <p>The ID of the visualization cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The time at which the visualization instance was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time at which the visualization instance expires.</p>
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
         * <p>*   Creating</p>
         * <p>*   Starting</p>
         * <p>*   Stopping</p>
         * <p>*   Stopped</p>
         * <p>*   Initializing</p>
         * <p>*   Unregistered</p>
         * <p>*   Registered</p>
         * <p>*   InUse</p>
         * <p>*   Missing</p>
         * <p>*   Cloning: The image is being created.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The username assigned to the visualization instance.</p>
         * <br>
         * <p>>  This parameter is empty if the instance is not assigned to specified users.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The working mode of the visualization instance. Valid values:</p>
         * <br>
         * <p>*   Desktop: the desktop mode</p>
         * <p>*   Application: the application mode</p>
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
