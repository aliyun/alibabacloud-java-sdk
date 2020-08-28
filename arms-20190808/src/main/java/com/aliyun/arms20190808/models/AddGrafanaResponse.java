// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddGrafanaResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public String data;

    public static AddGrafanaResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGrafanaResponse self = new AddGrafanaResponse();
        return TeaModel.build(map, self);
    }

}
