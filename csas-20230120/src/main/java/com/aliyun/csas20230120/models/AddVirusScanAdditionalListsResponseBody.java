// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class AddVirusScanAdditionalListsResponseBody extends TeaModel {
    /**
     * <p>The list of IDs for the newly added entries. The order is consistent with AdditionalLists in the request.</p>
     */
    @NameInMap("ListIds")
    public java.util.List<String> listIds;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddVirusScanAdditionalListsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddVirusScanAdditionalListsResponseBody self = new AddVirusScanAdditionalListsResponseBody();
        return TeaModel.build(map, self);
    }

    public AddVirusScanAdditionalListsResponseBody setListIds(java.util.List<String> listIds) {
        this.listIds = listIds;
        return this;
    }
    public java.util.List<String> getListIds() {
        return this.listIds;
    }

    public AddVirusScanAdditionalListsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
