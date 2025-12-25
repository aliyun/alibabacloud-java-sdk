// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetSourceResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response data.</p>
     */
    @NameInMap("data")
    public GetSourceResponseBodyData data;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DE10E3C0-A676-5169-812D-6610AACBFAFF</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSourceResponseBody self = new GetSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSourceResponseBody setData(GetSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSourceResponseBodyData getData() {
        return this.data;
    }

    public GetSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetSourceResponseBodyDataK8SSourceInfo extends TeaModel {
        /**
         * <p>The ID of the Container Service for Kubernetes (ACK) cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c2d290b2d8b5d4935864cace5f0173f31</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        public static GetSourceResponseBodyDataK8SSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSourceResponseBodyDataK8SSourceInfo self = new GetSourceResponseBodyDataK8SSourceInfo();
            return TeaModel.build(map, self);
        }

        public GetSourceResponseBodyDataK8SSourceInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

    public static class GetSourceResponseBodyDataNacosSourceInfo extends TeaModel {
        /**
         * <p>The endpoint of the Nacos instance.</p>
         * 
         * <strong>example:</strong>
         * <p>mse</p>
         */
        @NameInMap("address")
        public String address;

        /**
         * <p>The cluster ID.</p>
         * 
         * <strong>example:</strong>
         * <p>fluss-cn-w7k4hann601</p>
         */
        @NameInMap("clusterId")
        public String clusterId;

        /**
         * <p>The Nacos instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgprecn-cn-cfn47q7oh001</p>
         */
        @NameInMap("instanceId")
        public String instanceId;

        public static GetSourceResponseBodyDataNacosSourceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSourceResponseBodyDataNacosSourceInfo self = new GetSourceResponseBodyDataNacosSourceInfo();
            return TeaModel.build(map, self);
        }

        public GetSourceResponseBodyDataNacosSourceInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public GetSourceResponseBodyDataNacosSourceInfo setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetSourceResponseBodyDataNacosSourceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class GetSourceResponseBodyData extends TeaModel {
        /**
         * <p>The creation timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("createTimestamp")
        public Long createTimestamp;

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cq2vundlhtg***</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <p>Kubernetes source information.</p>
         */
        @NameInMap("k8SSourceInfo")
        public GetSourceResponseBodyDataK8SSourceInfo k8SSourceInfo;

        /**
         * <p>The source information when the source type is MSE_NACOS.</p>
         */
        @NameInMap("nacosSourceInfo")
        public GetSourceResponseBodyDataNacosSourceInfo nacosSourceInfo;

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>import-test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz4us4iruleja</p>
         */
        @NameInMap("resourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>src-crdddallhtgt***</p>
         */
        @NameInMap("sourceId")
        public String sourceId;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>K8S</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The update timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719386834548</p>
         */
        @NameInMap("updateTimestamp")
        public Long updateTimestamp;

        public static GetSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSourceResponseBodyData self = new GetSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSourceResponseBodyData setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public GetSourceResponseBodyData setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public GetSourceResponseBodyData setK8SSourceInfo(GetSourceResponseBodyDataK8SSourceInfo k8SSourceInfo) {
            this.k8SSourceInfo = k8SSourceInfo;
            return this;
        }
        public GetSourceResponseBodyDataK8SSourceInfo getK8SSourceInfo() {
            return this.k8SSourceInfo;
        }

        public GetSourceResponseBodyData setNacosSourceInfo(GetSourceResponseBodyDataNacosSourceInfo nacosSourceInfo) {
            this.nacosSourceInfo = nacosSourceInfo;
            return this;
        }
        public GetSourceResponseBodyDataNacosSourceInfo getNacosSourceInfo() {
            return this.nacosSourceInfo;
        }

        public GetSourceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSourceResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetSourceResponseBodyData setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public GetSourceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetSourceResponseBodyData setUpdateTimestamp(Long updateTimestamp) {
            this.updateTimestamp = updateTimestamp;
            return this;
        }
        public Long getUpdateTimestamp() {
            return this.updateTimestamp;
        }

    }

}
