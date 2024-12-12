// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceAbJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Qh6OdgIMcliQSI1fReOw****</p>
     */
    @NameInMap("CipherBase64ed")
    public String cipherBase64ed;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitTraceAbJobRequestInput input;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitTraceAbJobRequestOutput output;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("TotalTime")
    public String totalTime;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitTraceAbJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceAbJobRequest self = new SubmitTraceAbJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTraceAbJobRequest setCipherBase64ed(String cipherBase64ed) {
        this.cipherBase64ed = cipherBase64ed;
        return this;
    }
    public String getCipherBase64ed() {
        return this.cipherBase64ed;
    }

    public SubmitTraceAbJobRequest setInput(SubmitTraceAbJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitTraceAbJobRequestInput getInput() {
        return this.input;
    }

    public SubmitTraceAbJobRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public SubmitTraceAbJobRequest setOutput(SubmitTraceAbJobRequestOutput output) {
        this.output = output;
        return this;
    }
    public SubmitTraceAbJobRequestOutput getOutput() {
        return this.output;
    }

    public SubmitTraceAbJobRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public SubmitTraceAbJobRequest setTotalTime(String totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public String getTotalTime() {
        return this.totalTime;
    }

    public SubmitTraceAbJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitTraceAbJobRequestInput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitTraceAbJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitTraceAbJobRequestInput self = new SubmitTraceAbJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitTraceAbJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTraceAbJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitTraceAbJobRequestOutput extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/dir/</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitTraceAbJobRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitTraceAbJobRequestOutput self = new SubmitTraceAbJobRequestOutput();
            return TeaModel.build(map, self);
        }

        public SubmitTraceAbJobRequestOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTraceAbJobRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
