// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTranscodeJobRequest extends TeaModel {
    @NameInMap("ParentJobId")
    public String parentJobId;

    public static GetTranscodeJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTranscodeJobRequest self = new GetTranscodeJobRequest();
        return TeaModel.build(map, self);
    }

    public GetTranscodeJobRequest setParentJobId(String parentJobId) {
        this.parentJobId = parentJobId;
        return this;
    }
    public String getParentJobId() {
        return this.parentJobId;
    }

}
