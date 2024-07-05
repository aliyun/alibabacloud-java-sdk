// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class CompareImageFacesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>F73AC982-2B9E-4ECD-AED5-F8331C5******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0.8848152756690983</p>
     */
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
