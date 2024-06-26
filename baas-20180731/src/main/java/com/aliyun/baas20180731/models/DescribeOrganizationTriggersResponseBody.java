// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeOrganizationTriggersResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public java.util.List<DescribeOrganizationTriggersResponseBodyResult> result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeOrganizationTriggersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOrganizationTriggersResponseBody self = new DescribeOrganizationTriggersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOrganizationTriggersResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeOrganizationTriggersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOrganizationTriggersResponseBody setResult(java.util.List<DescribeOrganizationTriggersResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DescribeOrganizationTriggersResponseBodyResult> getResult() {
        return this.result;
    }

    public DescribeOrganizationTriggersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeOrganizationTriggersResponseBodyResultCheckpoint extends TeaModel {
        @NameInMap("ErrorCount")
        public Long errorCount;

        @NameInMap("Height")
        public Long height;

        @NameInMap("Index")
        public Long index;

        @NameInMap("Type")
        public String type;

        public static DescribeOrganizationTriggersResponseBodyResultCheckpoint build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationTriggersResponseBodyResultCheckpoint self = new DescribeOrganizationTriggersResponseBodyResultCheckpoint();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationTriggersResponseBodyResultCheckpoint setErrorCount(Long errorCount) {
            this.errorCount = errorCount;
            return this;
        }
        public Long getErrorCount() {
            return this.errorCount;
        }

        public DescribeOrganizationTriggersResponseBodyResultCheckpoint setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public DescribeOrganizationTriggersResponseBodyResultCheckpoint setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeOrganizationTriggersResponseBodyResultCheckpoint setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeOrganizationTriggersResponseBodyResult extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

        @NameInMap("Checkpoint")
        public DescribeOrganizationTriggersResponseBodyResultCheckpoint checkpoint;

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

        public static DescribeOrganizationTriggersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeOrganizationTriggersResponseBodyResult self = new DescribeOrganizationTriggersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeOrganizationTriggersResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeOrganizationTriggersResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public DescribeOrganizationTriggersResponseBodyResult setCheckpoint(DescribeOrganizationTriggersResponseBodyResultCheckpoint checkpoint) {
            this.checkpoint = checkpoint;
            return this;
        }
        public DescribeOrganizationTriggersResponseBodyResultCheckpoint getCheckpoint() {
            return this.checkpoint;
        }

        public DescribeOrganizationTriggersResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeOrganizationTriggersResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeOrganizationTriggersResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOrganizationTriggersResponseBodyResult setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public DescribeOrganizationTriggersResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeOrganizationTriggersResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeOrganizationTriggersResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
