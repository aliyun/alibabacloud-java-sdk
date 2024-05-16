// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteDataSourceRequest extends TeaModel {
    /**
     * <p>The ID of the data source. You can call the [ListDataSources](https://help.aliyun.com/document_detail/211431.html) operation to obtain the ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSourceId")
    public Long dataSourceId;

    public static DeleteDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourceRequest self = new DeleteDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourceRequest setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

}
