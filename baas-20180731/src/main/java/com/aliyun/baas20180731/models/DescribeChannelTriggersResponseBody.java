// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeChannelTriggersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeChannelTriggersResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeChannelTriggersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelTriggersResponseBody self = new DescribeChannelTriggersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelTriggersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeChannelTriggersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelTriggersResponseBody setResult(java.util.List<DescribeChannelTriggersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeChannelTriggersResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeChannelTriggersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeChannelTriggersResponseBodyResultCheckpoint extends TeaModel {
        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Index")
        public Long index;

        @NameInMap("Type")
        public String type;

        public static DescribeChannelTriggersResponseBodyResultCheckpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelTriggersResponseBodyResultCheckpoint self = new DescribeChannelTriggersResponseBodyResultCheckpoint();
            return TeaModel.build(map, self);
        }

        public DescribeChannelTriggersResponseBodyResultCheckpoint setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public DescribeChannelTriggersResponseBodyResultCheckpoint setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeChannelTriggersResponseBodyResultCheckpoint setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeChannelTriggersResponseBodyResultCheckpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeChannelTriggersResponseBodyResult extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Checkpoint")
        public DescribeChannelTriggersResponseBodyResultCheckpoint checkpoint;

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

        public static DescribeChannelTriggersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelTriggersResponseBodyResult self = new DescribeChannelTriggersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeChannelTriggersResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeChannelTriggersResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeChannelTriggersResponseBodyResult setCheckpoint(DescribeChannelTriggersResponseBodyResultCheckpoint checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public DescribeChannelTriggersResponseBodyResultCheckpoint getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeChannelTriggersResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeChannelTriggersResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeChannelTriggersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeChannelTriggersResponseBodyResult setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public DescribeChannelTriggersResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeChannelTriggersResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeChannelTriggersResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
