// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsInstancesResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Data")
    public java.util.List<ListAnsInstancesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static ListAnsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnsInstancesResponseBody self = new ListAnsInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAnsInstancesResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListAnsInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAnsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnsInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAnsInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAnsInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAnsInstancesResponseBody setData(java.util.List<ListAnsInstancesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAnsInstancesResponseBodyData> getData() {
        return this.data;
    }

    public ListAnsInstancesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAnsInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAnsInstancesResponseBodyData extends TeaModel {
        @NameInMap("DefaultKey")
        public String defaultKey;

        @NameInMap("Ephemeral")
        public Boolean ephemeral;

        @NameInMap("Marked")
        public Boolean marked;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("LastBeat")
        public Long lastBeat;

        @NameInMap("OkCount")
        public Integer okCount;

        @NameInMap("Weight")
        public Integer weight;

        @NameInMap("InstanceHeartBeatInterval")
        public Integer instanceHeartBeatInterval;

        @NameInMap("IpDeleteTimeout")
        public Integer ipDeleteTimeout;

        @NameInMap("App")
        public String app;

        @NameInMap("FailCount")
        public Integer failCount;

        @NameInMap("Healthy")
        public Boolean healthy;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("DatumKey")
        public String datumKey;

        @NameInMap("ClusterName")
        public String clusterName;

        @NameInMap("InstanceHeartBeatTimeOut")
        public Integer instanceHeartBeatTimeOut;

        @NameInMap("ServiceName")
        public String serviceName;

        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        public static ListAnsInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAnsInstancesResponseBodyData self = new ListAnsInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAnsInstancesResponseBodyData setDefaultKey(String defaultKey) {
            this.defaultKey = defaultKey;
            return this;
        }
        public String getDefaultKey() {
            return this.defaultKey;
        }

        public ListAnsInstancesResponseBodyData setEphemeral(Boolean ephemeral) {
            this.ephemeral = ephemeral;
            return this;
        }
        public Boolean getEphemeral() {
            return this.ephemeral;
        }

        public ListAnsInstancesResponseBodyData setMarked(Boolean marked) {
            this.marked = marked;
            return this;
        }
        public Boolean getMarked() {
            return this.marked;
        }

        public ListAnsInstancesResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListAnsInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAnsInstancesResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListAnsInstancesResponseBodyData setLastBeat(Long lastBeat) {
            this.lastBeat = lastBeat;
            return this;
        }
        public Long getLastBeat() {
            return this.lastBeat;
        }

        public ListAnsInstancesResponseBodyData setOkCount(Integer okCount) {
            this.okCount = okCount;
            return this;
        }
        public Integer getOkCount() {
            return this.okCount;
        }

        public ListAnsInstancesResponseBodyData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

        public ListAnsInstancesResponseBodyData setInstanceHeartBeatInterval(Integer instanceHeartBeatInterval) {
            this.instanceHeartBeatInterval = instanceHeartBeatInterval;
            return this;
        }
        public Integer getInstanceHeartBeatInterval() {
            return this.instanceHeartBeatInterval;
        }

        public ListAnsInstancesResponseBodyData setIpDeleteTimeout(Integer ipDeleteTimeout) {
            this.ipDeleteTimeout = ipDeleteTimeout;
            return this;
        }
        public Integer getIpDeleteTimeout() {
            return this.ipDeleteTimeout;
        }

        public ListAnsInstancesResponseBodyData setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public ListAnsInstancesResponseBodyData setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public ListAnsInstancesResponseBodyData setHealthy(Boolean healthy) {
            this.healthy = healthy;
            return this;
        }
        public Boolean getHealthy() {
            return this.healthy;
        }

        public ListAnsInstancesResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListAnsInstancesResponseBodyData setDatumKey(String datumKey) {
            this.datumKey = datumKey;
            return this;
        }
        public String getDatumKey() {
            return this.datumKey;
        }

        public ListAnsInstancesResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListAnsInstancesResponseBodyData setInstanceHeartBeatTimeOut(Integer instanceHeartBeatTimeOut) {
            this.instanceHeartBeatTimeOut = instanceHeartBeatTimeOut;
            return this;
        }
        public Integer getInstanceHeartBeatTimeOut() {
            return this.instanceHeartBeatTimeOut;
        }

        public ListAnsInstancesResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListAnsInstancesResponseBodyData setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

    }

}
