// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class GetHotelNoticeV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public GetHotelNoticeV2RequestUserInfo userInfo;

    public static GetHotelNoticeV2Request build(java.util.Map<String, ?> map) throws Exception {
        GetHotelNoticeV2Request self = new GetHotelNoticeV2Request();
        return TeaModel.build(map, self);
    }

    public GetHotelNoticeV2Request setUserInfo(GetHotelNoticeV2RequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetHotelNoticeV2RequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetHotelNoticeV2RequestUserInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("EncodeKey")
        public String encodeKey;

        /**
         * <strong>example:</strong>
         * <p>HOTEL</p>
         */
        @NameInMap("EncodeType")
        public String encodeType;

        /**
         * <strong>example:</strong>
         * <p>rV/XSgPuxZjx/hN3iw8U+e8ou***lk1r43LWcVW6fvY1Rr4sEPFodpnA==</p>
         */
        @NameInMap("Id")
        public String id;

        /**
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

        public static GetHotelNoticeV2RequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetHotelNoticeV2RequestUserInfo self = new GetHotelNoticeV2RequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetHotelNoticeV2RequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetHotelNoticeV2RequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetHotelNoticeV2RequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetHotelNoticeV2RequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetHotelNoticeV2RequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
