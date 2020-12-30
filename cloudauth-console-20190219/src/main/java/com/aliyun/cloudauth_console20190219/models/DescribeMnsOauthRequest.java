// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeMnsOauthRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeMnsOauthRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMnsOauthRequest self = new DescribeMnsOauthRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMnsOauthRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeMnsOauthRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
