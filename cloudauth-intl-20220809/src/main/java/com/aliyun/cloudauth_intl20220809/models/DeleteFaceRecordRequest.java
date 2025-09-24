// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DeleteFaceRecordRequest extends TeaModel {
    /**
     * <p>Primary Key ID</p>
     * 
     * <strong>example:</strong>
     * <p>344537</p>
     */
    @NameInMap("Id")
    public String id;

    public static DeleteFaceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFaceRecordRequest self = new DeleteFaceRecordRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFaceRecordRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
