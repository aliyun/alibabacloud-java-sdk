// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class MssOpenApiCreateSingleDataRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MssSyncOrderJsonStr")
    public String mssSyncOrderJsonStr;

    public static MssOpenApiCreateSingleDataRequest build(java.util.Map<String, ?> map) throws Exception {
        MssOpenApiCreateSingleDataRequest self = new MssOpenApiCreateSingleDataRequest();
        return TeaModel.build(map, self);
    }

    public MssOpenApiCreateSingleDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MssOpenApiCreateSingleDataRequest setMssSyncOrderJsonStr(String mssSyncOrderJsonStr) {
        this.mssSyncOrderJsonStr = mssSyncOrderJsonStr;
        return this;
    }
    public String getMssSyncOrderJsonStr() {
        return this.mssSyncOrderJsonStr;
    }

}
