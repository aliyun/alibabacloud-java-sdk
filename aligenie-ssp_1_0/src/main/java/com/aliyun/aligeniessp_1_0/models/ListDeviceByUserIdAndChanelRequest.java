// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceByUserIdAndChanelRequest extends TeaModel {
    @NameInMap("ChannelInfo")
    public ListDeviceByUserIdAndChanelRequestChannelInfo channelInfo;

    @NameInMap("UserInfo")
    public ListDeviceByUserIdAndChanelRequestUserInfo userInfo;

    public static ListDeviceByUserIdAndChanelRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceByUserIdAndChanelRequest self = new ListDeviceByUserIdAndChanelRequest();
        return TeaModel.build(map, self);
    }

    public ListDeviceByUserIdAndChanelRequest setChannelInfo(ListDeviceByUserIdAndChanelRequestChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
        return this;
    }
    public ListDeviceByUserIdAndChanelRequestChannelInfo getChannelInfo() {
        return this.channelInfo;
    }

    public ListDeviceByUserIdAndChanelRequest setUserInfo(ListDeviceByUserIdAndChanelRequestUserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }
    public ListDeviceByUserIdAndChanelRequestUserInfo getUserInfo() {
        return this.userInfo;
    }

    public static class ListDeviceByUserIdAndChanelRequestChannelInfo extends TeaModel {
        @NameInMap("Channel")
        public String channel;

        @NameInMap("ExtInfo")
        public String extInfo;

        public static ListDeviceByUserIdAndChanelRequestChannelInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceByUserIdAndChanelRequestChannelInfo self = new ListDeviceByUserIdAndChanelRequestChannelInfo();
            return TeaModel.build(map, self);
        }

        public ListDeviceByUserIdAndChanelRequestChannelInfo setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ListDeviceByUserIdAndChanelRequestChannelInfo setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

    }

    public static class ListDeviceByUserIdAndChanelRequestUserInfo extends TeaModel {
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

        public static ListDeviceByUserIdAndChanelRequestUserInfo build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceByUserIdAndChanelRequestUserInfo self = new ListDeviceByUserIdAndChanelRequestUserInfo();
            return TeaModel.build(map, self);
        }

        public ListDeviceByUserIdAndChanelRequestUserInfo setEncodeKey(String encodeKey) {
            this.encodeKey = encodeKey;
            return this;
        }
        public String getEncodeKey() {
            return this.encodeKey;
        }

        public ListDeviceByUserIdAndChanelRequestUserInfo setEncodeType(String encodeType) {
            this.encodeType = encodeType;
            return this;
        }
        public String getEncodeType() {
            return this.encodeType;
        }

        public ListDeviceByUserIdAndChanelRequestUserInfo setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListDeviceByUserIdAndChanelRequestUserInfo setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public ListDeviceByUserIdAndChanelRequestUserInfo setOrganizationId(String organizationId) {
            this.organizationId = organizationId;
            return this;
        }
        public String getOrganizationId() {
            return this.organizationId;
        }

    }

}
