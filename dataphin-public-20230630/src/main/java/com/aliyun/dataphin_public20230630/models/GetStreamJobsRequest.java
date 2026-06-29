// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetStreamJobsRequest extends TeaModel {
    /**
     * <p>The Dataphin environment. Valid values:</p>
     * <ul>
     * <li>DEV</li>
     * <li>PROD.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DEV</p>
     */
    @NameInMap("Env")
    public String env;

    /**
     * <p>The tenant ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30001011</p>
     */
    @NameInMap("OpTenantId")
    public Long opTenantId;

    /**
     * <p>The Dataphin project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7162269257990111</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetStreamJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStreamJobsRequest self = new GetStreamJobsRequest();
        return TeaModel.build(map, self);
    }

    public GetStreamJobsRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetStreamJobsRequest setOpTenantId(Long opTenantId) {
        this.opTenantId = opTenantId;
        return this;
    }
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public GetStreamJobsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
