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
     * <p>The dynamic part in the error message. This parameter is used to replace the \<em>\</em>%s\<em>\</em> variable in the <strong>ErrMessage</strong> parameter.</p>
     * <blockquote>
     * <p>If the return value of the <strong>ErrMessage</strong> parameter is <strong>The Value of Input Parameter %s is not valid</strong> and the return value of the <strong>DynamicMessage</strong> parameter is <strong>DtsJobId</strong>, the specified <strong>DtsJobId</strong> parameter is invalid.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

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
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The message returned.</p>
     * <ul>
     * <li>If the request is successful, a success message is returned.</li>
     * <li>If the request fails, an error message is returned.</li>
     * </ul>
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
     * <p>25EA0A83-9007-4E87-808C-637BE1A****</p>
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
         * 
         * <strong>example:</strong>
         * <p>1631001140913</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The type of the object that is exported. Valid values:</p>
         * <ul>
         * <li>transactionLog: transaction logs</li>
         * <li>snapshot: snapshots</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>snapshot</p>
         */
        @NameInMap("ExportType")
        public String exportType;

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("Extend")
        public String extend;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-st21ri2****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the associated task at the underlying layer. This parameter is used only to troubleshoot failures.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("KubeoneTaskIds")
        public String kubeoneTaskIds;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li>CREATE: The object is being created.</li>
         * <li>RUNNING: The task is running.</li>
         * <li>FINISH: The task is completed.</li>
         * <li>FAILED: The task fails.</li>
         * <li>EXPIRE: The task has expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The last update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1632979237663</p>
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
