// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dfs20180620.models;

import com.aliyun.tea.*;

public class GetRegionRequest extends TeaModel {
    @NameInMap("InputRegionId")
    public String inputRegionId;

    public static GetRegionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRegionRequest self = new GetRegionRequest();
        return TeaModel.build(map, self);
    }

    public GetRegionRequest setInputRegionId(String inputRegionId) {
        this.inputRegionId = inputRegionId;
        return this;
    }
    public String getInputRegionId() {
        return this.inputRegionId;
    }

}
