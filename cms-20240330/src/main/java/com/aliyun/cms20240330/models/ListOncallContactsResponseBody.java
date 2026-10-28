// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ListOncallContactsResponseBody extends TeaModel {
    /**
     * <p>The IDs of the contacts.</p>
     */
    @NameInMap("contactIds")
    public java.util.List<String> contactIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8FDE2569-626B-5176-9844-28877A*****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListOncallContactsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOncallContactsResponseBody self = new ListOncallContactsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOncallContactsResponseBody setContactIds(java.util.List<String> contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public java.util.List<String> getContactIds() {
        return this.contactIds;
    }

    public ListOncallContactsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
