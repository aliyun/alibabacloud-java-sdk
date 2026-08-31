// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class EnableAccessForCloudSiemRequest extends TeaModel {
    /**
     * <p>Specifies whether to automatically integrate alert logs from Security Center, Web Application Firewall (WAF), and Cloud Firewall. By default, the logs are automatically integrated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AutoSubmit")
    public Integer autoSubmit;

    /**
     * <p>The idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-426614174000</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The region where the threat detection and response data management center resides. Select the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: assets in the Chinese mainland and Hong Kong (China).</li>
     * <li>ap-southeast-1: assets outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member account to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type.</p>
     * <ul>
     * <li>0: the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts in the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Integer roleType;

    public static EnableAccessForCloudSiemRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableAccessForCloudSiemRequest self = new EnableAccessForCloudSiemRequest();
        return TeaModel.build(map, self);
    }

    public EnableAccessForCloudSiemRequest setAutoSubmit(Integer autoSubmit) {
        this.autoSubmit = autoSubmit;
        return this;
    }
    public Integer getAutoSubmit() {
        return this.autoSubmit;
    }

    public EnableAccessForCloudSiemRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableAccessForCloudSiemRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public EnableAccessForCloudSiemRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public EnableAccessForCloudSiemRequest setRoleType(Integer roleType) {
        this.roleType = roleType;
        return this;
    }
    public Integer getRoleType() {
        return this.roleType;
    }

}
