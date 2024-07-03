// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class DisableSqlConcurrencyControlRequest extends TeaModel {
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
     * <p> The database instance must be an ApsaraDB RDS for MySQL instance or a PolarDB for MySQL cluster.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-2ze1jdv45i7l6****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the throttling rule that is applied to the instance. You can call the <a href="https://help.aliyun.com/document_detail/223538.html">GetRunningSqlConcurrencyControlRules</a> operation to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ItemId")
    public Long itemId;

    public static DisableSqlConcurrencyControlRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableSqlConcurrencyControlRequest self = new DisableSqlConcurrencyControlRequest();
        return TeaModel.build(map, self);
    }

    public DisableSqlConcurrencyControlRequest setConsoleContext(String consoleContext) {
        this.consoleContext = consoleContext;
        return this;
    }
    public String getConsoleContext() {
        return this.consoleContext;
    }

    public DisableSqlConcurrencyControlRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DisableSqlConcurrencyControlRequest setItemId(Long itemId) {
        this.itemId = itemId;
        return this;
    }
    public Long getItemId() {
        return this.itemId;
    }

}
