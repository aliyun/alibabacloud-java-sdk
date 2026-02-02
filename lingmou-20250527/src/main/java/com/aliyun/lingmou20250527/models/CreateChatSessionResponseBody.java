// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lingmou20250527.models;

import com.aliyun.tea.*;

public class CreateChatSessionResponseBody extends TeaModel {
    /**
     * <p>响应码。</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>响应数据。</p>
     */
    @NameInMap("data")
    public CreateChatSessionResponseBodyData data;

    /**
     * <p>http响应码</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Long httpStatusCode;

    /**
     * <p>状态码描述。</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求ID</p>
     * 
     * <strong>example:</strong>
     * <p>7239F9E5-A4DB-55BA-B701-0CE47DBDB0A8</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>请求是否成功</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static CreateChatSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateChatSessionResponseBody self = new CreateChatSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateChatSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateChatSessionResponseBody setData(CreateChatSessionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateChatSessionResponseBodyData getData() {
        return this.data;
    }

    public CreateChatSessionResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateChatSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateChatSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateChatSessionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateChatSessionResponseBodyDataAvatarAssets extends TeaModel {
        /**
         * <p>资产MD5值。</p>
         * 
         * <strong>example:</strong>
         * <p>5B83BE2114489274BB88BADE7EBC****</p>
         */
        @NameInMap("md5")
        public String md5;

        /**
         * <p>支持的SDK最低版本。</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.1</p>
         */
        @NameInMap("minRequiredVersion")
        public String minRequiredVersion;

        /**
         * <p>SDK使用的密钥。</p>
         * 
         * <strong>example:</strong>
         * <p>J562PNqJBZDhzOQpLBgIcIW8+rHQoM7P6IONGMP7P5vGxrWLxT7VtRenFnMY+wg/zpA2qwpFBmJYO2rVexnlCQ2WE4kvYOH/OKmlTzpQddY34U5jS9KaS3b3ulpq4xnKDjWJ+sLZSRMhuPDdlq8ZPfcfEPhJhF3zPO8Hu4QOSu+D/pAIDJUoixOTo9Q14DXFKGFuuVRQOQ7f/VxJcoSLIWIusV917pLtph/IYBaLd27gzbrTZBEVD8qrucR+WOQPY1g67PGAdafkhJWrs/+coM7+5dc3HEUC+KgI9JN4X4Akelc94aJcy78RZ6tRdr73hBzN83/cMZdzt2hx******</p>
         */
        @NameInMap("secret")
        public String secret;

        /**
         * <p>资产类型。</p>
         * 
         * <strong>example:</strong>
         * <p>AVATAR_3D_TRADITIONAL</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>资产下载链接。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://daily-avatar-property.oss-cn-beijing.aliyuncs.com/avatar-share-property/AVATAR_3D_TRADITIONAL/Mt.CNMU6BO4RBYU2/secret_assets_web.zip?Expires=1752637519&OSSAccessKeyId=STS.NZULzwLRx8thHDHQxem94****&Signature=Oni3%2Be8dY8Xrv3iRGDyzn7u****%3D&security-token=CAISzAJ1q6Ft5B2yfSjIr5ngB8DDoY1Zj7aDSmL5tXgwYbYYi5LPrDz2IHhMfnloB%2BEcsfU3nmxT6vkZlrp6SJtIXleCZtF94oxN9h2gb4fb4093DEHt08%2FLI3OaLjKm9u2wCryLYbGwU%2FOpbE%2B%2B5U0X6LDmdDKkckW4OJmS8%2FBOZcgWWQ%2FKBlgvRq0hRG1YpdQdKGHaONu0LxfumRCwNkdzvRdmgm4NgsbWgO%2Fks0KA1QSml7ZP%2B9WuesH0M%2FMBZskvD42Hu8VtbbfE3SJq7BxHybx7lqQs%2B02c5onHUwEPsk%2FZYrKOroYzc1RjAbM%2FErRY6fP8nOE9ovbUm5RXHpT05CrMOs62ZPdDoKOscIvBXr6yZaP7JmcGC6iQLG%2FznQkSc081IsK2C7Xq0pe54O3lg9Ab41ZGNYEjq%2BpCIUP%2Fs97dqXEelD2e%2Bh8UezDnKxqAAXuAiYRY7Ox3cf6h2MlmRsK5yywg45O%2FizjiK2k8Z8p6WeOA54W3pfbg6ElV4d8TMWCVZ7tuAbSgRCKBg3q5YYrdS2ENqDu6njIea1pxG4LT4ydGxDBkYpjwcUxutDd0aAhFjsypSK%2Feuk0%2FDCfKMrWzCmkr1AtPpcNfJ8LPj58qIA">https://daily-avatar-property.oss-cn-beijing.aliyuncs.com/avatar-share-property/AVATAR_3D_TRADITIONAL/Mt.CNMU6BO4RBYU2/secret_assets_web.zip?Expires=1752637519&amp;OSSAccessKeyId=STS.NZULzwLRx8thHDHQxem94****&amp;Signature=Oni3%2Be8dY8Xrv3iRGDyzn7u****%3D&amp;security-token=CAISzAJ1q6Ft5B2yfSjIr5ngB8DDoY1Zj7aDSmL5tXgwYbYYi5LPrDz2IHhMfnloB%2BEcsfU3nmxT6vkZlrp6SJtIXleCZtF94oxN9h2gb4fb4093DEHt08%2FLI3OaLjKm9u2wCryLYbGwU%2FOpbE%2B%2B5U0X6LDmdDKkckW4OJmS8%2FBOZcgWWQ%2FKBlgvRq0hRG1YpdQdKGHaONu0LxfumRCwNkdzvRdmgm4NgsbWgO%2Fks0KA1QSml7ZP%2B9WuesH0M%2FMBZskvD42Hu8VtbbfE3SJq7BxHybx7lqQs%2B02c5onHUwEPsk%2FZYrKOroYzc1RjAbM%2FErRY6fP8nOE9ovbUm5RXHpT05CrMOs62ZPdDoKOscIvBXr6yZaP7JmcGC6iQLG%2FznQkSc081IsK2C7Xq0pe54O3lg9Ab41ZGNYEjq%2BpCIUP%2Fs97dqXEelD2e%2Bh8UezDnKxqAAXuAiYRY7Ox3cf6h2MlmRsK5yywg45O%2FizjiK2k8Z8p6WeOA54W3pfbg6ElV4d8TMWCVZ7tuAbSgRCKBg3q5YYrdS2ENqDu6njIea1pxG4LT4ydGxDBkYpjwcUxutDd0aAhFjsypSK%2Feuk0%2FDCfKMrWzCmkr1AtPpcNfJ8LPj58qIA</a></p>
         */
        @NameInMap("url")
        public String url;

        public static CreateChatSessionResponseBodyDataAvatarAssets build(java.util.Map<String, ?> map) throws Exception {
            CreateChatSessionResponseBodyDataAvatarAssets self = new CreateChatSessionResponseBodyDataAvatarAssets();
            return TeaModel.build(map, self);
        }

        public CreateChatSessionResponseBodyDataAvatarAssets setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public CreateChatSessionResponseBodyDataAvatarAssets setMinRequiredVersion(String minRequiredVersion) {
            this.minRequiredVersion = minRequiredVersion;
            return this;
        }
        public String getMinRequiredVersion() {
            return this.minRequiredVersion;
        }

        public CreateChatSessionResponseBodyDataAvatarAssets setSecret(String secret) {
            this.secret = secret;
            return this;
        }
        public String getSecret() {
            return this.secret;
        }

        public CreateChatSessionResponseBodyDataAvatarAssets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateChatSessionResponseBodyDataAvatarAssets setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateChatSessionResponseBodyDataRtcParams extends TeaModel {
        /**
         * <p>应用id。</p>
         * 
         * <strong>example:</strong>
         * <p>895cbf3b</p>
         */
        @NameInMap("appId")
        public String appId;

        /**
         * <p>数字人侧用户ID。</p>
         * 
         * <strong>example:</strong>
         * <p>E7enIvjUos</p>
         */
        @NameInMap("avatarUserId")
        public String avatarUserId;

        /**
         * <p>RTC通道ID。</p>
         * 
         * <strong>example:</strong>
         * <p>pPltqR3FovNCK3hNQc8eHUL3Zt****</p>
         */
        @NameInMap("channel")
        public String channel;

        /**
         * <p>客户端侧用户ID。</p>
         * 
         * <strong>example:</strong>
         * <p>aw0tqpFlP4</p>
         */
        @NameInMap("clientUserId")
        public String clientUserId;

        /**
         * <p>RTC服务地址。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://gw.rtn.aliyuncs.com">https://gw.rtn.aliyuncs.com</a></p>
         */
        @NameInMap("gslb")
        public String gslb;

        /**
         * <p>随机串。</p>
         * 
         * <strong>example:</strong>
         * <p>f8b0ef02c5da778f4488e2470c</p>
         */
        @NameInMap("nonce")
        public String nonce;

        /**
         * <p>服务端侧用户ID。</p>
         * 
         * <strong>example:</strong>
         * <p>YzZtSQP8QX</p>
         */
        @NameInMap("serverUserId")
        public String serverUserId;

        /**
         * <p>过期时间戳。</p>
         * 
         * <strong>example:</strong>
         * <p>1560588594</p>
         */
        @NameInMap("timestamp")
        public Long timestamp;

        /**
         * <p>访问凭证token。</p>
         * 
         * <strong>example:</strong>
         * <p>PtGgv2dM9F8tEuAtda50c0VNNFjn0WUbyTDPa1im4cUBE****</p>
         */
        @NameInMap("token")
        public String token;

        public static CreateChatSessionResponseBodyDataRtcParams build(java.util.Map<String, ?> map) throws Exception {
            CreateChatSessionResponseBodyDataRtcParams self = new CreateChatSessionResponseBodyDataRtcParams();
            return TeaModel.build(map, self);
        }

        public CreateChatSessionResponseBodyDataRtcParams setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public CreateChatSessionResponseBodyDataRtcParams setAvatarUserId(String avatarUserId) {
            this.avatarUserId = avatarUserId;
            return this;
        }
        public String getAvatarUserId() {
            return this.avatarUserId;
        }

        public CreateChatSessionResponseBodyDataRtcParams setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public CreateChatSessionResponseBodyDataRtcParams setClientUserId(String clientUserId) {
            this.clientUserId = clientUserId;
            return this;
        }
        public String getClientUserId() {
            return this.clientUserId;
        }

        public CreateChatSessionResponseBodyDataRtcParams setGslb(String gslb) {
            this.gslb = gslb;
            return this;
        }
        public String getGslb() {
            return this.gslb;
        }

        public CreateChatSessionResponseBodyDataRtcParams setNonce(String nonce) {
            this.nonce = nonce;
            return this;
        }
        public String getNonce() {
            return this.nonce;
        }

        public CreateChatSessionResponseBodyDataRtcParams setServerUserId(String serverUserId) {
            this.serverUserId = serverUserId;
            return this;
        }
        public String getServerUserId() {
            return this.serverUserId;
        }

        public CreateChatSessionResponseBodyDataRtcParams setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public CreateChatSessionResponseBodyDataRtcParams setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

    }

    public static class CreateChatSessionResponseBodyData extends TeaModel {
        /**
         * <p>端渲染数字人资产信息。</p>
         */
        @NameInMap("avatarAssets")
        public CreateChatSessionResponseBodyDataAvatarAssets avatarAssets;

        /**
         * <p>RTC入参。</p>
         */
        @NameInMap("rtcParams")
        public CreateChatSessionResponseBodyDataRtcParams rtcParams;

        /**
         * <p>会话ID</p>
         * 
         * <strong>example:</strong>
         * <p>9827f4bd-5008-4d34-98fb-62598f3ad3b5</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        public static CreateChatSessionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateChatSessionResponseBodyData self = new CreateChatSessionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateChatSessionResponseBodyData setAvatarAssets(CreateChatSessionResponseBodyDataAvatarAssets avatarAssets) {
            this.avatarAssets = avatarAssets;
            return this;
        }
        public CreateChatSessionResponseBodyDataAvatarAssets getAvatarAssets() {
            return this.avatarAssets;
        }

        public CreateChatSessionResponseBodyData setRtcParams(CreateChatSessionResponseBodyDataRtcParams rtcParams) {
            this.rtcParams = rtcParams;
            return this;
        }
        public CreateChatSessionResponseBodyDataRtcParams getRtcParams() {
            return this.rtcParams;
        }

        public CreateChatSessionResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

    }

}
