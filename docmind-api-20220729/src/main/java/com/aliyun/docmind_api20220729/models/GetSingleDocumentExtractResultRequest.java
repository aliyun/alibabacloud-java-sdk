// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class GetSingleDocumentExtractResultRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetSingleDocumentExtractResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSingleDocumentExtractResultRequest self = new GetSingleDocumentExtractResultRequest();
        return TeaModel.build(map, self);
    }

    public GetSingleDocumentExtractResultRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
