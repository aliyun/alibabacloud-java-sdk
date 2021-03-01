// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListApplicationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ApplicationList")
    public ListApplicationResponseBodyApplicationList applicationList;

    @NameInMap("Code")
    public Integer code;

    public static ListApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationResponseBody self = new ListApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationResponseBody setApplicationList(ListApplicationResponseBodyApplicationList applicationList) {
        this.applicationList = applicationList;
        return this;
    }
    public ListApplicationResponseBodyApplicationList getApplicationList() {
        return this.applicationList;
    }

    public ListApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class ListApplicationResponseBodyApplicationListApplication extends TeaModel {
        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ApplicationType")
        public String applicationType;

        @NameInMap("Name")
        public String name;

        @NameInMap("RunningInstanceCount")
        public Integer runningInstanceCount;

        @NameInMap("BuildPackageId")
        public Long buildPackageId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("RegionId")
        public String regionId;

        public static ListApplicationResponseBodyApplicationListApplication build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationResponseBodyApplicationListApplication self = new ListApplicationResponseBodyApplicationListApplication();
            return TeaModel.build(map, self);
        }

        public ListApplicationResponseBodyApplicationListApplication setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public ListApplicationResponseBodyApplicationListApplication setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListApplicationResponseBodyApplicationListApplication setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListApplicationResponseBodyApplicationListApplication setApplicationType(String applicationType) {
            this.applicationType = applicationType;
            return this;
        }
        public String getApplicationType() {
            return this.applicationType;
        }

        public ListApplicationResponseBodyApplicationListApplication setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListApplicationResponseBodyApplicationListApplication setRunningInstanceCount(Integer runningInstanceCount) {
            this.runningInstanceCount = runningInstanceCount;
            return this;
        }
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        public ListApplicationResponseBodyApplicationListApplication setBuildPackageId(Long buildPackageId) {
            this.buildPackageId = buildPackageId;
            return this;
        }
        public Long getBuildPackageId() {
            return this.buildPackageId;
        }

        public ListApplicationResponseBodyApplicationListApplication setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public ListApplicationResponseBodyApplicationListApplication setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class ListApplicationResponseBodyApplicationList extends TeaModel {
        @NameInMap("Application")
        public java.util.List<ListApplicationResponseBodyApplicationListApplication> application;

        public static ListApplicationResponseBodyApplicationList build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationResponseBodyApplicationList self = new ListApplicationResponseBodyApplicationList();
            return TeaModel.build(map, self);
        }

        public ListApplicationResponseBodyApplicationList setApplication(java.util.List<ListApplicationResponseBodyApplicationListApplication> application) {
            this.application = application;
            return this;
        }
        public java.util.List<ListApplicationResponseBodyApplicationListApplication> getApplication() {
            return this.application;
        }

    }

}
