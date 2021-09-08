// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryStudioAppDomainListOpenRequest extends TeaModel {
    @NameInMap("ProjectId")
    @Validation(required = true)
    public String projectId;

    @NameInMap("AppId")
    @Validation(required = true)
    public String appId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    public static QueryStudioAppDomainListOpenRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryStudioAppDomainListOpenRequest self = new QueryStudioAppDomainListOpenRequest();
        return TeaModel.build(map, self);
    }

    public QueryStudioAppDomainListOpenRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryStudioAppDomainListOpenRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryStudioAppDomainListOpenRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

}
