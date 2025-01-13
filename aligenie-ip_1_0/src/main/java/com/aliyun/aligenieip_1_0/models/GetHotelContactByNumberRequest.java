// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelContactByNumberRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>101</p>
     */
    @NameInMap("Number")
    public String number;

    @NameInMap("UserInfo")
    public GetHotelContactByNumberRequestUserInfo userInfo;

    public static GetHotelContactByNumberRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotelContactByNumberRequest self = new GetHotelContactByNumberRequest();
        return TeaModel.build(map, self);
    }

    public GetHotelContactByNumberRequest setNumber(String number) {
        this.number = number;
        return this;
    }
    public String getNumber() {
        return this.number;
    }

    public GetHotelContactByNumberRequest setUserInfo(GetHotelContactByNumberRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetHotelContactByNumberRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetHotelContactByNumberRequestUserInfo extends TeaModel {
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
         * <p>HOTEL</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ou***lk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
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

        public static GetHotelContactByNumberRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotelContactByNumberRequestUserInfo self = new GetHotelContactByNumberRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetHotelContactByNumberRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetHotelContactByNumberRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetHotelContactByNumberRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotelContactByNumberRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetHotelContactByNumberRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
