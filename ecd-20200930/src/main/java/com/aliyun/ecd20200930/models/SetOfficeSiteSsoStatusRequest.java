// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class SetOfficeSiteSsoStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable SSO.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSso")
    public Boolean enableSso;

    /**
     * <p>The workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-363353****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SetOfficeSiteSsoStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetOfficeSiteSsoStatusRequest self = new SetOfficeSiteSsoStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetOfficeSiteSsoStatusRequest setEnableSso(Boolean enableSso) {
        this.enableSso = enableSso;
        return this;
    }
    public Boolean getEnableSso() {
        return this.enableSso;
    }

    public SetOfficeSiteSsoStatusRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public SetOfficeSiteSsoStatusRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
