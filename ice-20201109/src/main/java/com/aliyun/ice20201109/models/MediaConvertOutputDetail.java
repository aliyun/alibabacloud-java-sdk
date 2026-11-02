// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutputDetail extends TeaModel {
    /**
     * <p>The error code for a transcoding failure.</p>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.ResourceContentBad</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The time when the output was created. The time is displayed in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-07T06:06:58Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The time when the output was completed. The time is displayed in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-07T13:01:07Z</p>
     */
    @NameInMap("FinishTime")
    public String finishTime;

    /**
     * <p>The detailed cause of the transcoding failure.</p>
     * 
     * <strong>example:</strong>
     * <p>The resource operated InputFile is bad</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The name of the transcoding output.</p>
     * 
     * <strong>example:</strong>
     * <p>720P-mp4</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The details of the output result.</p>
     */
    @NameInMap("Result")
    public MediaConvertOutputDetailResult result;

    /**
     * <p>The task status. Valid values:</p>
     * <ul>
     * <li>Init: Initialized.</li>
     * <li>Scheduled: Scheduled.</li>
     * <li>Success: Succeeded.</li>
     * <li>Failed: Failed.</li>
     * <li>Skipped: Skipped.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The ID of the transcoding output task.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>4215e042b3966ca5441e</strong></strong></strong></p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static MediaConvertOutputDetail build(java.util.Map<String, ?> map) throws Exception {
        MediaConvertOutputDetail self = new MediaConvertOutputDetail();
        return TeaModel.build(map, self);
    }

    public MediaConvertOutputDetail setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MediaConvertOutputDetail setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MediaConvertOutputDetail setFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }
    public String getFinishTime() {
        return this.finishTime;
    }

    public MediaConvertOutputDetail setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MediaConvertOutputDetail setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public MediaConvertOutputDetail setResult(MediaConvertOutputDetailResult result) {
        this.result = result;
        return this;
    }
    public MediaConvertOutputDetailResult getResult() {
        return this.result;
    }

    public MediaConvertOutputDetail setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MediaConvertOutputDetail setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class MediaConvertOutputDetailResultOutputFile extends TeaModel {
        /**
         * <p>The media value.</p>
         * <ul>
         * <li>When Type is set to OSS, the URL supports the OSS and HTTP protocols.</li>
         * <li>When Type is set to Media, the value is the media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The media object type. Valid values:</p>
         * <ul>
         * <li>OSS: OSS file.</li>
         * <li>Media: Media asset ID.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The actual file URL when Type is set to Media.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Url")
        public String url;

        public static MediaConvertOutputDetailResultOutputFile build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertOutputDetailResultOutputFile self = new MediaConvertOutputDetailResultOutputFile();
            return TeaModel.build(map, self);
        }

        public MediaConvertOutputDetailResultOutputFile setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public MediaConvertOutputDetailResultOutputFile setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public MediaConvertOutputDetailResultOutputFile setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class MediaConvertOutputDetailResult extends TeaModel {
        /**
         * <p>The metadata of the audio and video streams.</p>
         */
        @NameInMap("OutFileMeta")
        public MediaConvertOutputDetailFileMeta outFileMeta;

        /**
         * <p>The details of the output file.</p>
         */
        @NameInMap("OutputFile")
        public MediaConvertOutputDetailResultOutputFile outputFile;

        public static MediaConvertOutputDetailResult build(java.util.Map<String, ?> map) throws Exception {
            MediaConvertOutputDetailResult self = new MediaConvertOutputDetailResult();
            return TeaModel.build(map, self);
        }

        public MediaConvertOutputDetailResult setOutFileMeta(MediaConvertOutputDetailFileMeta outFileMeta) {
            this.outFileMeta = outFileMeta;
            return this;
        }
        public MediaConvertOutputDetailFileMeta getOutFileMeta() {
            return this.outFileMeta;
        }

        public MediaConvertOutputDetailResult setOutputFile(MediaConvertOutputDetailResultOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public MediaConvertOutputDetailResultOutputFile getOutputFile() {
            return this.outputFile;
        }

    }

}
