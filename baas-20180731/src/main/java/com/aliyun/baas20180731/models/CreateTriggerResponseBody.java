// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class CreateTriggerResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public CreateTriggerResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static CreateTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerResponseBody self = new CreateTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTriggerResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public CreateTriggerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTriggerResponseBody setResult(CreateTriggerResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CreateTriggerResponseBodyResult getResult() {
        return this.result;
    }

    public CreateTriggerResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTriggerResponseBodyResult extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("ChannelName")
        public String channelName;

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

        public static CreateTriggerResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CreateTriggerResponseBodyResult self = new CreateTriggerResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CreateTriggerResponseBodyResult setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public CreateTriggerResponseBodyResult setChannelName(String channelName) {
            this.channelName = channelName;
            return this;
        }
        public String getChannelName() {
            return this.channelName;
        }

        public CreateTriggerResponseBodyResult setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateTriggerResponseBodyResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public CreateTriggerResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateTriggerResponseBodyResult setOptions(String options) {
            this.options = options;
            return this;
        }
        public String getOptions() {
            return this.options;
        }

        public CreateTriggerResponseBodyResult setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public CreateTriggerResponseBodyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public CreateTriggerResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
