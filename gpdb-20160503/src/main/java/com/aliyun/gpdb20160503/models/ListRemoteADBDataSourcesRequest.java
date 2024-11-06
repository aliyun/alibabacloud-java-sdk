// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class ListRemoteADBDataSourcesRequest extends TeaModel {
    /**
     * <p>Instance name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-xxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Data source ID.</p>
     * 
     * <strong>example:</strong>
     * <p>119</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static ListRemoteADBDataSourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRemoteADBDataSourcesRequest self = new ListRemoteADBDataSourcesRequest();
        return TeaModel.build(map, self);
    }

    public ListRemoteADBDataSourcesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ListRemoteADBDataSourcesRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListRemoteADBDataSourcesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
