// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAlternativeSnapshotReposRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the added OSS reference repositories. Default value: true. Valid values: true: Returns the added OSS reference repositories. false: Does not return the added OSS reference repositories.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("alreadySetItems")
    public Boolean alreadySetItems;

    public static ListAlternativeSnapshotReposRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAlternativeSnapshotReposRequest self = new ListAlternativeSnapshotReposRequest();
        return TeaModel.build(map, self);
    }

    public ListAlternativeSnapshotReposRequest setAlreadySetItems(Boolean alreadySetItems) {
        this.alreadySetItems = alreadySetItems;
        return this;
    }
    public Boolean getAlreadySetItems() {
        return this.alreadySetItems;
    }

}
