// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class ListCallbackRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCallbackRequest self = new ListCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ListCallbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
