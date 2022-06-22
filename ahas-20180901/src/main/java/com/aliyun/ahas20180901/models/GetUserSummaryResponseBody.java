// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class GetUserSummaryResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetUserSummaryResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public String success;

    public static GetUserSummaryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetUserSummaryResponseBody self = new GetUserSummaryResponseBody();
        return TeaModel.build(map, self);
    }

    public GetUserSummaryResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetUserSummaryResponseBody setData(GetUserSummaryResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetUserSummaryResponseBodyData getData() {
        return this.data;
    }

    public GetUserSummaryResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetUserSummaryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetUserSummaryResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class GetUserSummaryResponseBodyData extends TeaModel {
        @NameInMap("MachineCount")
        public Long machineCount;

        @NameInMap("NameSpaceCount")
        public Long nameSpaceCount;

        @NameInMap("SwitchCount")
        public Long switchCount;

        public static GetUserSummaryResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetUserSummaryResponseBodyData self = new GetUserSummaryResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetUserSummaryResponseBodyData setMachineCount(Long machineCount) {
            this.machineCount = machineCount;
            return this;
        }
        public Long getMachineCount() {
            return this.machineCount;
        }

        public GetUserSummaryResponseBodyData setNameSpaceCount(Long nameSpaceCount) {
            this.nameSpaceCount = nameSpaceCount;
            return this;
        }
        public Long getNameSpaceCount() {
            return this.nameSpaceCount;
        }

        public GetUserSummaryResponseBodyData setSwitchCount(Long switchCount) {
            this.switchCount = switchCount;
            return this;
        }
        public Long getSwitchCount() {
            return this.switchCount;
        }

    }

}
