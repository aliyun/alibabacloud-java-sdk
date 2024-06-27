// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class AddMigrationTaskResponseBody extends TeaModel {
    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public AddMigrationTaskResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is processed successfully.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>7466566F-F30F-4A29-965D-3E0AF21D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AddMigrationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMigrationTaskResponseBody self = new AddMigrationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMigrationTaskResponseBody setData(AddMigrationTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddMigrationTaskResponseBodyData getData() {
        return this.data;
    }

    public AddMigrationTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public AddMigrationTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddMigrationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMigrationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddMigrationTaskResponseBodyData extends TeaModel {
        /**
         * <p>The type of the instance. Valid values:</p>
         * <ul>
         * <li>Nacos-Ans</li>
         * <li>ZooKeeper</li>
         * <li>Eureka</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Nacos-Ans</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The endpoint of the source instance node.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1:8848</p>
         */
        @NameInMap("OriginInstanceAddress")
        public String originInstanceAddress;

        /**
         * <p>The name of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Source instance</p>
         */
        @NameInMap("OriginInstanceName")
        public String originInstanceName;

        /**
         * <p>The list of namespaces. This parameter is optional if applications are migrated from a Nacos instance.</p>
         * 
         * <strong>example:</strong>
         * <p>namesapceId1,namesapceId2</p>
         */
        @NameInMap("OriginInstanceNamespace")
        public String originInstanceNamespace;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>testsdfsdfsd</p>
         */
        @NameInMap("ProjectDesc")
        public String projectDesc;

        @NameInMap("SyncType")
        public String syncType;

        /**
         * <p>The name of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Destination instance</p>
         */
        @NameInMap("TargetClusterName")
        public String targetClusterName;

        /**
         * <p>The URL of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-94d****-nacos-ans.mse.aliyuncs.com:8848</p>
         */
        @NameInMap("TargetClusterUrl")
        public String targetClusterUrl;

        /**
         * <p>The ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-7pp2w*****</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>183876217*****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static AddMigrationTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddMigrationTaskResponseBodyData self = new AddMigrationTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddMigrationTaskResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public AddMigrationTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddMigrationTaskResponseBodyData setOriginInstanceAddress(String originInstanceAddress) {
            this.originInstanceAddress = originInstanceAddress;
            return this;
        }
        public String getOriginInstanceAddress() {
            return this.originInstanceAddress;
        }

        public AddMigrationTaskResponseBodyData setOriginInstanceName(String originInstanceName) {
            this.originInstanceName = originInstanceName;
            return this;
        }
        public String getOriginInstanceName() {
            return this.originInstanceName;
        }

        public AddMigrationTaskResponseBodyData setOriginInstanceNamespace(String originInstanceNamespace) {
            this.originInstanceNamespace = originInstanceNamespace;
            return this;
        }
        public String getOriginInstanceNamespace() {
            return this.originInstanceNamespace;
        }

        public AddMigrationTaskResponseBodyData setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }
        public String getProjectDesc() {
            return this.projectDesc;
        }

        public AddMigrationTaskResponseBodyData setSyncType(String syncType) {
            this.syncType = syncType;
            return this;
        }
        public String getSyncType() {
            return this.syncType;
        }

        public AddMigrationTaskResponseBodyData setTargetClusterName(String targetClusterName) {
            this.targetClusterName = targetClusterName;
            return this;
        }
        public String getTargetClusterName() {
            return this.targetClusterName;
        }

        public AddMigrationTaskResponseBodyData setTargetClusterUrl(String targetClusterUrl) {
            this.targetClusterUrl = targetClusterUrl;
            return this;
        }
        public String getTargetClusterUrl() {
            return this.targetClusterUrl;
        }

        public AddMigrationTaskResponseBodyData setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public AddMigrationTaskResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
