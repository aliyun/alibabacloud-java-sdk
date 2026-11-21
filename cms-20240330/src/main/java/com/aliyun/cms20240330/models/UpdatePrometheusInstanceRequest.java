// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdatePrometheusInstanceRequest extends TeaModel {
    /**
     * <p>The number of days to automatically archive and retain data after the storage period expires. A value of 0 indicates that data is not archived. Valid values for the archive retention period:
     * V1: 1 to 365 days. Supported only for the pay-by-ingested-data billing method.
     * V2: 1 to 3650 days. A value of 3650 indicates permanent retention.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("archiveDuration")
    public Integer archiveDuration;

    /**
     * <p>The authentication-free read policy. IP address ranges and VPC IDs are supported.</p>
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
     * <p>The authentication-free read policy. IP address ranges and VPC IDs are supported.</p>
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
     * <p>Specifies whether to only precheck the request. Valid values:</p>
     * <p>true: sends a precheck request without updating the instance. The system checks whether required parameters are specified, the request format is valid, and service limits are met. If the request fails the precheck, the corresponding error is returned. If the request passes the precheck, the DryRunOperation error code is returned.
     * false: sends a regular request. If the request passes the precheck, the instance is updated. This is the default value.</p>
     */
    @NameInMap("dryrun")
    public Boolean dryrun;

    /**
     * <p>Specifies whether to enable authentication-free read.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthFreeRead")
    public Boolean enableAuthFreeRead;

    /**
     * <p>Specifies whether to enable authentication-free write.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthFreeWrite")
    public Boolean enableAuthFreeWrite;

    /**
     * <p>Specifies whether to enable access token authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthToken")
    public Boolean enableAuthToken;

    /**
     * <p>The billing method. You can change the billing method only once during the lifecycle of the instance. Valid values:
     * POSTPAY: pay-as-you-go based on the number of reported metrics.
     * POSTPAY_GB: pay-as-you-go based on the volume of ingested data.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY_GB</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>The name of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test-prom-name</p>
     */
    @NameInMap("prometheusInstanceName")
    public String prometheusInstanceName;

    /**
     * <p>The status of the instance storage database. Only RUNNING is supported. If this parameter is left empty, the status of the storage database is not changed.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The storage duration in days. Valid values:
     * For the pay-by-ingested-data billing method: 90 and 180.
     * For the pay-by-reported-metrics billing method: 15, 30, 60, 90, and 180.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("storageDuration")
    public Integer storageDuration;

    /**
     * <p>The Prometheus storage configuration.</p>
     */
    @NameInMap("storeConfig")
    public PrometheusInstanceStoreConfig storeConfig;

    /**
     * <p>The workspace to which the instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-1500199863951574-cn-shanghai</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static UpdatePrometheusInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePrometheusInstanceRequest self = new UpdatePrometheusInstanceRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePrometheusInstanceRequest setArchiveDuration(Integer archiveDuration) {
        this.archiveDuration = archiveDuration;
        return this;
    }
    public Integer getArchiveDuration() {
        return this.archiveDuration;
    }

    public UpdatePrometheusInstanceRequest setAuthFreeReadPolicy(String authFreeReadPolicy) {
        this.authFreeReadPolicy = authFreeReadPolicy;
        return this;
    }
    public String getAuthFreeReadPolicy() {
        return this.authFreeReadPolicy;
    }

    public UpdatePrometheusInstanceRequest setAuthFreeWritePolicy(String authFreeWritePolicy) {
        this.authFreeWritePolicy = authFreeWritePolicy;
        return this;
    }
    public String getAuthFreeWritePolicy() {
        return this.authFreeWritePolicy;
    }

    public UpdatePrometheusInstanceRequest setDryrun(Boolean dryrun) {
        this.dryrun = dryrun;
        return this;
    }
    public Boolean getDryrun() {
        return this.dryrun;
    }

    public UpdatePrometheusInstanceRequest setEnableAuthFreeRead(Boolean enableAuthFreeRead) {
        this.enableAuthFreeRead = enableAuthFreeRead;
        return this;
    }
    public Boolean getEnableAuthFreeRead() {
        return this.enableAuthFreeRead;
    }

    public UpdatePrometheusInstanceRequest setEnableAuthFreeWrite(Boolean enableAuthFreeWrite) {
        this.enableAuthFreeWrite = enableAuthFreeWrite;
        return this;
    }
    public Boolean getEnableAuthFreeWrite() {
        return this.enableAuthFreeWrite;
    }

    public UpdatePrometheusInstanceRequest setEnableAuthToken(Boolean enableAuthToken) {
        this.enableAuthToken = enableAuthToken;
        return this;
    }
    public Boolean getEnableAuthToken() {
        return this.enableAuthToken;
    }

    public UpdatePrometheusInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public UpdatePrometheusInstanceRequest setPrometheusInstanceName(String prometheusInstanceName) {
        this.prometheusInstanceName = prometheusInstanceName;
        return this;
    }
    public String getPrometheusInstanceName() {
        return this.prometheusInstanceName;
    }

    public UpdatePrometheusInstanceRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdatePrometheusInstanceRequest setStorageDuration(Integer storageDuration) {
        this.storageDuration = storageDuration;
        return this;
    }
    public Integer getStorageDuration() {
        return this.storageDuration;
    }

    public UpdatePrometheusInstanceRequest setStoreConfig(PrometheusInstanceStoreConfig storeConfig) {
        this.storeConfig = storeConfig;
        return this;
    }
    public PrometheusInstanceStoreConfig getStoreConfig() {
        return this.storeConfig;
    }

    public UpdatePrometheusInstanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
