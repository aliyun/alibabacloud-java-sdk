// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveSnapshotJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com/snapshot/callback">http://www.aliyun.com/snapshot/callback</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SnapshotOutput")
    public SubmitLiveSnapshotJobRequestSnapshotOutput snapshotOutput;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamInput")
    public SubmitLiveSnapshotJobRequestStreamInput streamInput;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static SubmitLiveSnapshotJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveSnapshotJobRequest self = new SubmitLiveSnapshotJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLiveSnapshotJobRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public SubmitLiveSnapshotJobRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public SubmitLiveSnapshotJobRequest setSnapshotOutput(SubmitLiveSnapshotJobRequestSnapshotOutput snapshotOutput) {
        this.snapshotOutput = snapshotOutput;
        return this;
    }
    public SubmitLiveSnapshotJobRequestSnapshotOutput getSnapshotOutput() {
        return this.snapshotOutput;
    }

    public SubmitLiveSnapshotJobRequest setStreamInput(SubmitLiveSnapshotJobRequestStreamInput streamInput) {
        this.streamInput = streamInput;
        return this;
    }
    public SubmitLiveSnapshotJobRequestStreamInput getStreamInput() {
        return this.streamInput;
    }

    public SubmitLiveSnapshotJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class SubmitLiveSnapshotJobRequestSnapshotOutput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testbucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static SubmitLiveSnapshotJobRequestSnapshotOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitLiveSnapshotJobRequestSnapshotOutput self = new SubmitLiveSnapshotJobRequestSnapshotOutput();
            return TeaModel.build(map, self);
        }

        public SubmitLiveSnapshotJobRequestSnapshotOutput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitLiveSnapshotJobRequestSnapshotOutput setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public SubmitLiveSnapshotJobRequestSnapshotOutput setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

    public static class SubmitLiveSnapshotJobRequestStreamInput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://<a href="http://www.aliyun.com/stream">www.aliyun.com/stream</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static SubmitLiveSnapshotJobRequestStreamInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitLiveSnapshotJobRequestStreamInput self = new SubmitLiveSnapshotJobRequestStreamInput();
            return TeaModel.build(map, self);
        }

        public SubmitLiveSnapshotJobRequestStreamInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitLiveSnapshotJobRequestStreamInput setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
