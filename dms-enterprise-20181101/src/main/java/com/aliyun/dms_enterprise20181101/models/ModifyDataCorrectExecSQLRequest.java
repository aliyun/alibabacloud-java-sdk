// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ModifyDataCorrectExecSQLRequest extends TeaModel {
    @NameInMap("ExecSQL")
    public String execSQL;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RegionId")
    public String regionId;

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

    public ModifyDataCorrectExecSQLRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDataCorrectExecSQLRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
