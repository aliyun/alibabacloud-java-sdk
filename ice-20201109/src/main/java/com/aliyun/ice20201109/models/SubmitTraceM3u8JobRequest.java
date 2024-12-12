// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceM3u8JobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://cipher.abc.com">https://cipher.abc.com</a></p>
     */
    @NameInMap("KeyUri")
    public String keyUri;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitTraceM3u8JobRequestOutput output;

    /**
     * <strong>example:</strong>
     * <p>{&quot;m3u8Type&quot;:&quot;v1&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    @NameInMap("Trace")
    public String trace;

    /**
     * <strong>example:</strong>
     * <p>437bd2b516ffda105d07b12a9a82****</p>
     */
    @NameInMap("TraceMediaId")
    public String traceMediaId;

    public static SubmitTraceM3u8JobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitTraceM3u8JobRequest self = new SubmitTraceM3u8JobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitTraceM3u8JobRequest setKeyUri(String keyUri) {
        this.keyUri = keyUri;
        return this;
    }
    public String getKeyUri() {
        return this.keyUri;
    }

    public SubmitTraceM3u8JobRequest setOutput(SubmitTraceM3u8JobRequestOutput output) {
        this.output = output;
        return this;
    }
    public SubmitTraceM3u8JobRequestOutput getOutput() {
        return this.output;
    }

    public SubmitTraceM3u8JobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitTraceM3u8JobRequest setTrace(String trace) {
        this.trace = trace;
        return this;
    }
    public String getTrace() {
        return this.trace;
    }

    public SubmitTraceM3u8JobRequest setTraceMediaId(String traceMediaId) {
        this.traceMediaId = traceMediaId;
        return this;
    }
    public String getTraceMediaId() {
        return this.traceMediaId;
    }

    public static class SubmitTraceM3u8JobRequestOutput extends TeaModel {
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

        public static SubmitTraceM3u8JobRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitTraceM3u8JobRequestOutput self = new SubmitTraceM3u8JobRequestOutput();
            return TeaModel.build(map, self);
        }

        public SubmitTraceM3u8JobRequestOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitTraceM3u8JobRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
