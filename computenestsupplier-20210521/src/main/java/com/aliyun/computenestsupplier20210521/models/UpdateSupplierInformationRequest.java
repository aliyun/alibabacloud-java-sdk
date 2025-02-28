// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class UpdateSupplierInformationRequest extends TeaModel {
    /**
     * <p>The delivery settings.</p>
     */
    @NameInMap("DeliverySettings")
    public UpdateSupplierInformationRequestDeliverySettings deliverySettings;

    /**
     * <p>The Ip of operation.</p>
     * 
     * <strong>example:</strong>
     * <p>192.xxx.xxx.xxx/16,192.xxx.xxx.xxx</p>
     */
    @NameInMap("OperationIp")
    public String operationIp;

    /**
     * <p>The MFA of operation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OperationMfaPresent")
    public Boolean operationMfaPresent;

    /**
     * <p>Region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The description of service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Test supplier</p>
     */
    @NameInMap("SupplierDesc")
    public String supplierDesc;

    /**
     * <p>The Logo of service provider.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://example.aliyundoc.com/cover/34DB-4F4C-9373-003AA060****.png">http://example.aliyundoc.com/cover/34DB-4F4C-9373-003AA060****.png</a></p>
     */
    @NameInMap("SupplierLogo")
    public String supplierLogo;

    /**
     * <p>The URL of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.xxx.xxx.cn">http://www.xxx.xxx.cn</a></p>
     */
    @NameInMap("SupplierUrl")
    public String supplierUrl;

    public static UpdateSupplierInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSupplierInformationRequest self = new UpdateSupplierInformationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSupplierInformationRequest setDeliverySettings(UpdateSupplierInformationRequestDeliverySettings deliverySettings) {
        this.deliverySettings = deliverySettings;
        return this;
    }
    public UpdateSupplierInformationRequestDeliverySettings getDeliverySettings() {
        return this.deliverySettings;
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

    public UpdateSupplierInformationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSupplierInformationRequest setSupplierDesc(String supplierDesc) {
        this.supplierDesc = supplierDesc;
        return this;
    }
    public String getSupplierDesc() {
        return this.supplierDesc;
    }

    public UpdateSupplierInformationRequest setSupplierLogo(String supplierLogo) {
        this.supplierLogo = supplierLogo;
        return this;
    }
    public String getSupplierLogo() {
        return this.supplierLogo;
    }

    public UpdateSupplierInformationRequest setSupplierUrl(String supplierUrl) {
        this.supplierUrl = supplierUrl;
        return this;
    }
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    public static class UpdateSupplierInformationRequestDeliverySettings extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>mybucket</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <p>Specifies whether to enable screencast delivery to Object Storage Service (OSS). Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OssEnabled")
        public Boolean ossEnabled;

        /**
         * <p>The number of days for which the screencasts are saved.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("OssExpirationDays")
        public Long ossExpirationDays;

        /**
         * <p>The OSS path.</p>
         * 
         * <strong>example:</strong>
         * <p>path1/path2/</p>
         */
        @NameInMap("OssPath")
        public String ossPath;

        public static UpdateSupplierInformationRequestDeliverySettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateSupplierInformationRequestDeliverySettings self = new UpdateSupplierInformationRequestDeliverySettings();
            return TeaModel.build(map, self);
        }

        public UpdateSupplierInformationRequestDeliverySettings setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public UpdateSupplierInformationRequestDeliverySettings setOssEnabled(Boolean ossEnabled) {
            this.ossEnabled = ossEnabled;
            return this;
        }
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        public UpdateSupplierInformationRequestDeliverySettings setOssExpirationDays(Long ossExpirationDays) {
            this.ossExpirationDays = ossExpirationDays;
            return this;
        }
        public Long getOssExpirationDays() {
            return this.ossExpirationDays;
        }

        public UpdateSupplierInformationRequestDeliverySettings setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

    }

}
