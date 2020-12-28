// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas_openapi20190901.models;

import com.aliyun.tea.*;

public class GetExperimentMetaRequest extends TeaModel {
    @NameInMap("ExperimentId")
    public String experimentId;

    @NameInMap("NameSpace")
    public String nameSpace;

    public static GetExperimentMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentMetaRequest self = new GetExperimentMetaRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentMetaRequest setExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }
    public String getExperimentId() {
        return this.experimentId;
    }

    public GetExperimentMetaRequest setNameSpace(String nameSpace) {
        this.nameSpace = nameSpace;
        return this;
    }
    public String getNameSpace() {
        return this.nameSpace;
    }

}
