// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListWuyingServerWorkloadTemplateRequest extends TeaModel {
    /**
     * <p>A compatibility field. The current version does not read this parameter. The operation returns a maximum of the first 100 templates.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>A compatibility field. The current version does not read this parameter and does not support token-based pagination.</p>
     * 
     * <strong>example:</strong>
     * <p>unused</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The virtual node pool ID. <strong>Required</strong>. The node pool must already exist and belong to the current account, but it is not required to be attached to a workstation.</p>
     * <p>If you already have a valid node pool ID, you can directly pass it. If a workstation is already associated with a node pool, you can also obtain the corresponding non-empty <code>VirtualNodePoolId</code> by invoking <a href="~~ListWuyingServer~~">ListWuyingServer</a>. If you do not have a valid ID, do not use an empty value, workstation ID, cluster ID, or the character string <code>null</code> as a substitute.</p>
     * <p><a href="~~CreateWuyingServer~~">CreateWuyingServer</a> only associates existing node pools and does not support automatic creation of node pools. If the node pool does not exist or does not belong to the current account, <code>InvalidParameter.VirtualNodePoolId</code> is returned.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vnp-bp1234567890abcde</p>
     */
    @NameInMap("VirtualNodePoolId")
    public String virtualNodePoolId;

    public static ListWuyingServerWorkloadTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        ListWuyingServerWorkloadTemplateRequest self = new ListWuyingServerWorkloadTemplateRequest();
        return TeaModel.build(map, self);
    }

    public ListWuyingServerWorkloadTemplateRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListWuyingServerWorkloadTemplateRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListWuyingServerWorkloadTemplateRequest setVirtualNodePoolId(String virtualNodePoolId) {
        this.virtualNodePoolId = virtualNodePoolId;
        return this;
    }
    public String getVirtualNodePoolId() {
        return this.virtualNodePoolId;
    }

}
