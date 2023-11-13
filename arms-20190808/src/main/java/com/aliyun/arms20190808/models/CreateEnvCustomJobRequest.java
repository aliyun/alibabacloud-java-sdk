// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateEnvCustomJobRequest extends TeaModel {
    /**
     * <p>The language. Valid values: zh and en. Default value: zh.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The YAML configuration string of the custom job.</p>
     */
    @NameInMap("ConfigYaml")
    public String configYaml;

    /**
     * <p>The name of the custom job.</p>
     */
    @NameInMap("CustomJobName")
    public String customJobName;

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

    public static CreateEnvCustomJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEnvCustomJobRequest self = new CreateEnvCustomJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateEnvCustomJobRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public CreateEnvCustomJobRequest setConfigYaml(String configYaml) {
        this.configYaml = configYaml;
        return this;
    }
    public String getConfigYaml() {
        return this.configYaml;
    }

    public CreateEnvCustomJobRequest setCustomJobName(String customJobName) {
        this.customJobName = customJobName;
        return this;
    }
    public String getCustomJobName() {
        return this.customJobName;
    }

    public CreateEnvCustomJobRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public CreateEnvCustomJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
