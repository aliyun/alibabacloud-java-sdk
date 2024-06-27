// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateMigrationTaskResponseBody extends TeaModel {
    /**
     * <p>The data structure.</p>
     */
    @NameInMap("Data")
    public UpdateMigrationTaskResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request was successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>AF21683A-29C7-4853-AC0F-B5ADEE4****</p>
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

    public static UpdateMigrationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMigrationTaskResponseBody self = new UpdateMigrationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMigrationTaskResponseBody setData(UpdateMigrationTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateMigrationTaskResponseBodyData getData() {
        return this.data;
    }

    public UpdateMigrationTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateMigrationTaskResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public UpdateMigrationTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMigrationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMigrationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateMigrationTaskResponseBodyData extends TeaModel {
        /**
         * <p>The type of the instance.</p>
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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-07T10:07:57.000+0000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The address of the source instance node.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.100.2:2181</p>
         */
        @NameInMap("OriginInstanceAddress")
        public String originInstanceAddress;

        /**
         * <p>The name of the source instance.</p>
         * 
         * <strong>example:</strong>
         * <p>src</p>
         */
        @NameInMap("OriginInstanceName")
        public String originInstanceName;

        /**
         * <p>The list of namespaces. This parameter is optional if applications are migrated from a Nacos instance.</p>
         * 
         * <strong>example:</strong>
         * <p>fsdfsdfdsf</p>
         */
        @NameInMap("OriginInstanceNamespace")
        public String originInstanceNamespace;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>1232345</p>
         */
        @NameInMap("ProjectDesc")
        public String projectDesc;

        @NameInMap("SyncType")
        public String syncType;

        /**
         * <p>The name of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>multiple-nacos</p>
         */
        @NameInMap("TargetClusterName")
        public String targetClusterName;

        /**
         * <p>The URL of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-0b*****-nacos-ans.mse.aliyuncs.com:8848</p>
         */
        @NameInMap("TargetClusterUrl")
        public String targetClusterUrl;

        /**
         * <p>The ID of the destination instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-zvp2u*****</p>
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

        public static UpdateMigrationTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateMigrationTaskResponseBodyData self = new UpdateMigrationTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateMigrationTaskResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public UpdateMigrationTaskResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public UpdateMigrationTaskResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public UpdateMigrationTaskResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateMigrationTaskResponseBodyData setOriginInstanceAddress(String originInstanceAddress) {
            this.originInstanceAddress = originInstanceAddress;
            return this;
        }
        public String getOriginInstanceAddress() {
            return this.originInstanceAddress;
        }

        public UpdateMigrationTaskResponseBodyData setOriginInstanceName(String originInstanceName) {
            this.originInstanceName = originInstanceName;
            return this;
        }
        public String getOriginInstanceName() {
            return this.originInstanceName;
        }

        public UpdateMigrationTaskResponseBodyData setOriginInstanceNamespace(String originInstanceNamespace) {
            this.originInstanceNamespace = originInstanceNamespace;
            return this;
        }
        public String getOriginInstanceNamespace() {
            return this.originInstanceNamespace;
        }

        public UpdateMigrationTaskResponseBodyData setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }
        public String getProjectDesc() {
            return this.projectDesc;
        }

        public UpdateMigrationTaskResponseBodyData setSyncType(String syncType) {
            this.syncType = syncType;
            return this;
        }
        public String getSyncType() {
            return this.syncType;
        }

        public UpdateMigrationTaskResponseBodyData setTargetClusterName(String targetClusterName) {
            this.targetClusterName = targetClusterName;
            return this;
        }
        public String getTargetClusterName() {
            return this.targetClusterName;
        }

        public UpdateMigrationTaskResponseBodyData setTargetClusterUrl(String targetClusterUrl) {
            this.targetClusterUrl = targetClusterUrl;
            return this;
        }
        public String getTargetClusterUrl() {
            return this.targetClusterUrl;
        }

        public UpdateMigrationTaskResponseBodyData setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public UpdateMigrationTaskResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
