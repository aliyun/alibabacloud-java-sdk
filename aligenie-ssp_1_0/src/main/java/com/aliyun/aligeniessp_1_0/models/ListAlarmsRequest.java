// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListAlarmsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public ListAlarmsRequestDeviceInfo deviceInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Payload")
    public ListAlarmsRequestPayload payload;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ListAlarmsRequestUserInfo userInfo;

    public static ListAlarmsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmsRequest self = new ListAlarmsRequest();
        return TeaModel.build(map, self);
    }

    public ListAlarmsRequest setDeviceInfo(ListAlarmsRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListAlarmsRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListAlarmsRequest setPayload(ListAlarmsRequestPayload payload) {
        this.payload = payload;
        return this;
    }
    public ListAlarmsRequestPayload getPayload() {
        return this.payload;
    }

    public ListAlarmsRequest setUserInfo(ListAlarmsRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListAlarmsRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListAlarmsRequestDeviceInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DAFE****ce3ej=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListAlarmsRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsRequestDeviceInfo self = new ListAlarmsRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListAlarmsRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListAlarmsRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListAlarmsRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlarmsRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListAlarmsRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListAlarmsRequestPayload extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        public static ListAlarmsRequestPayload build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsRequestPayload self = new ListAlarmsRequestPayload();
            return TeaModel.build(map, self);
        }

        public ListAlarmsRequestPayload setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAlarmsRequestPayload setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

    }

    public static class ListAlarmsRequestUserInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12**45</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PACKAGE_NAME</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HOFF****my7Iw=</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OPEN_ID</p>
         */
        @NameInMap("IdType")
        public String idType;

        /**
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListAlarmsRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmsRequestUserInfo self = new ListAlarmsRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListAlarmsRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListAlarmsRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListAlarmsRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListAlarmsRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListAlarmsRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
