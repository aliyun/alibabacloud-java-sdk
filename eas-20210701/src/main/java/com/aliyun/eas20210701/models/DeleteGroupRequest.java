// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class DeleteGroupRequest extends TeaModel {
    /**
     * <p>Specifies whether cascade delete is enabled. If enabled, deleting the service group automatically deletes all services in the service group. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CascadeDelete")
    public String cascadeDelete;

    public static DeleteGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGroupRequest self = new DeleteGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGroupRequest setCascadeDelete(String cascadeDelete) {
        this.cascadeDelete = cascadeDelete;
        return this;
    }
    public String getCascadeDelete() {
        return this.cascadeDelete;
    }

}
