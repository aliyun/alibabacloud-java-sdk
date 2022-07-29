// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class AddAndRemoveFavoriteContentRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public AddAndRemoveFavoriteContentRequestDeviceInfo deviceInfo;

    @NameInMap("OpenAddAndRemoveFavoriteContentRequest")
    public AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequest openAddAndRemoveFavoriteContentRequest;

    @NameInMap("UserInfo")
    public AddAndRemoveFavoriteContentRequestUserInfo userInfo;

    public static AddAndRemoveFavoriteContentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAndRemoveFavoriteContentRequest self = new AddAndRemoveFavoriteContentRequest();
        return TeaModel.build(map, self);
    }

    public AddAndRemoveFavoriteContentRequest setDeviceInfo(AddAndRemoveFavoriteContentRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public AddAndRemoveFavoriteContentRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public AddAndRemoveFavoriteContentRequest setOpenAddAndRemoveFavoriteContentRequest(AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequest openAddAndRemoveFavoriteContentRequest) {
        this.openAddAndRemoveFavoriteContentRequest = openAddAndRemoveFavoriteContentRequest;
        return this;
    }
    public AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequest getOpenAddAndRemoveFavoriteContentRequest() {
        return this.openAddAndRemoveFavoriteContentRequest;
    }

    public AddAndRemoveFavoriteContentRequest setUserInfo(AddAndRemoveFavoriteContentRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public AddAndRemoveFavoriteContentRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class AddAndRemoveFavoriteContentRequestDeviceInfo extends TeaModel {
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static AddAndRemoveFavoriteContentRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            AddAndRemoveFavoriteContentRequestDeviceInfo self = new AddAndRemoveFavoriteContentRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public AddAndRemoveFavoriteContentRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public AddAndRemoveFavoriteContentRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public AddAndRemoveFavoriteContentRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddAndRemoveFavoriteContentRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public AddAndRemoveFavoriteContentRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequestOpenSourceRawIdPair extends TeaModel {
        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        @NameInMap("RawId")
        public String rawId;

        @NameInMap("Source")
        public String source;

        public static AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequestOpenSourceRawIdPair build(java.util.Map<String, ?> map) throws Exception {
            AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequestOpenSourceRawIdPair self = new AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequestOpenSourceRawIdPair();
            return TeaModel.build(map, self);
        }

        public AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequestOpenSourceRawIdPair setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequestOpenSourceRawIdPair setRawId(String rawId) {
            this.rawId = rawId;
            return this;
        }
        public String getRawId() {
            return this.rawId;
        }

        public AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequestOpenSourceRawIdPair setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequest extends TeaModel {
        @NameInMap("FavoriteCmd")
        public String favoriteCmd;

        @NameInMap("OpenSourceRawIdPair")
        public AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequestOpenSourceRawIdPair openSourceRawIdPair;

        @NameInMap("PackageType")
        public String packageType;

        public static AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequest build(java.util.Map<String, ?> map) throws Exception {
            AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequest self = new AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequest();
            return TeaModel.build(map, self);
        }

        public AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequest setFavoriteCmd(String favoriteCmd) {
            this.favoriteCmd = favoriteCmd;
            return this;
        }
        public String getFavoriteCmd() {
            return this.favoriteCmd;
        }

        public AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequest setOpenSourceRawIdPair(AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequestOpenSourceRawIdPair openSourceRawIdPair) {
            this.openSourceRawIdPair = openSourceRawIdPair;
            return this;
        }
        public AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequestOpenSourceRawIdPair getOpenSourceRawIdPair() {
            return this.openSourceRawIdPair;
        }

        public AddAndRemoveFavoriteContentRequestOpenAddAndRemoveFavoriteContentRequest setPackageType(String packageType) {
            this.packageType = packageType;
            return this;
        }
        public String getPackageType() {
            return this.packageType;
        }

    }

    public static class AddAndRemoveFavoriteContentRequestUserInfo extends TeaModel {
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("Id")
        public String id;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("OrganizationId")
        public String organizationId;

        public static AddAndRemoveFavoriteContentRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            AddAndRemoveFavoriteContentRequestUserInfo self = new AddAndRemoveFavoriteContentRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public AddAndRemoveFavoriteContentRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public AddAndRemoveFavoriteContentRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public AddAndRemoveFavoriteContentRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public AddAndRemoveFavoriteContentRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public AddAndRemoveFavoriteContentRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
