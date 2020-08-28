// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class ListMcdpAimRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("EmptyTag")
    public String emptyTag;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("Name")
    public String name;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Sort")
    public String sort;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListMcdpAimRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMcdpAimRequest self = new ListMcdpAimRequest();
        return TeaModel.build(map, self);
    }

}
