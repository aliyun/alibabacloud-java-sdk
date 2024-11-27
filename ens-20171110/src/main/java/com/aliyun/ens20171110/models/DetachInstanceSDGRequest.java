// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachInstanceSDGRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static DetachInstanceSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachInstanceSDGRequest self = new DetachInstanceSDGRequest();
        return TeaModel.build(map, self);
    }

    public DetachInstanceSDGRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public DetachInstanceSDGRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
