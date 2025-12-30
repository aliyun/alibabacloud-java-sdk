// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetCheckConnectivityJobsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>462935472785</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    public static GetCheckConnectivityJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckConnectivityJobsRequest self = new GetCheckConnectivityJobsRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckConnectivityJobsRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public GetCheckConnectivityJobsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

}
