// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alinlp20200629.models;

import com.aliyun.tea.*;

public class PostMSDataProcessingCountResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public PostMSDataProcessingCountResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static PostMSDataProcessingCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PostMSDataProcessingCountResponseBody self = new PostMSDataProcessingCountResponseBody();
        return TeaModel.build(map, self);
    }

    public PostMSDataProcessingCountResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public PostMSDataProcessingCountResponseBody setData(PostMSDataProcessingCountResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PostMSDataProcessingCountResponseBodyData getData() {
        return this.data;
    }

    public PostMSDataProcessingCountResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public PostMSDataProcessingCountResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public PostMSDataProcessingCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PostMSDataProcessingCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PostMSDataProcessingCountResponseBodyDataDataProcessedStatusesErrorDataList extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("OpType")
        public String opType;

        public static PostMSDataProcessingCountResponseBodyDataDataProcessedStatusesErrorDataList build(java.util.Map<String, ?> map) throws Exception {
            PostMSDataProcessingCountResponseBodyDataDataProcessedStatusesErrorDataList self = new PostMSDataProcessingCountResponseBodyDataDataProcessedStatusesErrorDataList();
            return TeaModel.build(map, self);
        }

        public PostMSDataProcessingCountResponseBodyDataDataProcessedStatusesErrorDataList setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public PostMSDataProcessingCountResponseBodyDataDataProcessedStatusesErrorDataList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public PostMSDataProcessingCountResponseBodyDataDataProcessedStatusesErrorDataList setOpType(String opType) {
            this.opType = opType;
            return this;
        }
        public String getOpType() {
            return this.opType;
        }

    }

    public static class PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses extends TeaModel {
        @NameInMap("ChunkNum")
        public String chunkNum;

        @NameInMap("DataId")
        public String dataId;

        @NameInMap("ErrorDataList")
        public java.util.List<PostMSDataProcessingCountResponseBodyDataDataProcessedStatusesErrorDataList> errorDataList;

        @NameInMap("OpStatus")
        public java.util.Map<String, Integer> opStatus;

        @NameInMap("Status")
        public String status;

        @NameInMap("VersionValue")
        public String versionValue;

        public static PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses build(java.util.Map<String, ?> map) throws Exception {
            PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses self = new PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses();
            return TeaModel.build(map, self);
        }

        public PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses setChunkNum(String chunkNum) {
            this.chunkNum = chunkNum;
            return this;
        }
        public String getChunkNum() {
            return this.chunkNum;
        }

        public PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses setDataId(String dataId) {
            this.dataId = dataId;
            return this;
        }
        public String getDataId() {
            return this.dataId;
        }

        public PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses setErrorDataList(java.util.List<PostMSDataProcessingCountResponseBodyDataDataProcessedStatusesErrorDataList> errorDataList) {
            this.errorDataList = errorDataList;
            return this;
        }
        public java.util.List<PostMSDataProcessingCountResponseBodyDataDataProcessedStatusesErrorDataList> getErrorDataList() {
            return this.errorDataList;
        }

        public PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses setOpStatus(java.util.Map<String, Integer> opStatus) {
            this.opStatus = opStatus;
            return this;
        }
        public java.util.Map<String, Integer> getOpStatus() {
            return this.opStatus;
        }

        public PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses setVersionValue(String versionValue) {
            this.versionValue = versionValue;
            return this;
        }
        public String getVersionValue() {
            return this.versionValue;
        }

    }

    public static class PostMSDataProcessingCountResponseBodyData extends TeaModel {
        @NameInMap("DataProcessedStatuses")
        public java.util.List<PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses> dataProcessedStatuses;

        @NameInMap("Status")
        public String status;

        public static PostMSDataProcessingCountResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PostMSDataProcessingCountResponseBodyData self = new PostMSDataProcessingCountResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PostMSDataProcessingCountResponseBodyData setDataProcessedStatuses(java.util.List<PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses> dataProcessedStatuses) {
            this.dataProcessedStatuses = dataProcessedStatuses;
            return this;
        }
        public java.util.List<PostMSDataProcessingCountResponseBodyDataDataProcessedStatuses> getDataProcessedStatuses() {
            return this.dataProcessedStatuses;
        }

        public PostMSDataProcessingCountResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
