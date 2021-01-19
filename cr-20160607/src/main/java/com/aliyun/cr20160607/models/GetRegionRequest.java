// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20160607.models;

import com.aliyun.tea.*;

public class GetRegionRequest extends TeaModel {
    @NameInMap("Domain")
    public String domain;

    public static GetRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegionRequest self = new GetRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetRegionRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
