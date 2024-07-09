// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserConfigsResponseBody extends TeaModel {
    /**
     * <p>The configurations of the specified feature.</p>
     */
    @NameInMap("Configs")
    public DescribeUserConfigsResponseBodyConfigs configs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>9BCC7BAA-ACBE-45E5-83F0-98BF7E693E84</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUserConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserConfigsResponseBody self = new DescribeUserConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserConfigsResponseBody setConfigs(DescribeUserConfigsResponseBodyConfigs configs) {
        this.configs = configs;
        return this;
    }
    public DescribeUserConfigsResponseBodyConfigs getConfigs() {
        return this.configs;
    }

    public DescribeUserConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUserConfigsResponseBodyConfigsOssLogConfig extends TeaModel {
        /**
         * <p>The name of the bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>Buckettest</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>Indicates whether the OSS bucket is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        public static DescribeUserConfigsResponseBodyConfigsOssLogConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserConfigsResponseBodyConfigsOssLogConfig self = new DescribeUserConfigsResponseBodyConfigsOssLogConfig();
            return TeaModel.build(map, self);
        }

        public DescribeUserConfigsResponseBodyConfigsOssLogConfig setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeUserConfigsResponseBodyConfigsOssLogConfig setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeUserConfigsResponseBodyConfigsOssLogConfig setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

    }

    public static class DescribeUserConfigsResponseBodyConfigsWafConfig extends TeaModel {
        /**
         * <p>Indicates whether WAF is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("Enable")
        public String enable;

        public static DescribeUserConfigsResponseBodyConfigsWafConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserConfigsResponseBodyConfigsWafConfig self = new DescribeUserConfigsResponseBodyConfigsWafConfig();
            return TeaModel.build(map, self);
        }

        public DescribeUserConfigsResponseBodyConfigsWafConfig setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

    }

    public static class DescribeUserConfigsResponseBodyConfigs extends TeaModel {
        /**
         * <p>The configurations of Object Storage Service (OSS).</p>
         */
        @NameInMap("OssLogConfig")
        public DescribeUserConfigsResponseBodyConfigsOssLogConfig ossLogConfig;

        /**
         * <p>The configurations of Web Application Firewall (WAF).</p>
         */
        @NameInMap("WafConfig")
        public DescribeUserConfigsResponseBodyConfigsWafConfig wafConfig;

        public static DescribeUserConfigsResponseBodyConfigs build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserConfigsResponseBodyConfigs self = new DescribeUserConfigsResponseBodyConfigs();
            return TeaModel.build(map, self);
        }

        public DescribeUserConfigsResponseBodyConfigs setOssLogConfig(DescribeUserConfigsResponseBodyConfigsOssLogConfig ossLogConfig) {
            this.ossLogConfig = ossLogConfig;
            return this;
        }
        public DescribeUserConfigsResponseBodyConfigsOssLogConfig getOssLogConfig() {
            return this.ossLogConfig;
        }

        public DescribeUserConfigsResponseBodyConfigs setWafConfig(DescribeUserConfigsResponseBodyConfigsWafConfig wafConfig) {
            this.wafConfig = wafConfig;
            return this;
        }
        public DescribeUserConfigsResponseBodyConfigsWafConfig getWafConfig() {
            return this.wafConfig;
        }

    }

}
