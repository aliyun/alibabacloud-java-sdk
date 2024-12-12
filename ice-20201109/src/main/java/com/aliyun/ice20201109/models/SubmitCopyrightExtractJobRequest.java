// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightExtractJobRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitCopyrightExtractJobRequestInput input;

    /**
     * <strong>example:</strong>
     * <p>{&quot;algoType&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitCopyrightExtractJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightExtractJobRequest self = new SubmitCopyrightExtractJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightExtractJobRequest setInput(SubmitCopyrightExtractJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitCopyrightExtractJobRequestInput getInput() {
        return this.input;
    }

    public SubmitCopyrightExtractJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitCopyrightExtractJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitCopyrightExtractJobRequestInput extends TeaModel {
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

        public static SubmitCopyrightExtractJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitCopyrightExtractJobRequestInput self = new SubmitCopyrightExtractJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitCopyrightExtractJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitCopyrightExtractJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
