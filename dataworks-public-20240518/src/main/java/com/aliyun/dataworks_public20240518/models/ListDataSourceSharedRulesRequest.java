// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListDataSourceSharedRulesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TargetProjectId")
    public Long targetProjectId;

    public static ListDataSourceSharedRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSourceSharedRulesRequest self = new ListDataSourceSharedRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSourceSharedRulesRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    public ListDataSourceSharedRulesRequest setTargetProjectId(Long targetProjectId) {
        this.targetProjectId = targetProjectId;
        return this;
    }
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

}
