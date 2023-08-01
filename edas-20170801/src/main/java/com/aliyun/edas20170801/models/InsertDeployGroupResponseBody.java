// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertDeployGroupResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code that is returned.</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The information about the instance group.</p>
     */
    @NameInMap("DeployGroupEntity")
    public InsertDeployGroupResponseBodyDeployGroupEntity deployGroupEntity;

    /**
     * <p>The additional information that is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static InsertDeployGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertDeployGroupResponseBody self = new InsertDeployGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertDeployGroupResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public InsertDeployGroupResponseBody setDeployGroupEntity(InsertDeployGroupResponseBodyDeployGroupEntity deployGroupEntity) {
        this.deployGroupEntity = deployGroupEntity;
        return this;
    }
    public InsertDeployGroupResponseBodyDeployGroupEntity getDeployGroupEntity() {
        return this.deployGroupEntity;
    }

    public InsertDeployGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertDeployGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class InsertDeployGroupResponseBodyDeployGroupEntity extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The version of the deployment package for the application.</p>
         * <br>
         * <p>*   If the application is deployed, a string of random numbers is returned.</p>
         * <p>*   If the application is not deployed, the return value is empty.</p>
         */
        @NameInMap("AppVersionId")
        public String appVersionId;

        /**
         * <p>The ID of the cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The time when the instance group was created. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The name of the instance group.</p>
         */
        @NameInMap("GroupName")
        public String groupName;

        /**
         * <p>The type of the instance group. Valid values:</p>
         * <br>
         * <p>*   0: the default group.</p>
         * <p>*   1: a group for which canary traffic management is not enabled.</p>
         * <p>*   2: a group for which canary traffic management is enabled.</p>
         */
        @NameInMap("GroupType")
        public Integer groupType;

        /**
         * <p>The ID of the instance group.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The version of the deployment package that was used to deploy an application in the instance group.</p>
         * <br>
         * <p>*   If an application is deployed in the instance group, a string of random numbers is returned.</p>
         * <p>*   If no application is deployed in the instance group, the return value is empty.</p>
         */
        @NameInMap("PackageVersionId")
        public String packageVersionId;

        /**
         * <p>The time when the instance group was last modified. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static InsertDeployGroupResponseBodyDeployGroupEntity build(java.util.Map<String, ?> map) throws Exception {
            InsertDeployGroupResponseBodyDeployGroupEntity self = new InsertDeployGroupResponseBodyDeployGroupEntity();
            return TeaModel.build(map, self);
        }

        public InsertDeployGroupResponseBodyDeployGroupEntity setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InsertDeployGroupResponseBodyDeployGroupEntity setAppVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }
        public String getAppVersionId() {
            return this.appVersionId;
        }

        public InsertDeployGroupResponseBodyDeployGroupEntity setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public InsertDeployGroupResponseBodyDeployGroupEntity setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public InsertDeployGroupResponseBodyDeployGroupEntity setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public InsertDeployGroupResponseBodyDeployGroupEntity setGroupType(Integer groupType) {
            this.groupType = groupType;
            return this;
        }
        public Integer getGroupType() {
            return this.groupType;
        }

        public InsertDeployGroupResponseBodyDeployGroupEntity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public InsertDeployGroupResponseBodyDeployGroupEntity setPackageVersionId(String packageVersionId) {
            this.packageVersionId = packageVersionId;
            return this;
        }
        public String getPackageVersionId() {
            return this.packageVersionId;
        }

        public InsertDeployGroupResponseBodyDeployGroupEntity setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
