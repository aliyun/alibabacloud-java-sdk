// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ReadMessageRequest extends TeaModel {
    @NameInMap("MessageId")
    public Long messageId;

    @NameInMap("UserInfo")
    public ReadMessageRequestUserInfo userInfo;

    public static ReadMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ReadMessageRequest self = new ReadMessageRequest();
        return TeaModel.build(map, self);
    }

    public ReadMessageRequest setMessageId(Long messageId) {
        this.messageId = messageId;
        return this;
    }
    public Long getMessageId() {
        return this.messageId;
    }

    public ReadMessageRequest setUserInfo(ReadMessageRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ReadMessageRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ReadMessageRequestUserInfo extends TeaModel {
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

        public static ReadMessageRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ReadMessageRequestUserInfo self = new ReadMessageRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ReadMessageRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ReadMessageRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ReadMessageRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ReadMessageRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ReadMessageRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
