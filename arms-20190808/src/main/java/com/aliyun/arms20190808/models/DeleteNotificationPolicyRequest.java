// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteNotificationPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the notification policy.</p>
     */
    @NameInMap("Id")
    public Long id;

    public static DeleteNotificationPolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteNotificationPolicyRequest self = new DeleteNotificationPolicyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteNotificationPolicyRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
