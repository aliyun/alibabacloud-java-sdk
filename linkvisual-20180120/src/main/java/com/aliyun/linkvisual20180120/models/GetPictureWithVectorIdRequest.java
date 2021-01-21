// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureWithVectorIdRequest extends TeaModel {
    @NameInMap("VectorId")
    @Validation(required = true)
    public String vectorId;

    public static GetPictureWithVectorIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPictureWithVectorIdRequest self = new GetPictureWithVectorIdRequest();
        return TeaModel.build(map, self);
    }

    public GetPictureWithVectorIdRequest setVectorId(String vectorId) {
        this.vectorId = vectorId;
        return this;
    }
    public String getVectorId() {
        return this.vectorId;
    }

}
