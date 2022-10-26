// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RegisterUserAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public RegisterUserAccountResponseBodyModel model;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubCode")
    public String subCode;

    @NameInMap("SubMessage")
    public String subMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static RegisterUserAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RegisterUserAccountResponseBody self = new RegisterUserAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public RegisterUserAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RegisterUserAccountResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RegisterUserAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RegisterUserAccountResponseBody setModel(RegisterUserAccountResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RegisterUserAccountResponseBodyModel getModel() {
        return this.model;
    }

    public RegisterUserAccountResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public RegisterUserAccountResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public RegisterUserAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RegisterUserAccountResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RegisterUserAccountResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RegisterUserAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RegisterUserAccountResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class RegisterUserAccountResponseBodyModel extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("CUserId")
        public String CUserId;

        @NameInMap("ExtInfo")
        public String extInfo;

        @NameInMap("LmUid")
        public Long lmUid;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("TbAccountType")
        public String tbAccountType;

        @NameInMap("TbUserId")
        public Long tbUserId;

        public static RegisterUserAccountResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RegisterUserAccountResponseBodyModel self = new RegisterUserAccountResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RegisterUserAccountResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public RegisterUserAccountResponseBodyModel setCUserId(String CUserId) {
            this.CUserId = CUserId;
            return this;
        }
        public String getCUserId() {
            return this.CUserId;
        }

        public RegisterUserAccountResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public RegisterUserAccountResponseBodyModel setLmUid(Long lmUid) {
            this.lmUid = lmUid;
            return this;
        }
        public Long getLmUid() {
            return this.lmUid;
        }

        public RegisterUserAccountResponseBodyModel setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RegisterUserAccountResponseBodyModel setTbAccountType(String tbAccountType) {
            this.tbAccountType = tbAccountType;
            return this;
        }
        public String getTbAccountType() {
            return this.tbAccountType;
        }

        public RegisterUserAccountResponseBodyModel setTbUserId(Long tbUserId) {
            this.tbUserId = tbUserId;
            return this;
        }
        public Long getTbUserId() {
            return this.tbUserId;
        }

    }

}
