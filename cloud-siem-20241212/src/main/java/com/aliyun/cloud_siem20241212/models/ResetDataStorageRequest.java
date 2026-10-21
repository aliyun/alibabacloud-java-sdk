// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ResetDataStorageRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.<blockquote>
     * <p>Note: This parameter is required. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center region based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the China Threat Detection and Response (CTDR) member to which the administrator switches the view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static ResetDataStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        ResetDataStorageRequest self = new ResetDataStorageRequest();
        return TeaModel.build(map, self);
    }

    public ResetDataStorageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ResetDataStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ResetDataStorageRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
