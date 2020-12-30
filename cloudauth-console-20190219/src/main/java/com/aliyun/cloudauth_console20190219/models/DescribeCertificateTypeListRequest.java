// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_console20190219.models;

import com.aliyun.tea.*;

public class DescribeCertificateTypeListRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeCertificateTypeListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateTypeListRequest self = new DescribeCertificateTypeListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateTypeListRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeCertificateTypeListRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
