// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceExtractJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitTraceExtractJobRequestInput input;

    /**
     * <strong>example:</strong>
     * <p>{&quot;m3u8Type&quot;:&quot;v1&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitTraceExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceExtractJobRequest self = new SubmitTraceExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTraceExtractJobRequest setInput(SubmitTraceExtractJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitTraceExtractJobRequestInput getInput() {
        return this.input;
    }

    public SubmitTraceExtractJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitTraceExtractJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitTraceExtractJobRequestInput extends TeaModel {
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

        public static SubmitTraceExtractJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitTraceExtractJobRequestInput self = new SubmitTraceExtractJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitTraceExtractJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTraceExtractJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
