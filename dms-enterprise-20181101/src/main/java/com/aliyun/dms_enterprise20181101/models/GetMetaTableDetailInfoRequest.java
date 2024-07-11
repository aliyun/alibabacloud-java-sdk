// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetMetaTableDetailInfoRequest extends TeaModel {
    /**
     * <p>The GUID of the table in Data Management (DMS).</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/141875.html">ListLogicTables</a> operation with ReturnGuid set to true to query the GUIDs of logical tables in a specific logical database.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation with ReturnGuid set to true to query the GUIDs of tables in a specific physical database.</p>
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
     * <p>To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the Manage DMS tenants topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetMetaTableDetailInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableDetailInfoRequest self = new GetMetaTableDetailInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetMetaTableDetailInfoRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

    public GetMetaTableDetailInfoRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
