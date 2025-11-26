// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkOSSParameters extends TeaModel {
    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("CompressionType")
    public String compressionType;

    @NameInMap("ContentTransform")
    public SinkOSSParametersContentTransform contentTransform;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("PathFormat")
    public String pathFormat;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleArn")
    public String roleArn;

    @NameInMap("RotateIntervalMs")
    public String rotateIntervalMs;

    @NameInMap("RotateSizeBytes")
    public String rotateSizeBytes;

    @NameInMap("SSLEnabled")
    public Boolean SSLEnabled;

    @NameInMap("TaskConcurrency")
    public String taskConcurrency;

    @NameInMap("TimeZone")
    public String timeZone;

    public static SinkOSSParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkOSSParameters self = new SinkOSSParameters();
        return TeaModel.build(map, self);
    }

    public SinkOSSParameters setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public SinkOSSParameters setCompressionType(String compressionType) {
        this.compressionType = compressionType;
        return this;
    }
    public String getCompressionType() {
        return this.compressionType;
    }

    public SinkOSSParameters setContentTransform(SinkOSSParametersContentTransform contentTransform) {
        this.contentTransform = contentTransform;
        return this;
    }
    public SinkOSSParametersContentTransform getContentTransform() {
        return this.contentTransform;
    }

    public SinkOSSParameters setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SinkOSSParameters setPathFormat(String pathFormat) {
        this.pathFormat = pathFormat;
        return this;
    }
    public String getPathFormat() {
        return this.pathFormat;
    }

    public SinkOSSParameters setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SinkOSSParameters setRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }
    public String getRoleArn() {
        return this.roleArn;
    }

    public SinkOSSParameters setRotateIntervalMs(String rotateIntervalMs) {
        this.rotateIntervalMs = rotateIntervalMs;
        return this;
    }
    public String getRotateIntervalMs() {
        return this.rotateIntervalMs;
    }

    public SinkOSSParameters setRotateSizeBytes(String rotateSizeBytes) {
        this.rotateSizeBytes = rotateSizeBytes;
        return this;
    }
    public String getRotateSizeBytes() {
        return this.rotateSizeBytes;
    }

    public SinkOSSParameters setSSLEnabled(Boolean SSLEnabled) {
        this.SSLEnabled = SSLEnabled;
        return this;
    }
    public Boolean getSSLEnabled() {
        return this.SSLEnabled;
    }

    public SinkOSSParameters setTaskConcurrency(String taskConcurrency) {
        this.taskConcurrency = taskConcurrency;
        return this;
    }
    public String getTaskConcurrency() {
        return this.taskConcurrency;
    }

    public SinkOSSParameters setTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }
    public String getTimeZone() {
        return this.timeZone;
    }

    public static class SinkOSSParametersContentTransform extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static SinkOSSParametersContentTransform build(java.util.Map<String, ?> map) throws Exception {
            SinkOSSParametersContentTransform self = new SinkOSSParametersContentTransform();
            return TeaModel.build(map, self);
        }

        public SinkOSSParametersContentTransform setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkOSSParametersContentTransform setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkOSSParametersContentTransform setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
