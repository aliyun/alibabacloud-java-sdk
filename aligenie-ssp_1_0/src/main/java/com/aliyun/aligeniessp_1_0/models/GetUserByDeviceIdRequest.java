// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetUserByDeviceIdRequest extends TeaModel {
    // 设备标识信息
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
        // 编码类型对应的值，此处填写天猫精灵AI平台中，该产品ProductKey所在项目的Project ID。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，此处填写“PROJECT_ID”
        @NameInMap("EncodeType")
        public String encodeType;

        // 设备标识（deviceOpenId或deviceUnionId）
        @NameInMap("Id")
        public String id;

        // 设备Id的类型  - OPEN_ID：默认的设备ID标识 - UNION_ID: 组织维度的设备ID标识，在开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 组织ID，如果IdType为UNION_ID时必填
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
