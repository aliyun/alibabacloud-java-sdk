// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeConfigurationResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Configuration")
    public DescribeConfigurationResponseBodyConfiguration configuration;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>611CC94A-7711-4873-8848-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationResponseBody self = new DescribeConfigurationResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeConfigurationResponseBody setConfiguration(DescribeConfigurationResponseBodyConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public DescribeConfigurationResponseBodyConfiguration getConfiguration() {
        return this.configuration;
    }

    public DescribeConfigurationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeConfigurationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeConfigurationResponseBodyConfiguration extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>Hello World</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>com.aliyun.acm.example</p>
         */
        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Desc")
        public String desc;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>DEFAULT_GROUP</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <strong>example:</strong>
         * <p>18d2e20****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <strong>example:</strong>
         * <p>tag1,tag2</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeConfigurationResponseBodyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationResponseBodyConfiguration self = new DescribeConfigurationResponseBodyConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationResponseBodyConfiguration setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeConfigurationResponseBodyConfiguration setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeConfigurationResponseBodyConfiguration setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DescribeConfigurationResponseBodyConfiguration setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeConfigurationResponseBodyConfiguration setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeConfigurationResponseBodyConfiguration setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeConfigurationResponseBodyConfiguration setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public DescribeConfigurationResponseBodyConfiguration setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeConfigurationResponseBodyConfiguration setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeConfigurationResponseBodyConfiguration setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
