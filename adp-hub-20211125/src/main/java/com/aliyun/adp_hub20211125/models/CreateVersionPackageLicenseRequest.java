// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp_hub20211125.models;

import com.aliyun.tea.*;

public class CreateVersionPackageLicenseRequest extends TeaModel {
    @NameInMap("customProductQuotaList")
    public java.util.List<CreateVersionPackageLicenseRequestCustomProductQuotaList> customProductQuotaList;

    @NameInMap("environmentUID")
    public String environmentUID;

    @NameInMap("expiredTime")
    public Long expiredTime;

    @NameInMap("machineFingerprint")
    public String machineFingerprint;

    @NameInMap("productVersionUID")
    public String productVersionUID;

    public static CreateVersionPackageLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVersionPackageLicenseRequest self = new CreateVersionPackageLicenseRequest();
        return TeaModel.build(map, self);
    }

    public CreateVersionPackageLicenseRequest setCustomProductQuotaList(java.util.List<CreateVersionPackageLicenseRequestCustomProductQuotaList> customProductQuotaList) {
        this.customProductQuotaList = customProductQuotaList;
        return this;
    }
    public java.util.List<CreateVersionPackageLicenseRequestCustomProductQuotaList> getCustomProductQuotaList() {
        return this.customProductQuotaList;
    }

    public CreateVersionPackageLicenseRequest setEnvironmentUID(String environmentUID) {
        this.environmentUID = environmentUID;
        return this;
    }
    public String getEnvironmentUID() {
        return this.environmentUID;
    }

    public CreateVersionPackageLicenseRequest setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }
    public Long getExpiredTime() {
        return this.expiredTime;
    }

    public CreateVersionPackageLicenseRequest setMachineFingerprint(String machineFingerprint) {
        this.machineFingerprint = machineFingerprint;
        return this;
    }
    public String getMachineFingerprint() {
        return this.machineFingerprint;
    }

    public CreateVersionPackageLicenseRequest setProductVersionUID(String productVersionUID) {
        this.productVersionUID = productVersionUID;
        return this;
    }
    public String getProductVersionUID() {
        return this.productVersionUID;
    }

    public static class CreateVersionPackageLicenseRequestCustomProductQuotaList extends TeaModel {
        @NameInMap("description")
        public String description;

        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static CreateVersionPackageLicenseRequestCustomProductQuotaList build(java.util.Map<String, ?> map) throws Exception {
            CreateVersionPackageLicenseRequestCustomProductQuotaList self = new CreateVersionPackageLicenseRequestCustomProductQuotaList();
            return TeaModel.build(map, self);
        }

        public CreateVersionPackageLicenseRequestCustomProductQuotaList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateVersionPackageLicenseRequestCustomProductQuotaList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVersionPackageLicenseRequestCustomProductQuotaList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
