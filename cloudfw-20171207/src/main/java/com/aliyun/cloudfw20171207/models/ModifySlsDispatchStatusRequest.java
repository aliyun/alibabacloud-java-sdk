// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySlsDispatchStatusRequest extends TeaModel {
    /**
     * <p>The key for the log category. Valid values:</p>
     * <p><strong>internet_log</strong></p>
     * <p><strong>vpc_firewall_log</strong></p>
     * <p><strong>nat_firewall_log</strong></p>
     * <p><strong>ipv6_firewall_log</strong></p>
     * <p><strong>dns_firewall_log</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>internet_log</p>
     */
    @NameInMap("DispatchValue")
    public String dispatchValue;

    /**
     * <p>Specifies whether to deliver logs. A value of \<code>true\\</code> enables delivery, and \<code>false\\</code> disables it.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableStatus")
    public Boolean enableStatus;

    /**
     * <p>The supported filter conditions. Valid values:</p>
     * <p><strong>attack</strong></p>
     * <p><strong>acl</strong></p>
     * <p><strong>other</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>attack,acl</p>
     */
    @NameInMap("FilterKeys")
    public String filterKeys;

    /**
     * <p>The region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("NewRegionId")
    public String newRegionId;

    /**
     * <p>The site to modify. If the log version is 1, leave this parameter empty or set it to \<code>global\\</code>. If the log version is 2, set this parameter to \<code>cn\\</code> or \<code>intl\\</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>cn</p>
     */
    @NameInMap("Site")
    public String site;

    public static ModifySlsDispatchStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySlsDispatchStatusRequest self = new ModifySlsDispatchStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModifySlsDispatchStatusRequest setDispatchValue(String dispatchValue) {
        this.dispatchValue = dispatchValue;
        return this;
    }
    public String getDispatchValue() {
        return this.dispatchValue;
    }

    public ModifySlsDispatchStatusRequest setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public Boolean getEnableStatus() {
        return this.enableStatus;
    }

    public ModifySlsDispatchStatusRequest setFilterKeys(String filterKeys) {
        this.filterKeys = filterKeys;
        return this;
    }
    public String getFilterKeys() {
        return this.filterKeys;
    }

    public ModifySlsDispatchStatusRequest setNewRegionId(String newRegionId) {
        this.newRegionId = newRegionId;
        return this;
    }
    public String getNewRegionId() {
        return this.newRegionId;
    }

    public ModifySlsDispatchStatusRequest setSite(String site) {
        this.site = site;
        return this;
    }
    public String getSite() {
        return this.site;
    }

}
