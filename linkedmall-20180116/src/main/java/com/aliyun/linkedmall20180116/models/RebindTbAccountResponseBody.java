// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RebindTbAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public RebindTbAccountResponseBodyModel model;

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

    public static RebindTbAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RebindTbAccountResponseBody self = new RebindTbAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public RebindTbAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RebindTbAccountResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public RebindTbAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RebindTbAccountResponseBody setModel(RebindTbAccountResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public RebindTbAccountResponseBodyModel getModel() {
        return this.model;
    }

    public RebindTbAccountResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public RebindTbAccountResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public RebindTbAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RebindTbAccountResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public RebindTbAccountResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public RebindTbAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public RebindTbAccountResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class RebindTbAccountResponseBodyModel extends TeaModel {
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

        public static RebindTbAccountResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            RebindTbAccountResponseBodyModel self = new RebindTbAccountResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public RebindTbAccountResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public RebindTbAccountResponseBodyModel setCUserId(String CUserId) {
            this.CUserId = CUserId;
            return this;
        }
        public String getCUserId() {
            return this.CUserId;
        }

        public RebindTbAccountResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public RebindTbAccountResponseBodyModel setLmUid(Long lmUid) {
            this.lmUid = lmUid;
            return this;
        }
        public Long getLmUid() {
            return this.lmUid;
        }

        public RebindTbAccountResponseBodyModel setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public RebindTbAccountResponseBodyModel setTbAccountType(String tbAccountType) {
            this.tbAccountType = tbAccountType;
            return this;
        }
        public String getTbAccountType() {
            return this.tbAccountType;
        }

        public RebindTbAccountResponseBodyModel setTbUserId(Long tbUserId) {
            this.tbUserId = tbUserId;
            return this;
        }
        public Long getTbUserId() {
            return this.tbUserId;
        }

    }

}
