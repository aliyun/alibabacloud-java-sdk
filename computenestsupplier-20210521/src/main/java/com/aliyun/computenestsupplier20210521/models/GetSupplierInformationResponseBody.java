// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetSupplierInformationResponseBody extends TeaModel {
    /**
     * <p>The delivery settings.</p>
     */
    @NameInMap("DeliverySettings")
    public GetSupplierInformationResponseBodyDeliverySettings deliverySettings;

    /**
     * <p>Whether to enable reseller</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableReseller")
    public Boolean enableReseller;

    /**
     * <p>The Ip of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>10.xxx.xxx.xxx/101</p>
     */
    @NameInMap("OperationIp")
    public String operationIp;

    /**
     * <p>The MFA of the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OperationMfaPresent")
    public Boolean operationMfaPresent;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <p>The name of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p>Alibaba Cloud</p>
     */
    @NameInMap("SupplierName")
    public String supplierName;

    /**
     * <p>The URL of the service provider.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.xxx.xxx.cn">http://www.xxx.xxx.cn</a></p>
     */
    @NameInMap("SupplierUrl")
    public String supplierUrl;

    public static GetSupplierInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupplierInformationResponseBody self = new GetSupplierInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupplierInformationResponseBody setDeliverySettings(GetSupplierInformationResponseBodyDeliverySettings deliverySettings) {
        this.deliverySettings = deliverySettings;
        return this;
    }
    public GetSupplierInformationResponseBodyDeliverySettings getDeliverySettings() {
        return this.deliverySettings;
    }

    public GetSupplierInformationResponseBody setEnableReseller(Boolean enableReseller) {
        this.enableReseller = enableReseller;
        return this;
    }
    public Boolean getEnableReseller() {
        return this.enableReseller;
    }

    public GetSupplierInformationResponseBody setOperationIp(String operationIp) {
        this.operationIp = operationIp;
        return this;
    }
    public String getOperationIp() {
        return this.operationIp;
    }

    public GetSupplierInformationResponseBody setOperationMfaPresent(Boolean operationMfaPresent) {
        this.operationMfaPresent = operationMfaPresent;
        return this;
    }
    public Boolean getOperationMfaPresent() {
        return this.operationMfaPresent;
    }

    public GetSupplierInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSupplierInformationResponseBody setSupplierDesc(String supplierDesc) {
        this.supplierDesc = supplierDesc;
        return this;
    }
    public String getSupplierDesc() {
        return this.supplierDesc;
    }

    public GetSupplierInformationResponseBody setSupplierLogo(String supplierLogo) {
        this.supplierLogo = supplierLogo;
        return this;
    }
    public String getSupplierLogo() {
        return this.supplierLogo;
    }

    public GetSupplierInformationResponseBody setSupplierName(String supplierName) {
        this.supplierName = supplierName;
        return this;
    }
    public String getSupplierName() {
        return this.supplierName;
    }

    public GetSupplierInformationResponseBody setSupplierUrl(String supplierUrl) {
        this.supplierUrl = supplierUrl;
        return this;
    }
    public String getSupplierUrl() {
        return this.supplierUrl;
    }

    public static class GetSupplierInformationResponseBodyDeliverySettings extends TeaModel {
        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>mybucket</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <p>Indicates whether screencast delivery to Object Storage Service (OSS) is enabled. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        public static GetSupplierInformationResponseBodyDeliverySettings build(java.util.Map<String, ?> map) throws Exception {
            GetSupplierInformationResponseBodyDeliverySettings self = new GetSupplierInformationResponseBodyDeliverySettings();
            return TeaModel.build(map, self);
        }

        public GetSupplierInformationResponseBodyDeliverySettings setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public GetSupplierInformationResponseBodyDeliverySettings setOssEnabled(Boolean ossEnabled) {
            this.ossEnabled = ossEnabled;
            return this;
        }
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        public GetSupplierInformationResponseBodyDeliverySettings setOssExpirationDays(Long ossExpirationDays) {
            this.ossExpirationDays = ossExpirationDays;
            return this;
        }
        public Long getOssExpirationDays() {
            return this.ossExpirationDays;
        }

        public GetSupplierInformationResponseBodyDeliverySettings setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

    }

}
