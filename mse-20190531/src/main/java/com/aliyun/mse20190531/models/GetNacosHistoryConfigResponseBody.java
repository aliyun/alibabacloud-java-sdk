// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosHistoryConfigResponseBody extends TeaModel {
    // The configuration information.
    @NameInMap("Configuration")
    public GetNacosHistoryConfigResponseBodyConfiguration configuration;

    // The error code returned if the request failed.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The message returned.
    @NameInMap("Message")
    public String message;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   `true`: The request was successful.
    // *   `false`: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static GetNacosHistoryConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetNacosHistoryConfigResponseBody self = new GetNacosHistoryConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetNacosHistoryConfigResponseBody setConfiguration(GetNacosHistoryConfigResponseBodyConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public GetNacosHistoryConfigResponseBodyConfiguration getConfiguration() {
        return this.configuration;
    }

    public GetNacosHistoryConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetNacosHistoryConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetNacosHistoryConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNacosHistoryConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetNacosHistoryConfigResponseBodyConfiguration extends TeaModel {
        // The name of the application.
        @NameInMap("AppName")
        public String appName;

        // The content of the configuration.
        @NameInMap("Content")
        public String content;

        // The ID of the configuration.
        @NameInMap("DataId")
        public String dataId;

        // The encryption key.
        @NameInMap("EncryptedDataKey")
        public String encryptedDataKey;

        // The name of the configuration group.
        @NameInMap("Group")
        public String group;

        // The MD5 value of the configuration.
        @NameInMap("Md5")
        public String md5;

        // The configuration type.
        @NameInMap("OpType")
        public String opType;

        public static GetNacosHistoryConfigResponseBodyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            GetNacosHistoryConfigResponseBodyConfiguration self = new GetNacosHistoryConfigResponseBodyConfiguration();
            return TeaModel.build(map, self);
        }

        public GetNacosHistoryConfigResponseBodyConfiguration setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetNacosHistoryConfigResponseBodyConfiguration setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetNacosHistoryConfigResponseBodyConfiguration setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public GetNacosHistoryConfigResponseBodyConfiguration setEncryptedDataKey(String encryptedDataKey) {
            this.encryptedDataKey = encryptedDataKey;
            return this;
        }
        public String getEncryptedDataKey() {
            return this.encryptedDataKey;
        }

        public GetNacosHistoryConfigResponseBodyConfiguration setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public GetNacosHistoryConfigResponseBodyConfiguration setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public GetNacosHistoryConfigResponseBodyConfiguration setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

    }

}
