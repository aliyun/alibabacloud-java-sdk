// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosConfigResponseBody extends TeaModel {
    @NameInMap("Configuration")
    public GetNacosConfigResponseBodyConfiguration configuration;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AppName")
        public String appName;

        @NameInMap("BetaIps")
        public String betaIps;

        @NameInMap("Content")
        public String content;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("EncryptedDataKey")
        public String encryptedDataKey;

        @NameInMap("Group")
        public String group;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("Tags")
        public String tags;

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
