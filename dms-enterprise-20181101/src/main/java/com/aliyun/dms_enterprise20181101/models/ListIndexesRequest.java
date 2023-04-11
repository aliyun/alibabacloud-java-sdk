// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListIndexesRequest extends TeaModel {
    /**
     * <p>Specifies whether the table is a logical table.</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The ID of the table.</p>
     */
    @NameInMap("TableId")
    public String tableId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see [Manage DMS tenants](~~181330~~).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ListIndexesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIndexesRequest self = new ListIndexesRequest();
        return TeaModel.build(map, self);
    }

    public ListIndexesRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public ListIndexesRequest setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

    public ListIndexesRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
