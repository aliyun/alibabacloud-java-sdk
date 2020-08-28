// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableChangeLogRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    @NameInMap("ChangeType")
    public String changeType;

    @NameInMap("ObjectType")
    public String objectType;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    public static GetMetaTableChangeLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableChangeLogRequest self = new GetMetaTableChangeLogRequest();
        return TeaModel.build(map, self);
    }

}
