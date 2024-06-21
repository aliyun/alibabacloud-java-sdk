// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class CreateEngineNamespaceResponseBody extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-892k****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public CreateEngineNamespaceResponseBodyData data;

    /**
     * <p>The error code returned if the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is successfully processed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F6092602-C357-4750-89D9-E572FBEA****</p>
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

    public static CreateEngineNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEngineNamespaceResponseBody self = new CreateEngineNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEngineNamespaceResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateEngineNamespaceResponseBody setData(CreateEngineNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateEngineNamespaceResponseBodyData getData() {
        return this.data;
    }

    public CreateEngineNamespaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateEngineNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateEngineNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEngineNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateEngineNamespaceResponseBodyData extends TeaModel {
        /**
         * <p>The number of configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigCount")
        public Integer configCount;

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>f4fa5b81-2f26-4900-833a-7516b315ebb2</p>
         */
        @NameInMap("Namespace")
        public String namespace;

        /**
         * <p>The description of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>mytest</p>
         */
        @NameInMap("NamespaceDesc")
        public String namespaceDesc;

        /**
         * <p>The display name of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("NamespaceShowName")
        public String namespaceShowName;

        /**
         * <p>The quota of configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Quota")
        public Integer quota;

        /**
         * <p>The number of active services.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ServiceCount")
        public Integer serviceCount;

        /**
         * <p>The type of the namespace. Valid values:</p>
         * <ul>
         * <li><code>0</code>: global configuration</li>
         * <li><code>1</code>: default namespace</li>
         * <li><code>2</code>: custom namespace</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static CreateEngineNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateEngineNamespaceResponseBodyData self = new CreateEngineNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateEngineNamespaceResponseBodyData setConfigCount(Integer configCount) {
            this.configCount = configCount;
            return this;
        }
        public Integer getConfigCount() {
            return this.configCount;
        }

        public CreateEngineNamespaceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public CreateEngineNamespaceResponseBodyData setNamespaceDesc(String namespaceDesc) {
            this.namespaceDesc = namespaceDesc;
            return this;
        }
        public String getNamespaceDesc() {
            return this.namespaceDesc;
        }

        public CreateEngineNamespaceResponseBodyData setNamespaceShowName(String namespaceShowName) {
            this.namespaceShowName = namespaceShowName;
            return this;
        }
        public String getNamespaceShowName() {
            return this.namespaceShowName;
        }

        public CreateEngineNamespaceResponseBodyData setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public CreateEngineNamespaceResponseBodyData setServiceCount(Integer serviceCount) {
            this.serviceCount = serviceCount;
            return this;
        }
        public Integer getServiceCount() {
            return this.serviceCount;
        }

        public CreateEngineNamespaceResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
