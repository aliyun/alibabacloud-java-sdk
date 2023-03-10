// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class AncillarySuggestRequest extends TeaModel {
    @NameInMap("solution_id")
    public String solutionId;

    public static AncillarySuggestRequest build(java.util.Map<String, ?> map) throws Exception {
        AncillarySuggestRequest self = new AncillarySuggestRequest();
        return TeaModel.build(map, self);
    }

    public AncillarySuggestRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

}
