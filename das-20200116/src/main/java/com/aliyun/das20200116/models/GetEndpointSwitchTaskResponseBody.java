// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetEndpointSwitchTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetEndpointSwitchTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    @NameInMap("Synchro")
    public String synchro;

    public static GetEndpointSwitchTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEndpointSwitchTaskResponseBody self = new GetEndpointSwitchTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEndpointSwitchTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEndpointSwitchTaskResponseBody setData(GetEndpointSwitchTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEndpointSwitchTaskResponseBodyData getData() {
        return this.data;
    }

    public GetEndpointSwitchTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetEndpointSwitchTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEndpointSwitchTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public GetEndpointSwitchTaskResponseBody setSynchro(String synchro) {
        this.synchro = synchro;
        return this;
    }
    public String getSynchro() {
        return this.synchro;
    }

    public static class GetEndpointSwitchTaskResponseBodyData extends TeaModel {
        @NameInMap("AccountId")
        public String accountId;

        @NameInMap("DbLinkId")
        public Long dbLinkId;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("OriUuid")
        public String oriUuid;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("Uuid")
        public String uuid;

        public static GetEndpointSwitchTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEndpointSwitchTaskResponseBodyData self = new GetEndpointSwitchTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEndpointSwitchTaskResponseBodyData setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public GetEndpointSwitchTaskResponseBodyData setDbLinkId(Long dbLinkId) {
            this.dbLinkId = dbLinkId;
            return this;
        }
        public Long getDbLinkId() {
            return this.dbLinkId;
        }

        public GetEndpointSwitchTaskResponseBodyData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public GetEndpointSwitchTaskResponseBodyData setOriUuid(String oriUuid) {
            this.oriUuid = oriUuid;
            return this;
        }
        public String getOriUuid() {
            return this.oriUuid;
        }

        public GetEndpointSwitchTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEndpointSwitchTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetEndpointSwitchTaskResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
