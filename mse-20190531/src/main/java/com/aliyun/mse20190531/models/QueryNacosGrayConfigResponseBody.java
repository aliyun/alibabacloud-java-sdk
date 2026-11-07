// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class QueryNacosGrayConfigResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public QueryNacosGrayConfigResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>EE5C32A1-BC0E-4B79-817C-103E4EDF****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryNacosGrayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryNacosGrayConfigResponseBody self = new QueryNacosGrayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryNacosGrayConfigResponseBody setData(QueryNacosGrayConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryNacosGrayConfigResponseBodyData getData() {
        return this.data;
    }

    public QueryNacosGrayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryNacosGrayConfigResponseBodyData extends TeaModel {
        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-a</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The configuration content.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The DataId of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>test.yaml</p>
         */
        @NameInMap("DataId")
        public String dataId;

        /**
         * <p>The canary release rule.</p>
         * 
         * <strong>example:</strong>
         * <p>nacos.config.gray.label=test</p>
         */
        @NameInMap("GrayRule")
        public String grayRule;

        /**
         * <p>The name of the canary release version.</p>
         * 
         * <strong>example:</strong>
         * <p>Beta(IP)</p>
         */
        @NameInMap("GrayRuleName")
        public String grayRuleName;

        /**
         * <p>The priority of the canary release version.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("GrayRulePriority")
        public String grayRulePriority;

        /**
         * <p>The canary release type. Valid values: Beta or Tag.</p>
         * 
         * <strong>example:</strong>
         * <p>Tags</p>
         */
        @NameInMap("GrayType")
        public String grayType;

        /**
         * <p>The configuration group.</p>
         * 
         * <strong>example:</strong>
         * <p>dubbo</p>
         */
        @NameInMap("Group")
        public String group;

        /**
         * <p>The last modification time of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>1742277568000</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The MD5 hash of the configuration content.</p>
         * 
         * <strong>example:</strong>
         * <p>87d14faf58a103ac8840b9c5f1c2a0fe</p>
         */
        @NameInMap("Md5")
        public String md5;

        public static QueryNacosGrayConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryNacosGrayConfigResponseBodyData self = new QueryNacosGrayConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryNacosGrayConfigResponseBodyData setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public QueryNacosGrayConfigResponseBodyData setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public QueryNacosGrayConfigResponseBodyData setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public QueryNacosGrayConfigResponseBodyData setGrayRule(String grayRule) {
            this.grayRule = grayRule;
            return this;
        }
        public String getGrayRule() {
            return this.grayRule;
        }

        public QueryNacosGrayConfigResponseBodyData setGrayRuleName(String grayRuleName) {
            this.grayRuleName = grayRuleName;
            return this;
        }
        public String getGrayRuleName() {
            return this.grayRuleName;
        }

        public QueryNacosGrayConfigResponseBodyData setGrayRulePriority(String grayRulePriority) {
            this.grayRulePriority = grayRulePriority;
            return this;
        }
        public String getGrayRulePriority() {
            return this.grayRulePriority;
        }

        public QueryNacosGrayConfigResponseBodyData setGrayType(String grayType) {
            this.grayType = grayType;
            return this;
        }
        public String getGrayType() {
            return this.grayType;
        }

        public QueryNacosGrayConfigResponseBodyData setGroup(String group) {
            this.group = group;
            return this;
        }
        public String getGroup() {
            return this.group;
        }

        public QueryNacosGrayConfigResponseBodyData setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public QueryNacosGrayConfigResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

    }

}
