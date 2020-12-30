// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeSignedUrlRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Key")
    public String key;

    public static DescribeSignedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSignedUrlRequest self = new DescribeSignedUrlRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSignedUrlRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeSignedUrlRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeSignedUrlRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
