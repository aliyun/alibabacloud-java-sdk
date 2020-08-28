// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListBaselineStatusesRequest extends TeaModel {
    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Bizdate")
    @Validation(required = true)
    public String bizdate;

    @NameInMap("Priority")
    public String priority;

    @NameInMap("SearchText")
    public String searchText;

    @NameInMap("Owner")
    public String owner;

    @NameInMap("TopicId")
    public Long topicId;

    @NameInMap("FinishStatus")
    public String finishStatus;

    @NameInMap("Status")
    public String status;

    @NameInMap("BaselineTypes")
    public String baselineTypes;

    public static ListBaselineStatusesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBaselineStatusesRequest self = new ListBaselineStatusesRequest();
        return TeaModel.build(map, self);
    }

}
