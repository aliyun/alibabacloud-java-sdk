// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UnmountInstanceSDGRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sdg-xxxx</p>
     */
    @NameInMap("SDGId")
    public String SDGId;

    public static UnmountInstanceSDGRequest build(java.util.Map<String, ?> map) throws Exception {
        UnmountInstanceSDGRequest self = new UnmountInstanceSDGRequest();
        return TeaModel.build(map, self);
    }

    public UnmountInstanceSDGRequest setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public UnmountInstanceSDGRequest setSDGId(String SDGId) {
        this.SDGId = SDGId;
        return this;
    }
    public String getSDGId() {
        return this.SDGId;
    }

}
