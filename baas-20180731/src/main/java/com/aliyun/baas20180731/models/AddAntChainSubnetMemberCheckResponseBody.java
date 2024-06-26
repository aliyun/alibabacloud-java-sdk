// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class AddAntChainSubnetMemberCheckResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public AddAntChainSubnetMemberCheckResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static AddAntChainSubnetMemberCheckResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAntChainSubnetMemberCheckResponseBody self = new AddAntChainSubnetMemberCheckResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAntChainSubnetMemberCheckResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddAntChainSubnetMemberCheckResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddAntChainSubnetMemberCheckResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddAntChainSubnetMemberCheckResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddAntChainSubnetMemberCheckResponseBody setResult(AddAntChainSubnetMemberCheckResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public AddAntChainSubnetMemberCheckResponseBodyResult getResult() {
        return this.result;
    }

    public AddAntChainSubnetMemberCheckResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddAntChainSubnetMemberCheckResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public AddAntChainSubnetMemberCheckResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddAntChainSubnetMemberCheckResponseBodyResultConsortiumMemberInfoList extends TeaModel {
        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        public static AddAntChainSubnetMemberCheckResponseBodyResultConsortiumMemberInfoList build(java.util.Map<String, ?> map) throws Exception {
            AddAntChainSubnetMemberCheckResponseBodyResultConsortiumMemberInfoList self = new AddAntChainSubnetMemberCheckResponseBodyResultConsortiumMemberInfoList();
            return TeaModel.build(map, self);
        }

        public AddAntChainSubnetMemberCheckResponseBodyResultConsortiumMemberInfoList setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public AddAntChainSubnetMemberCheckResponseBodyResultConsortiumMemberInfoList setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

    }

    public static class AddAntChainSubnetMemberCheckResponseBodyResult extends TeaModel {
        @NameInMap("ConsortiumMemberInfoList")
        public java.util.List<AddAntChainSubnetMemberCheckResponseBodyResultConsortiumMemberInfoList> consortiumMemberInfoList;

        public static AddAntChainSubnetMemberCheckResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            AddAntChainSubnetMemberCheckResponseBodyResult self = new AddAntChainSubnetMemberCheckResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public AddAntChainSubnetMemberCheckResponseBodyResult setConsortiumMemberInfoList(java.util.List<AddAntChainSubnetMemberCheckResponseBodyResultConsortiumMemberInfoList> consortiumMemberInfoList) {
            this.consortiumMemberInfoList = consortiumMemberInfoList;
            return this;
        }
        public java.util.List<AddAntChainSubnetMemberCheckResponseBodyResultConsortiumMemberInfoList> getConsortiumMemberInfoList() {
            return this.consortiumMemberInfoList;
        }

    }

}
