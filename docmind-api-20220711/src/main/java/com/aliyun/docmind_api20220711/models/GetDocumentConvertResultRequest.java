// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocumentConvertResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>docmind-20220816-1e89d65c</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetDocumentConvertResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentConvertResultRequest self = new GetDocumentConvertResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentConvertResultRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
