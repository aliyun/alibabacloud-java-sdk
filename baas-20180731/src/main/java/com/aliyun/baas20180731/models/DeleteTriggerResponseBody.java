// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DeleteTriggerResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DeleteTriggerResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteTriggerResponseBody self = new DeleteTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteTriggerResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DeleteTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteTriggerResponseBody setResult(DeleteTriggerResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DeleteTriggerResponseBodyResult getResult() {
        return this.result;
    }

    public DeleteTriggerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteTriggerResponseBodyResultCheckpoint extends TeaModel {
        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Index")
        public Long index;

        @NameInMap("Type")
        public String type;

        public static DeleteTriggerResponseBodyResultCheckpoint build(java.util.Map<String, ?> map) throws Exception {
            DeleteTriggerResponseBodyResultCheckpoint self = new DeleteTriggerResponseBodyResultCheckpoint();
            return TeaModel.build(map, self);
        }

        public DeleteTriggerResponseBodyResultCheckpoint setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public DeleteTriggerResponseBodyResultCheckpoint setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DeleteTriggerResponseBodyResultCheckpoint setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DeleteTriggerResponseBodyResultCheckpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DeleteTriggerResponseBodyResult extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Checkpoint")
        public DeleteTriggerResponseBodyResultCheckpoint checkpoint;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("Name")
        public String name;

        @NameInMap("Options")
        public String options;

        @NameInMap("Source")
        public String source;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public String type;

        public static DeleteTriggerResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DeleteTriggerResponseBodyResult self = new DeleteTriggerResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DeleteTriggerResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DeleteTriggerResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DeleteTriggerResponseBodyResult setCheckpoint(DeleteTriggerResponseBodyResultCheckpoint checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public DeleteTriggerResponseBodyResultCheckpoint getCheckpoint() {
            return this.checkpoint;
        }

        public DeleteTriggerResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DeleteTriggerResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DeleteTriggerResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DeleteTriggerResponseBodyResult setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public DeleteTriggerResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DeleteTriggerResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DeleteTriggerResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
