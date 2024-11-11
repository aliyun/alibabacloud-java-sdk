// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListDeviceByUserIdAndChanelRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ChannelInfo")
    public ListDeviceByUserIdAndChanelRequestChannelInfo channelInfo;

    /**
     * <p>This parameter is required.</p>
     */
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
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WeChat、ThirdApp</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
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
         * <p>123</p>
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
         * <p>1***2</p>
         */
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
