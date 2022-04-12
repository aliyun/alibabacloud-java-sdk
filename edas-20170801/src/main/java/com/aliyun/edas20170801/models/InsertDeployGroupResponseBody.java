// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertDeployGroupResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("DeployGroupEntity")
    public InsertDeployGroupResponseBodyDeployGroupEntity deployGroupEntity;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppVersionId")
        public String appVersionId;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupType")
        public Integer groupType;

        @NameInMap("Id")
        public String id;

        @NameInMap("PackageVersionId")
        public String packageVersionId;

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
