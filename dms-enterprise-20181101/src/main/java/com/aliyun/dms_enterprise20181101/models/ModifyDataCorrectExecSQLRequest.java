// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyDataCorrectExecSQLRequest extends TeaModel {
    /**
     * <p>The new SQL script.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>update tb set id = 1 where id = 1;</p>
     */
    @NameInMap("ExecSQL")
    public String execSQL;

    /**
     * <p>The ID of the data change ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4328****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4****</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ModifyDataCorrectExecSQLRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataCorrectExecSQLRequest self = new ModifyDataCorrectExecSQLRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataCorrectExecSQLRequest setExecSQL(String execSQL) {
        this.execSQL = execSQL;
        return this;
    }
    public String getExecSQL() {
        return this.execSQL;
    }

    public ModifyDataCorrectExecSQLRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ModifyDataCorrectExecSQLRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
