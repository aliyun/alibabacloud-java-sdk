// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ListProductVersionRelatedFoundationComponentVersionsRequest extends TeaModel {
    @NameInMap("onlyEnabled")
    public Boolean onlyEnabled;

    public static ListProductVersionRelatedFoundationComponentVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductVersionRelatedFoundationComponentVersionsRequest self = new ListProductVersionRelatedFoundationComponentVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductVersionRelatedFoundationComponentVersionsRequest setOnlyEnabled(Boolean onlyEnabled) {
        this.onlyEnabled = onlyEnabled;
        return this;
    }
    public Boolean getOnlyEnabled() {
        return this.onlyEnabled;
    }

}
