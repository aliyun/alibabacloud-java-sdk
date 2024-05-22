// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitLiveRecordJobRequest extends TeaModel {
    /**
     * <p>代表资源名称的资源属性字段</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>回调地址</p>
     */
    @NameInMap("NotifyUrl")
    public String notifyUrl;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RecordOutput")
    public SubmitLiveRecordJobRequestRecordOutput recordOutput;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("StreamInput")
    public SubmitLiveRecordJobRequestStreamInput streamInput;

    /**
     * <p>录制模板ID</p>
     * <br>
     * <p>This parameter is required.</p>
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
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

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
