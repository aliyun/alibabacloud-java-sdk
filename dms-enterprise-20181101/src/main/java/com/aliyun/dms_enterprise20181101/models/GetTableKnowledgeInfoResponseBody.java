// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableKnowledgeInfoResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Table")
    public TableKnowledgeInfo table;

    public static GetTableKnowledgeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTableKnowledgeInfoResponseBody self = new GetTableKnowledgeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTableKnowledgeInfoResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetTableKnowledgeInfoResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetTableKnowledgeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetTableKnowledgeInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetTableKnowledgeInfoResponseBody setTable(TableKnowledgeInfo table) {
        this.table = table;
        return this;
    }
    public TableKnowledgeInfo getTable() {
        return this.table;
    }

}
