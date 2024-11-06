// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DeleteRemoteADBDataSourceRequest extends TeaModel {
    /**
     * <p>The service ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSourceId")
    public String dataSourceId;

    /**
     * <p>The ID of the instance that uses the data provided by another instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-test</p>
     */
    @NameInMap("LocalDBInstanceId")
    public String localDBInstanceId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static DeleteRemoteADBDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRemoteADBDataSourceRequest self = new DeleteRemoteADBDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRemoteADBDataSourceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public DeleteRemoteADBDataSourceRequest setLocalDBInstanceId(String localDBInstanceId) {
        this.localDBInstanceId = localDBInstanceId;
        return this;
    }
    public String getLocalDBInstanceId() {
        return this.localDBInstanceId;
    }

    public DeleteRemoteADBDataSourceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
