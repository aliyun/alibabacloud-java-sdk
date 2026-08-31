// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetComputeClusterResponseBody extends TeaModel {
    /**
     * <p>The cluster details.</p>
     */
    @NameInMap("ClusterConfig")
    public GetComputeClusterResponseBodyClusterConfig clusterConfig;

    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The details of the backend exception.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetComputeClusterResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetComputeClusterResponseBody self = new GetComputeClusterResponseBody();
        return TeaModel.build(map, self);
    }

    public GetComputeClusterResponseBody setClusterConfig(GetComputeClusterResponseBodyClusterConfig clusterConfig) {
        this.clusterConfig = clusterConfig;
        return this;
    }
    public GetComputeClusterResponseBodyClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    public GetComputeClusterResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetComputeClusterResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetComputeClusterResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetComputeClusterResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetComputeClusterResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetComputeClusterResponseBodyClusterConfigClusterSafetyControl extends TeaModel {
        /**
         * <p>The control mode.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE_COMPUTE_SOURCE</p>
         */
        @NameInMap("ClusterSafetyAuthType")
        public String clusterSafetyAuthType;

        /**
         * <p>The list of whitelisted user group IDs.</p>
         */
        @NameInMap("UserGroupIds")
        public java.util.List<String> userGroupIds;

        /**
         * <p>The list of whitelisted user group names.</p>
         */
        @NameInMap("UserGroupNames")
        public java.util.List<String> userGroupNames;

        /**
         * <p>The list of whitelisted user IDs.</p>
         */
        @NameInMap("UserIds")
        public java.util.List<String> userIds;

        /**
         * <p>The list of whitelisted usernames.</p>
         */
        @NameInMap("UserNames")
        public java.util.List<String> userNames;

        public static GetComputeClusterResponseBodyClusterConfigClusterSafetyControl build(java.util.Map<String, ?> map) throws Exception {
            GetComputeClusterResponseBodyClusterConfigClusterSafetyControl self = new GetComputeClusterResponseBodyClusterConfigClusterSafetyControl();
            return TeaModel.build(map, self);
        }

        public GetComputeClusterResponseBodyClusterConfigClusterSafetyControl setClusterSafetyAuthType(String clusterSafetyAuthType) {
            this.clusterSafetyAuthType = clusterSafetyAuthType;
            return this;
        }
        public String getClusterSafetyAuthType() {
            return this.clusterSafetyAuthType;
        }

        public GetComputeClusterResponseBodyClusterConfigClusterSafetyControl setUserGroupIds(java.util.List<String> userGroupIds) {
            this.userGroupIds = userGroupIds;
            return this;
        }
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        public GetComputeClusterResponseBodyClusterConfigClusterSafetyControl setUserGroupNames(java.util.List<String> userGroupNames) {
            this.userGroupNames = userGroupNames;
            return this;
        }
        public java.util.List<String> getUserGroupNames() {
            return this.userGroupNames;
        }

        public GetComputeClusterResponseBodyClusterConfigClusterSafetyControl setUserIds(java.util.List<String> userIds) {
            this.userIds = userIds;
            return this;
        }
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public GetComputeClusterResponseBodyClusterConfigClusterSafetyControl setUserNames(java.util.List<String> userNames) {
            this.userNames = userNames;
            return this;
        }
        public java.util.List<String> getUserNames() {
            return this.userNames;
        }

    }

    public static class GetComputeClusterResponseBodyClusterConfig extends TeaModel {
        /**
         * <p>The cluster security control configuration.</p>
         */
        @NameInMap("ClusterSafetyControl")
        public GetComputeClusterResponseBodyClusterConfigClusterSafetyControl clusterSafetyControl;

        /**
         * <p>The cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Des")
        public String des;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-30 08:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>102311</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The cluster owner.</p>
         * 
         * <strong>example:</strong>
         * <p>30012211</p>
         */
        @NameInMap("Owner")
        public String owner;

        /**
         * <p>The cluster version.</p>
         * 
         * <strong>example:</strong>
         * <p>CDH6</p>
         */
        @NameInMap("TypeVersion")
        public String typeVersion;

        public static GetComputeClusterResponseBodyClusterConfig build(java.util.Map<String, ?> map) throws Exception {
            GetComputeClusterResponseBodyClusterConfig self = new GetComputeClusterResponseBodyClusterConfig();
            return TeaModel.build(map, self);
        }

        public GetComputeClusterResponseBodyClusterConfig setClusterSafetyControl(GetComputeClusterResponseBodyClusterConfigClusterSafetyControl clusterSafetyControl) {
            this.clusterSafetyControl = clusterSafetyControl;
            return this;
        }
        public GetComputeClusterResponseBodyClusterConfigClusterSafetyControl getClusterSafetyControl() {
            return this.clusterSafetyControl;
        }

        public GetComputeClusterResponseBodyClusterConfig setDes(String des) {
            this.des = des;
            return this;
        }
        public String getDes() {
            return this.des;
        }

        public GetComputeClusterResponseBodyClusterConfig setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetComputeClusterResponseBodyClusterConfig setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetComputeClusterResponseBodyClusterConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetComputeClusterResponseBodyClusterConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetComputeClusterResponseBodyClusterConfig setOwner(String owner) {
            this.owner = owner;
            return this;
        }
        public String getOwner() {
            return this.owner;
        }

        public GetComputeClusterResponseBodyClusterConfig setTypeVersion(String typeVersion) {
            this.typeVersion = typeVersion;
            return this;
        }
        public String getTypeVersion() {
            return this.typeVersion;
        }

    }

}
