// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetVisitorLoginDetailsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetVisitorLoginDetailsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>19D09CCC-F298-4124-849A-AFA217819011</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetVisitorLoginDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVisitorLoginDetailsResponseBody self = new GetVisitorLoginDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVisitorLoginDetailsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetVisitorLoginDetailsResponseBody setData(GetVisitorLoginDetailsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetVisitorLoginDetailsResponseBodyData getData() {
        return this.data;
    }

    public GetVisitorLoginDetailsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetVisitorLoginDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetVisitorLoginDetailsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetVisitorLoginDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetVisitorLoginDetailsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>7pjxxx</p>
         */
        @NameInMap("ChatAppId")
        public String chatAppId;

        /**
         * <strong>example:</strong>
         * <p>955e4bd7xxxxxxxxxxxxxd7898ba9fa0d0</p>
         */
        @NameInMap("ChatAppKey")
        public String chatAppKey;

        /**
         * <strong>example:</strong>
         * <p>4c51c9116c36537cb850dc1081d745df</p>
         */
        @NameInMap("ChatDeviceId")
        public String chatDeviceId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;accessToken&quot;:&quot;oauth_cloud_key:+4oJXUAFSWxGD2YuRW4V/oUN0/8qJGNc0I<em><strong><strong><strong><strong>n1E3DOr3Q3lX00ZnTpyqRi8Y6hYoLYA7n2ZkWuv485hVtXeSgnIQkKxXPbMgwoLxWaK//lI5Dn/mb4YuDifigv+ZyFzc+07vxm9ZFu/NjA==&quot;,&quot;accessTokenExpiredTime&quot;:86400000,&quot;refreshToken&quot;:&quot;oauth_cloud_key:/U+8UueDmpeUszhXC+SWow4pNLZp2C</strong></strong></strong></strong></em>**U/377BNXF+Mjo1lFgDk6GtEjNNoJpapX2mHH8GcRke2+yKQs/w4gAN9xSMn543Ciung+93pXV6IpQGbEVlu&quot;}</p>
         */
        @NameInMap("ChatLoginToken")
        public String chatLoginToken;

        /**
         * <strong>example:</strong>
         * <p>wss://wss.im.dingtalk.cn</p>
         */
        @NameInMap("ChatServerUrl")
        public String chatServerUrl;

        /**
         * <strong>example:</strong>
         * <p>dac9c001****a15684ea91a81317</p>
         */
        @NameInMap("ChatUserId")
        public String chatUserId;

        public static GetVisitorLoginDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetVisitorLoginDetailsResponseBodyData self = new GetVisitorLoginDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetVisitorLoginDetailsResponseBodyData setChatAppId(String chatAppId) {
            this.chatAppId = chatAppId;
            return this;
        }
        public String getChatAppId() {
            return this.chatAppId;
        }

        public GetVisitorLoginDetailsResponseBodyData setChatAppKey(String chatAppKey) {
            this.chatAppKey = chatAppKey;
            return this;
        }
        public String getChatAppKey() {
            return this.chatAppKey;
        }

        public GetVisitorLoginDetailsResponseBodyData setChatDeviceId(String chatDeviceId) {
            this.chatDeviceId = chatDeviceId;
            return this;
        }
        public String getChatDeviceId() {
            return this.chatDeviceId;
        }

        public GetVisitorLoginDetailsResponseBodyData setChatLoginToken(String chatLoginToken) {
            this.chatLoginToken = chatLoginToken;
            return this;
        }
        public String getChatLoginToken() {
            return this.chatLoginToken;
        }

        public GetVisitorLoginDetailsResponseBodyData setChatServerUrl(String chatServerUrl) {
            this.chatServerUrl = chatServerUrl;
            return this;
        }
        public String getChatServerUrl() {
            return this.chatServerUrl;
        }

        public GetVisitorLoginDetailsResponseBodyData setChatUserId(String chatUserId) {
            this.chatUserId = chatUserId;
            return this;
        }
        public String getChatUserId() {
            return this.chatUserId;
        }

    }

}
