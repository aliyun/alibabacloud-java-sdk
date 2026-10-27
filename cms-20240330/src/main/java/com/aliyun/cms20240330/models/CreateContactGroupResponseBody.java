// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateContactGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("contactGroupId")
    public String contactGroupId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static CreateContactGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateContactGroupResponseBody self = new CreateContactGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateContactGroupResponseBody setContactGroupId(String contactGroupId) {
        this.contactGroupId = contactGroupId;
        return this;
    }
    public String getContactGroupId() {
        return this.contactGroupId;
    }

    public CreateContactGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
