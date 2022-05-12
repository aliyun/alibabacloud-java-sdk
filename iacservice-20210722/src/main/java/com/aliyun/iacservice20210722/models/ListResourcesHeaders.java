// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210722.models;

import com.aliyun.tea.*;

public class ListResourcesHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("x-roag-cache")
    public Boolean xRoagCache;

    public static ListResourcesHeaders build(java.util.Map<String, ?> map) throws Exception {
        ListResourcesHeaders self = new ListResourcesHeaders();
        return TeaModel.build(map, self);
    }

    public ListResourcesHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public ListResourcesHeaders setXRoagCache(Boolean xRoagCache) {
        this.xRoagCache = xRoagCache;
        return this;
    }
    public Boolean getXRoagCache() {
        return this.xRoagCache;
    }

}
