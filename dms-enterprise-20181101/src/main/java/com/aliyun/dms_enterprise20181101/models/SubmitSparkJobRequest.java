// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SubmitSparkJobRequest extends TeaModel {
    @NameInMap("AppCode")
    public String appCode;

    @NameInMap("Arguments")
    public java.util.List<String> arguments;

    @NameInMap("Configuration")
    public java.util.Map<String, ?> configuration;

    @NameInMap("Files")
    public java.util.List<String> files;

    @NameInMap("MainClass")
    public String mainClass;

    @NameInMap("MainFile")
    public String mainFile;

    @NameInMap("Name")
    public String name;

    @NameInMap("OssInfo")
    public SubmitSparkJobRequestOssInfo ossInfo;

    @NameInMap("Tid")
    public Long tid;

    public static SubmitSparkJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitSparkJobRequest self = new SubmitSparkJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitSparkJobRequest setAppCode(String appCode) {
        this.appCode = appCode;
        return this;
    }
    public String getAppCode() {
        return this.appCode;
    }

    public SubmitSparkJobRequest setArguments(java.util.List<String> arguments) {
        this.arguments = arguments;
        return this;
    }
    public java.util.List<String> getArguments() {
        return this.arguments;
    }

    public SubmitSparkJobRequest setConfiguration(java.util.Map<String, ?> configuration) {
        this.configuration = configuration;
        return this;
    }
    public java.util.Map<String, ?> getConfiguration() {
        return this.configuration;
    }

    public SubmitSparkJobRequest setFiles(java.util.List<String> files) {
        this.files = files;
        return this;
    }
    public java.util.List<String> getFiles() {
        return this.files;
    }

    public SubmitSparkJobRequest setMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }
    public String getMainClass() {
        return this.mainClass;
    }

    public SubmitSparkJobRequest setMainFile(String mainFile) {
        this.mainFile = mainFile;
        return this;
    }
    public String getMainFile() {
        return this.mainFile;
    }

    public SubmitSparkJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitSparkJobRequest setOssInfo(SubmitSparkJobRequestOssInfo ossInfo) {
        this.ossInfo = ossInfo;
        return this;
    }
    public SubmitSparkJobRequestOssInfo getOssInfo() {
        return this.ossInfo;
    }

    public SubmitSparkJobRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class SubmitSparkJobRequestOssInfo extends TeaModel {
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("AccessKeySecret")
        public String accessKeySecret;

        @NameInMap("Endpoint")
        public String endpoint;

        public static SubmitSparkJobRequestOssInfo build(java.util.Map<String, ?> map) throws Exception {
            SubmitSparkJobRequestOssInfo self = new SubmitSparkJobRequestOssInfo();
            return TeaModel.build(map, self);
        }

        public SubmitSparkJobRequestOssInfo setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public SubmitSparkJobRequestOssInfo setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }
        public String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        public SubmitSparkJobRequestOssInfo setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

    }

}
