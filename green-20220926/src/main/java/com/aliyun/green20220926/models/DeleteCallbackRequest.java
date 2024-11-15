// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteCallbackRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1480</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCallbackRequest self = new DeleteCallbackRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCallbackRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DeleteCallbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
