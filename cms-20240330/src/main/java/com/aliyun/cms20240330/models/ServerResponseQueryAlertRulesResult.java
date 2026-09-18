// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ServerResponseQueryAlertRulesResult extends TeaModel {
    /**
     * <p>The status code of the API response. A value of 200 indicates a successful request. Other values indicate an exception.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The business data returned by the API, including the list of alert rule query results and pagination information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;alertRules&quot;:[],&quot;totalCount&quot;:0}</p>
     */
    @NameInMap("data")
    public QueryAlertRulesResult data;

    /**
     * <p>The detailed error description returned when the request fails. This parameter is empty when the request succeeds.</p>
     * 
     * <strong>example:</strong>
     * <p>The request is invalid.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The token for the next page. A value of null indicates that no more pages are available.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The page number of the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of records per page in the current response.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The unique ID of the API request, used for troubleshooting and server-side log tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>A1B2C3D4-E5F6-7890-ABCD-EF1234567890</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of true indicates success. A value of false indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>The total number of alert rules that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
