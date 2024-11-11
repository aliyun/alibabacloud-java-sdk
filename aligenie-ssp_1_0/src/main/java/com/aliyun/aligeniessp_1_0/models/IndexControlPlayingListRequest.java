// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class IndexControlPlayingListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DeviceInfo")
    public IndexControlPlayingListRequestDeviceInfo deviceInfo;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OpenIndexControlRequest")
    public IndexControlPlayingListRequestOpenIndexControlRequest openIndexControlRequest;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public IndexControlPlayingListRequestUserInfo userInfo;

    public static IndexControlPlayingListRequest build(java.util.Map<String, ?> map) throws Exception {
        IndexControlPlayingListRequest self = new IndexControlPlayingListRequest();
        return TeaModel.build(map, self);
    }

    public IndexControlPlayingListRequest setDeviceInfo(IndexControlPlayingListRequestDeviceInfo deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public IndexControlPlayingListRequestDeviceInfo getDeviceInfo() {
        return this.deviceInfo;
    }

    public IndexControlPlayingListRequest setOpenIndexControlRequest(IndexControlPlayingListRequestOpenIndexControlRequest openIndexControlRequest) {
        this.openIndexControlRequest = openIndexControlRequest;
        return this;
    }
    public IndexControlPlayingListRequestOpenIndexControlRequest getOpenIndexControlRequest() {
        return this.openIndexControlRequest;
    }

    public IndexControlPlayingListRequest setUserInfo(IndexControlPlayingListRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public IndexControlPlayingListRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class IndexControlPlayingListRequestDeviceInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
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
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static IndexControlPlayingListRequestDeviceInfo build(java.util.Map<String, ?> map) throws Exception {
            IndexControlPlayingListRequestDeviceInfo self = new IndexControlPlayingListRequestDeviceInfo();
            return TeaModel.build(map, self);
        }

        public IndexControlPlayingListRequestDeviceInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public IndexControlPlayingListRequestDeviceInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public IndexControlPlayingListRequestDeviceInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public IndexControlPlayingListRequestDeviceInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public IndexControlPlayingListRequestDeviceInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

    public static class IndexControlPlayingListRequestOpenIndexControlRequest extends TeaModel {
        @NameInMap("ExtendInfo")
        public java.util.Map<String, ?> extendInfo;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NeedContentContinued")
        public Boolean needContentContinued;

        public static IndexControlPlayingListRequestOpenIndexControlRequest build(java.util.Map<String, ?> map) throws Exception {
            IndexControlPlayingListRequestOpenIndexControlRequest self = new IndexControlPlayingListRequestOpenIndexControlRequest();
            return TeaModel.build(map, self);
        }

        public IndexControlPlayingListRequestOpenIndexControlRequest setExtendInfo(java.util.Map<String, ?> extendInfo) {
            this.extendInfo = extendInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtendInfo() {
            return this.extendInfo;
        }

        public IndexControlPlayingListRequestOpenIndexControlRequest setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public IndexControlPlayingListRequestOpenIndexControlRequest setNeedContentContinued(Boolean needContentContinued) {
            this.needContentContinued = needContentContinued;
            return this;
        }
        public Boolean getNeedContentContinued() {
            return this.needContentContinued;
        }

    }

    public static class IndexControlPlayingListRequestUserInfo extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROJECT_ID</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ouRjKOX95tn1a0kwb2+Ao6Q1CAxASJUZDWtlk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
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
         * <p>123</p>
         */
        @NameInMap("OrganizationId")
        public String organizationId;

        public static IndexControlPlayingListRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            IndexControlPlayingListRequestUserInfo self = new IndexControlPlayingListRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public IndexControlPlayingListRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public IndexControlPlayingListRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public IndexControlPlayingListRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public IndexControlPlayingListRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public IndexControlPlayingListRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
