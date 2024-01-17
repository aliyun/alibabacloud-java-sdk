// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchImageTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public FetchImageTaskResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static FetchImageTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FetchImageTaskResponseBody self = new FetchImageTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public FetchImageTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FetchImageTaskResponseBody setData(FetchImageTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public FetchImageTaskResponseBodyData getData() {
        return this.data;
    }

    public FetchImageTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public FetchImageTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FetchImageTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FetchImageTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class FetchImageTaskResponseBodyDataTaskInfoListImageList extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Url")
        public String url;

        public static FetchImageTaskResponseBodyDataTaskInfoListImageList build(java.util.Map<String, ?> map) throws Exception {
            FetchImageTaskResponseBodyDataTaskInfoListImageList self = new FetchImageTaskResponseBodyDataTaskInfoListImageList();
            return TeaModel.build(map, self);
        }

        public FetchImageTaskResponseBodyDataTaskInfoListImageList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public FetchImageTaskResponseBodyDataTaskInfoListImageList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public FetchImageTaskResponseBodyDataTaskInfoListImageList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class FetchImageTaskResponseBodyDataTaskInfoList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("ImageList")
        public java.util.List<FetchImageTaskResponseBodyDataTaskInfoListImageList> imageList;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskStatus")
        public String taskStatus;

        public static FetchImageTaskResponseBodyDataTaskInfoList build(java.util.Map<String, ?> map) throws Exception {
            FetchImageTaskResponseBodyDataTaskInfoList self = new FetchImageTaskResponseBodyDataTaskInfoList();
            return TeaModel.build(map, self);
        }

        public FetchImageTaskResponseBodyDataTaskInfoList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public FetchImageTaskResponseBodyDataTaskInfoList setImageList(java.util.List<FetchImageTaskResponseBodyDataTaskInfoListImageList> imageList) {
            this.imageList = imageList;
            return this;
        }
        public java.util.List<FetchImageTaskResponseBodyDataTaskInfoListImageList> getImageList() {
            return this.imageList;
        }

        public FetchImageTaskResponseBodyDataTaskInfoList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public FetchImageTaskResponseBodyDataTaskInfoList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

    public static class FetchImageTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskInfoList")
        public java.util.List<FetchImageTaskResponseBodyDataTaskInfoList> taskInfoList;

        public static FetchImageTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            FetchImageTaskResponseBodyData self = new FetchImageTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public FetchImageTaskResponseBodyData setTaskInfoList(java.util.List<FetchImageTaskResponseBodyDataTaskInfoList> taskInfoList) {
            this.taskInfoList = taskInfoList;
            return this;
        }
        public java.util.List<FetchImageTaskResponseBodyDataTaskInfoList> getTaskInfoList() {
            return this.taskInfoList;
        }

    }

}
