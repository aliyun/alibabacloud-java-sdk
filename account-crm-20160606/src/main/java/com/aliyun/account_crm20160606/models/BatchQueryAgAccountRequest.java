// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class BatchQueryAgAccountRequest extends TeaModel {
    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("PkList")
    public String pkList;

    public static BatchQueryAgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryAgAccountRequest self = new BatchQueryAgAccountRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryAgAccountRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public BatchQueryAgAccountRequest setPkList(String pkList) {
        this.pkList = pkList;
        return this;
    }
    public String getPkList() {
        return this.pkList;
    }

}
