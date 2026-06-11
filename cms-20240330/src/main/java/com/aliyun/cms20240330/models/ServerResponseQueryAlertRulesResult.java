// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ServerResponseQueryAlertRulesResult extends TeaModel {
    /**
     * <p>The status code of the response. A status code of <code>200</code> indicates a successful request.</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response payload.</p>
     */
    @NameInMap("data")
    public QueryAlertRulesResult data;

    /**
     * <p>The response message. If the request fails, this field contains details about the error.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The token to retrieve the next page of results. A null value indicates that no more results are available.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The current page number.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The unique request ID, used for troubleshooting.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: <code>true</code> and <code>false</code>.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of alert rules that match the query.</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ServerResponseQueryAlertRulesResult build(java.util.Map<String, ?> map) throws Exception {
        ServerResponseQueryAlertRulesResult self = new ServerResponseQueryAlertRulesResult();
        return TeaModel.build(map, self);
    }

    public ServerResponseQueryAlertRulesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ServerResponseQueryAlertRulesResult setData(QueryAlertRulesResult data) {
        this.data = data;
        return this;
    }
    public QueryAlertRulesResult getData() {
        return this.data;
    }

    public ServerResponseQueryAlertRulesResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ServerResponseQueryAlertRulesResult setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ServerResponseQueryAlertRulesResult setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ServerResponseQueryAlertRulesResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ServerResponseQueryAlertRulesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ServerResponseQueryAlertRulesResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ServerResponseQueryAlertRulesResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
