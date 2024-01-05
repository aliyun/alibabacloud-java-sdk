// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class GetText2ImageJobResponseBody extends TeaModel {
    @NameInMap("Images")
    public java.util.List<GetText2ImageJobResponseBodyImages> images;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskMetrics")
    public GetText2ImageJobResponseBodyTaskMetrics taskMetrics;

    @NameInMap("TaskStatus")
    public String taskStatus;

    @NameInMap("Usage")
    public java.util.List<GetText2ImageJobResponseBodyUsage> usage;

    public static GetText2ImageJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetText2ImageJobResponseBody self = new GetText2ImageJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetText2ImageJobResponseBody setImages(java.util.List<GetText2ImageJobResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<GetText2ImageJobResponseBodyImages> getImages() {
        return this.images;
    }

    public GetText2ImageJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetText2ImageJobResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public GetText2ImageJobResponseBody setTaskMetrics(GetText2ImageJobResponseBodyTaskMetrics taskMetrics) {
        this.taskMetrics = taskMetrics;
        return this;
    }
    public GetText2ImageJobResponseBodyTaskMetrics getTaskMetrics() {
        return this.taskMetrics;
    }

    public GetText2ImageJobResponseBody setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public GetText2ImageJobResponseBody setUsage(java.util.List<GetText2ImageJobResponseBodyUsage> usage) {
        this.usage = usage;
        return this;
    }
    public java.util.List<GetText2ImageJobResponseBodyUsage> getUsage() {
        return this.usage;
    }

    public static class GetText2ImageJobResponseBodyImages extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("URL")
        public String URL;

        public static GetText2ImageJobResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            GetText2ImageJobResponseBodyImages self = new GetText2ImageJobResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public GetText2ImageJobResponseBodyImages setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetText2ImageJobResponseBodyImages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetText2ImageJobResponseBodyImages setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class GetText2ImageJobResponseBodyTaskMetrics extends TeaModel {
        @NameInMap("Failed")
        public Integer failed;

        @NameInMap("Succeeded")
        public Integer succeeded;

        @NameInMap("Total")
        public Integer total;

        public static GetText2ImageJobResponseBodyTaskMetrics build(java.util.Map<String, ?> map) throws Exception {
            GetText2ImageJobResponseBodyTaskMetrics self = new GetText2ImageJobResponseBodyTaskMetrics();
            return TeaModel.build(map, self);
        }

        public GetText2ImageJobResponseBodyTaskMetrics setFailed(Integer failed) {
            this.failed = failed;
            return this;
        }
        public Integer getFailed() {
            return this.failed;
        }

        public GetText2ImageJobResponseBodyTaskMetrics setSucceeded(Integer succeeded) {
            this.succeeded = succeeded;
            return this;
        }
        public Integer getSucceeded() {
            return this.succeeded;
        }

        public GetText2ImageJobResponseBodyTaskMetrics setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

    public static class GetText2ImageJobResponseBodyUsage extends TeaModel {
        @NameInMap("ImageCount")
        public Integer imageCount;

        public static GetText2ImageJobResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            GetText2ImageJobResponseBodyUsage self = new GetText2ImageJobResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public GetText2ImageJobResponseBodyUsage setImageCount(Integer imageCount) {
            this.imageCount = imageCount;
            return this;
        }
        public Integer getImageCount() {
            return this.imageCount;
        }

    }

}
