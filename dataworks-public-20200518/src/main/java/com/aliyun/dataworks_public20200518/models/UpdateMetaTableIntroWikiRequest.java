// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class UpdateMetaTableIntroWikiRequest extends TeaModel {
    /**
     * <p>The details of the instructions on how to use the metatable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The GUID of the table. Specify the GUID in the odps.{projectName}.{tableName} format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>odps.test.table1</p>
     */
    @NameInMap("TableGuid")
    public String tableGuid;

    public static UpdateMetaTableIntroWikiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMetaTableIntroWikiRequest self = new UpdateMetaTableIntroWikiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMetaTableIntroWikiRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateMetaTableIntroWikiRequest setTableGuid(String tableGuid) {
        this.tableGuid = tableGuid;
        return this;
    }
    public String getTableGuid() {
        return this.tableGuid;
    }

}
