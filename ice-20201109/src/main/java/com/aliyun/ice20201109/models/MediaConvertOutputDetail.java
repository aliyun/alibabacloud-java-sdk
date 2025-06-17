// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaConvertOutputDetail extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("CreateTime")
    public String createTime;

    @NameInMap("FinishTime")
    public String finishTime;

    @NameInMap("Message")
    public String message;

    @NameInMap("Name")
    public String name;

    @NameInMap("Result")
    public MediaConvertOutputDetailResult result;

    @NameInMap("Status")
    public String status;

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
        @NameInMap("Media")
        public String media;

        @NameInMap("Type")
        public String type;

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
        @NameInMap("OutFileMeta")
        public MediaConvertOutputDetailFileMeta outFileMeta;

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
