// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class DetailDocumentResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("data")
    public DocumentDetailItem data;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>83A5A7DD-8974-5769-952E-590A97BEA34E</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DetailDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetailDocumentResponseBody self = new DetailDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public DetailDocumentResponseBody setData(DocumentDetailItem data) {
        this.data = data;
        return this;
    }
    public DocumentDetailItem getData() {
        return this.data;
    }

    public DetailDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
