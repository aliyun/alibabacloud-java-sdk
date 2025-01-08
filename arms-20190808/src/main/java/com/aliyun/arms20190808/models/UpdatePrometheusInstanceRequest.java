// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdatePrometheusInstanceRequest extends TeaModel {
    /**
     * <p>The number of days for which data is automatically archived after the storage expires. Valid values: 60, 90, 180, and 365. 0 indicates that the data is not archived.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("ArchiveDuration")
    public Integer archiveDuration;

    /**
     * <p>The IP addresses or CIDR blocks for which password-free read is enabled. Separate multiple IP addresses with line breaks.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthFreeReadPolicy")
    public String authFreeReadPolicy;

    /**
     * <p>The IP addresses or CIDR blocks for which password-free write is enabled. Separate multiple IP addresses with line breaks.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("AuthFreeWritePolicy")
    public String authFreeWritePolicy;

    /**
     * <p>The ID of the Prometheus instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-xxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>Specifies whether to enable password-free read.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAuthFreeRead")
    public Boolean enableAuthFreeRead;

    /**
     * <p>Specifies whether to enable password-free write.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAuthFreeWrite")
    public Boolean enableAuthFreeWrite;

    /**
     * <p>Specifies whether to enable access token authentication.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableAuthToken")
    public Boolean enableAuthToken;

    /**
     * <p>The billing mode. Valid values: POSTPAY: charges fees based on the amount of reported metric data. POSTPAY_GB: charges fees based on the amount of written metric data.</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The data storage duration. Unit: days.</p>
     * 
     * <strong>example:</strong>
     * <p>90</p>
     */
    @NameInMap("StorageDuration")
    public Integer storageDuration;

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

    public UpdatePrometheusInstanceRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
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

    public UpdatePrometheusInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdatePrometheusInstanceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdatePrometheusInstanceRequest setStorageDuration(Integer storageDuration) {
        this.storageDuration = storageDuration;
        return this;
    }
    public Integer getStorageDuration() {
        return this.storageDuration;
    }

}
