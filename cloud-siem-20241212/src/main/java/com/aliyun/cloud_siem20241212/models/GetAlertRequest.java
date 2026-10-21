// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetAlertRequest extends TeaModel {
    /**
     * <p>The ID of the alert associated with the event.</p>
     * <blockquote>
     * <p>This parameter is required. If this parameter is not specified, the service returns a 400 error.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sas_71e24437d2797ce8fc59692905a4****</p>
     */
    @NameInMap("AlertUuid")
    public String alertUuid;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <blockquote>
     * <p>This parameter is required. If this parameter is not specified, the service returns a 400 error.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the data management center of threat detection and response is located. Specify the management center region based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets belong to the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets belong to regions outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    /**
     * <p>The view type. Valid values:</p>
     * <ul>
     * <li>0: the view of the current Alibaba Cloud account.</li>
     * <li>1: the view of all accounts in the enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RoleType")
    public Long roleType;

    public static GetAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertRequest self = new GetAlertRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertRequest setAlertUuid(String alertUuid) {
        this.alertUuid = alertUuid;
        return this;
    }
    public String getAlertUuid() {
        return this.alertUuid;
    }

    public GetAlertRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetAlertRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetAlertRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public GetAlertRequest setRoleType(Long roleType) {
        this.roleType = roleType;
        return this;
    }
    public Long getRoleType() {
        return this.roleType;
    }

}
