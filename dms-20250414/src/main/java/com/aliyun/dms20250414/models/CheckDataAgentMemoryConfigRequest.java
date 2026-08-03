// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CheckDataAgentMemoryConfigRequest extends TeaModel {
    /**
     * <p>The current Data Management unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    public static CheckDataAgentMemoryConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckDataAgentMemoryConfigRequest self = new CheckDataAgentMemoryConfigRequest();
        return TeaModel.build(map, self);
    }

    public CheckDataAgentMemoryConfigRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

}
