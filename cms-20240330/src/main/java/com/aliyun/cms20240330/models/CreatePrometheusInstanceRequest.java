// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreatePrometheusInstanceRequest extends TeaModel {
    /**
     * <p>The number of days that data is automatically archived after the storage period expires. A value of 0 indicates that data is not archived. Valid values for the archive duration:</p>
     * <ul>
     * <li>V1: 60 to 365 days.</li>
     * <li>V2: 60 to 3650 days (3650 indicates permanent retention).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("archiveDuration")
    public Integer archiveDuration;

    /**
     * <p>The authentication-free read policy. IP CIDR blocks and VPC IDs are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;SourceIp&quot;: [
     *     &quot;192.168.1.0/24&quot;,
     *     &quot;172.168.2.22&quot;
     *   ],
     *   &quot;SourceVpc&quot;: [
     *     &quot;vpc-xx1&quot;,
     *     &quot;vpc-xx2&quot;
     *   ]
     * }</p>
     */
    @NameInMap("authFreeReadPolicy")
    public String authFreeReadPolicy;

    /**
     * <p>The authentication-free write policy.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;SourceIp&quot;: [
     *     &quot;192.168.1.0/24&quot;,
     *     &quot;172.168.2.22&quot;
     *   ],
     *   &quot;SourceVpc&quot;: [
     *     &quot;vpc-xx1&quot;,
     *     &quot;vpc-xx2&quot;
     *   ]
     * }</p>
     */
    @NameInMap("authFreeWritePolicy")
    public String authFreeWritePolicy;

    /**
     * <p>Specifies whether to enable authentication-free read. This parameter is supported only for V2 instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthFreeRead")
    public Boolean enableAuthFreeRead;

    /**
     * <p>Specifies whether to enable authentication-free write. This parameter is supported only for V2 instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthFreeWrite")
    public Boolean enableAuthFreeWrite;

    /**
     * <p>Specifies whether to enable the authorization token. This parameter is supported only for V1 instances.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthToken")
    public Boolean enableAuthToken;

    /**
     * <p>The billable methods. Valid values:</p>
     * <ul>
     * <li>POSTPAY: pay-as-you-go by metric reporting volume.</li>
     * <li>POSTPAY_GB: pay-as-you-go by metric write volume.
     * If this parameter is left empty, the default billing method configured by the user is used. If the user has not configured a default billing method, the system uses pay-as-you-go by metric reporting volume.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("prometheusInstanceName")
    public String prometheusInstanceName;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aekz5qqvjyatgoy</p>
     */
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The instance status.</p>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The storage duration (in days):</p>
     * <ul>
     * <li>By write volume: 90 or 180.</li>
     * <li>By metric reporting volume: 15, 30, 60, 90, or 180.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("storageDuration")
    public Integer storageDuration;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("tags")
    public java.util.List<CreatePrometheusInstanceRequestTags> tags;

    /**
     * <p>The workspace to which the instance belongs. Default value: default-cms-{userId}-{regionId}.</p>
     * 
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

    public CreatePrometheusInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key1</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
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
