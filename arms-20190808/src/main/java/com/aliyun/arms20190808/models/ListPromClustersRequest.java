// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPromClustersRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static ListPromClustersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPromClustersRequest self = new ListPromClustersRequest();
        return TeaModel.build(map, self);
    }

}
