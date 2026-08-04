// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceBasicInfoRequest extends TeaModel {
    /**
     * <p>List of device identity information.</p>
     */
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
        /**
         * <p>Value corresponding to the encoding type. Enter the Project ID of the project where the product resides. You can view this in the Tmall Genie AI Platform console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>Encoding type. Enter <strong>PROJECT_ID</strong> here.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>Type of device ID:</p>
         * <ul>
         * <li>OPEN_ID: Default device ID identity.</li>
         * <li>UNION_ID: Organization-dimension device ID identity. You must request an organization in advance on the Open Platform.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <p>List of device identity information.</p>
         */
        @NameInMap("Ids")
        public java.util.List<String> ids;

        /**
         * <p>Organization ID of the device. Required if IdType is UNION_ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
