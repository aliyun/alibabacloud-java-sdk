// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusCountRequest extends TeaModel {
    /**
     * <p>The data timestamp of instances.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-01-01</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    /**
     * <p>The runtime environment. Valid values: PROD and DEV.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PROD</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetInstanceStatusCountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceStatusCountRequest self = new GetInstanceStatusCountRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceStatusCountRequest setBizDate(String bizDate) {
        this.bizDate = bizDate;
        return this;
    }
    public String getBizDate() {
        return this.bizDate;
    }

    public GetInstanceStatusCountRequest setProjectEnv(String projectEnv) {
        this.projectEnv = projectEnv;
        return this;
    }
    public String getProjectEnv() {
        return this.projectEnv;
    }

    public GetInstanceStatusCountRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
