// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ClearLogStoreStorageRequest extends TeaModel {
    /**
     * <p>The name of the site. If you have only one Logstore, you can leave this parameter empty. If you have two Logstores, set this parameter to cn or intl.</p>
     * 
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
