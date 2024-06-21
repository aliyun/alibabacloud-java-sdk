// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactResponseBody extends TeaModel {
    /**
     * <p>The ID of the alert contact.</p>
     * 
     * <strong>example:</strong>
     * <p>102**</p>
     */
    @NameInMap("ContactId")
    public String contactId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>E9C9DA3D-10FE-472E-9EEF-2D0A3E41****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAlertContactResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactResponseBody self = new CreateAlertContactResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactResponseBody setContactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
    public String getContactId() {
        return this.contactId;
    }

    public CreateAlertContactResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
