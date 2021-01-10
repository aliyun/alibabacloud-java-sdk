// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureInfoWithVectorIdsRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("VectorIdList")
    public java.util.List<String> vectorIdList;

    public static GetPictureInfoWithVectorIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPictureInfoWithVectorIdsRequest self = new GetPictureInfoWithVectorIdsRequest();
        return TeaModel.build(map, self);
    }

    public GetPictureInfoWithVectorIdsRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public GetPictureInfoWithVectorIdsRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public GetPictureInfoWithVectorIdsRequest setVectorIdList(java.util.List<String> vectorIdList) {
        this.vectorIdList = vectorIdList;
        return this;
    }
    public java.util.List<String> getVectorIdList() {
        return this.vectorIdList;
    }

}
