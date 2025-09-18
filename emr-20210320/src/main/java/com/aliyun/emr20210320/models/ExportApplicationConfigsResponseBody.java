// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ExportApplicationConfigsResponseBody extends TeaModel {
    @NameInMap("ApplicationConfigs")
    public java.util.List<ApplicationConfigs> applicationConfigs;

    /**
     * <p>请求ID。</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportApplicationConfigsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportApplicationConfigsResponseBody self = new ExportApplicationConfigsResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportApplicationConfigsResponseBody setApplicationConfigs(java.util.List<ApplicationConfigs> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<ApplicationConfigs> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public ExportApplicationConfigsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ApplicationConfigs extends TeaModel {
        /**
         * <p>应用名称。</p>
         * 
         * <strong>example:</strong>
         * <p>YARN</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>文件名称。</p>
         * 
         * <strong>example:</strong>
         * <p>yarn-site.xml</p>
         */
        @NameInMap("ConfigFileName")
        public String configFileName;

        /**
         * <p>文件内容，base64加密。</p>
         * 
         * <strong>example:</strong>
         * <p>export key=value</p>
         */
        @NameInMap("Content")
        public String content;

        public static ApplicationConfigs build(java.util.Map<String, ?> map) throws Exception {
            ApplicationConfigs self = new ApplicationConfigs();
            return TeaModel.build(map, self);
        }

        public ApplicationConfigs setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ApplicationConfigs setConfigFileName(String configFileName) {
            this.configFileName = configFileName;
            return this;
        }
        public String getConfigFileName() {
            return this.configFileName;
        }

        public ApplicationConfigs setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

    }

}
