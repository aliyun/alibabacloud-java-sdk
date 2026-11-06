// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class ListWuyingServerWorkloadTemplateRequest extends TeaModel {
    /**
     * <p>A compatibility field. The current version does not read this parameter. The operation returns a fixed maximum of the first 100 templates.</p>
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
     * <p>The ID of the virtual node pool. This parameter is <strong>required</strong>. The node pool must belong to the current account. You can call <a href="~~ListWuyingServer~~">ListWuyingServer</a> to obtain the ID.</p>
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
