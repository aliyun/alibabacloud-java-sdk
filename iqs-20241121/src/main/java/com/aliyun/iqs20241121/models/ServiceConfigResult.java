// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241121.models;

import com.aliyun.tea.*;

public class ServiceConfigResult extends TeaModel {
    @NameInMap("poiSearchTotalQuota")
    public String poiSearchTotalQuota;

    @NameInMap("poiSearchUsedQuota")
    public String poiSearchUsedQuota;

    @NameInMap("searchTotalQuota")
    public String searchTotalQuota;

    @NameInMap("searchUsedQuota")
    public String searchUsedQuota;

    @NameInMap("status")
    public String status;

    public static ServiceConfigResult build(java.util.Map<String, ?> map) throws Exception {
        ServiceConfigResult self = new ServiceConfigResult();
        return TeaModel.build(map, self);
    }

    public ServiceConfigResult setPoiSearchTotalQuota(String poiSearchTotalQuota) {
        this.poiSearchTotalQuota = poiSearchTotalQuota;
        return this;
    }
    public String getPoiSearchTotalQuota() {
        return this.poiSearchTotalQuota;
    }

    public ServiceConfigResult setPoiSearchUsedQuota(String poiSearchUsedQuota) {
        this.poiSearchUsedQuota = poiSearchUsedQuota;
        return this;
    }
    public String getPoiSearchUsedQuota() {
        return this.poiSearchUsedQuota;
    }

    public ServiceConfigResult setSearchTotalQuota(String searchTotalQuota) {
        this.searchTotalQuota = searchTotalQuota;
        return this;
    }
    public String getSearchTotalQuota() {
        return this.searchTotalQuota;
    }

    public ServiceConfigResult setSearchUsedQuota(String searchUsedQuota) {
        this.searchUsedQuota = searchUsedQuota;
        return this;
    }
    public String getSearchUsedQuota() {
        return this.searchUsedQuota;
    }

    public ServiceConfigResult setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
