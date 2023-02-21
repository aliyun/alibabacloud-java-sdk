// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetOcIcBasicRequest extends TeaModel {
    @NameInMap("SearchKey")
    public String searchKey;

    public static GetOcIcBasicRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOcIcBasicRequest self = new GetOcIcBasicRequest();
        return TeaModel.build(map, self);
    }

    public GetOcIcBasicRequest setSearchKey(String searchKey) {
        this.searchKey = searchKey;
        return this;
    }
    public String getSearchKey() {
        return this.searchKey;
    }

}
