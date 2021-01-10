// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureWithVectorIdRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("VectorId")
    public String vectorId;

    public static GetPictureWithVectorIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPictureWithVectorIdRequest self = new GetPictureWithVectorIdRequest();
        return TeaModel.build(map, self);
    }

    public GetPictureWithVectorIdRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public GetPictureWithVectorIdRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public GetPictureWithVectorIdRequest setVectorId(String vectorId) {
        this.vectorId = vectorId;
        return this;
    }
    public String getVectorId() {
        return this.vectorId;
    }

}
