// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.computenest20210601.models;

import com.aliyun.tea.*;

public class UpdateUserInformationRequest extends TeaModel {
    /**
     * <p>The modified delivery settings.</p>
     */
    @NameInMap("DeliverySettings")
    public UpdateUserInformationRequestDeliverySettings deliverySettings;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateUserInformationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserInformationRequest self = new UpdateUserInformationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserInformationRequest setDeliverySettings(UpdateUserInformationRequestDeliverySettings deliverySettings) {
        this.deliverySettings = deliverySettings;
        return this;
    }
    public UpdateUserInformationRequestDeliverySettings getDeliverySettings() {
        return this.deliverySettings;
    }

    public UpdateUserInformationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class UpdateUserInformationRequestDeliverySettings extends TeaModel {
        /**
         * <p>Specifies whether to enable screencast delivery to OSS. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ActiontrailDeliveryToOssEnabled")
        public Boolean actiontrailDeliveryToOssEnabled;

        /**
         * <p>The name of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;mybucket&quot;</p>
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
         * <p>&quot;path1/path2/&quot;</p>
         */
        @NameInMap("OssPath")
        public String ossPath;

        public static UpdateUserInformationRequestDeliverySettings build(java.util.Map<String, ?> map) throws Exception {
            UpdateUserInformationRequestDeliverySettings self = new UpdateUserInformationRequestDeliverySettings();
            return TeaModel.build(map, self);
        }

        public UpdateUserInformationRequestDeliverySettings setActiontrailDeliveryToOssEnabled(Boolean actiontrailDeliveryToOssEnabled) {
            this.actiontrailDeliveryToOssEnabled = actiontrailDeliveryToOssEnabled;
            return this;
        }
        public Boolean getActiontrailDeliveryToOssEnabled() {
            return this.actiontrailDeliveryToOssEnabled;
        }

        public UpdateUserInformationRequestDeliverySettings setOssBucketName(String ossBucketName) {
            this.ossBucketName = ossBucketName;
            return this;
        }
        public String getOssBucketName() {
            return this.ossBucketName;
        }

        public UpdateUserInformationRequestDeliverySettings setOssEnabled(Boolean ossEnabled) {
            this.ossEnabled = ossEnabled;
            return this;
        }
        public Boolean getOssEnabled() {
            return this.ossEnabled;
        }

        public UpdateUserInformationRequestDeliverySettings setOssExpirationDays(Long ossExpirationDays) {
            this.ossExpirationDays = ossExpirationDays;
            return this;
        }
        public Long getOssExpirationDays() {
            return this.ossExpirationDays;
        }

        public UpdateUserInformationRequestDeliverySettings setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

    }

}
