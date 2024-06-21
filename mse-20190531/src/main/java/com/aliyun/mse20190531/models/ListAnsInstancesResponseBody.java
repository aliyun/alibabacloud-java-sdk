// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAnsInstancesResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAnsInstancesResponseBodyData> data;

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
     * <p>202</p>
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
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>52BA6DA6-A702-4362-A32F-DFF79655****</p>
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

    /**
     * <p>The total number of returned instances.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAnsInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAnsInstancesResponseBody self = new ListAnsInstancesResponseBody();
        return TeaModel.build(map, self);
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

    public ListAnsInstancesResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListAnsInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAnsInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAnsInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAnsInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAnsInstancesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAnsInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAnsInstancesResponseBodyData extends TeaModel {
        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("App")
        public String app;

        /**
         * <p>The name of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT</p>
         */
        @NameInMap("ClusterName")
        public String clusterName;

        /**
         * <p>The reference key.</p>
         * 
         * <strong>example:</strong>
         * <p>30.5.XX.XX:unknown:DEFAULT</p>
         */
        @NameInMap("DatumKey")
        public String datumKey;

        /**
         * <p>The default key.</p>
         * 
         * <strong>example:</strong>
         * <p>30.5.XX.XX:unknown</p>
         */
        @NameInMap("DefaultKey")
        public String defaultKey;

        /**
         * <p>The effective status of the instance. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The instance takes effect.</li>
         * <li><code>false</code>: The instance does not take effect.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Indicates whether the information about the ephemeral node is obtained. Valid values:</p>
         * <ul>
         * <li><code>true</code>: yes</li>
         * <li><code>false</code>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Ephemeral")
        public Boolean ephemeral;

        /**
         * <p>The number of counted failures.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The health status of the instance. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The instance is healthy.</li>
         * <li><code>false</code>: The instance is unhealthy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Healthy")
        public Boolean healthy;

        /**
         * <p>The heartbeat interval of the instance. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("InstanceHeartBeatInterval")
        public Integer instanceHeartBeatInterval;

        /**
         * <p>The timeout period of the instance heartbeat.</p>
         * 
         * <strong>example:</strong>
         * <p>15000</p>
         */
        @NameInMap("InstanceHeartBeatTimeOut")
        public Integer instanceHeartBeatTimeOut;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>30.5.XX.XX#0#DEFAULT#DEFAULT_GROUP@@consumers:com.alibaba.edas.IHelloService</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>30.5.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The timeout period for removing an IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>30000</p>
         */
        @NameInMap("IpDeleteTimeout")
        public Integer ipDeleteTimeout;

        /**
         * <p>The last heartbeat time.</p>
         * 
         * <strong>example:</strong>
         * <p>20201010</p>
         */
        @NameInMap("LastBeat")
        public Long lastBeat;

        /**
         * <p>Indicates whether the instance was marked. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The instance marking was successful.</li>
         * <li><code>false</code>: The instance marking failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Marked")
        public Boolean marked;

        /**
         * <p>The metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>[int]</p>
         */
        @NameInMap("Metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The number of counted successes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OkCount")
        public Integer okCount;

        /**
         * <p>The port number.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The name of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP@@consumers:com.alibaba.edas.IHelloService::</p>
         */
        @NameInMap("ServiceName")
        public String serviceName;

        /**
         * <p>The weight.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public Integer weight;

        public static ListAnsInstancesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAnsInstancesResponseBodyData self = new ListAnsInstancesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAnsInstancesResponseBodyData setApp(String app) {
            this.app = app;
            return this;
        }
        public String getApp() {
            return this.app;
        }

        public ListAnsInstancesResponseBodyData setClusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        public String getClusterName() {
            return this.clusterName;
        }

        public ListAnsInstancesResponseBodyData setDatumKey(String datumKey) {
            this.datumKey = datumKey;
            return this;
        }
        public String getDatumKey() {
            return this.datumKey;
        }

        public ListAnsInstancesResponseBodyData setDefaultKey(String defaultKey) {
            this.defaultKey = defaultKey;
            return this;
        }
        public String getDefaultKey() {
            return this.defaultKey;
        }

        public ListAnsInstancesResponseBodyData setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public ListAnsInstancesResponseBodyData setEphemeral(Boolean ephemeral) {
            this.ephemeral = ephemeral;
            return this;
        }
        public Boolean getEphemeral() {
            return this.ephemeral;
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

        public ListAnsInstancesResponseBodyData setInstanceHeartBeatInterval(Integer instanceHeartBeatInterval) {
            this.instanceHeartBeatInterval = instanceHeartBeatInterval;
            return this;
        }
        public Integer getInstanceHeartBeatInterval() {
            return this.instanceHeartBeatInterval;
        }

        public ListAnsInstancesResponseBodyData setInstanceHeartBeatTimeOut(Integer instanceHeartBeatTimeOut) {
            this.instanceHeartBeatTimeOut = instanceHeartBeatTimeOut;
            return this;
        }
        public Integer getInstanceHeartBeatTimeOut() {
            return this.instanceHeartBeatTimeOut;
        }

        public ListAnsInstancesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAnsInstancesResponseBodyData setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListAnsInstancesResponseBodyData setIpDeleteTimeout(Integer ipDeleteTimeout) {
            this.ipDeleteTimeout = ipDeleteTimeout;
            return this;
        }
        public Integer getIpDeleteTimeout() {
            return this.ipDeleteTimeout;
        }

        public ListAnsInstancesResponseBodyData setLastBeat(Long lastBeat) {
            this.lastBeat = lastBeat;
            return this;
        }
        public Long getLastBeat() {
            return this.lastBeat;
        }

        public ListAnsInstancesResponseBodyData setMarked(Boolean marked) {
            this.marked = marked;
            return this;
        }
        public Boolean getMarked() {
            return this.marked;
        }

        public ListAnsInstancesResponseBodyData setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListAnsInstancesResponseBodyData setOkCount(Integer okCount) {
            this.okCount = okCount;
            return this;
        }
        public Integer getOkCount() {
            return this.okCount;
        }

        public ListAnsInstancesResponseBodyData setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListAnsInstancesResponseBodyData setServiceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public String getServiceName() {
            return this.serviceName;
        }

        public ListAnsInstancesResponseBodyData setWeight(Integer weight) {
            this.weight = weight;
            return this;
        }
        public Integer getWeight() {
            return this.weight;
        }

    }

}
