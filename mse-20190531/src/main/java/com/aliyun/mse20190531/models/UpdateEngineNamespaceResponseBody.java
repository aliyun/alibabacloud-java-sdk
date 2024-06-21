// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class UpdateEngineNamespaceResponseBody extends TeaModel {
    /**
     * <p>The details of the data.</p>
     */
    @NameInMap("Data")
    public UpdateEngineNamespaceResponseBodyData data;

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
     * <p>4E9FDCFE-0738-493B-B801-82BDFBCB****</p>
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

    public static UpdateEngineNamespaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEngineNamespaceResponseBody self = new UpdateEngineNamespaceResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEngineNamespaceResponseBody setData(UpdateEngineNamespaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateEngineNamespaceResponseBodyData getData() {
        return this.data;
    }

    public UpdateEngineNamespaceResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateEngineNamespaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateEngineNamespaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateEngineNamespaceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class UpdateEngineNamespaceResponseBodyData extends TeaModel {
        /**
         * <p>The quota value.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ConfigCount")
        public Integer configCount;

        /**
         * <p>The namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>public</p>
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
         * <p>mytestshowname</p>
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

        public static UpdateEngineNamespaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateEngineNamespaceResponseBodyData self = new UpdateEngineNamespaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateEngineNamespaceResponseBodyData setConfigCount(Integer configCount) {
            this.configCount = configCount;
            return this;
        }
        public Integer getConfigCount() {
            return this.configCount;
        }

        public UpdateEngineNamespaceResponseBodyData setNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }
        public String getNamespace() {
            return this.namespace;
        }

        public UpdateEngineNamespaceResponseBodyData setNamespaceDesc(String namespaceDesc) {
            this.namespaceDesc = namespaceDesc;
            return this;
        }
        public String getNamespaceDesc() {
            return this.namespaceDesc;
        }

        public UpdateEngineNamespaceResponseBodyData setNamespaceShowName(String namespaceShowName) {
            this.namespaceShowName = namespaceShowName;
            return this;
        }
        public String getNamespaceShowName() {
            return this.namespaceShowName;
        }

        public UpdateEngineNamespaceResponseBodyData setQuota(Integer quota) {
            this.quota = quota;
            return this;
        }
        public Integer getQuota() {
            return this.quota;
        }

        public UpdateEngineNamespaceResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
