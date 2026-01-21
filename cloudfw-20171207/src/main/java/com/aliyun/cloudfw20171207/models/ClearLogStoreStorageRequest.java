// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ClearLogStoreStorageRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Site")
    public String site;

    public static ClearLogStoreStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        ClearLogStoreStorageRequest self = new ClearLogStoreStorageRequest();
        return TeaModel.build(map, self);
    }

    public ClearLogStoreStorageRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

}
