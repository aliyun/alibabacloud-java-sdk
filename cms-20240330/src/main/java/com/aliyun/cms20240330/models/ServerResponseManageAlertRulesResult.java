// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ServerResponseManageAlertRulesResult extends TeaModel {
    /**
     * <p>响应码</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ManageAlertRulesResult data;

    /**
     * <p>错误消息</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>分页 Token</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>页码</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>每页大小</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>请求 ID</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>是否成功</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>总数</p>
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
