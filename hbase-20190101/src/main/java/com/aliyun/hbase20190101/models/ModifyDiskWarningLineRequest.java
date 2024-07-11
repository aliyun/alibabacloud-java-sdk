// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ModifyDiskWarningLineRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-m5eznlga4k5bcxxxx</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("WarningLine")
    public Integer warningLine;

    public static ModifyDiskWarningLineRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskWarningLineRequest self = new ModifyDiskWarningLineRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDiskWarningLineRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ModifyDiskWarningLineRequest setWarningLine(Integer warningLine) {
        this.warningLine = warningLine;
        return this;
    }
    public Integer getWarningLine() {
        return this.warningLine;
    }

}
