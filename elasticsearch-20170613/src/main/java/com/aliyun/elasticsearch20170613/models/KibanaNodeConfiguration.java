// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class KibanaNodeConfiguration extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("amount")
    public Long amount;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("disk")
    public Long disk;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>elasticsearch.sn2ne.large</p>
     */
    @NameInMap("spec")
    public String spec;

    public static KibanaNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
        KibanaNodeConfiguration self = new KibanaNodeConfiguration();
        return TeaModel.build(map, self);
    }

    public KibanaNodeConfiguration setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public KibanaNodeConfiguration setDisk(Long disk) {
        this.disk = disk;
        return this;
    }
    public Long getDisk() {
        return this.disk;
    }

    public KibanaNodeConfiguration setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
