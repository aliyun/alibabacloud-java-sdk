// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class QueryCallbackRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckForOss")
    public Boolean checkForOss;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11234</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static QueryCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCallbackRequest self = new QueryCallbackRequest();
        return TeaModel.build(map, self);
    }

    public QueryCallbackRequest setCheckForOss(Boolean checkForOss) {
        this.checkForOss = checkForOss;
        return this;
    }
    public Boolean getCheckForOss() {
        return this.checkForOss;
    }

    public QueryCallbackRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public QueryCallbackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
