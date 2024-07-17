// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class CreateLockRequest extends TeaModel {
    /**
     * <p>LockObjList</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;databaseName&quot;:&quot;db&quot;,&quot;tableName&quot;:&quot;test&quot;}</p>
     */
    @NameInMap("LockObjList")
    public java.util.List<LockObj> lockObjList;

    public static CreateLockRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLockRequest self = new CreateLockRequest();
        return TeaModel.build(map, self);
    }

    public CreateLockRequest setLockObjList(java.util.List<LockObj> lockObjList) {
        this.lockObjList = lockObjList;
        return this;
    }
    public java.util.List<LockObj> getLockObjList() {
        return this.lockObjList;
    }

}
