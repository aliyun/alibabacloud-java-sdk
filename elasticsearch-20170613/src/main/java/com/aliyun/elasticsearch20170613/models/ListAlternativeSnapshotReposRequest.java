// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListAlternativeSnapshotReposRequest extends TeaModel {
    /**
     * <p>Specifies whether to return the OSS reference repositories that have already been added. Valid values:</p>
     * <ul>
     * <li>true (default): Returns the already added repositories.</li>
     * <li>false: Does not return the already added repositories.</li>
     * </ul>
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
