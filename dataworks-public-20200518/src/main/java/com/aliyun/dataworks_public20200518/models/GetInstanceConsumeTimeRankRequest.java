// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceConsumeTimeRankRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    public static GetInstanceConsumeTimeRankRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsumeTimeRankRequest self = new GetInstanceConsumeTimeRankRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceConsumeTimeRankRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public GetInstanceConsumeTimeRankRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

}
