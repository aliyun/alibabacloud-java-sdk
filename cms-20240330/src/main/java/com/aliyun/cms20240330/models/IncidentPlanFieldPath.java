// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentPlanFieldPath extends TeaModel {
    /**
     * <p>字段别名。</p>
     * 
     * <strong>example:</strong>
     * <p>服务名称</p>
     */
    @NameInMap("fieldAlias")
    public String fieldAlias;

    /**
     * <p>字段路径的列表。</p>
     */
    @NameInMap("fieldPath")
    public java.util.List<String> fieldPath;

    public static IncidentPlanFieldPath build(java.util.Map<String, ?> map) throws Exception {
        IncidentPlanFieldPath self = new IncidentPlanFieldPath();
        return TeaModel.build(map, self);
    }

    public IncidentPlanFieldPath setFieldAlias(String fieldAlias) {
        this.fieldAlias = fieldAlias;
        return this;
    }
    public String getFieldAlias() {
        return this.fieldAlias;
    }

    public IncidentPlanFieldPath setFieldPath(java.util.List<String> fieldPath) {
        this.fieldPath = fieldPath;
        return this;
    }
    public java.util.List<String> getFieldPath() {
        return this.fieldPath;
    }

}
