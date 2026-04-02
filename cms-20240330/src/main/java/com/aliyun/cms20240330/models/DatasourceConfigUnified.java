// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DatasourceConfigUnified extends TeaModel {
    /**
     * <p>Prometheus 实例 ID（type=PROMETHEUS 时使用）</p>
     */
    @NameInMap("instanceId")
    public String instanceId;

    /**
     * <p>地域 ID（各类型可选，缺省与规则/网关一致）</p>
     */
    @NameInMap("regionId")
    public String regionId;

    /**
     * <p>数据源类型</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("type")
    public String type;

    public static DatasourceConfigUnified build(java.util.Map<String, ?> map) throws Exception {
        DatasourceConfigUnified self = new DatasourceConfigUnified();
        return TeaModel.build(map, self);
    }

    public DatasourceConfigUnified setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DatasourceConfigUnified setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DatasourceConfigUnified setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
