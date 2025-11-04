// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceM3u8JobRequest extends TeaModel {
    /**
     * <p>The URI of the key server.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://cipher.abc.com">https://cipher.abc.com</a></p>
     */
    @NameInMap("KeyUri")
    public String keyUri;

    /**
     * <p>The OSS URL of the output M3U8 file.</p>
     * <blockquote>
     * <p>The OSS bucket must reside in the same region as the service region.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitTraceM3u8JobRequestOutput output;

    /**
     * <p>Additional parameters for the watermark job, provided as a JSON string. Supported parameter:</p>
     * <ul>
     * <li><p>m3u8Type: The type of M3U8 to generate. Defaults to v1.</p>
     * <ul>
     * <li>v1: Generates an M3U8 with absolute paths, playable directly. The signed URL for access is valid for 24 hours. If you need to use it after expiration, you must call this API again.</li>
     * <li>v2: Generates an M3U8 with relative paths. It must be placed in the same directory as the TS segment files to be playable.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;m3u8Type&quot;:&quot;v1&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The specific trace watermark information.</p>
     */
    @NameInMap("Trace")
    public String trace;

    /**
     * <p>The media ID for the trace watermark. You can obtain this from the response of the SubmitTraceAbJob operation.</p>
     * 
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
         * <p>The OSS path where the output file is saved. You can specify the path in one of the following formats:</p>
         * <p>1\. oss://bucket/object</p>
         * <p>2\. http(s)://bucket.oss-[regionId].aliyuncs.com/object where bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object path in OSS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output file. Valid value:</p>
         * <ol>
         * <li>OSS: an OSS object.</li>
         * </ol>
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
