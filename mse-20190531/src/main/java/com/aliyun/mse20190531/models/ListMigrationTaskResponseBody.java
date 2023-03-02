// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListMigrationTaskResponseBody extends TeaModel {
    /**
     * <p>The array structure.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListMigrationTaskResponseBodyData> data;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpCode")
    public String httpCode;

    /**
     * <p>The message returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   `true`: The request was successful.</p>
     * <p>*   `false`: The request failed.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListMigrationTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMigrationTaskResponseBody self = new ListMigrationTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMigrationTaskResponseBody setData(java.util.List<ListMigrationTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListMigrationTaskResponseBodyData> getData() {
        return this.data;
    }

    public ListMigrationTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListMigrationTaskResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListMigrationTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListMigrationTaskResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListMigrationTaskResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListMigrationTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMigrationTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListMigrationTaskResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListMigrationTaskResponseBodyData extends TeaModel {
        /**
         * <p>The type of the instance.</p>
         * <br>
         * <p>*   Nacos-Ans</p>
         * <p>*   ZooKeeper</p>
         * <p>*   Eureka</p>
         */
        @NameInMap("ClusterType")
        public String clusterType;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The update time.</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The address of the source instance node.</p>
         */
        @NameInMap("OriginInstanceAddress")
        public String originInstanceAddress;

        /**
         * <p>The name of the source instance.</p>
         */
        @NameInMap("OriginInstanceName")
        public String originInstanceName;

        /**
         * <p>The list of namespaces. This parameter is optional if applications are migrated from a Nacos instance.</p>
         */
        @NameInMap("OriginInstanceNamespace")
        public String originInstanceNamespace;

        /**
         * <p>The description.</p>
         */
        @NameInMap("ProjectDesc")
        public String projectDesc;

        /**
         * <p>The name of the destination instance.</p>
         */
        @NameInMap("TargetClusterName")
        public String targetClusterName;

        /**
         * <p>The URL of the destination instance.</p>
         */
        @NameInMap("TargetClusterUrl")
        public String targetClusterUrl;

        /**
         * <p>The ID of the destination instance.</p>
         */
        @NameInMap("TargetInstanceId")
        public String targetInstanceId;

        /**
         * <p>The ID of the user.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListMigrationTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMigrationTaskResponseBodyData self = new ListMigrationTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMigrationTaskResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListMigrationTaskResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListMigrationTaskResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListMigrationTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMigrationTaskResponseBodyData setOriginInstanceAddress(String originInstanceAddress) {
            this.originInstanceAddress = originInstanceAddress;
            return this;
        }
        public String getOriginInstanceAddress() {
            return this.originInstanceAddress;
        }

        public ListMigrationTaskResponseBodyData setOriginInstanceName(String originInstanceName) {
            this.originInstanceName = originInstanceName;
            return this;
        }
        public String getOriginInstanceName() {
            return this.originInstanceName;
        }

        public ListMigrationTaskResponseBodyData setOriginInstanceNamespace(String originInstanceNamespace) {
            this.originInstanceNamespace = originInstanceNamespace;
            return this;
        }
        public String getOriginInstanceNamespace() {
            return this.originInstanceNamespace;
        }

        public ListMigrationTaskResponseBodyData setProjectDesc(String projectDesc) {
            this.projectDesc = projectDesc;
            return this;
        }
        public String getProjectDesc() {
            return this.projectDesc;
        }

        public ListMigrationTaskResponseBodyData setTargetClusterName(String targetClusterName) {
            this.targetClusterName = targetClusterName;
            return this;
        }
        public String getTargetClusterName() {
            return this.targetClusterName;
        }

        public ListMigrationTaskResponseBodyData setTargetClusterUrl(String targetClusterUrl) {
            this.targetClusterUrl = targetClusterUrl;
            return this;
        }
        public String getTargetClusterUrl() {
            return this.targetClusterUrl;
        }

        public ListMigrationTaskResponseBodyData setTargetInstanceId(String targetInstanceId) {
            this.targetInstanceId = targetInstanceId;
            return this;
        }
        public String getTargetInstanceId() {
            return this.targetInstanceId;
        }

        public ListMigrationTaskResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
