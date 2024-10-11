// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListInstanceTaskResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>InternalServerError</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>An internal server error occurred</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8F81A922-6C81-46D6-B78C-CC35E16B1691</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The progress of the task that is running on the instance.</p>
     */
    @NameInMap("result")
    public java.util.List<ListInstanceTaskResponseBodyResult> result;

    public static ListInstanceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTaskResponseBody self = new ListInstanceTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListInstanceTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstanceTaskResponseBody setResult(java.util.List<ListInstanceTaskResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInstanceTaskResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListInstanceTaskResponseBodyResultSubProgressInfos extends TeaModel {
        /**
         * <p>The detailed description of subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>data import progress info</p>
         */
        @NameInMap("detail")
        public String detail;

        /**
         * <p>The number of completed subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("finishedNum")
        public Integer finishedNum;

        /**
         * <p>The progress of subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("progress")
        public Integer progress;

        /**
         * <p>The total number of subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("totalNum")
        public Integer totalNum;

        /**
         * <p>The type of subtasks.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_PROCESS</p>
         */
        @NameInMap("type")
        public String type;

        public static ListInstanceTaskResponseBodyResultSubProgressInfos build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceTaskResponseBodyResultSubProgressInfos self = new ListInstanceTaskResponseBodyResultSubProgressInfos();
            return TeaModel.build(map, self);
        }

        public ListInstanceTaskResponseBodyResultSubProgressInfos setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public ListInstanceTaskResponseBodyResultSubProgressInfos setFinishedNum(Integer finishedNum) {
            this.finishedNum = finishedNum;
            return this;
        }
        public Integer getFinishedNum() {
            return this.finishedNum;
        }

        public ListInstanceTaskResponseBodyResultSubProgressInfos setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListInstanceTaskResponseBodyResultSubProgressInfos setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public ListInstanceTaskResponseBodyResultSubProgressInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListInstanceTaskResponseBodyResult extends TeaModel {
        /**
         * <p>The name of the step. Example: DATA_IMPORT. The value indicates that data is being imported.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_IMPORT</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The information about the progress of subtasks.</p>
         */
        @NameInMap("subProgressInfos")
        public java.util.List<ListInstanceTaskResponseBodyResultSubProgressInfos> subProgressInfos;

        /**
         * <p>The overall progress of the current task.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalProgress")
        public Integer totalProgress;

        public static ListInstanceTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceTaskResponseBodyResult self = new ListInstanceTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInstanceTaskResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListInstanceTaskResponseBodyResult setSubProgressInfos(java.util.List<ListInstanceTaskResponseBodyResultSubProgressInfos> subProgressInfos) {
            this.subProgressInfos = subProgressInfos;
            return this;
        }
        public java.util.List<ListInstanceTaskResponseBodyResultSubProgressInfos> getSubProgressInfos() {
            return this.subProgressInfos;
        }

        public ListInstanceTaskResponseBodyResult setTotalProgress(Integer totalProgress) {
            this.totalProgress = totalProgress;
            return this;
        }
        public Integer getTotalProgress() {
            return this.totalProgress;
        }

    }

}
