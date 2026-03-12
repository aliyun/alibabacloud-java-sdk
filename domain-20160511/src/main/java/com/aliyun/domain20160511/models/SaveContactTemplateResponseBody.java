// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class SaveContactTemplateResponseBody extends TeaModel {
    @NameInMap("ContactTemplateId")
    public Long contactTemplateId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SaveContactTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveContactTemplateResponseBody self = new SaveContactTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveContactTemplateResponseBody setContactTemplateId(Long contactTemplateId) {
        this.contactTemplateId = contactTemplateId;
        return this;
    }
    public Long getContactTemplateId() {
        return this.contactTemplateId;
    }

    public SaveContactTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveContactTemplateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
