// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetDeviceBasicInfoRequest extends TeaModel {
    @NameInMap("DeviceInfo")
    public GetDeviceBasicInfoRequestDeviceInfo deviceInfo;

    public static GetDeviceBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceBasicInfoRequest self = new GetDeviceBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceBasicInfoRequest setDeviceInfo(GetDeviceBasicInfoRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public GetDeviceBasicInfoRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public static class GetDeviceBasicInfoRequestDeviceInfo extends TeaModel {
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

        public static GetDeviceBasicInfoRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetDeviceBasicInfoRequestDeviceInfo self = new GetDeviceBasicInfoRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public GetDeviceBasicInfoRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetDeviceBasicInfoRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
