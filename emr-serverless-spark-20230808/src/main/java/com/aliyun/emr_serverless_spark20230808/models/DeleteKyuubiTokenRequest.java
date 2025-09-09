// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class DeleteKyuubiTokenRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static DeleteKyuubiTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteKyuubiTokenRequest self = new DeleteKyuubiTokenRequest();
        return TeaModel.build(map, self);
    }

    public DeleteKyuubiTokenRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
