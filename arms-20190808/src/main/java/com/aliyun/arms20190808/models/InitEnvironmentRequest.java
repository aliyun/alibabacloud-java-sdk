// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InitEnvironmentRequest extends TeaModel {
    /**
     * <p>The language. Valid values: zh and en. Default value: zh.</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>The ID of the environment instance.</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>type of managed:</p>
     * <p>- none: not managed. default value of prometheus for ACK.</p>
     * <p>- agent: managed agent. default value of promehtues for ASK/ACS/AckOne.</p>
     * <p>- agent-exproter: maanged agent and exporter. default of prometheus for Cloud.</p>
     */
    @NameInMap("ManagedType")
    public String managedType;

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

    public InitEnvironmentRequest setManagedType(String managedType) {
        this.managedType = managedType;
        return this;
    }
    public String getManagedType() {
        return this.managedType;
    }

    public InitEnvironmentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
