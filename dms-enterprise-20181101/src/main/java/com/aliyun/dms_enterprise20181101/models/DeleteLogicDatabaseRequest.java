// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DeleteLogicDatabaseRequest extends TeaModel {
    /**
     * <p>The ID of the logical database. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listlogicdatabases">ListLogicDatabases</a> or <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/searchdatabase">SearchDatabase</a> operation to query the ID of the logical database.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1***</p>
     */
    @NameInMap("LogicDbId")
    public Long logicDbId;

    /**
     * <p>The ID of the tenant. </p>
     * <blockquote>
     * <p> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the DMS console. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/manage-dms-tenants">Manage DMS tenants</a> topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static DeleteLogicDatabaseRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogicDatabaseRequest self = new DeleteLogicDatabaseRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogicDatabaseRequest setLogicDbId(Long logicDbId) {
        this.logicDbId = logicDbId;
        return this;
    }
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    public DeleteLogicDatabaseRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
