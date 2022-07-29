// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUserByDeviceIdRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetUserByDeviceIdRequestDeviceInfo deviceInfo;

    public static GetUserByDeviceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserByDeviceIdRequest self = new GetUserByDeviceIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserByDeviceIdRequest setDeviceInfo(GetUserByDeviceIdRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetUserByDeviceIdRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class GetUserByDeviceIdRequestDeviceInfo extends TeaModel {
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

        public static GetUserByDeviceIdRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetUserByDeviceIdRequestDeviceInfo self = new GetUserByDeviceIdRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetUserByDeviceIdRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetUserByDeviceIdRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetUserByDeviceIdRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetUserByDeviceIdRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetUserByDeviceIdRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
