// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class DeleteDataAgentMemoryRequest extends TeaModel {
    /**
     * <p>The current DMS unit.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("DMSUnit")
    public String DMSUnit;

    /**
     * <p>The memory UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>ed3f67***********ed</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DeleteDataAgentMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataAgentMemoryRequest self = new DeleteDataAgentMemoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataAgentMemoryRequest setDMSUnit(String DMSUnit) {
        this.DMSUnit = DMSUnit;
        return this;
    }
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    public DeleteDataAgentMemoryRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
