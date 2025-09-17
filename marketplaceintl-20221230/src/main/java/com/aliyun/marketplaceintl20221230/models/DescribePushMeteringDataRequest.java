// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketplaceintl20221230.models;

import com.aliyun.tea.*;

public class DescribePushMeteringDataRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pushData123456</p>
     */
    @NameInMap("PushOrderBizId")
    public String pushOrderBizId;

    public static DescribePushMeteringDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePushMeteringDataRequest self = new DescribePushMeteringDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribePushMeteringDataRequest setPushOrderBizId(String pushOrderBizId) {
        this.pushOrderBizId = pushOrderBizId;
        return this;
    }
    public String getPushOrderBizId() {
        return this.pushOrderBizId;
    }

}
