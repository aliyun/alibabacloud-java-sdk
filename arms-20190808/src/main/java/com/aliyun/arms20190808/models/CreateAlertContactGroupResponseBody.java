// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the alert contact group.</p>
     */
    @NameInMap("ContactGroupId")
    public String contactGroupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAlertContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertContactGroupResponseBody self = new CreateAlertContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAlertContactGroupResponseBody setContactGroupId(String contactGroupId) {
        this.contactGroupId = contactGroupId;
        return this;
    }
    public String getContactGroupId() {
        return this.contactGroupId;
    }

    public CreateAlertContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
