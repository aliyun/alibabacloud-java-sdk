// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsAsyncTaskResponseBody extends TeaModel {
    @NameInMap("data")
    public GetMmsAsyncTaskResponseBodyData data;

    /**
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
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:00</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2024-12-17 17:44:17</p>
         */
        @NameInMap("endTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("errorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>2523</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>232</p>
         */
        @NameInMap("objectId")
        public Long objectId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("progress")
        public Integer progress;

        /**
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("result")
        public String result;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("running")
        public Boolean running;

        /**
         * <strong>example:</strong>
         * <p>2000017</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:17</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("status")
        public String status;

        /**
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
