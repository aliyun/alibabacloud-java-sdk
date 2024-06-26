// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetTranscodeJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ab4802364a2e49208c99efab82dfa8e8</p>
     */
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
