// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331.models;

import com.aliyun.tea.*;

public class GetAllEdgeDevicesRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    public static GetAllEdgeDevicesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAllEdgeDevicesRequest self = new GetAllEdgeDevicesRequest();
        return TeaModel.build(map, self);
    }

    public GetAllEdgeDevicesRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
