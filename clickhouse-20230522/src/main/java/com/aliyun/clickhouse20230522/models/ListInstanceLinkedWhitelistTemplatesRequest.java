// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class ListInstanceLinkedWhitelistTemplatesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc-exadfas</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListInstanceLinkedWhitelistTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceLinkedWhitelistTemplatesRequest self = new ListInstanceLinkedWhitelistTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceLinkedWhitelistTemplatesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ListInstanceLinkedWhitelistTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
