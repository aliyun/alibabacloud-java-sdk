// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avds20171129.models;

import com.aliyun.tea.*;

public class DescribeDomainAttackSurfacesFacetsRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TaskId")
    public Integer taskId;

    @NameInMap("Domain")
    public String domain;

    public static DescribeDomainAttackSurfacesFacetsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainAttackSurfacesFacetsRequest self = new DescribeDomainAttackSurfacesFacetsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDomainAttackSurfacesFacetsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeDomainAttackSurfacesFacetsRequest setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

    public DescribeDomainAttackSurfacesFacetsRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

}
