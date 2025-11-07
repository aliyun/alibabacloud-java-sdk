// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DeleteAllCustomizeFlowStrategyRequest extends TeaModel {
    /**
     * <p>Region ID</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>User ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>126005125163xxxx</p>
     */
    @NameInMap("UserId")
    public Long userId;

    public static DeleteAllCustomizeFlowStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAllCustomizeFlowStrategyRequest self = new DeleteAllCustomizeFlowStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAllCustomizeFlowStrategyRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAllCustomizeFlowStrategyRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
