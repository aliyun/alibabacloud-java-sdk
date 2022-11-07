// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetWorkitemRelationsRequest extends TeaModel {
    @NameInMap("relationType")
    public String relationType;

    public static GetWorkitemRelationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetWorkitemRelationsRequest self = new GetWorkitemRelationsRequest();
        return TeaModel.build(map, self);
    }

    public GetWorkitemRelationsRequest setRelationType(String relationType) {
        this.relationType = relationType;
        return this;
    }
    public String getRelationType() {
        return this.relationType;
    }

}
