// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobRequest extends TeaModel {
    /**
     * <p>A description of the watermark job.</p>
     * 
     * <strong>example:</strong>
     * <p>Task description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The input video file to be watermarked.</p>
     * <blockquote>
     * <ul>
     * <li>The OSS object or media asset must be in the same region as the service call.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example.mp4&quot;}</p>
     */
    @NameInMap("Input")
    public SubmitCopyrightJobRequestInput input;

    /**
     * <p>The watermark level, which specifies the embedding channel. Valid values are 0, 1, and 2, which correspond to the U, UV, and YUV channels, respectively.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>The watermark content to embed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Copyright watermark test</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The location of the output file.</p>
     * <blockquote>
     * <ul>
     * <li>The OSS bucket must be in the same region as the service call.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-shanghai&quot;,&quot;Object&quot;:&quot;example_result.mp4&quot;}</p>
     */
    @NameInMap("Output")
    public SubmitCopyrightJobRequestOutput output;

    /**
     * <p>The parameters for the watermark job, specified as a JSON string. The following parameter is supported:</p>
     * <ul>
     * <li><p><code>algoType</code>: The algorithm type. Defaults to <code>v1</code>.</p>
     * <ul>
     * <li><p><code>v1</code>: For videos 3 minutes or longer.</p>
     * </li>
     * <li><p><code>v2</code>: For short videos.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;algoType&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The start time of the watermark in seconds. Defaults to 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The end time of the watermark in seconds. If unspecified, the watermark is applied until the video ends.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalTime")
    public Long totalTime;

    /**
     * <p>The user data. The value can be up to 1,024 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static SubmitCopyrightJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCopyrightJobRequest self = new SubmitCopyrightJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCopyrightJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitCopyrightJobRequest setInput(SubmitCopyrightJobRequestInput input) {
        this.input = input;
        return this;
    }
    public SubmitCopyrightJobRequestInput getInput() {
        return this.input;
    }

    public SubmitCopyrightJobRequest setLevel(Long level) {
        this.level = level;
        return this;
    }
    public Long getLevel() {
        return this.level;
    }

    public SubmitCopyrightJobRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitCopyrightJobRequest setOutput(SubmitCopyrightJobRequestOutput output) {
        this.output = output;
        return this;
    }
    public SubmitCopyrightJobRequestOutput getOutput() {
        return this.output;
    }

    public SubmitCopyrightJobRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SubmitCopyrightJobRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public SubmitCopyrightJobRequest setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public Long getTotalTime() {
        return this.totalTime;
    }

    public SubmitCopyrightJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public static class SubmitCopyrightJobRequestInput extends TeaModel {
        /**
         * <p>The input file, specified as either an OSS URL or a media asset ID. The following formats are supported for OSS URLs:</p>
         * <p>1\. <code>oss://bucket/object</code></p>
         * <p>2\. <code>http(s)://bucket.oss-[regionId].aliyuncs.com/object</code></p>
         * <p>In these formats, <code>bucket</code> specifies the name of an OSS bucket in the same region as the service, and <code>object</code> specifies the file path.</p>
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
         * <li><p><code>OSS</code>: The URL of an OSS object.</p>
         * </li>
         * <li><p><code>Media</code>: The media asset ID.</p>
         * </li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitCopyrightJobRequestInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitCopyrightJobRequestInput self = new SubmitCopyrightJobRequestInput();
            return TeaModel.build(map, self);
        }

        public SubmitCopyrightJobRequestInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitCopyrightJobRequestInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitCopyrightJobRequestOutput extends TeaModel {
        /**
         * <p>The OSS URL for the output file. The following formats are supported:</p>
         * <p>1\. <code>oss://bucket/object</code></p>
         * <p>2\. <code>http(s)://bucket.oss-[regionId].aliyuncs.com/object</code><br>In these formats, <code>bucket</code> specifies the name of an OSS bucket in the same region as the service, and <code>object</code> specifies the file path.<br></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/output.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output file. Valid value:</p>
         * <ol>
         * <li><code>OSS</code>: The URL of an OSS object.</li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitCopyrightJobRequestOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitCopyrightJobRequestOutput self = new SubmitCopyrightJobRequestOutput();
            return TeaModel.build(map, self);
        }

        public SubmitCopyrightJobRequestOutput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public SubmitCopyrightJobRequestOutput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
