// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DescribeFcRegionRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    public static DescribeFcRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFcRegionRequest self = new DescribeFcRegionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFcRegionRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
