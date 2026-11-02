// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitCopyrightJobRequest extends TeaModel {
    /**
     * <p>The description of the watermark information.</p>
     * 
     * <strong>example:</strong>
     * <p>Task description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The video file to which the watermark is to be added.</p>
     * <blockquote>
     * <ul>
     * <li>The region of the OSS file or media asset must be the same as the region of the current IMS.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitCopyrightJobRequestInput input;

    /**
     * <p>The watermark level, which indicates the embedding channel. Valid values: 0 (0u), 1 (1uv), and 2 (2yuv).</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>The watermark information to be added.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Copyright watermark test</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The URL of the output file.</p>
     * <blockquote>
     * <ul>
     * <li>The region of OSS must be the same as the region of the current IMS.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitCopyrightJobRequestOutput output;

    /**
     * <p>The parameters of the watermark job, in the JSON string format. The following parameters are supported:</p>
     * <ul>
     * <li>algoType: the algorithm type. Default value: v1.<ul>
     * <li>v1: long video copyright watermark, which supports only videos longer than 3 minutes.</li>
     * <li>v2: short video copyright watermark.</li>
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
     * <p>The start time of the watermark, in seconds. If you do not specify this parameter, the default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The end time of the watermark, in seconds. If you do not specify this parameter, the default value is the duration of the video.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalTime")
    public Long totalTime;

    /**
     * <p>The user-defined data, with a maximum length of 1,024 bytes.</p>
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
         * <p>The information about the input file. Both OSS URLs and media asset IDs are supported.
         * The OSS URL rules are as follows:</p>
         * <ol>
         * <li><p>oss://bucket/object</p>
         * </li>
         * <li><p>http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
         * </li>
         * </ol>
         * <p>In the URLs, bucket is the name of the OSS bucket that is in the same region as the current project, and object is the file path.</p>
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
         * <li>OSS: the URL of the OSS file.</li>
         * <li>Media: the ID of the media asset.</li>
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
         * <p>The information about the output file. Only OSS URLs are supported. The OSS URL rules are as follows:</p>
         * <ol>
         * <li><p>oss://bucket/object</p>
         * </li>
         * <li><p>http(s)://bucket.oss-[regionId].aliyuncs.com/object
         * In the URLs, bucket is the name of the OSS bucket that is in the same region as the current project, and object is the file path.</p>
         * </li>
         * </ol>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://test-bucket/output.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output file. Valid values:</p>
         * <ol>
         * <li>OSS: the URL of the OSS file.</li>
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
