// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class QueryEccInfoRequest extends TeaModel {
    /**
     * <p>The ID of the ECC.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EccId")
    public String eccId;

    public static QueryEccInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEccInfoRequest self = new QueryEccInfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryEccInfoRequest setEccId(String eccId) {
        this.eccId = eccId;
        return this;
    }
    public String getEccId() {
        return this.eccId;
    }

}
