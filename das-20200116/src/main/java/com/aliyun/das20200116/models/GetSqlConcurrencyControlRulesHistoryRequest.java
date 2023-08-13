// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetSqlConcurrencyControlRulesHistoryRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The instance ID.</p>
     * <br>
     * <p>>  Only ApsaraDB RDS for MySQL instances and PolarDB for MySQL clusters are supported.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The value must be an integer that is greater than 0. Default value: 1.</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. The value must be an integer that is greater than 0. Default value: 10.</p>
     */
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
