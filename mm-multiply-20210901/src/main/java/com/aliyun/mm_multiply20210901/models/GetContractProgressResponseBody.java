// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetContractProgressResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    // contractProgressModels
    @NameInMap("ContractProgressModels")
    public java.util.List<GetContractProgressResponseBodyContractProgressModels> contractProgressModels;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetContractProgressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContractProgressResponseBody self = new GetContractProgressResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContractProgressResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetContractProgressResponseBody setContractProgressModels(java.util.List<GetContractProgressResponseBodyContractProgressModels> contractProgressModels) {
        this.contractProgressModels = contractProgressModels;
        return this;
    }
    public java.util.List<GetContractProgressResponseBodyContractProgressModels> getContractProgressModels() {
        return this.contractProgressModels;
    }

    public GetContractProgressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContractProgressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContractProgressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContractProgressResponseBodyContractProgressModels extends TeaModel {
        // 行为
        @NameInMap("Action")
        public String action;

        // 行为描述
        @NameInMap("ActionDescription")
        public String actionDescription;

        // 合同ID
        @NameInMap("ContractId")
        public String contractId;

        // 合同名称
        @NameInMap("ContractName")
        public String contractName;

        // 合同状态
        @NameInMap("ContractStatus")
        public String contractStatus;

        // extInfo
        @NameInMap("ExtInfo")
        public java.util.Map<String, ?> extInfo;

        // id
        @NameInMap("Id")
        public String id;

        // 时间
        @NameInMap("Time")
        public String time;

        public static GetContractProgressResponseBodyContractProgressModels build(java.util.Map<String, ?> map) throws Exception {
            GetContractProgressResponseBodyContractProgressModels self = new GetContractProgressResponseBodyContractProgressModels();
            return TeaModel.build(map, self);
        }

        public GetContractProgressResponseBodyContractProgressModels setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetContractProgressResponseBodyContractProgressModels setActionDescription(String actionDescription) {
            this.actionDescription = actionDescription;
            return this;
        }
        public String getActionDescription() {
            return this.actionDescription;
        }

        public GetContractProgressResponseBodyContractProgressModels setContractId(String contractId) {
            this.contractId = contractId;
            return this;
        }
        public String getContractId() {
            return this.contractId;
        }

        public GetContractProgressResponseBodyContractProgressModels setContractName(String contractName) {
            this.contractName = contractName;
            return this;
        }
        public String getContractName() {
            return this.contractName;
        }

        public GetContractProgressResponseBodyContractProgressModels setContractStatus(String contractStatus) {
            this.contractStatus = contractStatus;
            return this;
        }
        public String getContractStatus() {
            return this.contractStatus;
        }

        public GetContractProgressResponseBodyContractProgressModels setExtInfo(java.util.Map<String, ?> extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public java.util.Map<String, ?> getExtInfo() {
            return this.extInfo;
        }

        public GetContractProgressResponseBodyContractProgressModels setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetContractProgressResponseBodyContractProgressModels setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
