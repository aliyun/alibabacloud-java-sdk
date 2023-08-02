// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class GetDataServiceApiContextRequest extends TeaModel {
    /**
     * <p>apiId</p>
     */
    @NameInMap("ApiId")
    public Long apiId;

    @NameInMap("ApiStatus")
    public Integer apiStatus;

    @NameInMap("CacheKey")
    public String cacheKey;

    @NameInMap("ForPrivateResGroup")
    public Boolean forPrivateResGroup;

    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetDataServiceApiContextRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataServiceApiContextRequest self = new GetDataServiceApiContextRequest();
        return TeaModel.build(map, self);
    }

    public GetDataServiceApiContextRequest setApiId(Long apiId) {
        this.apiId = apiId;
        return this;
    }
    public Long getApiId() {
        return this.apiId;
    }

    public GetDataServiceApiContextRequest setApiStatus(Integer apiStatus) {
        this.apiStatus = apiStatus;
        return this;
    }
    public Integer getApiStatus() {
        return this.apiStatus;
    }

    public GetDataServiceApiContextRequest setCacheKey(String cacheKey) {
        this.cacheKey = cacheKey;
        return this;
    }
    public String getCacheKey() {
        return this.cacheKey;
    }

    public GetDataServiceApiContextRequest setForPrivateResGroup(Boolean forPrivateResGroup) {
        this.forPrivateResGroup = forPrivateResGroup;
        return this;
    }
    public Boolean getForPrivateResGroup() {
        return this.forPrivateResGroup;
    }

    public GetDataServiceApiContextRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
