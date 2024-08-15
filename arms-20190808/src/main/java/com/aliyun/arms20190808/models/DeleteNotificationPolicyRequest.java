// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DeleteNotificationPolicyRequest extends TeaModel {
    /**
     * <p>The ID of the notification policy.</p>
     * <p>For more information about how to obtain the ID of a notification policy, see <a href="https://help.aliyun.com/document_detail/2612375.html">ListNotificationPolicies</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
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
