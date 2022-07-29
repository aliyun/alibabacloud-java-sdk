// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ProgressControlRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public ProgressControlRequestDeviceInfo deviceInfo;

    @NameInMap("OpenProgressControlRequest")
    public ProgressControlRequestOpenProgressControlRequest openProgressControlRequest;

    @NameInMap("UserInfo")
    public ProgressControlRequestUserInfo userInfo;

    public static ProgressControlRequest build(java.util.Map<String, ?> map) throws Exception {
        ProgressControlRequest self = new ProgressControlRequest();
        return TeaModel.build(map, self);
    }

    public ProgressControlRequest setDeviceInfo(ProgressControlRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ProgressControlRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ProgressControlRequest setOpenProgressControlRequest(ProgressControlRequestOpenProgressControlRequest openProgressControlRequest) {
        this.openProgressControlRequest = openProgressControlRequest;
        return this;
    }
    public ProgressControlRequestOpenProgressControlRequest getOpenProgressControlRequest() {
        return this.openProgressControlRequest;
    }

    public ProgressControlRequest setUserInfo(ProgressControlRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ProgressControlRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ProgressControlRequestDeviceInfo extends TeaModel {
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

        public static ProgressControlRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ProgressControlRequestDeviceInfo self = new ProgressControlRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ProgressControlRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ProgressControlRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ProgressControlRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ProgressControlRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ProgressControlRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ProgressControlRequestOpenProgressControlRequest extends TeaModel {
        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        @NameInMap("Progress")
        public Integer progress;

        public static ProgressControlRequestOpenProgressControlRequest build(java.util.Map<String, ?> map) throws Exception {
            ProgressControlRequestOpenProgressControlRequest self = new ProgressControlRequestOpenProgressControlRequest();
            return TeaModel.build(map, self);
        }

        public ProgressControlRequestOpenProgressControlRequest setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public ProgressControlRequestOpenProgressControlRequest setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

    }

    public static class ProgressControlRequestUserInfo extends TeaModel {
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

        public static ProgressControlRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ProgressControlRequestUserInfo self = new ProgressControlRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ProgressControlRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ProgressControlRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ProgressControlRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ProgressControlRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ProgressControlRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
