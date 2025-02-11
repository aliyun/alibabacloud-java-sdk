// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyDefaultVpcRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DataRegion")
    public String dataRegion;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static DescribeDifyDefaultVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyDefaultVpcRequest self = new DescribeDifyDefaultVpcRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDifyDefaultVpcRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDifyDefaultVpcRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

    public DescribeDifyDefaultVpcRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
