// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRunningSqlConcurrencyControlRulesRequest extends TeaModel {
    /**
     * <p>The reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("ConsoleContext")
    public String consoleContext;

    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p> You must specify this parameter only if your database instance is an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The page number. The value must be a positive integer. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page. The value must be a positive integer. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    public static GetRunningSqlConcurrencyControlRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRunningSqlConcurrencyControlRulesRequest self = new GetRunningSqlConcurrencyControlRulesRequest();
        return TeaModel.build(map, self);
    }

    public GetRunningSqlConcurrencyControlRulesRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public GetRunningSqlConcurrencyControlRulesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRunningSqlConcurrencyControlRulesRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetRunningSqlConcurrencyControlRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
