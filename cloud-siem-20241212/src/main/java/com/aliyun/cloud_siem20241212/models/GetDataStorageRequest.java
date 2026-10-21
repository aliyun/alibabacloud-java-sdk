// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetDataStorageRequest extends TeaModel {
    /**
     * <p>The language of the returned message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Note: This parameter is required for actual API calls. If you do not specify this parameter, the service returns a 400 error with the message &quot;The specified Lang can not be empty.&quot;. Explicitly specify the language code.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the data management center of Threat Analysis is located. Select the region of the management center based on the region where your assets reside. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets reside outside the Chinese mainland.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the user whose perspective the administrator switches to.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
    @NameInMap("RoleFor")
    public Long roleFor;

    public static GetDataStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataStorageRequest self = new GetDataStorageRequest();
        return TeaModel.build(map, self);
    }

    public GetDataStorageRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetDataStorageRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetDataStorageRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
