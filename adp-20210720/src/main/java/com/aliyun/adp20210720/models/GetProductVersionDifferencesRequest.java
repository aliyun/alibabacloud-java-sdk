// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class GetProductVersionDifferencesRequest extends TeaModel {
    // 上一个产品版本id
    @NameInMap("preVersionUID")
    public String preVersionUID;

    public static GetProductVersionDifferencesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProductVersionDifferencesRequest self = new GetProductVersionDifferencesRequest();
        return TeaModel.build(map, self);
    }

    public GetProductVersionDifferencesRequest setPreVersionUID(String preVersionUID) {
        this.preVersionUID = preVersionUID;
        return this;
    }
    public String getPreVersionUID() {
        return this.preVersionUID;
    }

}
