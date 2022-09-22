// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class GetDocStructureResultRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static GetDocStructureResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDocStructureResultRequest self = new GetDocStructureResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDocStructureResultRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
