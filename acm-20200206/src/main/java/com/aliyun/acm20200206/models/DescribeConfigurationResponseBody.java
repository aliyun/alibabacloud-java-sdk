// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DescribeConfigurationResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Configuration")
    public DescribeConfigurationResponseBodyConfiguration configuration;

    @NameInMap("Code")
    public String code;

    public static DescribeConfigurationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeConfigurationResponseBody self = new DescribeConfigurationResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeConfigurationResponseBody setConfiguration(DescribeConfigurationResponseBodyConfiguration configuration) {
        this.configuration = configuration;
        return this;
    }
    public DescribeConfigurationResponseBodyConfiguration getConfiguration() {
        return this.configuration;
    }

    public DescribeConfigurationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class DescribeConfigurationResponseBodyConfiguration extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("Content")
        public String content;

        @NameInMap("Group")
        public String group;

        @NameInMap("Desc")
        public String desc;

        public static DescribeConfigurationResponseBodyConfiguration build(java.util.Map<String, ?> map) throws Exception {
            DescribeConfigurationResponseBodyConfiguration self = new DescribeConfigurationResponseBodyConfiguration();
            return TeaModel.build(map, self);
        }

        public DescribeConfigurationResponseBodyConfiguration setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeConfigurationResponseBodyConfiguration setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeConfigurationResponseBodyConfiguration setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeConfigurationResponseBodyConfiguration setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeConfigurationResponseBodyConfiguration setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public DescribeConfigurationResponseBodyConfiguration setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public DescribeConfigurationResponseBodyConfiguration setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public DescribeConfigurationResponseBodyConfiguration setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

    }

}
