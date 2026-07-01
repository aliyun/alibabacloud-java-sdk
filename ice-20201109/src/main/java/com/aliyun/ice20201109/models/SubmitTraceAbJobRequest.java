// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceAbJobRequest extends TeaModel {
    /**
     * <p>The Base64-encoded encryption key.</p>
     * 
     * <strong>example:</strong>
     * <p>Qh6OdgIMcliQSI1fReOw****</p>
     */
    @NameInMap("CipherBase64ed")
    public String cipherBase64ed;

    /**
     * <p>The input video for the A/B stream forensic watermarking job.</p>
     * <blockquote>
     * <ul>
     * <li><p>The Object Storage Service (OSS) file or media asset must be in the same region where Intelligent Media Services (IMS) is deployed.</p>
     * </li>
     * <li><p>This operation supports only videos that are three minutes or longer. Using a shorter video may cause the API call to fail or produce no output.</p>
     * </li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitTraceAbJobRequestInput input;

    /**
     * <p>The watermark level, which specifies the embedding channel. Valid values: <code>0</code> (U channel), <code>1</code> (UV channels), and <code>2</code> (YUV channels).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>The output location for the A/B stream job. This must be an OSS directory.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitTraceAbJobRequestOutput output;

    /**
     * <p>The start time for watermark embedding, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The total duration for watermark embedding, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("TotalTime")
    public Long totalTime;

    /**
     * <p>User data to include in the request. The maximum length is 1,024 bytes.</p>
     * 
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

    public SubmitTraceAbJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SubmitTraceAbJobRequest setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public Long getTotalTime() {
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
         * <p>The location of the input file. This can be an OSS URL or a media asset ID.
         * The supported OSS URL formats are:</p>
         * <p>1\. <code>oss://&lt;bucket&gt;/&lt;object&gt;</code></p>
         * <p>2\. <code>http(s)://&lt;bucket&gt;.oss-[regionId].aliyuncs.com/&lt;object&gt;</code></p>
         * <p>In these formats, <code>&lt;bucket&gt;</code> is the name of the OSS bucket, which must be in the same region as your project, and <code>&lt;object&gt;</code> is the path to the file.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the input file. Valid values:</p>
         * <ol>
         * <li><p><code>OSS</code>: The file is specified by an OSS URL.</p>
         * </li>
         * <li><p><code>Media</code>: The file is specified by a media asset ID.</p>
         * </li>
         * </ol>
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
         * <p>The output path. Specify an OSS directory URL or a media asset ID. If you specify an OSS URL, use one of the following formats for the output directory:</p>
         * <p>1\. <code>oss://&lt;bucket&gt;/&lt;dir&gt;/</code></p>
         * <p>2\. <code>http(s)://&lt;bucket&gt;.oss-[regionId].aliyuncs.com/&lt;dir&gt;/</code></p>
         * <p>In these formats, <code>&lt;bucket&gt;</code> is the name of the OSS bucket, which must be in the same region as your project, and <code>&lt;dir&gt;</code> is the output directory path.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/dir/</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output object.
         * Valid values:</p>
         * <ul>
         * <li><p><code>OSS</code>: An OSS object.</p>
         * </li>
         * <li><p><code>Media</code>: A media asset ID.</p>
         * </li>
         * </ul>
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
