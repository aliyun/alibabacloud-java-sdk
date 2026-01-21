// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifySlsDispatchStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>internet_log</p>
     */
    @NameInMap("DispatchValue")
    public String dispatchValue;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableStatus")
    public Boolean enableStatus;

    /**
     * <strong>example:</strong>
     * <p>attack,acl</p>
     */
    @NameInMap("FilterKeys")
    public String filterKeys;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("NewRegionId")
    public String newRegionId;

    /**
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
