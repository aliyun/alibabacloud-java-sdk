// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetRemindRequest extends TeaModel {
    /**
     * <p>The custom alert rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("RemindId")
    public Long remindId;

    public static GetRemindRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRemindRequest self = new GetRemindRequest();
        return TeaModel.build(map, self);
    }

    public GetRemindRequest setRemindId(Long remindId) {
        this.remindId = remindId;
        return this;
    }
    public Long getRemindId() {
        return this.remindId;
    }

}
