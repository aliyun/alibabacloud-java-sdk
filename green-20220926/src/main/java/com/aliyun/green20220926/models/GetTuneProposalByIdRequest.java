// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class GetTuneProposalByIdRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>prop-xxxxxxxx</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetTuneProposalByIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTuneProposalByIdRequest self = new GetTuneProposalByIdRequest();
        return TeaModel.build(map, self);
    }

    public GetTuneProposalByIdRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
