// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListPlayHistoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public ListPlayHistoryRequestDeviceInfo deviceInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Request")
    public ListPlayHistoryRequestRequest request;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public ListPlayHistoryRequestUserInfo userInfo;

    public static ListPlayHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPlayHistoryRequest self = new ListPlayHistoryRequest();
        return TeaModel.build(map, self);
    }

    public ListPlayHistoryRequest setDeviceInfo(ListPlayHistoryRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public ListPlayHistoryRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public ListPlayHistoryRequest setRequest(ListPlayHistoryRequestRequest request) {
        this.request = request;
        return this;
    }
    public ListPlayHistoryRequestRequest getRequest() {
        return this.request;
    }

    public ListPlayHistoryRequest setUserInfo(ListPlayHistoryRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListPlayHistoryRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListPlayHistoryRequestDeviceInfo extends TeaModel {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListPlayHistoryRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPlayHistoryRequestDeviceInfo self = new ListPlayHistoryRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public ListPlayHistoryRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListPlayHistoryRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListPlayHistoryRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPlayHistoryRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListPlayHistoryRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class ListPlayHistoryRequestRequest extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>music</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListPlayHistoryRequestRequest build(java.util.Map<String, ?> map) throws Exception {
            ListPlayHistoryRequestRequest self = new ListPlayHistoryRequestRequest();
            return TeaModel.build(map, self);
        }

        public ListPlayHistoryRequestRequest setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListPlayHistoryRequestRequest setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPlayHistoryRequestRequest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListPlayHistoryRequestUserInfo extends TeaModel {
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1**2</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static ListPlayHistoryRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPlayHistoryRequestUserInfo self = new ListPlayHistoryRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListPlayHistoryRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListPlayHistoryRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListPlayHistoryRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListPlayHistoryRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListPlayHistoryRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
