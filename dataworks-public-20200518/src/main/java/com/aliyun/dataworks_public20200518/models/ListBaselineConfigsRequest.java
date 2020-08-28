// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineConfigsRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("ProjectId")
    @Validation(required = true)
    public Long projectId;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("Useflag")
    public Boolean useflag;

    @NameInMap("BaselineTypes")
    public String baselineTypes;

    @NameInMap("SearchText")
    public String searchText;

    public static ListBaselineConfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineConfigsRequest self = new ListBaselineConfigsRequest();
        return TeaModel.build(map, self);
    }

}
