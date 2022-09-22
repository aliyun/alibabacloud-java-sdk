// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocumentCompareResultRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetDocumentCompareResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocumentCompareResultRequest self = new GetDocumentCompareResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDocumentCompareResultRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
