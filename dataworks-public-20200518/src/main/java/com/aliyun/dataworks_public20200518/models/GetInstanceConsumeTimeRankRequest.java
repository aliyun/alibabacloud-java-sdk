// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetInstanceConsumeTimeRankRequest extends TeaModel {
    /**
     * <p>The data timestamp, accurate to the day. Specify the time in the ISO 8601 standard in the yyyy-MM-dd\&quot;T\&quot;HH:mm:ssZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-21T00:00:00+0800</p>
     */
    @NameInMap("Bizdate")
    public String bizdate;

    /**
     * <p>The DataWorks workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
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
