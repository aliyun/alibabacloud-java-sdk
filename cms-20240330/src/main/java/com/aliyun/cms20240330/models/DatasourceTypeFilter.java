// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DatasourceTypeFilter extends TeaModel {
    /**
     * <p>Specifies the data source type for an exact match.</p>
     */
    @NameInMap("eq")
    public String eq;

    public static DatasourceTypeFilter build(java.util.Map<String, ?> map) throws Exception {
        DatasourceTypeFilter self = new DatasourceTypeFilter();
        return TeaModel.build(map, self);
    }

    public DatasourceTypeFilter setEq(String eq) {
        this.eq = eq;
        return this;
    }
    public String getEq() {
        return this.eq;
    }

}
