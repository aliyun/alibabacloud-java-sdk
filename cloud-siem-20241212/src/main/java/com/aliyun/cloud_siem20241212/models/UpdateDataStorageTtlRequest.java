// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageTtlRequest extends TeaModel {
    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The cold storage duration in Simple Log Service. This parameter is not available for configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LogStoreColdTtl")
    public String logStoreColdTtl;

    /**
     * <p>The hot storage duration in Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("LogStoreHotTtl")
    public String logStoreHotTtl;

    /**
     * <p>The name of the Logstore for Threat Analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>network-activity</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The storage duration of the Logstore.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("LogStoreTtl")
    public String logStoreTtl;

    /**
     * <p>The region of the data management center for Threat Analysis. Select the region of the management center based on the region where your assets are located. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: The assets are located in the Chinese mainland.</li>
     * <li>ap-southeast-1: The assets are located outside the Chinese mainland.</li>
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

    public static UpdateDataStorageTtlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataStorageTtlRequest self = new UpdateDataStorageTtlRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataStorageTtlRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataStorageTtlRequest setLogStoreColdTtl(String logStoreColdTtl) {
        this.logStoreColdTtl = logStoreColdTtl;
        return this;
    }
    public String getLogStoreColdTtl() {
        return this.logStoreColdTtl;
    }

    public UpdateDataStorageTtlRequest setLogStoreHotTtl(String logStoreHotTtl) {
        this.logStoreHotTtl = logStoreHotTtl;
        return this;
    }
    public String getLogStoreHotTtl() {
        return this.logStoreHotTtl;
    }

    public UpdateDataStorageTtlRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public UpdateDataStorageTtlRequest setLogStoreTtl(String logStoreTtl) {
        this.logStoreTtl = logStoreTtl;
        return this;
    }
    public String getLogStoreTtl() {
        return this.logStoreTtl;
    }

    public UpdateDataStorageTtlRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataStorageTtlRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

}
