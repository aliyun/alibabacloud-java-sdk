// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateSupplierInformationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("OperationIp")
    public String operationIp;

    @NameInMap("OperationMfaPresent")
    public Boolean operationMfaPresent;

    @NameInMap("DeliverySettings")
    public UpdateSupplierInformationRequestDeliverySettings deliverySettings;

    public static UpdateSupplierInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSupplierInformationRequest self = new UpdateSupplierInformationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSupplierInformationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSupplierInformationRequest setOperationIp(String operationIp) {
        this.operationIp = operationIp;
        return this;
    }
    public String getOperationIp() {
        return this.operationIp;
    }

    public UpdateSupplierInformationRequest setOperationMfaPresent(Boolean operationMfaPresent) {
        this.operationMfaPresent = operationMfaPresent;
        return this;
    }
    public Boolean getOperationMfaPresent() {
        return this.operationMfaPresent;
    }

    public UpdateSupplierInformationRequest setDeliverySettings(UpdateSupplierInformationRequestDeliverySettings deliverySettings) {
        this.deliverySettings = deliverySettings;
        return this;
    }
    public UpdateSupplierInformationRequestDeliverySettings getDeliverySettings() {
        return this.deliverySettings;
    }

    public static class UpdateSupplierInformationRequestDeliverySettings extends TeaModel {
        @NameInMap("OssEnabled")
        public Boolean ossEnabled;

        @NameInMap("OssBucketName")
        public String ossBucketName;

        @NameInMap("OssPath")
        public String ossPath;

        @NameInMap("OssExpirationDays")
        public Long ossExpirationDays;

        public static UpdateSupplierInformationRequestDeliverySettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateSupplierInformationRequestDeliverySettings self = new UpdateSupplierInformationRequestDeliverySettings();
            return TeaModel.build(map, self);
        }

        public UpdateSupplierInformationRequestDeliverySettings setOssEnabled(Boolean ossEnabled) {
            this.ossEnabled = ossEnabled;
            return this;
        }
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        public UpdateSupplierInformationRequestDeliverySettings setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public UpdateSupplierInformationRequestDeliverySettings setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public UpdateSupplierInformationRequestDeliverySettings setOssExpirationDays(Long ossExpirationDays) {
            this.ossExpirationDays = ossExpirationDays;
            return this;
        }
        public Long getOssExpirationDays() {
            return this.ossExpirationDays;
        }

    }

}
