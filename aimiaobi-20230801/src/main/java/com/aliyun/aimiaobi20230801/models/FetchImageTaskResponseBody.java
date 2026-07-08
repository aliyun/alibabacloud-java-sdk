// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class FetchImageTaskResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     */
    @NameInMap("Data")
    public FetchImageTaskResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error description</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request identifier</p>
     * 
     * <strong>example:</strong>
     * <p>DD656AF9-0839-521A-A3D2-F320009F9C87</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request succeeded: true for success, false for failure</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Error code returned if the image was not generated</p>
         * 
         * <strong>example:</strong>
         * <p>NoData</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>Error message returned if the image was not generated</p>
         * 
         * <strong>example:</strong>
         * <p>错误</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Image URL</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/aaa.png">http://www.example.com/aaa.png</a></p>
         */
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
        /**
         * <p>Paragraph ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Image information</p>
         */
        @NameInMap("ImageList")
        public java.util.List<FetchImageTaskResponseBodyDataTaskInfoListImageList> imageList;

        /**
         * <p>Task ID, the unique identifier of a task</p>
         * 
         * <strong>example:</strong>
         * <p>net-7eb32699000d4193a3c59fc64ae1e55f</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Current task status. Values: SUCCESSED = task succeeded, FAILED = task failed, CANCELED = task canceled, PENDING = task queued, SUSPENDED = task suspended, RUNNING = task in progress</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
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
        /**
         * <p>Image information generated by smart illustration tasks</p>
         */
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
