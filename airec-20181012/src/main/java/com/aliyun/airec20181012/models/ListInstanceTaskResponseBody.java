// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012.models;

import com.aliyun.tea.*;

public class ListInstanceTaskResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Code")
    public String code;

    @NameInMap("Result")
    public java.util.List<ListInstanceTaskResponseBodyResult> result;

    public static ListInstanceTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTaskResponseBody self = new ListInstanceTaskResponseBody();
        return TeaModel.build(map, self);
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

    public ListInstanceTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListInstanceTaskResponseBody setResult(java.util.List<ListInstanceTaskResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ListInstanceTaskResponseBodyResult> getResult() {
        return this.result;
    }

    public static class ListInstanceTaskResponseBodyResultSubProgressInfos extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("FinishedNum")
        public Integer finishedNum;

        @NameInMap("TotalNum")
        public Integer totalNum;

        @NameInMap("Detail")
        public String detail;

        public static ListInstanceTaskResponseBodyResultSubProgressInfos build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceTaskResponseBodyResultSubProgressInfos self = new ListInstanceTaskResponseBodyResultSubProgressInfos();
            return TeaModel.build(map, self);
        }

        public ListInstanceTaskResponseBodyResultSubProgressInfos setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListInstanceTaskResponseBodyResultSubProgressInfos setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public ListInstanceTaskResponseBodyResultSubProgressInfos setFinishedNum(Integer finishedNum) {
            this.finishedNum = finishedNum;
            return this;
        }
        public Integer getFinishedNum() {
            return this.finishedNum;
        }

        public ListInstanceTaskResponseBodyResultSubProgressInfos setTotalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Integer getTotalNum() {
            return this.totalNum;
        }

        public ListInstanceTaskResponseBodyResultSubProgressInfos setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

    }

    public static class ListInstanceTaskResponseBodyResult extends TeaModel {
        @NameInMap("SubProgressInfos")
        public java.util.List<ListInstanceTaskResponseBodyResultSubProgressInfos> subProgressInfos;

        @NameInMap("Name")
        public String name;

        @NameInMap("TotalProgress")
        public Integer totalProgress;

        public static ListInstanceTaskResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListInstanceTaskResponseBodyResult self = new ListInstanceTaskResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListInstanceTaskResponseBodyResult setSubProgressInfos(java.util.List<ListInstanceTaskResponseBodyResultSubProgressInfos> subProgressInfos) {
            this.subProgressInfos = subProgressInfos;
            return this;
        }
        public java.util.List<ListInstanceTaskResponseBodyResultSubProgressInfos> getSubProgressInfos() {
            return this.subProgressInfos;
        }

        public ListInstanceTaskResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
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
