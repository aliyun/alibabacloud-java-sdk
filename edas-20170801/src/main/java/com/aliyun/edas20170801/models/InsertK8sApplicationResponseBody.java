// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class InsertK8sApplicationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ApplicationInfo")
    public InsertK8sApplicationResponseBodyApplicationInfo applicationInfo;

    @NameInMap("Code")
    public Integer code;

    public static InsertK8sApplicationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertK8sApplicationResponseBody self = new InsertK8sApplicationResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertK8sApplicationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertK8sApplicationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertK8sApplicationResponseBody setApplicationInfo(InsertK8sApplicationResponseBodyApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }
    public InsertK8sApplicationResponseBodyApplicationInfo getApplicationInfo() {
        return this.applicationInfo;
    }

    public InsertK8sApplicationResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class InsertK8sApplicationResponseBodyApplicationInfo extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Dockerize")
        public Boolean dockerize;

        @NameInMap("Owner")
        public String owner;

        @NameInMap("EdasId")
        public String edasId;

        @NameInMap("ClusterType")
        public Integer clusterType;

        @NameInMap("AppId")
        public String appId;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("RegionId")
        public String regionId;

        public static InsertK8sApplicationResponseBodyApplicationInfo build(java.util.Map<String, ?> map) throws Exception {
            InsertK8sApplicationResponseBodyApplicationInfo self = new InsertK8sApplicationResponseBodyApplicationInfo();
            return TeaModel.build(map, self);
        }

        public InsertK8sApplicationResponseBodyApplicationInfo setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public InsertK8sApplicationResponseBodyApplicationInfo setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public InsertK8sApplicationResponseBodyApplicationInfo setDockerize(Boolean dockerize) {
            this.dockerize = dockerize;
            return this;
        }
        public Boolean getDockerize() {
            return this.dockerize;
        }

        public InsertK8sApplicationResponseBodyApplicationInfo setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public InsertK8sApplicationResponseBodyApplicationInfo setEdasId(String edasId) {
            this.edasId = edasId;
            return this;
        }
        public String getEdasId() {
            return this.edasId;
        }

        public InsertK8sApplicationResponseBodyApplicationInfo setClusterType(Integer clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public Integer getClusterType() {
            return this.clusterType;
        }

        public InsertK8sApplicationResponseBodyApplicationInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public InsertK8sApplicationResponseBodyApplicationInfo setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public InsertK8sApplicationResponseBodyApplicationInfo setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

}
