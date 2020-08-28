// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class SearchMetaTablesRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("AppGuid")
    public String appGuid;

    @NameInMap("Keyword")
    @Validation(required = true)
    public String keyword;

    @NameInMap("EntityType")
    public Integer entityType;

    public static SearchMetaTablesRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchMetaTablesRequest self = new SearchMetaTablesRequest();
        return TeaModel.build(map, self);
    }

}
