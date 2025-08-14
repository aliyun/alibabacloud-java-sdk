// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetAIAgentVoiceprintRequest extends TeaModel {
    @NameInMap("Input")
    public SetAIAgentVoiceprintRequestInput input;

    /**
     * <strong>example:</strong>
     * <p>vp_1699123456_8527</p>
     */
    @NameInMap("VoiceprintId")
    public String voiceprintId;

    public static SetAIAgentVoiceprintRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAIAgentVoiceprintRequest self = new SetAIAgentVoiceprintRequest();
        return TeaModel.build(map, self);
    }

    public SetAIAgentVoiceprintRequest setInput(SetAIAgentVoiceprintRequestInput input) {
        this.input = input;
        return this;
    }
    public SetAIAgentVoiceprintRequestInput getInput() {
        return this.input;
    }

    public SetAIAgentVoiceprintRequest setVoiceprintId(String voiceprintId) {
        this.voiceprintId = voiceprintId;
        return this;
    }
    public String getVoiceprintId() {
        return this.voiceprintId;
    }

    public static class SetAIAgentVoiceprintRequestInput extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/audio/sample.wav">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/audio/sample.wav</a></p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p>wav</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <strong>example:</strong>
         * <p>url</p>
         */
        @NameInMap("Type")
        public String type;

        public static SetAIAgentVoiceprintRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SetAIAgentVoiceprintRequestInput self = new SetAIAgentVoiceprintRequestInput();
            return TeaModel.build(map, self);
        }

        public SetAIAgentVoiceprintRequestInput setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public SetAIAgentVoiceprintRequestInput setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public SetAIAgentVoiceprintRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
