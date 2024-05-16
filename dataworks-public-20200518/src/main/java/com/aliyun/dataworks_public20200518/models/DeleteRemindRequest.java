// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DeleteRemindRequest extends TeaModel {
    /**
     * <p>The ID of the custom alert rule.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RemindId")
    public Long remindId;

    public static DeleteRemindRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRemindRequest self = new DeleteRemindRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRemindRequest setRemindId(Long remindId) {
        this.remindId = remindId;
        return this;
    }
    public Long getRemindId() {
        return this.remindId;
    }

}
