// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetPartitionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ds=20250101</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The table ID. For more details, refer to the response of the ListTables operation and <a href="https://help.aliyun.com/document_detail/2880092.html">description of concepts related to metadata entities.</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>maxcompute-column:11075xxxx::test_project:test_schema:test_table</p>
     */
    @NameInMap("TableId")
    public String tableId;

    public static GetPartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPartitionRequest self = new GetPartitionRequest();
        return TeaModel.build(map, self);
    }

    public GetPartitionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetPartitionRequest setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

}
