// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeOsVersionRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("VersionId")
    public Long versionId;

    public static DescribeOsVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOsVersionRequest self = new DescribeOsVersionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOsVersionRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeOsVersionRequest setVersionId(Long versionId) {
        this.versionId = versionId;
        return this;
    }
    public Long getVersionId() {
        return this.versionId;
    }

}
