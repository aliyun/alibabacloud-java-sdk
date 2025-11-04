// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTraceAbJobRequest extends TeaModel {
    /**
     * <p>The key that is encoded by using the Base64 algorithm.</p>
     * 
     * <strong>example:</strong>
     * <p>Qh6OdgIMcliQSI1fReOw****</p>
     */
    @NameInMap("CipherBase64ed")
    public String cipherBase64ed;

    /**
     * <p>The source video file for A/B watermarking.</p>
     * <blockquote>
     * <p>OSS object or media asset must reside in the same region as the IMS service region. This API supports only videos that last at least 3 minutes. If the video is too short, the call may fail, or no output may be returned.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Input")
    public SubmitTraceAbJobRequestInput input;

    /**
     * <p>The watermark level, which specifies the channel to embed watermarks. Valid values: 0 specifies the 0u channel, 1 specifies the 1uv channel, and 2 specifies the 2yuv channel.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Level")
    public Long level;

    /**
     * <p>The output directory path.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Output")
    public SubmitTraceAbJobRequestOutput output;

    /**
     * <p>The start point of watermark embedding. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The duration of the watermark embedding. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>360</p>
     */
    @NameInMap("TotalTime")
    public Long totalTime;

    /**
     * <p>The custom data, which can be up to 1,024 bytes in size.</p>
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
         * <p>The source file. The file can be an OSS object or a media asset. You can specify the path of an OSS object in one of the following formats:</p>
         * <p>1\. oss://bucket/object</p>
         * <p>2\. http(s)://bucket.oss-[regionId].aliyuncs.com/object</p>
         * <p>where bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object path in OSS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/object</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the source file. Valid values:</p>
         * <ol>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
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
         * <p>The output file. The file can be an OSS object or a media asset. OSS URL formats:</p>
         * <p>1\. oss://bucket/dir/</p>
         * <p>2\. http(s)://bucket.oss-[regionId].aliyuncs.com/dir/</p>
         * <p>In the URL, bucket specifies an OSS bucket that resides in the same region as the job, and dir specifies the object path in OSS.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/dir/</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the output file. Valid values:</p>
         * <ul>
         * <li>OSS: an OSS object.</li>
         * <li>Media: a media asset.</li>
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
