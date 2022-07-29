// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class GetCodeEnhanceRequest extends TeaModel {
    @NameInMap("ChannelInfo")
    public GetCodeEnhanceRequestChannelInfo channelInfo;

    @NameInMap("UserInfo")
    public GetCodeEnhanceRequestUserInfo userInfo;

    public static GetCodeEnhanceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCodeEnhanceRequest self = new GetCodeEnhanceRequest();
        return TeaModel.build(map, self);
    }

    public GetCodeEnhanceRequest setChannelInfo(GetCodeEnhanceRequestChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
        return this;
    }
    public GetCodeEnhanceRequestChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    public GetCodeEnhanceRequest setUserInfo(GetCodeEnhanceRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public GetCodeEnhanceRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class GetCodeEnhanceRequestChannelInfo extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("ExtInfo")
        public String extInfo;

        public static GetCodeEnhanceRequestChannelInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCodeEnhanceRequestChannelInfo self = new GetCodeEnhanceRequestChannelInfo();
            return TeaModel.build(map, self);
        }

        public GetCodeEnhanceRequestChannelInfo setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public GetCodeEnhanceRequestChannelInfo setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

    }

    public static class GetCodeEnhanceRequestUserInfo extends TeaModel {
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

        public static GetCodeEnhanceRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            GetCodeEnhanceRequestUserInfo self = new GetCodeEnhanceRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public GetCodeEnhanceRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public GetCodeEnhanceRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public GetCodeEnhanceRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCodeEnhanceRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public GetCodeEnhanceRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
