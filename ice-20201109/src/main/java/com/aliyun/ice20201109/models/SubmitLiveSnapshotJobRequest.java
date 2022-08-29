// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveSnapshotJobRequest extends TeaModel {
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("SnapshotOutput")
    public SubmitLiveSnapshotJobRequestSnapshotOutput snapshotOutput;

    @NameInMap("StreamInput")
    public SubmitLiveSnapshotJobRequestStreamInput streamInput;

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
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

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
        @NameInMap("Type")
        public String type;

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
