// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetRecordsByOuterBusinessIdRequest extends TeaModel {
    @NameInMap("OuterBusinessId")
    public String outerBusinessId;

    public static GetRecordsByOuterBusinessIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRecordsByOuterBusinessIdRequest self = new GetRecordsByOuterBusinessIdRequest();
        return TeaModel.build(map, self);
    }

    public GetRecordsByOuterBusinessIdRequest setOuterBusinessId(String outerBusinessId) {
        this.outerBusinessId = outerBusinessId;
        return this;
    }
    public String getOuterBusinessId() {
        return this.outerBusinessId;
    }

}
