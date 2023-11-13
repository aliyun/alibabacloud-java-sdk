// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeEnvCustomJobRequest extends TeaModel {
    /**
     * <p>The name of the custom job.</p>
     */
    @NameInMap("CustomJobName")
    public String customJobName;

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

    public static DescribeEnvCustomJobRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEnvCustomJobRequest self = new DescribeEnvCustomJobRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEnvCustomJobRequest setCustomJobName(String customJobName) {
        this.customJobName = customJobName;
        return this;
    }
    public String getCustomJobName() {
        return this.customJobName;
    }

    public DescribeEnvCustomJobRequest setEncryptYaml(Boolean encryptYaml) {
        this.encryptYaml = encryptYaml;
        return this;
    }
    public Boolean getEncryptYaml() {
        return this.encryptYaml;
    }

    public DescribeEnvCustomJobRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public DescribeEnvCustomJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
