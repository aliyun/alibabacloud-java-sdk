// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CheckCardUsedOrNotResponseBody extends TeaModel {
    @NameInMap("Data")
    public CheckCardUsedOrNotResponseBodyData data;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("code")
    public String code;

    public static CheckCardUsedOrNotResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckCardUsedOrNotResponseBody self = new CheckCardUsedOrNotResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckCardUsedOrNotResponseBody setData(CheckCardUsedOrNotResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckCardUsedOrNotResponseBodyData getData() {
        return this.data;
    }

    public CheckCardUsedOrNotResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckCardUsedOrNotResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckCardUsedOrNotResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckCardUsedOrNotResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class CheckCardUsedOrNotResponseBodyDataSopList extends TeaModel {
        // xflow id
        @NameInMap("FlowId")
        public Long flowId;

        // sop code
        @NameInMap("SopCode")
        public String sopCode;

        // sop名称
        @NameInMap("SopName")
        public String sopName;

        // 状态
        @NameInMap("Status")
        public String status;

        // 状态描述
        @NameInMap("StatusDesc")
        public String statusDesc;

        public static CheckCardUsedOrNotResponseBodyDataSopList build(java.util.Map<String, ?> map) throws Exception {
            CheckCardUsedOrNotResponseBodyDataSopList self = new CheckCardUsedOrNotResponseBodyDataSopList();
            return TeaModel.build(map, self);
        }

        public CheckCardUsedOrNotResponseBodyDataSopList setFlowId(Long flowId) {
            this.flowId = flowId;
            return this;
        }
        public Long getFlowId() {
            return this.flowId;
        }

        public CheckCardUsedOrNotResponseBodyDataSopList setSopCode(String sopCode) {
            this.sopCode = sopCode;
            return this;
        }
        public String getSopCode() {
            return this.sopCode;
        }

        public CheckCardUsedOrNotResponseBodyDataSopList setSopName(String sopName) {
            this.sopName = sopName;
            return this;
        }
        public String getSopName() {
            return this.sopName;
        }

        public CheckCardUsedOrNotResponseBodyDataSopList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CheckCardUsedOrNotResponseBodyDataSopList setStatusDesc(String statusDesc) {
            this.statusDesc = statusDesc;
            return this;
        }
        public String getStatusDesc() {
            return this.statusDesc;
        }

    }

    public static class CheckCardUsedOrNotResponseBodyData extends TeaModel {
        // 卡片是否被使用
        @NameInMap("CheckResult")
        public Boolean checkResult;

        // 使用该卡片的sop
        @NameInMap("SopList")
        public java.util.List<CheckCardUsedOrNotResponseBodyDataSopList> sopList;

        public static CheckCardUsedOrNotResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckCardUsedOrNotResponseBodyData self = new CheckCardUsedOrNotResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckCardUsedOrNotResponseBodyData setCheckResult(Boolean checkResult) {
            this.checkResult = checkResult;
            return this;
        }
        public Boolean getCheckResult() {
            return this.checkResult;
        }

        public CheckCardUsedOrNotResponseBodyData setSopList(java.util.List<CheckCardUsedOrNotResponseBodyDataSopList> sopList) {
            this.sopList = sopList;
            return this;
        }
        public java.util.List<CheckCardUsedOrNotResponseBodyDataSopList> getSopList() {
            return this.sopList;
        }

    }

}
