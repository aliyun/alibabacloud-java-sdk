// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class QueryArtifactSignatureRequest extends TeaModel {
    @NameInMap("ArtifactMd5")
    @Validation(required = true)
    public String artifactMd5;

    @NameInMap("ExpireTime")
    @Validation(required = true)
    public Long expireTime;

    @NameInMap("JobInstanceId")
    public String jobInstanceId;

    public static QueryArtifactSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryArtifactSignatureRequest self = new QueryArtifactSignatureRequest();
        return TeaModel.build(map, self);
    }

    public QueryArtifactSignatureRequest setArtifactMd5(String artifactMd5) {
        this.artifactMd5 = artifactMd5;
        return this;
    }
    public String getArtifactMd5() {
        return this.artifactMd5;
    }

    public QueryArtifactSignatureRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public QueryArtifactSignatureRequest setJobInstanceId(String jobInstanceId) {
        this.jobInstanceId = jobInstanceId;
        return this;
    }
    public String getJobInstanceId() {
        return this.jobInstanceId;
    }

}
