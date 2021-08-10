// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class DeleteCopyrightPersonRequest extends TeaModel {
    @NameInMap("PersonId")
    public Long personId;

    public static DeleteCopyrightPersonRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCopyrightPersonRequest self = new DeleteCopyrightPersonRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCopyrightPersonRequest setPersonId(Long personId) {
        this.personId = personId;
        return this;
    }
    public Long getPersonId() {
        return this.personId;
    }

}
