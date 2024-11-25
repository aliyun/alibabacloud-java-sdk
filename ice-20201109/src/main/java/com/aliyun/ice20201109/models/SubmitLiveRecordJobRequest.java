// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveRecordJobRequest extends TeaModel {
    /**
     * <p>The name of the recording job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>live stream record 1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/imsnotify">https://example.com/imsnotify</a></p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>The storage address of the recording.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordOutput")
    public SubmitLiveRecordJobRequestRecordOutput recordOutput;

    /**
     * <p>The URL of the live stream.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamInput")
    public SubmitLiveRecordJobRequestStreamInput streamInput;

    /**
     * <p>The ID of the recording template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    public static SubmitLiveRecordJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitLiveRecordJobRequest self = new SubmitLiveRecordJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitLiveRecordJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public SubmitLiveRecordJobRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

    public SubmitLiveRecordJobRequest setRecordOutput(SubmitLiveRecordJobRequestRecordOutput recordOutput) {
        this.recordOutput = recordOutput;
        return this;
    }
    public SubmitLiveRecordJobRequestRecordOutput getRecordOutput() {
        return this.recordOutput;
    }

    public SubmitLiveRecordJobRequest setStreamInput(SubmitLiveRecordJobRequestStreamInput streamInput) {
        this.streamInput = streamInput;
        return this;
    }
    public SubmitLiveRecordJobRequestStreamInput getStreamInput() {
        return this.streamInput;
    }

    public SubmitLiveRecordJobRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public static class SubmitLiveRecordJobRequestRecordOutput extends TeaModel {
        /**
         * <p>The bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>imsbucket1</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The endpoint of the storage service.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou.aliyuncs.com</p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The type of the storage address.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitLiveRecordJobRequestRecordOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitLiveRecordJobRequestRecordOutput self = new SubmitLiveRecordJobRequestRecordOutput();
            return TeaModel.build(map, self);
        }

        public SubmitLiveRecordJobRequestRecordOutput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitLiveRecordJobRequestRecordOutput setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public SubmitLiveRecordJobRequestRecordOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitLiveRecordJobRequestStreamInput extends TeaModel {
        /**
         * <p>The type of the live stream URL. The value can only be rtmp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The URL of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>rtmp://example.com/live/stream1</p>
         */
        @NameInMap("Url")
        public String url;

        public static SubmitLiveRecordJobRequestStreamInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitLiveRecordJobRequestStreamInput self = new SubmitLiveRecordJobRequestStreamInput();
            return TeaModel.build(map, self);
        }

        public SubmitLiveRecordJobRequestStreamInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitLiveRecordJobRequestStreamInput setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
