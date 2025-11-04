// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SetAIAgentVoiceprintRequest extends TeaModel {
    /**
     * <p>The input file.</p>
     */
    @NameInMap("Input")
    public SetAIAgentVoiceprintRequestInput input;

    /**
     * <p>A unique identifier for the voiceprint. Generate this ID based on your own business rules. Requirement: 1 to 127 characters in length.</p>
     * 
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
         * <p>The media access link.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/audio/sample.wav">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/audio/sample.wav</a></p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <p>The audio file format. Only WAV is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>wav</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>Specifies the access type for the audio file. The system will verify file accessibility via HEAD or GET requests. Valid values:</p>
         * <ul>
         * <li><p>url: An HTTP(S) link to the audio file.</p>
         * </li>
         * <li><p>oss: An OSS object. Supports the following formats:</p>
         * <ol>
         * <li><p>OSS URI: oss://bucket-name/object-key</p>
         * <p>Example: oss://my-bucket/audio/sample.wav</p>
         * </li>
         * <li><p>OSS public URL: http(s)://${bucket}.oss-${region}.aliyuncs.com/${object}</p>
         * <p>Example: <a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/audio/sample.wav">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/audio/sample.wav</a></p>
         * </li>
         * </ol>
         * </li>
         * </ul>
         * <blockquote>
         * <p> The OSS bucket must be in the same region as the service. Otherwise, the access fails.</p>
         * </blockquote>
         * 
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
