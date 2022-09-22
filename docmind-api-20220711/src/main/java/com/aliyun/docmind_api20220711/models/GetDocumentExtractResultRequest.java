// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocumentExtractResultRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetDocumentExtractResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentExtractResultRequest self = new GetDocumentExtractResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentExtractResultRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
