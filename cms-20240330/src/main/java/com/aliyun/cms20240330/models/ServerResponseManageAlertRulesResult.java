// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ServerResponseManageAlertRulesResult extends TeaModel {
    /**
     * <p>The response code.</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ManageAlertRulesResult data;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The pagination token.</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of entries.</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ServerResponseManageAlertRulesResult build(java.util.Map<String, ?> map) throws Exception {
        ServerResponseManageAlertRulesResult self = new ServerResponseManageAlertRulesResult();
        return TeaModel.build(map, self);
    }

    public ServerResponseManageAlertRulesResult setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ServerResponseManageAlertRulesResult setData(ManageAlertRulesResult data) {
        this.data = data;
        return this;
    }
    public ManageAlertRulesResult getData() {
        return this.data;
    }

    public ServerResponseManageAlertRulesResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ServerResponseManageAlertRulesResult setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ServerResponseManageAlertRulesResult setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ServerResponseManageAlertRulesResult setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ServerResponseManageAlertRulesResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ServerResponseManageAlertRulesResult setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ServerResponseManageAlertRulesResult setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
