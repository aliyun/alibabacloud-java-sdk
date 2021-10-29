// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlConcurrencyControlRulesHistoryRequest extends TeaModel {
    @NameInMap("ConsoleContext")
    public String consoleContext;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    public static GetSqlConcurrencyControlRulesHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSqlConcurrencyControlRulesHistoryRequest self = new GetSqlConcurrencyControlRulesHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetSqlConcurrencyControlRulesHistoryRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetSqlConcurrencyControlRulesHistoryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetSqlConcurrencyControlRulesHistoryRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetSqlConcurrencyControlRulesHistoryRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
