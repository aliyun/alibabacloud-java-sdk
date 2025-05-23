// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetNacosConfigResponseBody extends TeaModel {
    /**
     * <p>Configuration information.</p>
     */
    @NameInMap("Configuration")
    public GetNacosConfigResponseBodyConfiguration configuration;

    /**
     * <p>Error code.</p>
     * 
     * <strong>example:</strong>
     * <p>mse-100-000</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>Message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B4EAB48C-BB4B-5B8D-B33B-35D69606C5AD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the request, with values as follows:</p>
     * <ul>
     * <li><code>true</code>: The request was successful.</li>
     * <li><code>false</code>: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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

    public static class GetNacosConfigResponseBodyConfigurationGrayVersions extends TeaModel {
        /**
         * <p>Gray version name</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority of the current gray rule.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        /**
         * <p>Rules of the current gray version</p>
         * 
         * <strong>example:</strong>
         * <p>a=b</p>
         */
        @NameInMap("Rule")
        public String rule;

        /**
         * <p>Gray type</p>
         * 
         * <strong>example:</strong>
         * <p>Beta</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetNacosConfigResponseBodyConfigurationGrayVersions build(java.util.Map<String, ?> map) throws Exception {
            GetNacosConfigResponseBodyConfigurationGrayVersions self = new GetNacosConfigResponseBodyConfigurationGrayVersions();
            return TeaModel.build(map, self);
        }

        public GetNacosConfigResponseBodyConfigurationGrayVersions setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetNacosConfigResponseBodyConfigurationGrayVersions setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public GetNacosConfigResponseBodyConfigurationGrayVersions setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public GetNacosConfigResponseBodyConfigurationGrayVersions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetNacosConfigResponseBodyConfiguration extends TeaModel {
        /**
         * <p>Application name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>List of IPs for Beta release.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.XX.XX，2.2.XX.XX</p>
         */
        @NameInMap("BetaIps")
        public String betaIps;

        /**
         * <p>Configuration content.</p>
         * 
         * <strong>example:</strong>
         * <p>log.level=error</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>Configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>log.yaml</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>Configuration description.</p>
         * 
         * <strong>example:</strong>
         * <p>For testing</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>Encrypted key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("EncryptedDataKey")
        public String encryptedDataKey;

        /**
         * <p>Current gray version information</p>
         */
        @NameInMap("GrayVersions")
        public java.util.List<GetNacosConfigResponseBodyConfigurationGrayVersions> grayVersions;

        /**
         * <p>Configuration group name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>Message digest of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>123rfsdf3</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>Tags of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>context</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>Format of the configuration content.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
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

        public GetNacosConfigResponseBodyConfiguration setGrayVersions(java.util.List<GetNacosConfigResponseBodyConfigurationGrayVersions> grayVersions) {
            this.grayVersions = grayVersions;
            return this;
        }
        public java.util.List<GetNacosConfigResponseBodyConfigurationGrayVersions> getGrayVersions() {
            return this.grayVersions;
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
