// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class AppInfoDTO extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>1-普通应用，2-内嵌SDK.</p>
     */
    @NameInMap("AppType")
    public Integer appType;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("ItemId")
    public String itemId;

    @NameInMap("Platforms")
    public java.util.List<AppInfoDTOPlatforms> platforms;

    @NameInMap("UserId")
    public Long userId;

    public static AppInfoDTO build(java.util.Map<String, ?> map) throws Exception {
        AppInfoDTO self = new AppInfoDTO();
        return TeaModel.build(map, self);
    }

    public AppInfoDTO setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public AppInfoDTO setAppType(Integer appType) {
        this.appType = appType;
        return this;
    }
    public Integer getAppType() {
        return this.appType;
    }

    public AppInfoDTO setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public AppInfoDTO setItemId(String itemId) {
        this.itemId = itemId;
        return this;
    }
    public String getItemId() {
        return this.itemId;
    }

    public AppInfoDTO setPlatforms(java.util.List<AppInfoDTOPlatforms> platforms) {
        this.platforms = platforms;
        return this;
    }
    public java.util.List<AppInfoDTOPlatforms> getPlatforms() {
        return this.platforms;
    }

    public AppInfoDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public static class AppInfoDTOPlatforms extends TeaModel {
        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("LicenseItemIds")
        public java.util.List<String> licenseItemIds;

        @NameInMap("PkgName")
        public String pkgName;

        @NameInMap("PkgSignature")
        public String pkgSignature;

        @NameInMap("PlatformType")
        public Long platformType;

        @NameInMap("Type")
        public Long type;

        public static AppInfoDTOPlatforms build(java.util.Map<String, ?> map) throws Exception {
            AppInfoDTOPlatforms self = new AppInfoDTOPlatforms();
            return TeaModel.build(map, self);
        }

        public AppInfoDTOPlatforms setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public AppInfoDTOPlatforms setLicenseItemIds(java.util.List<String> licenseItemIds) {
            this.licenseItemIds = licenseItemIds;
            return this;
        }
        public java.util.List<String> getLicenseItemIds() {
            return this.licenseItemIds;
        }

        public AppInfoDTOPlatforms setPkgName(String pkgName) {
            this.pkgName = pkgName;
            return this;
        }
        public String getPkgName() {
            return this.pkgName;
        }

        public AppInfoDTOPlatforms setPkgSignature(String pkgSignature) {
            this.pkgSignature = pkgSignature;
            return this;
        }
        public String getPkgSignature() {
            return this.pkgSignature;
        }

        public AppInfoDTOPlatforms setPlatformType(Long platformType) {
            this.platformType = platformType;
            return this;
        }
        public Long getPlatformType() {
            return this.platformType;
        }

        public AppInfoDTOPlatforms setType(Long type) {
            this.type = type;
            return this;
        }
        public Long getType() {
            return this.type;
        }

    }

}
