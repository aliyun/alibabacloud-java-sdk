// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListExportZookeeperDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListExportZookeeperDataResponseBodyData> data;

    /**
     * <p>cluster not found</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>systemError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>system error</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>mse-200-021</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>mse-100-001</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>illegal request:%s</p>
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
        @NameInMap("ContentMap")
        public String contentMap;

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
