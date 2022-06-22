// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryHelmPackageAddressRequest extends TeaModel {
    @NameInMap("AhasRegionId")
    public String ahasRegionId;

    @NameInMap("Namespace")
    public String namespace;

    public static QueryHelmPackageAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHelmPackageAddressRequest self = new QueryHelmPackageAddressRequest();
        return TeaModel.build(map, self);
    }

    public QueryHelmPackageAddressRequest setAhasRegionId(String ahasRegionId) {
        this.ahasRegionId = ahasRegionId;
        return this;
    }
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    public QueryHelmPackageAddressRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

}
