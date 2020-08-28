// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListRemindsRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Founder")
    public String founder;

    @NameInMap("NodeId")
    public Long nodeId;

    @NameInMap("RemindTypes")
    public String remindTypes;

    @NameInMap("AlertTarget")
    public String alertTarget;

    @NameInMap("SearchText")
    public String searchText;

    public static ListRemindsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRemindsRequest self = new ListRemindsRequest();
        return TeaModel.build(map, self);
    }

}
