// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ServerResponseManageAlertRulesResult extends TeaModel {
    /**
     * <p>The status code of the API response. A value of 200 indicates a successful request. Other values indicate a request exception.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The business data returned by the API, which contains the execution result details of alert rule management operations such as batch enabling or disabling.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;updatedUuidList&quot;:[&quot;a1b2c3d4-e5f6-7890-abcd-ef1234567890&quot;]}</p>
     */
    @NameInMap("data")
    public ManageAlertRulesResult data;

    /**
     * <p>The error description returned when the request fails. This parameter is empty when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified alert rule UUID does not exist.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The cursor for the next page in keyset-based pagination. A value of null indicates that no more data is available. Use this value to retrieve the next page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page in the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The unique ID of the API request, which is used for troubleshooting and correlating server-side logs.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of alert rules actually affected by the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
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
