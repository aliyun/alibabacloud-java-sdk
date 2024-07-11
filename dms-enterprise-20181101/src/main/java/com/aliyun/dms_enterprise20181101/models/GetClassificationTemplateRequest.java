// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetClassificationTemplateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>169****</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <strong>example:</strong>
     * <p>23***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetClassificationTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClassificationTemplateRequest self = new GetClassificationTemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetClassificationTemplateRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GetClassificationTemplateRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
