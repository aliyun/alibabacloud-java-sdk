// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreatePrometheusInstanceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>60</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("archiveDuration")
    public Integer archiveDuration;

    /**
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("authFreeReadPolicy")
    public String authFreeReadPolicy;

    /**
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("authFreeWritePolicy")
    public String authFreeWritePolicy;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthFreeRead")
    public Boolean enableAuthFreeRead;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthFreeWrite")
    public Boolean enableAuthFreeWrite;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthToken")
    public Boolean enableAuthToken;

    /**
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("prometheusInstanceName")
    public String prometheusInstanceName;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("storageDuration")
    public Integer storageDuration;

    @NameInMap("tags")
    public java.util.List<CreatePrometheusInstanceRequestTags> tags;

    /**
     * <strong>example:</strong>
     * <p>wokspace1</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreatePrometheusInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePrometheusInstanceRequest self = new CreatePrometheusInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreatePrometheusInstanceRequest setArchiveDuration(Integer archiveDuration) {
        this.archiveDuration = archiveDuration;
        return this;
    }
    public Integer getArchiveDuration() {
        return this.archiveDuration;
    }

    public CreatePrometheusInstanceRequest setAuthFreeReadPolicy(String authFreeReadPolicy) {
        this.authFreeReadPolicy = authFreeReadPolicy;
        return this;
    }
    public String getAuthFreeReadPolicy() {
        return this.authFreeReadPolicy;
    }

    public CreatePrometheusInstanceRequest setAuthFreeWritePolicy(String authFreeWritePolicy) {
        this.authFreeWritePolicy = authFreeWritePolicy;
        return this;
    }
    public String getAuthFreeWritePolicy() {
        return this.authFreeWritePolicy;
    }

    public CreatePrometheusInstanceRequest setEnableAuthFreeRead(Boolean enableAuthFreeRead) {
        this.enableAuthFreeRead = enableAuthFreeRead;
        return this;
    }
    public Boolean getEnableAuthFreeRead() {
        return this.enableAuthFreeRead;
    }

    public CreatePrometheusInstanceRequest setEnableAuthFreeWrite(Boolean enableAuthFreeWrite) {
        this.enableAuthFreeWrite = enableAuthFreeWrite;
        return this;
    }
    public Boolean getEnableAuthFreeWrite() {
        return this.enableAuthFreeWrite;
    }

    public CreatePrometheusInstanceRequest setEnableAuthToken(Boolean enableAuthToken) {
        this.enableAuthToken = enableAuthToken;
        return this;
    }
    public Boolean getEnableAuthToken() {
        return this.enableAuthToken;
    }

    public CreatePrometheusInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreatePrometheusInstanceRequest setPrometheusInstanceName(String prometheusInstanceName) {
        this.prometheusInstanceName = prometheusInstanceName;
        return this;
    }
    public String getPrometheusInstanceName() {
        return this.prometheusInstanceName;
    }

    public CreatePrometheusInstanceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public CreatePrometheusInstanceRequest setStorageDuration(Integer storageDuration) {
        this.storageDuration = storageDuration;
        return this;
    }
    public Integer getStorageDuration() {
        return this.storageDuration;
    }

    public CreatePrometheusInstanceRequest setTags(java.util.List<CreatePrometheusInstanceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreatePrometheusInstanceRequestTags> getTags() {
        return this.tags;
    }

    public CreatePrometheusInstanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

    public static class CreatePrometheusInstanceRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>110109200001214284</p>
         */
        @NameInMap("value")
        public String value;

        public static CreatePrometheusInstanceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreatePrometheusInstanceRequestTags self = new CreatePrometheusInstanceRequestTags();
            return TeaModel.build(map, self);
        }

        public CreatePrometheusInstanceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreatePrometheusInstanceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
