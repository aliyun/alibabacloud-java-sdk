// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class ListFeatureTablesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("dataSourceId")
    public String dataSourceId;

    /**
     * <strong>example:</strong>
     * <p>UserFeatureTable</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("updateFrequency")
    public String updateFrequency;

    public static ListFeatureTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFeatureTablesRequest self = new ListFeatureTablesRequest();
        return TeaModel.build(map, self);
    }

    public ListFeatureTablesRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListFeatureTablesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ListFeatureTablesRequest setUpdateFrequency(String updateFrequency) {
        this.updateFrequency = updateFrequency;
        return this;
    }
    public String getUpdateFrequency() {
        return this.updateFrequency;
    }

}
