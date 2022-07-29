// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceBasicInfoRequest extends TeaModel {
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
        @NameInMap("EncodeKey")
        public String encodeKey;

        @NameInMap("EncodeType")
        public String encodeType;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("Ids")
        public java.util.List<String> ids;

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
