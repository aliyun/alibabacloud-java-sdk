// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteOncallSchedulesRequest extends TeaModel {
    /**
     * <p>The IDs of the on-call schedules.</p>
     */
    @NameInMap("oncallScheduleIds")
    public java.util.List<String> oncallScheduleIds;

    public static DeleteOncallSchedulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOncallSchedulesRequest self = new DeleteOncallSchedulesRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOncallSchedulesRequest setOncallScheduleIds(java.util.List<String> oncallScheduleIds) {
        this.oncallScheduleIds = oncallScheduleIds;
        return this;
    }
    public java.util.List<String> getOncallScheduleIds() {
        return this.oncallScheduleIds;
    }

}
