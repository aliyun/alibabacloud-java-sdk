// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteFaceGroupRequest extends TeaModel {
    /**
     * <p>Primary key ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16681</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteFaceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceGroupRequest self = new DeleteFaceGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceGroupRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
