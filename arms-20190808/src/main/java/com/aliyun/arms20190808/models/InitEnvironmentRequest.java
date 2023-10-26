// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InitEnvironmentRequest extends TeaModel {
    /**
     * <p>Locale, the default is Chinese zh.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>Environment ID.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static InitEnvironmentRequest build(java.util.Map<String, ?> map) throws Exception {
        InitEnvironmentRequest self = new InitEnvironmentRequest();
        return TeaModel.build(map, self);
    }

    public InitEnvironmentRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public InitEnvironmentRequest setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public String getEnvironmentId() {
        return this.environmentId;
    }

    public InitEnvironmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
