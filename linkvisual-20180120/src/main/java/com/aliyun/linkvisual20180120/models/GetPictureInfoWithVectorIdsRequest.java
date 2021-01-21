// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetPictureInfoWithVectorIdsRequest extends TeaModel {
    @NameInMap("VectorIdList")
    @Validation(required = true)
    public java.util.List<String> vectorIdList;

    public static GetPictureInfoWithVectorIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPictureInfoWithVectorIdsRequest self = new GetPictureInfoWithVectorIdsRequest();
        return TeaModel.build(map, self);
    }

    public GetPictureInfoWithVectorIdsRequest setVectorIdList(java.util.List<String> vectorIdList) {
        this.vectorIdList = vectorIdList;
        return this;
    }
    public java.util.List<String> getVectorIdList() {
        return this.vectorIdList;
    }

}
