// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableOutputRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    @NameInMap("StartDate")
    @Validation(required = true)
    public String startDate;

    @NameInMap("EndDate")
    @Validation(required = true)
    public String endDate;

    public static GetMetaTableOutputRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableOutputRequest self = new GetMetaTableOutputRequest();
        return TeaModel.build(map, self);
    }

}
