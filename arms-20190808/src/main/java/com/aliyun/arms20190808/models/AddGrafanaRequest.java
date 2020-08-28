// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddGrafanaRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClusterId")
    @Validation(required = true)
    public String clusterId;

    @NameInMap("Integration")
    @Validation(required = true)
    public String integration;

    public static AddGrafanaRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGrafanaRequest self = new AddGrafanaRequest();
        return TeaModel.build(map, self);
    }

}
