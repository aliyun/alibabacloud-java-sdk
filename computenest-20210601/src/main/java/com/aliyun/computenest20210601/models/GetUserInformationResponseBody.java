// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class GetUserInformationResponseBody extends TeaModel {
    @NameInMap("DeliverySettings")
    public GetUserInformationResponseBodyDeliverySettings deliverySettings;

    /**
     * <strong>example:</strong>
     * <p>52EBAF16-22F6-53DB-AE1E-44764FC62AF0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetUserInformationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserInformationResponseBody self = new GetUserInformationResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserInformationResponseBody setDeliverySettings(GetUserInformationResponseBodyDeliverySettings deliverySettings) {
        this.deliverySettings = deliverySettings;
        return this;
    }
    public GetUserInformationResponseBodyDeliverySettings getDeliverySettings() {
        return this.deliverySettings;
    }

    public GetUserInformationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetUserInformationResponseBodyDeliverySettings extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ActiontrailDeliveryToOssEnabled")
        public Boolean actiontrailDeliveryToOssEnabled;

        /**
         * <strong>example:</strong>
         * <p>0101data</p>
         */
        @NameInMap("OssBucketName")
        public String ossBucketName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OssEnabled")
        public Boolean ossEnabled;

        /**
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("OssExpirationDays")
        public Long ossExpirationDays;

        /**
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("OssPath")
        public String ossPath;

        public static GetUserInformationResponseBodyDeliverySettings build(java.util.Map<String, ?> map) throws Exception {
            GetUserInformationResponseBodyDeliverySettings self = new GetUserInformationResponseBodyDeliverySettings();
            return TeaModel.build(map, self);
        }

        public GetUserInformationResponseBodyDeliverySettings setActiontrailDeliveryToOssEnabled(Boolean actiontrailDeliveryToOssEnabled) {
            this.actiontrailDeliveryToOssEnabled = actiontrailDeliveryToOssEnabled;
            return this;
        }
        public Boolean getActiontrailDeliveryToOssEnabled() {
            return this.actiontrailDeliveryToOssEnabled;
        }

        public GetUserInformationResponseBodyDeliverySettings setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public GetUserInformationResponseBodyDeliverySettings setOssEnabled(Boolean ossEnabled) {
            this.ossEnabled = ossEnabled;
            return this;
        }
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        public GetUserInformationResponseBodyDeliverySettings setOssExpirationDays(Long ossExpirationDays) {
            this.ossExpirationDays = ossExpirationDays;
            return this;
        }
        public Long getOssExpirationDays() {
            return this.ossExpirationDays;
        }

        public GetUserInformationResponseBodyDeliverySettings setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

    }

}
