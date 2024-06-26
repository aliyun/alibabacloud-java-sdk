// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeTriggerResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeTriggerResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTriggerResponseBody self = new DescribeTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTriggerResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTriggerResponseBody setResult(DescribeTriggerResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeTriggerResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeTriggerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTriggerResponseBodyResultCheckpoint extends TeaModel {
        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Index")
        public Long index;

        @NameInMap("Type")
        public String type;

        public static DescribeTriggerResponseBodyResultCheckpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeTriggerResponseBodyResultCheckpoint self = new DescribeTriggerResponseBodyResultCheckpoint();
            return TeaModel.build(map, self);
        }

        public DescribeTriggerResponseBodyResultCheckpoint setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public DescribeTriggerResponseBodyResultCheckpoint setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeTriggerResponseBodyResultCheckpoint setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeTriggerResponseBodyResultCheckpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeTriggerResponseBodyResult extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Checkpoint")
        public DescribeTriggerResponseBodyResultCheckpoint checkpoint;

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

        public static DescribeTriggerResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeTriggerResponseBodyResult self = new DescribeTriggerResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeTriggerResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeTriggerResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeTriggerResponseBodyResult setCheckpoint(DescribeTriggerResponseBodyResultCheckpoint checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public DescribeTriggerResponseBodyResultCheckpoint getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeTriggerResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeTriggerResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeTriggerResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTriggerResponseBodyResult setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public DescribeTriggerResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeTriggerResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeTriggerResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
