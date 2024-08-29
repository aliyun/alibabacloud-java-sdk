// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907.models;

import com.aliyun.tea.*;

public class CreateAdvancedSearchFileRequest extends TeaModel {
    /**
     * <p>The SQL statement used to query resources.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SELECT * WHERE ResourceType = \&quot;ACS::ECS::Instance\&quot;</p>
     */
    @NameInMap("Sql")
    public String sql;

    public static CreateAdvancedSearchFileRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAdvancedSearchFileRequest self = new CreateAdvancedSearchFileRequest();
        return TeaModel.build(map, self);
    }

    public CreateAdvancedSearchFileRequest setSql(String sql) {
        this.sql = sql;
        return this;
    }
    public String getSql() {
        return this.sql;
    }

}
