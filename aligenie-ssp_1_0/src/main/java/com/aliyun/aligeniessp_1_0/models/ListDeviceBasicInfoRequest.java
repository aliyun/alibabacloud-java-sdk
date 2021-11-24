// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceBasicInfoRequest extends TeaModel {
    // 设备标识信息
    @NameInMap("DeviceInfos")
    public ListDeviceBasicInfoRequestDeviceInfos deviceInfos;

    public static ListDeviceBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceBasicInfoRequest self = new ListDeviceBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceBasicInfoRequest setDeviceInfos(ListDeviceBasicInfoRequestDeviceInfos deviceInfos) {
        this.deviceInfos = deviceInfos;
        return this;
    }
    public ListDeviceBasicInfoRequestDeviceInfos getDeviceInfos() {
        return this.deviceInfos;
    }

    public static class ListDeviceBasicInfoRequestDeviceInfos extends TeaModel {
        // 编码类型对应的值，此处填写天猫精灵AI平台中，该产品ProductKey所在项目的Project ID。
        @NameInMap("EncodeKey")
        public String encodeKey;

        // 编码类型，此处填写“PROJECT_ID”
        @NameInMap("EncodeType")
        public String encodeType;

        // 设备Id的类型  - OPEN_ID：默认的设备ID标识 - UNION_ID: 组织维度的设备ID标识，在开放平台申请过组织后才会有
        @NameInMap("IdType")
        public String idType;

        // 设备标识列表（deviceOpenId或deviceUnionId）
        @NameInMap("Ids")
        public java.util.List<String> ids;

        // 组织ID，如果IdType为UNION_ID时必填
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListDeviceBasicInfoRequestDeviceInfos build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceBasicInfoRequestDeviceInfos self = new ListDeviceBasicInfoRequestDeviceInfos();
            return TeaModel.build(map, self);
        }

        public ListDeviceBasicInfoRequestDeviceInfos setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListDeviceBasicInfoRequestDeviceInfos setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListDeviceBasicInfoRequestDeviceInfos setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListDeviceBasicInfoRequestDeviceInfos setIds(java.util.List<String> ids) {
            this.ids = ids;
            return this;
        }
        public java.util.List<String> getIds() {
            return this.ids;
        }

        public ListDeviceBasicInfoRequestDeviceInfos setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
