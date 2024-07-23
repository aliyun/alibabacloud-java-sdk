// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class AccessPageSetAclRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FREE_ACCESS</p>
     */
    @NameInMap("AccessMode")
    public String accessMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a-062wec3cwmayw****</p>
     */
    @NameInMap("AccessPageId")
    public String accessPageId;

    /**
     * <strong>example:</strong>
     * <p>notepad_test</p>
     */
    @NameInMap("AccessPageName")
    public String accessPageName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("EffectTime")
    public Integer effectTime;

    /**
     * <strong>example:</strong>
     * <p>Day</p>
     */
    @NameInMap("Unit")
    public String unit;

    public static AccessPageSetAclRequest build(java.util.Map<String, ?> map) throws Exception {
        AccessPageSetAclRequest self = new AccessPageSetAclRequest();
        return TeaModel.build(map, self);
    }

    public AccessPageSetAclRequest setAccessMode(String accessMode) {
        this.accessMode = accessMode;
        return this;
    }
    public String getAccessMode() {
        return this.accessMode;
    }

    public AccessPageSetAclRequest setAccessPageId(String accessPageId) {
        this.accessPageId = accessPageId;
        return this;
    }
    public String getAccessPageId() {
        return this.accessPageId;
    }

    public AccessPageSetAclRequest setAccessPageName(String accessPageName) {
        this.accessPageName = accessPageName;
        return this;
    }
    public String getAccessPageName() {
        return this.accessPageName;
    }

    public AccessPageSetAclRequest setEffectTime(Integer effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public Integer getEffectTime() {
        return this.effectTime;
    }

    public AccessPageSetAclRequest setUnit(String unit) {
        this.unit = unit;
        return this;
    }
    public String getUnit() {
        return this.unit;
    }

}
