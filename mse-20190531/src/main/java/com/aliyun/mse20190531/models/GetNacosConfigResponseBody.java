// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosConfigResponseBody extends TeaModel {
    /**
     * <p>The name of the application.</p>
     */
    @NameInMap("Configuration")
    public GetNacosConfigResponseBodyConfiguration configuration;

    /**
     * <p>mse-200-105</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The configuration information.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The format of the configuration.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>duplicatedClusterAliasName</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetNacosConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNacosConfigResponseBody self = new GetNacosConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNacosConfigResponseBody setConfiguration(GetNacosConfigResponseBodyConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public GetNacosConfigResponseBodyConfiguration getConfiguration() {
        return this.configuration;
    }

    public GetNacosConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNacosConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNacosConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNacosConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNacosConfigResponseBodyConfiguration extends TeaModel {
        /**
         * <p>The message digest of the configuration.</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The error code returned if the request failed.</p>
         */
        @NameInMap("BetaIps")
        public String betaIps;

        /**
         * <p>The description of the configuration.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The name of the configuration group.</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The encryption key.</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>1.1.XX.XX, 2.2.XX.XX</p>
         */
        @NameInMap("EncryptedDataKey")
        public String encryptedDataKey;

        /**
         * <p>For testing</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The content of the configuration.</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The ID of the configuration.</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The tags of the configuration.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetNacosConfigResponseBodyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetNacosConfigResponseBodyConfiguration self = new GetNacosConfigResponseBodyConfiguration();
            return TeaModel.build(map, self);
        }

        public GetNacosConfigResponseBodyConfiguration setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetNacosConfigResponseBodyConfiguration setBetaIps(String betaIps) {
            this.betaIps = betaIps;
            return this;
        }
        public String getBetaIps() {
            return this.betaIps;
        }

        public GetNacosConfigResponseBodyConfiguration setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetNacosConfigResponseBodyConfiguration setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetNacosConfigResponseBodyConfiguration setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetNacosConfigResponseBodyConfiguration setEncryptedDataKey(String encryptedDataKey) {
            this.encryptedDataKey = encryptedDataKey;
            return this;
        }
        public String getEncryptedDataKey() {
            return this.encryptedDataKey;
        }

        public GetNacosConfigResponseBodyConfiguration setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetNacosConfigResponseBodyConfiguration setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetNacosConfigResponseBodyConfiguration setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetNacosConfigResponseBodyConfiguration setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
