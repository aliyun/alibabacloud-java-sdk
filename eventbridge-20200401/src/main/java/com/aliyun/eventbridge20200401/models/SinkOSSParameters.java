// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkOSSParameters extends TeaModel {
    /**
     * <p>The name of the OSS bucket used to store event data.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("BucketName")
    public String bucketName;

    /**
     * <p>The compression type of the delivered files.</p>
     * 
     * <strong>example:</strong>
     * <p>gzip</p>
     */
    @NameInMap("CompressionType")
    public String compressionType;

    /**
     * <p>The event content transformation configuration before delivery to OSS.</p>
     */
    @NameInMap("ContentTransform")
    public SinkOSSParametersContentTransform contentTransform;

    /**
     * <p>The endpoint of the destination OSS service.</p>
     * 
     * <strong>example:</strong>
     * <p>oss-cn-hangzhou-internal.aliyuncs.com</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The storage path for event data in the OSS bucket.</p>
     * 
     * <strong>example:</strong>
     * <p>/EB-test/</p>
     */
    @NameInMap("PathFormat")
    public String pathFormat;

    /**
     * <p>The region ID of the destination OSS service.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ARN of the RAM role used to deliver data to OSS.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890123456:role/example-eventbridge-role</p>
     */
    @NameInMap("RoleArn")
    public String roleArn;

    /**
     * <p>The time window for batch aggregation of event data.</p>
     * 
     * <strong>example:</strong>
     * <p>60000</p>
     */
    @NameInMap("RotateIntervalMs")
    public String rotateIntervalMs;

    /**
     * <p>The file size threshold for batch aggregation.</p>
     * 
     * <strong>example:</strong>
     * <p>1048576</p>
     */
    @NameInMap("RotateSizeBytes")
    public String rotateSizeBytes;

    /**
     * <p>Specifies whether SSL is enabled.</p>
     */
    @NameInMap("SSLEnabled")
    public Boolean SSLEnabled;

    /**
     * <p>The number of concurrent delivery tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TaskConcurrency")
    public String taskConcurrency;

    /**
     * <p>The time zone used for time variables in the storage path.</p>
     * 
     * <strong>example:</strong>
     * <p>UTC+8:00</p>
     */
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
        /**
         * <p>The transformation method for the delivered content.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value expression used to generate the delivered content.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.message</p>
         */
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
