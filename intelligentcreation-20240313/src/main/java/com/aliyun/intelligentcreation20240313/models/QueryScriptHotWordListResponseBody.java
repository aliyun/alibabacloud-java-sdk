// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class QueryScriptHotWordListResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("scriptHotWordList")
    public java.util.List<AICoachScriptHotWordItem> scriptHotWordList;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("total")
    public Integer total;

    public static QueryScriptHotWordListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryScriptHotWordListResponseBody self = new QueryScriptHotWordListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryScriptHotWordListResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public QueryScriptHotWordListResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryScriptHotWordListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryScriptHotWordListResponseBody setScriptHotWordList(java.util.List<AICoachScriptHotWordItem> scriptHotWordList) {
        this.scriptHotWordList = scriptHotWordList;
        return this;
    }
    public java.util.List<AICoachScriptHotWordItem> getScriptHotWordList() {
        return this.scriptHotWordList;
    }

    public QueryScriptHotWordListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryScriptHotWordListResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
