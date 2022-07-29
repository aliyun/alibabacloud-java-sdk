// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceStatusInfoRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetDeviceStatusInfoRequestDeviceInfo deviceInfo;

    public static GetDeviceStatusInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceStatusInfoRequest self = new GetDeviceStatusInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceStatusInfoRequest setDeviceInfo(GetDeviceStatusInfoRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetDeviceStatusInfoRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class GetDeviceStatusInfoRequestDeviceInfo extends TeaModel {
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

        public static GetDeviceStatusInfoRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceStatusInfoRequestDeviceInfo self = new GetDeviceStatusInfoRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetDeviceStatusInfoRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetDeviceStatusInfoRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetDeviceStatusInfoRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDeviceStatusInfoRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetDeviceStatusInfoRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
