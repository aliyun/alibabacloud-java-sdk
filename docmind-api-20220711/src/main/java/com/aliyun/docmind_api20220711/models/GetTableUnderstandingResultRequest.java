// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetTableUnderstandingResultRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetTableUnderstandingResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableUnderstandingResultRequest self = new GetTableUnderstandingResultRequest();
        return TeaModel.build(map, self);
    }

    public GetTableUnderstandingResultRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
