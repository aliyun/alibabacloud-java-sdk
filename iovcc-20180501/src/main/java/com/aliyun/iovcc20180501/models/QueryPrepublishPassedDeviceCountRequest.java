// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class QueryPrepublishPassedDeviceCountRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("PrepublishId")
    public String prepublishId;

    public static QueryPrepublishPassedDeviceCountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPrepublishPassedDeviceCountRequest self = new QueryPrepublishPassedDeviceCountRequest();
        return TeaModel.build(map, self);
    }

    public QueryPrepublishPassedDeviceCountRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryPrepublishPassedDeviceCountRequest setPrepublishId(String prepublishId) {
        this.prepublishId = prepublishId;
        return this;
    }
    public String getPrepublishId() {
        return this.prepublishId;
    }

}
