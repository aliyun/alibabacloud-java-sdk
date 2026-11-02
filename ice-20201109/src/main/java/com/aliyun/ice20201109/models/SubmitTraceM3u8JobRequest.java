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
     * <p>The OSS output address of the m3u8 file.</p>
     * <blockquote>
     * <p>The region of the OSS bucket must be the same as the region of the current MPS.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitTraceM3u8JobRequestOutput output;

    /**
     * <p>The watermark job parameters. The value is a JSON string. The following parameters are supported:</p>
     * <ul>
     * <li><p>m3u8Type: the algorithm type. Default value: v1.</p>
     * <ul>
     * <li><p>v1: generates an m3u8 file with an absolute path, which can be played directly. The signature authentication is valid for 24 hours. After the authentication expires, you must resubmit the job to obtain the m3u8 file.</p>
     * </li>
     * <li><p>v2: generates an m3u8 file with a relative path, which must be placed in the same directory as the TS files.</p>
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
     * <p>The tracing watermark information.</p>
     * 
     * <strong>example:</strong>
     * <p>Traceability Watermark Test</p>
     */
    @NameInMap("Trace")
    public String trace;

    /**
     * <p>The media ID of the processed tracing watermark AB stream. You can obtain this ID from the response parameters of the operation that submits a video tracing watermark AB stream job.</p>
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
         * <p>The output file information. OSS addresses are supported. The OSS address rules are as follows:</p>
         * <ol>
         * <li><p>oss://bucket/object</p>
         * </li>
         * <li><p>http(s)://bucket.oss-[regionId].aliyuncs.com/object
         * where bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</p>
         * </li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The output file type. Valid values:</p>
         * <ol>
         * <li>OSS: OSS file address.</li>
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
