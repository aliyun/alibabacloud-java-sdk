// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class InitEnvironmentRequest extends TeaModel {
    /**
     * <p>The language. Valid values: zh and en. Default value: zh.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>Whether to create a Token in order to enhance the security of data retrieval.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CreateAuthToken")
    public Boolean createAuthToken;

    /**
     * <p>The ID of the environment instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>env-xxx</p>
     */
    @NameInMap("EnvironmentId")
    public String environmentId;

    /**
     * <p>Whether agents or exporters are managed. Valid values:</p>
     * <ul>
     * <li>none: No. By default, no managed agents or exporters are provided for ACK clusters.</li>
     * <li>agent: Agents are managed. By default, managed agents are provided for ASK clusters, ACS clusters, and ACK One clusters.</li>
     * <li>agent-exproter: Agents and exporters are managed. By default, managed agents and exporters are provided for cloud services.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agent</p>
     */
    @NameInMap("ManagedType")
    public String managedType;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
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

    public InitEnvironmentRequest setCreateAuthToken(Boolean createAuthToken) {
        this.createAuthToken = createAuthToken;
        return this;
    }
    public Boolean getCreateAuthToken() {
        return this.createAuthToken;
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
