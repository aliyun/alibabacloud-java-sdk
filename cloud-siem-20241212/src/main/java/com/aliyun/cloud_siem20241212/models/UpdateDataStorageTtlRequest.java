// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataStorageTtlRequest extends TeaModel {
    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The storage duration for cold storage in Simple Log Service. This setting is not yet available.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("LogStoreColdTtl")
    public String logStoreColdTtl;

    /**
     * <p>The storage duration for hot storage in Simple Log Service.</p>
     * 
     * <strong>example:</strong>
     * <p>180</p>
     */
    @NameInMap("LogStoreHotTtl")
    public String logStoreHotTtl;

    /**
     * <p>The name of the Logstore for threat analysis.</p>
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
     * <p>The region of the Data Management Center for threat analysis. Select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: The Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Regions outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member whose perspective the administrator assumes.</p>
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
