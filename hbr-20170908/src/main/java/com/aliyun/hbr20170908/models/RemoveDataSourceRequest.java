// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbr20170908.models;

import com.aliyun.tea.*;

public class RemoveDataSourceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds-000bz3***myv90r</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    public static RemoveDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveDataSourceRequest self = new RemoveDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public RemoveDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

}
