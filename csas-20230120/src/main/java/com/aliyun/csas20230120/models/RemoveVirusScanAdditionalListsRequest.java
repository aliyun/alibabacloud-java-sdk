// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class RemoveVirusScanAdditionalListsRequest extends TeaModel {
    /**
     * <p>The collection of entry IDs to remove. At least one entry ID must be specified.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListIds")
    public java.util.List<String> listIds;

    public static RemoveVirusScanAdditionalListsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveVirusScanAdditionalListsRequest self = new RemoveVirusScanAdditionalListsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveVirusScanAdditionalListsRequest setListIds(java.util.List<String> listIds) {
        this.listIds = listIds;
        return this;
    }
    public java.util.List<String> getListIds() {
        return this.listIds;
    }

}
