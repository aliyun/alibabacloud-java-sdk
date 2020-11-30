// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEndpointSwitchTaskResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("Synchro")
    @Validation(required = true)
    public String synchro;

    @NameInMap("Data")
    @Validation(required = true)
    public GetEndpointSwitchTaskResponseData data;

    public static GetEndpointSwitchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointSwitchTaskResponse self = new GetEndpointSwitchTaskResponse();
        return TeaModel.build(map, self);
    }

    public GetEndpointSwitchTaskResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEndpointSwitchTaskResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEndpointSwitchTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEndpointSwitchTaskResponse setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetEndpointSwitchTaskResponse setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public GetEndpointSwitchTaskResponse setData(GetEndpointSwitchTaskResponseData data) {
        this.data = data;
        return this;
    }
    public GetEndpointSwitchTaskResponseData getData() {
        return this.data;
    }

    public static class GetEndpointSwitchTaskResponseData extends TeaModel {
        @NameInMap("AccountId")
        @Validation(required = true)
        public String accountId;

        @NameInMap("DbLinkId")
        @Validation(required = true)
        public Long dbLinkId;

        @NameInMap("TaskId")
        @Validation(required = true)
        public String taskId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("OriUuid")
        @Validation(required = true)
        public String oriUuid;

        @NameInMap("Uuid")
        @Validation(required = true)
        public String uuid;

        @NameInMap("ErrMsg")
        @Validation(required = true)
        public String errMsg;

        public static GetEndpointSwitchTaskResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetEndpointSwitchTaskResponseData self = new GetEndpointSwitchTaskResponseData();
            return TeaModel.build(map, self);
        }

        public GetEndpointSwitchTaskResponseData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetEndpointSwitchTaskResponseData setDbLinkId(Long dbLinkId) {
            this.dbLinkId = dbLinkId;
            return this;
        }
        public Long getDbLinkId() {
            return this.dbLinkId;
        }

        public GetEndpointSwitchTaskResponseData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetEndpointSwitchTaskResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEndpointSwitchTaskResponseData setOriUuid(String oriUuid) {
            this.oriUuid = oriUuid;
            return this;
        }
        public String getOriUuid() {
            return this.oriUuid;
        }

        public GetEndpointSwitchTaskResponseData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public GetEndpointSwitchTaskResponseData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

}
