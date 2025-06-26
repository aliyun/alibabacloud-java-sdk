// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListKyuubiTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static ListKyuubiTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        ListKyuubiTokenRequest self = new ListKyuubiTokenRequest();
        return TeaModel.build(map, self);
    }

    public ListKyuubiTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
