// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListEnvCustomJobsRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the encrypted YAML string.</p>
     */
    @NameInMap("EncryptYaml")
    public Boolean encryptYaml;

    /**
     * <p>The ID of the environment instance.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListEnvCustomJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListEnvCustomJobsRequest self = new ListEnvCustomJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListEnvCustomJobsRequest setEncryptYaml(Boolean encryptYaml) {
        this.encryptYaml = encryptYaml;
        return this;
    }
    public Boolean getEncryptYaml() {
        return this.encryptYaml;
    }

    public ListEnvCustomJobsRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public ListEnvCustomJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
