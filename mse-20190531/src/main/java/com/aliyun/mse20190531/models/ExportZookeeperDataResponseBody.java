// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ExportZookeeperDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public ExportZookeeperDataResponseBodyData data;

    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ContentMap")
        public java.util.Map<String, ?> contentMap;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExportType")
        public String exportType;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("KubeoneTaskIds")
        public String kubeoneTaskIds;

        @NameInMap("Status")
        public String status;

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
