// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.copyright20190123.models;

import com.aliyun.tea.*;

public class SaveCopyrightPersonResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PersonId")
    public Long personId;

    @NameInMap("Success")
    public Boolean success;

    public static SaveCopyrightPersonResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveCopyrightPersonResponseBody self = new SaveCopyrightPersonResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveCopyrightPersonResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveCopyrightPersonResponseBody setPersonId(Long personId) {
        this.personId = personId;
        return this;
    }
    public Long getPersonId() {
        return this.personId;
    }

    public SaveCopyrightPersonResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
