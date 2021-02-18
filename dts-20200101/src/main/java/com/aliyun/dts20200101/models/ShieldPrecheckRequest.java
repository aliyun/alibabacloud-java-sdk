// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ShieldPrecheckRequest extends TeaModel {
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("PrecheckItems")
    public String precheckItems;

    public static ShieldPrecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        ShieldPrecheckRequest self = new ShieldPrecheckRequest();
        return TeaModel.build(map, self);
    }

    public ShieldPrecheckRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ShieldPrecheckRequest setPrecheckItems(String precheckItems) {
        this.precheckItems = precheckItems;
        return this;
    }
    public String getPrecheckItems() {
        return this.precheckItems;
    }

}
