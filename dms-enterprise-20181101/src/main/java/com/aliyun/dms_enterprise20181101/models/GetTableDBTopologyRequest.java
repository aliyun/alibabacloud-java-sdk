// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetTableDBTopologyRequest extends TeaModel {
    /**
     * <p>The GUID of the table in DMS.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the database to which the table belongs is a logical database, you can call the <a href="https://help.aliyun.com/document_detail/141875.html">ListLogicTables</a> operation to obtain the GUID. The value of the ReturnGuid parameter must be set to true.</p>
     * </li>
     * <li><p>If the database to which the table belongs is a physical database, you can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to obtain the GUID. The value of the ReturnGuid parameter must be set to true.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IDB_L_9032.db-test.yuyang_test</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetTableDBTopologyRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTableDBTopologyRequest self = new GetTableDBTopologyRequest();
        return TeaModel.build(map, self);
    }

    public GetTableDBTopologyRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetTableDBTopologyRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
