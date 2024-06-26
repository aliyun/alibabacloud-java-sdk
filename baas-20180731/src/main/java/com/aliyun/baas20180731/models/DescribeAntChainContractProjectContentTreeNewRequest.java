// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectContentTreeNewRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeAntChainContractProjectContentTreeNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectContentTreeNewRequest self = new DescribeAntChainContractProjectContentTreeNewRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectContentTreeNewRequest setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeAntChainContractProjectContentTreeNewRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
