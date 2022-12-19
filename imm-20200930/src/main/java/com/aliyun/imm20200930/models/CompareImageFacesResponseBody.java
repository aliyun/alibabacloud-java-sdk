// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CompareImageFacesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Similarity")
    public Float similarity;

    public static CompareImageFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CompareImageFacesResponseBody self = new CompareImageFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public CompareImageFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CompareImageFacesResponseBody setSimilarity(Float similarity) {
        this.similarity = similarity;
        return this;
    }
    public Float getSimilarity() {
        return this.similarity;
    }

}
