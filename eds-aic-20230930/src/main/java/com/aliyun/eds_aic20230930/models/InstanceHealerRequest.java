// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class InstanceHealerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceIdList")
    public java.util.List<String> instanceIdList;

    /**
     * <strong>example:</strong>
     * <p>Clean</p>
     */
    @NameInMap("Strategy")
    public String strategy;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    public static InstanceHealerRequest build(java.util.Map<String, ?> map) throws Exception {
        InstanceHealerRequest self = new InstanceHealerRequest();
        return TeaModel.build(map, self);
    }

    public InstanceHealerRequest setInstanceIdList(java.util.List<String> instanceIdList) {
        this.instanceIdList = instanceIdList;
        return this;
    }
    public java.util.List<String> getInstanceIdList() {
        return this.instanceIdList;
    }

    public InstanceHealerRequest setStrategy(String strategy) {
        this.strategy = strategy;
        return this;
    }
    public String getStrategy() {
        return this.strategy;
    }

    public InstanceHealerRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

}
