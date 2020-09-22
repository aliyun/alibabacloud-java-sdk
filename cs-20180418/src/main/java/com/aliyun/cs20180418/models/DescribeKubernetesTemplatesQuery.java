// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeKubernetesTemplatesQuery extends TeaModel {
    @NameInMap("KubernetesVersion")
    public String kubernetesVersion;

    @NameInMap("Region")
    public String region;

    public static DescribeKubernetesTemplatesQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeKubernetesTemplatesQuery self = new DescribeKubernetesTemplatesQuery();
        return TeaModel.build(map, self);
    }

    public DescribeKubernetesTemplatesQuery setKubernetesVersion(String kubernetesVersion) {
        this.kubernetesVersion = kubernetesVersion;
        return this;
    }
    public String getKubernetesVersion() {
        return this.kubernetesVersion;
    }

    public DescribeKubernetesTemplatesQuery setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

}
