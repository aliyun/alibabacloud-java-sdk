// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateAlertContactGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>446*</p>
     */
    @NameInMap("ContactGroupId")
    public String contactGroupId;

    /**
     * <strong>example:</strong>
     * <p>70675725-8F11-4817-8106-CFE0AD71****</p>
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
