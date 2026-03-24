// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdatePrometheusInstanceRequest extends TeaModel {
    /**
     * <p>The number of days to store archived data after the storage duration expires. A value of 0 disables archiving. For V1 instances, the valid values are 1 to 365. This is supported only for the pay-by-data-write billing method. For V2 instances, the valid values are 1 to 3650. A value of 3650 indicates permanent storage.</p>
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
     * <p>The policy for password-free read access. The policy supports IP address segments and VPC IDs.</p>
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
     * <p>The policy for password-free write access. The policy supports IP address segments and VPC IDs.</p>
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
     * <p>Specifies whether to enable password-free read access.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthFreeRead")
    public Boolean enableAuthFreeRead;

    /**
     * <p>Specifies whether to enable password-free write access.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthFreeWrite")
    public Boolean enableAuthFreeWrite;

    /**
     * <p>Specifies whether to enable authentication with an access token.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableAuthToken")
    public Boolean enableAuthToken;

    /**
     * <p>The billing method. You can change the billing method only once during the instance lifecycle. Valid values: \<code>POSTPAY\\</code> (pay-as-you-go based on reported metrics) and \<code>POSTPAY_GB\\</code> (pay-as-you-go based on data writes).</p>
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
     * <p>The storage duration in days. If the instance is billed by data writes, valid values are 90 and 180. If the instance is billed by reported metrics, valid values are 15, 30, 60, 90, and 180.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("storageDuration")
    public Integer storageDuration;

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
