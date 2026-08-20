// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteProhibitedSoftwareRequest extends TeaModel {
    /**
     * <p>The IDs of the prohibited software to delete. Duplicate IDs are not allowed. You can specify up to 100 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SoftwareIds")
    public java.util.List<String> softwareIds;

    public static DeleteProhibitedSoftwareRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteProhibitedSoftwareRequest self = new DeleteProhibitedSoftwareRequest();
        return TeaModel.build(map, self);
    }

    public DeleteProhibitedSoftwareRequest setSoftwareIds(java.util.List<String> softwareIds) {
        this.softwareIds = softwareIds;
        return this;
    }
    public java.util.List<String> getSoftwareIds() {
        return this.softwareIds;
    }

}
