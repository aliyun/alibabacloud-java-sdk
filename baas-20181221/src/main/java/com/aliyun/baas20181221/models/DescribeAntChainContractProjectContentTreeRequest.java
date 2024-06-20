// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectContentTreeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2L9VK68g</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeAntChainContractProjectContentTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectContentTreeRequest self = new DescribeAntChainContractProjectContentTreeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectContentTreeRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
