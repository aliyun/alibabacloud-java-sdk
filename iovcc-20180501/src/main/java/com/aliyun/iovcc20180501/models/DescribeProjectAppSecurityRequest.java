// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeProjectAppSecurityRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("AppId")
    public String appId;

    public static DescribeProjectAppSecurityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectAppSecurityRequest self = new DescribeProjectAppSecurityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectAppSecurityRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeProjectAppSecurityRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

}
