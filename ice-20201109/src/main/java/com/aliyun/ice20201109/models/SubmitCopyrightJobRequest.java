// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example.mp4&quot;}</p>
     */
    @NameInMap("Input")
    public SubmitCopyrightJobRequestInput input;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example_result.mp4&quot;}</p>
     */
    @NameInMap("Output")
    public SubmitCopyrightJobRequestOutput output;

    /**
     * <strong>example:</strong>
     * <p>{&quot;algoType&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalTime")
    public Long totalTime;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitCopyrightJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightJobRequest self = new SubmitCopyrightJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitCopyrightJobRequest setInput(SubmitCopyrightJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitCopyrightJobRequestInput getInput() {
        return this.input;
    }

    public SubmitCopyrightJobRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public SubmitCopyrightJobRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitCopyrightJobRequest setOutput(SubmitCopyrightJobRequestOutput output) {
        this.output = output;
        return this;
    }
    public SubmitCopyrightJobRequestOutput getOutput() {
        return this.output;
    }

    public SubmitCopyrightJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitCopyrightJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SubmitCopyrightJobRequest setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public Long getTotalTime() {
        return this.totalTime;
    }

    public SubmitCopyrightJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitCopyrightJobRequestInput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitCopyrightJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitCopyrightJobRequestInput self = new SubmitCopyrightJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitCopyrightJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitCopyrightJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitCopyrightJobRequestOutput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitCopyrightJobRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitCopyrightJobRequestOutput self = new SubmitCopyrightJobRequestOutput();
            return TeaModel.build(map, self);
        }

        public SubmitCopyrightJobRequestOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitCopyrightJobRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
