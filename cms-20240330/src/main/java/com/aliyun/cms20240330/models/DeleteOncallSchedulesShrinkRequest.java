// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteOncallSchedulesShrinkRequest extends TeaModel {
    @NameInMap("oncallScheduleIds")
    public String oncallScheduleIdsShrink;

    public static DeleteOncallSchedulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOncallSchedulesShrinkRequest self = new DeleteOncallSchedulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOncallSchedulesShrinkRequest setOncallScheduleIdsShrink(String oncallScheduleIdsShrink) {
        this.oncallScheduleIdsShrink = oncallScheduleIdsShrink;
        return this;
    }
    public String getOncallScheduleIdsShrink() {
        return this.oncallScheduleIdsShrink;
    }

}
