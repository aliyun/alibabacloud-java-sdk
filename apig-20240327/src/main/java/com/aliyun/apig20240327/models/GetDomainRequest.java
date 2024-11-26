// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetDomainRequest extends TeaModel {
    @NameInMap("withStatistics")
    public Boolean withStatistics;

    public static GetDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDomainRequest self = new GetDomainRequest();
        return TeaModel.build(map, self);
    }

    public GetDomainRequest setWithStatistics(Boolean withStatistics) {
        this.withStatistics = withStatistics;
        return this;
    }
    public Boolean getWithStatistics() {
        return this.withStatistics;
    }

}
