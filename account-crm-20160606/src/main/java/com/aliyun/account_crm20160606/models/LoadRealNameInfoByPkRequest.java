// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class LoadRealNameInfoByPkRequest extends TeaModel {
    @NameInMap("PK")
    public String PK;

    public static LoadRealNameInfoByPkRequest build(java.util.Map<String, ?> map) throws Exception {
        LoadRealNameInfoByPkRequest self = new LoadRealNameInfoByPkRequest();
        return TeaModel.build(map, self);
    }

    public LoadRealNameInfoByPkRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

}
