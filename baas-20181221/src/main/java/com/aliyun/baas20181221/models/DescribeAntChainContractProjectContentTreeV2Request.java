// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectContentTreeV2Request extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>M8GaMEyX</p>
     */
    @NameInMap("ConsortiumId")
    public String consortiumId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2L9VK68g</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeAntChainContractProjectContentTreeV2Request build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectContentTreeV2Request self = new DescribeAntChainContractProjectContentTreeV2Request();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectContentTreeV2Request setConsortiumId(String consortiumId) {
        this.consortiumId = consortiumId;
        return this;
    }
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public DescribeAntChainContractProjectContentTreeV2Request setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
