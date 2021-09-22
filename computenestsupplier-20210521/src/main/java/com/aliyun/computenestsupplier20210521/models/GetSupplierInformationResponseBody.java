// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenestsupplier20210521.models;

import com.aliyun.tea.*;

public class GetSupplierInformationResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SupplierName")
    public String supplierName;

    @NameInMap("SupplierUrl")
    public String supplierUrl;

    @NameInMap("SupplierDesc")
    public String supplierDesc;

    @NameInMap("OperationIp")
    public String operationIp;

    @NameInMap("OperationMfaPresent")
    public Boolean operationMfaPresent;

    @NameInMap("DeliverySettings")
    public GetSupplierInformationResponseBodyDeliverySettings deliverySettings;

    public static GetSupplierInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupplierInformationResponseBody self = new GetSupplierInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupplierInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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

    public GetSupplierInformationResponseBody setSupplierDesc(String supplierDesc) {
        this.supplierDesc = supplierDesc;
        return this;
    }
    public String getSupplierDesc() {
        return this.supplierDesc;
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

    public GetSupplierInformationResponseBody setDeliverySettings(GetSupplierInformationResponseBodyDeliverySettings deliverySettings) {
        this.deliverySettings = deliverySettings;
        return this;
    }
    public GetSupplierInformationResponseBodyDeliverySettings getDeliverySettings() {
        return this.deliverySettings;
    }

    public static class GetSupplierInformationResponseBodyDeliverySettings extends TeaModel {
        @NameInMap("OssEnabled")
        public Boolean ossEnabled;

        @NameInMap("OssBucketName")
        public String ossBucketName;

        @NameInMap("OssPath")
        public String ossPath;

        @NameInMap("OssExpirationDays")
        public Long ossExpirationDays;

        public static GetSupplierInformationResponseBodyDeliverySettings build(java.util.Map<String, ?> map) throws Exception {
            GetSupplierInformationResponseBodyDeliverySettings self = new GetSupplierInformationResponseBodyDeliverySettings();
            return TeaModel.build(map, self);
        }

        public GetSupplierInformationResponseBodyDeliverySettings setOssEnabled(Boolean ossEnabled) {
            this.ossEnabled = ossEnabled;
            return this;
        }
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        public GetSupplierInformationResponseBodyDeliverySettings setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public GetSupplierInformationResponseBodyDeliverySettings setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public GetSupplierInformationResponseBodyDeliverySettings setOssExpirationDays(Long ossExpirationDays) {
            this.ossExpirationDays = ossExpirationDays;
            return this;
        }
        public Long getOssExpirationDays() {
            return this.ossExpirationDays;
        }

    }

}
