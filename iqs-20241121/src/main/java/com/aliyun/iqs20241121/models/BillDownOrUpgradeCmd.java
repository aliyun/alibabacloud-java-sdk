// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class BillDownOrUpgradeCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("activeDate")
    public String activeDate;

    @NameInMap("codeType")
    public String codeType;

    @NameInMap("operateTypEnum")
    public String operateTypEnum;

    @NameInMap("qps")
    public Integer qps;

    public static BillDownOrUpgradeCmd build(java.util.Map<String, ?> map) throws Exception {
        BillDownOrUpgradeCmd self = new BillDownOrUpgradeCmd();
        return TeaModel.build(map, self);
    }

    public BillDownOrUpgradeCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public BillDownOrUpgradeCmd setActiveDate(String activeDate) {
        this.activeDate = activeDate;
        return this;
    }
    public String getActiveDate() {
        return this.activeDate;
    }

    public BillDownOrUpgradeCmd setCodeType(String codeType) {
        this.codeType = codeType;
        return this;
    }
    public String getCodeType() {
        return this.codeType;
    }

    public BillDownOrUpgradeCmd setOperateTypEnum(String operateTypEnum) {
        this.operateTypEnum = operateTypEnum;
        return this;
    }
    public String getOperateTypEnum() {
        return this.operateTypEnum;
    }

    public BillDownOrUpgradeCmd setQps(Integer qps) {
        this.qps = qps;
        return this;
    }
    public Integer getQps() {
        return this.qps;
    }

}
