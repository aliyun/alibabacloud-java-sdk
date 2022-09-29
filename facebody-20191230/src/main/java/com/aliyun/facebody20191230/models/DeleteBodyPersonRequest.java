// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class DeleteBodyPersonRequest extends TeaModel {
    @NameInMap("DbId")
    public Long dbId;

    @NameInMap("PersonId")
    public Long personId;

    public static DeleteBodyPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBodyPersonRequest self = new DeleteBodyPersonRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBodyPersonRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public DeleteBodyPersonRequest setPersonId(Long personId) {
        this.personId = personId;
        return this;
    }
    public Long getPersonId() {
        return this.personId;
    }

}
