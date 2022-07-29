// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceTagRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetDeviceTagRequestDeviceInfo deviceInfo;

    public static GetDeviceTagRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceTagRequest self = new GetDeviceTagRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceTagRequest setDeviceInfo(GetDeviceTagRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetDeviceTagRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class GetDeviceTagRequestDeviceInfo extends TeaModel {
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

        public static GetDeviceTagRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceTagRequestDeviceInfo self = new GetDeviceTagRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetDeviceTagRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetDeviceTagRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetDeviceTagRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDeviceTagRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetDeviceTagRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
