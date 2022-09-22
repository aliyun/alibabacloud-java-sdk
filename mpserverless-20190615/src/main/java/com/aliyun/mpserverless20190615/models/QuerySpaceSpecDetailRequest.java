// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class QuerySpaceSpecDetailRequest extends TeaModel {
    @NameInMap("SpecCode")
    public String specCode;

    public static QuerySpaceSpecDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySpaceSpecDetailRequest self = new QuerySpaceSpecDetailRequest();
        return TeaModel.build(map, self);
    }

    public QuerySpaceSpecDetailRequest setSpecCode(String specCode) {
        this.specCode = specCode;
        return this;
    }
    public String getSpecCode() {
        return this.specCode;
    }

}
