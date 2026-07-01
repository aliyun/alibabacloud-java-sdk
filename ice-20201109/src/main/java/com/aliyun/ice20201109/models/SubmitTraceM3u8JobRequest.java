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
     * <p>The OSS destination for the output M3U8 file.</p>
     * <blockquote>
     * <p>The OSS bucket must be in the same region as your MPS service.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitTraceM3u8JobRequestOutput output;

    /**
     * <p>A JSON string that contains parameters for the watermarking job. The following parameter is supported:</p>
     * <ul>
     * <li><p><code>m3u8Type</code>: The algorithm type. The default value is <code>v1</code>.</p>
     * <ul>
     * <li><p><code>v1</code>: Generates an M3U8 file that uses an absolute path. The file can be played directly. The signature is valid for 24 hours. After expiration, you must submit a new job to get a new M3U8 file.</p>
     * </li>
     * <li><p><code>v2</code>: Generates an M3U8 file that uses a relative path. This file must be stored in the same directory as the TS files.</p>
     * </li>
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
     * <p>The watermark content to embed.</p>
     * 
     * <strong>example:</strong>
     * <p>Trace watermark test</p>
     */
    @NameInMap("Trace")
    public String trace;

    /**
     * <p>The media ID of the processed A/B stream for video watermarking for tracing. This ID is returned in the response when you submit the A/B stream job.</p>
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
         * <p>The output file path. Only OSS paths are supported. You can use one of the following formats:</p>
         * <p>1\. <code>oss://bucket/object</code></p>
         * <p>2\. <code>http(s)://bucket.oss-[regionId].aliyuncs.com/object</code>. In these formats, <code>bucket</code> specifies the name of an OSS bucket in the same region as your project, and <code>object</code> specifies the file path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output destination. Valid values:</p>
         * <ol>
         * <li><code>OSS</code>: an OSS file location.</li>
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
