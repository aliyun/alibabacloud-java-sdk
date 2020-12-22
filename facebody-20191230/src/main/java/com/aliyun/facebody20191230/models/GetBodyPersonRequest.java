// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class GetBodyPersonRequest extends TeaModel {
    // 数据库ID
    @NameInMap("DbId")
    public Long dbId;

    // 人员ID
    @NameInMap("PersonId")
    public Long personId;

    public static GetBodyPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBodyPersonRequest self = new GetBodyPersonRequest();
        return TeaModel.build(map, self);
    }

    public GetBodyPersonRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public GetBodyPersonRequest setPersonId(Long personId) {
        this.personId = personId;
        return this;
    }
    public Long getPersonId() {
        return this.personId;
    }

}
