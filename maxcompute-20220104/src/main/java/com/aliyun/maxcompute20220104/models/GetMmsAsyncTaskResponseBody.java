// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsAsyncTaskResponseBody extends TeaModel {
    /**
     * <p>The asynchronous task object.</p>
     */
    @NameInMap("data")
    public GetMmsAsyncTaskResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>688003E1-D1B4-5468-957E-2FFB3AC8D79B</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMmsAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMmsAsyncTaskResponseBody self = new GetMmsAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMmsAsyncTaskResponseBody setData(GetMmsAsyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMmsAsyncTaskResponseBodyData getData() {
        return this.data;
    }

    public GetMmsAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMmsAsyncTaskResponseBodyData extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The time when the task stopped running.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 17:44:17</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <p>The asynchronous task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2523</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The ID of the object associated with the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("objectId")
        public Long objectId;

        /**
         * <p>The progress of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("progress")
        public Integer progress;

        /**
         * <p>The result of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <p>Indicates whether the task is running.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("running")
        public Boolean running;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2000017</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <p>The time when the task started to run.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:17</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>The status of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The type of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>TASK_CREATE</p>
         */
        @NameInMap("type")
        public String type;

        public static GetMmsAsyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMmsAsyncTaskResponseBodyData self = new GetMmsAsyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMmsAsyncTaskResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMmsAsyncTaskResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetMmsAsyncTaskResponseBodyData setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public GetMmsAsyncTaskResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMmsAsyncTaskResponseBodyData setObjectId(Long objectId) {
            this.objectId = objectId;
            return this;
        }
        public Long getObjectId() {
            return this.objectId;
        }

        public GetMmsAsyncTaskResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public GetMmsAsyncTaskResponseBodyData setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public GetMmsAsyncTaskResponseBodyData setRunning(Boolean running) {
            this.running = running;
            return this;
        }
        public Boolean getRunning() {
            return this.running;
        }

        public GetMmsAsyncTaskResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetMmsAsyncTaskResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetMmsAsyncTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMmsAsyncTaskResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
