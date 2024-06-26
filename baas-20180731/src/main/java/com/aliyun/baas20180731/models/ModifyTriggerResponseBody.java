// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class ModifyTriggerResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public ModifyTriggerResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static ModifyTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyTriggerResponseBody self = new ModifyTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyTriggerResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public ModifyTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyTriggerResponseBody setResult(ModifyTriggerResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ModifyTriggerResponseBodyResult getResult() {
        return this.result;
    }

    public ModifyTriggerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ModifyTriggerResponseBodyResultCheckpoint extends TeaModel {
        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Index")
        public Long index;

        @NameInMap("Type")
        public String type;

        public static ModifyTriggerResponseBodyResultCheckpoint build(java.util.Map<String, ?> map) throws Exception {
            ModifyTriggerResponseBodyResultCheckpoint self = new ModifyTriggerResponseBodyResultCheckpoint();
            return TeaModel.build(map, self);
        }

        public ModifyTriggerResponseBodyResultCheckpoint setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public ModifyTriggerResponseBodyResultCheckpoint setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public ModifyTriggerResponseBodyResultCheckpoint setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ModifyTriggerResponseBodyResultCheckpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ModifyTriggerResponseBodyResult extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Checkpoint")
        public ModifyTriggerResponseBodyResultCheckpoint checkpoint;

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

        public static ModifyTriggerResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ModifyTriggerResponseBodyResult self = new ModifyTriggerResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ModifyTriggerResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public ModifyTriggerResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public ModifyTriggerResponseBodyResult setCheckpoint(ModifyTriggerResponseBodyResultCheckpoint checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public ModifyTriggerResponseBodyResultCheckpoint getCheckpoint() {
            return this.checkpoint;
        }

        public ModifyTriggerResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ModifyTriggerResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ModifyTriggerResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ModifyTriggerResponseBodyResult setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public ModifyTriggerResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ModifyTriggerResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ModifyTriggerResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
