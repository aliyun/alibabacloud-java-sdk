// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdatePrometheusInstanceRequest extends TeaModel {
    /**
     * <p>The number of days to automatically archive and save after the storage expires, 0 means no archiving. The range of archiving days:
     * V1: 1<del>365 days. Only supported for metric write volume.
     * V2: 1</del>3650 days (3650 indicates permanent storage).</p>
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
     * <p>Password-free read policy (supports IP segments and VpcId).</p>
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
     * <p>Password-free write policy (supports IP segments and VpcId).</p>
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
     * <p>Whether to enable password-free read.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthFreeRead")
    public Boolean enableAuthFreeRead;

    /**
     * <p>Whether to enable password-free write.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthFreeWrite")
    public Boolean enableAuthFreeWrite;

    /**
     * <p>Whether to enable access token authentication.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthToken")
    public Boolean enableAuthToken;

    /**
     * <p>Billing method (can only be modified once during the instance\&quot;s lifecycle):
     * POSTPAY: Postpaid by metric reporting volume.
     * POSTPAY_GB: Postpaid by metric write volume.</p>
     * 
     * <strong>example:</strong>
     * <p>POSTPAY_GB</p>
     */
    @NameInMap("paymentType")
    public String paymentType;

    /**
     * <p>Instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>test-prom-name</p>
     */
    @NameInMap("prometheusInstanceName")
    public String prometheusInstanceName;

    /**
     * <p>Instance storage DB status (only supports RUNNING). If empty, the storage DB status will not be changed.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Storage duration (days):
     * By write volume: 90, 180.
     * By metric reporting volume: 15, 30, 60, 90, 180.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("storageDuration")
    public Integer storageDuration;

    /**
     * <p>Belonging workspace.</p>
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

    public UpdatePrometheusInstanceRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
