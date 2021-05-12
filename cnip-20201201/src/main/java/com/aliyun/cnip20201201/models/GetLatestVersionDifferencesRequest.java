// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class GetLatestVersionDifferencesRequest extends TeaModel {
    // 上一个产品版本id
    @NameInMap("preVersionID")
    public String preVersionID;

    public static GetLatestVersionDifferencesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLatestVersionDifferencesRequest self = new GetLatestVersionDifferencesRequest();
        return TeaModel.build(map, self);
    }

    public GetLatestVersionDifferencesRequest setPreVersionID(String preVersionID) {
        this.preVersionID = preVersionID;
        return this;
    }
    public String getPreVersionID() {
        return this.preVersionID;
    }

}
