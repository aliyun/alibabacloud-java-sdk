// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class GetDataStorageRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * <p>Note: This parameter is required in actual API calls. If it is not provided, the service returns a 400 error with the message &quot;The specified Lang can not be empty.&quot; Explicitly pass the language code.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the data management center for threat analysis is located. Select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: Assets are located outside the Chinese mainland.</li>
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

    /**
     * <p>Specifies whether to read the auto-discovered index configuration of each Logstore. This operation requires accessing Simple Log Service (SLS) for each Logstore. Default value: false. Set this parameter to true only on the storage management page.</p>
     */
    @NameInMap("WithAutoKeyDetect")
    public Boolean withAutoKeyDetect;

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

    public GetDataStorageRequest setWithAutoKeyDetect(Boolean withAutoKeyDetect) {
        this.withAutoKeyDetect = withAutoKeyDetect;
        return this;
    }
    public Boolean getWithAutoKeyDetect() {
        return this.withAutoKeyDetect;
    }

}
