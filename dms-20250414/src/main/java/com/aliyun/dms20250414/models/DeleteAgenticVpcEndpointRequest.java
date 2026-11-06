// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteAgenticVpcEndpointRequest extends TeaModel {
    /**
     * <p>The ID of the endpoint to be deleted. You can delete the endpoint even if it has associated data sources, but this may interrupt access.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ep-7xvra4ad6619266ba43d</p>
     */
    @NameInMap("EndpointId")
    public String endpointId;

    public static DeleteAgenticVpcEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticVpcEndpointRequest self = new DeleteAgenticVpcEndpointRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticVpcEndpointRequest setEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }
    public String getEndpointId() {
        return this.endpointId;
    }

}
