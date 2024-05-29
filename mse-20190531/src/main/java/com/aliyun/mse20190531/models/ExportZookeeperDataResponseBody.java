// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ExportZookeeperDataResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public ExportZookeeperDataResponseBodyData data;

    /**
     * <p>The dynamic part in the error message. This parameter is used to replace the \\*\\*%s\\*\\* variable in the **ErrMessage** parameter.</p>
     * <br>
     * <p>> If the return value of the **ErrMessage** parameter is **The Value of Input Parameter %s is not valid** and the return value of the **DynamicMessage** parameter is **DtsJobId**, the specified **DtsJobId** parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code returned if the request failed.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The message returned.</p>
     * <br>
     * <p>*   If the request is successful, a success message is returned.</p>
     * <p>*   If the request fails, an error message is returned.</p>
     */
    @NameInMap("Message")
    public String message;

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

    public static ExportZookeeperDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportZookeeperDataResponseBody self = new ExportZookeeperDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportZookeeperDataResponseBody setData(ExportZookeeperDataResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExportZookeeperDataResponseBodyData getData() {
        return this.data;
    }

    public ExportZookeeperDataResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ExportZookeeperDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ExportZookeeperDataResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExportZookeeperDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExportZookeeperDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExportZookeeperDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExportZookeeperDataResponseBodyData extends TeaModel {
        /**
         * <p>The content of a task.</p>
         */
        @NameInMap("ContentMap")
        public java.util.Map<String, ?> contentMap;

        /**
         * <p>The creation time.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The type of the object that is exported. Valid values:</p>
         * <br>
         * <p>*   transactionLog: transaction logs</p>
         * <p>*   snapshot: snapshots</p>
         */
        @NameInMap("ExportType")
        public String exportType;

        /**
         * <p>The extended information.</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The ID of the instance</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the associated task at the underlying layer. This parameter is used only to troubleshoot failures.</p>
         */
        @NameInMap("KubeoneTaskIds")
        public String kubeoneTaskIds;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   CREATE: The object is being created.</p>
         * <p>*   RUNNING: The task is running.</p>
         * <p>*   FINISH: The task is completed.</p>
         * <p>*   FAILED: The task fails.</p>
         * <p>*   EXPIRE: The task has expired.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The last update time.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ExportZookeeperDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExportZookeeperDataResponseBodyData self = new ExportZookeeperDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExportZookeeperDataResponseBodyData setContentMap(java.util.Map<String, ?> contentMap) {
            this.contentMap = contentMap;
            return this;
        }
        public java.util.Map<String, ?> getContentMap() {
            return this.contentMap;
        }

        public ExportZookeeperDataResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ExportZookeeperDataResponseBodyData setExportType(String exportType) {
            this.exportType = exportType;
            return this;
        }
        public String getExportType() {
            return this.exportType;
        }

        public ExportZookeeperDataResponseBodyData setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public ExportZookeeperDataResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ExportZookeeperDataResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ExportZookeeperDataResponseBodyData setKubeoneTaskIds(String kubeoneTaskIds) {
            this.kubeoneTaskIds = kubeoneTaskIds;
            return this;
        }
        public String getKubeoneTaskIds() {
            return this.kubeoneTaskIds;
        }

        public ExportZookeeperDataResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ExportZookeeperDataResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
