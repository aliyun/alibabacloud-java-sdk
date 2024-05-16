// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceStatusCountRequest extends TeaModel {
    /**
     * <p>The business date of the instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BizDate")
    public String bizDate;

    /**
     * <p>The running environment in PROD and DEV modes.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectEnv")
    public String projectEnv;

    /**
     * <p>The ID of the DataWorks workspace.</p>
     * <br>
     * <p>This parameter is required.</p>
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
