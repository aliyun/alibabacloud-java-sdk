// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListExportZookeeperDataResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListExportZookeeperDataResponseBodyData> data;

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

    public static ListExportZookeeperDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExportZookeeperDataResponseBody self = new ListExportZookeeperDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExportZookeeperDataResponseBody setData(java.util.List<ListExportZookeeperDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListExportZookeeperDataResponseBodyData> getData() {
        return this.data;
    }

    public ListExportZookeeperDataResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public ListExportZookeeperDataResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListExportZookeeperDataResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListExportZookeeperDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListExportZookeeperDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExportZookeeperDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListExportZookeeperDataResponseBodyData extends TeaModel {
        /**
         * <p>The details of the task.</p>
         */
        @NameInMap("ContentMap")
        public String contentMap;

        /**
         * <p>The time when the task was created.</p>
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
         * <p>The extension information that is in the JSON format. The extension information facilitates addition of parameters.</p>
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
         * <p>*   CREATE: The task is being created.</p>
         * <p>*   RUNNING: The task is being executed.</p>
         * <p>*   FINISH: The task is completed.</p>
         * <p>*   FAILED: The task failed.</p>
         * <p>*   EXPIRE: The task has expired.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time when the task was updated.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListExportZookeeperDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListExportZookeeperDataResponseBodyData self = new ListExportZookeeperDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListExportZookeeperDataResponseBodyData setContentMap(String contentMap) {
            this.contentMap = contentMap;
            return this;
        }
        public String getContentMap() {
            return this.contentMap;
        }

        public ListExportZookeeperDataResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListExportZookeeperDataResponseBodyData setExportType(String exportType) {
            this.exportType = exportType;
            return this;
        }
        public String getExportType() {
            return this.exportType;
        }

        public ListExportZookeeperDataResponseBodyData setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public ListExportZookeeperDataResponseBodyData setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListExportZookeeperDataResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListExportZookeeperDataResponseBodyData setKubeoneTaskIds(String kubeoneTaskIds) {
            this.kubeoneTaskIds = kubeoneTaskIds;
            return this;
        }
        public String getKubeoneTaskIds() {
            return this.kubeoneTaskIds;
        }

        public ListExportZookeeperDataResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListExportZookeeperDataResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
