// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class QueryUserAccountResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("LogsId")
    public String logsId;

    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public QueryUserAccountResponseBodyModel model;

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

    public static QueryUserAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryUserAccountResponseBody self = new QueryUserAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryUserAccountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryUserAccountResponseBody setLogsId(String logsId) {
        this.logsId = logsId;
        return this;
    }
    public String getLogsId() {
        return this.logsId;
    }

    public QueryUserAccountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryUserAccountResponseBody setModel(QueryUserAccountResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public QueryUserAccountResponseBodyModel getModel() {
        return this.model;
    }

    public QueryUserAccountResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryUserAccountResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryUserAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryUserAccountResponseBody setSubCode(String subCode) {
        this.subCode = subCode;
        return this;
    }
    public String getSubCode() {
        return this.subCode;
    }

    public QueryUserAccountResponseBody setSubMessage(String subMessage) {
        this.subMessage = subMessage;
        return this;
    }
    public String getSubMessage() {
        return this.subMessage;
    }

    public QueryUserAccountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryUserAccountResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryUserAccountResponseBodyModel extends TeaModel {
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

        public static QueryUserAccountResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            QueryUserAccountResponseBodyModel self = new QueryUserAccountResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public QueryUserAccountResponseBodyModel setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryUserAccountResponseBodyModel setCUserId(String CUserId) {
            this.CUserId = CUserId;
            return this;
        }
        public String getCUserId() {
            return this.CUserId;
        }

        public QueryUserAccountResponseBodyModel setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public QueryUserAccountResponseBodyModel setLmUid(Long lmUid) {
            this.lmUid = lmUid;
            return this;
        }
        public Long getLmUid() {
            return this.lmUid;
        }

        public QueryUserAccountResponseBodyModel setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public QueryUserAccountResponseBodyModel setTbAccountType(String tbAccountType) {
            this.tbAccountType = tbAccountType;
            return this;
        }
        public String getTbAccountType() {
            return this.tbAccountType;
        }

        public QueryUserAccountResponseBodyModel setTbUserId(Long tbUserId) {
            this.tbUserId = tbUserId;
            return this;
        }
        public Long getTbUserId() {
            return this.tbUserId;
        }

    }

}
