// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class DeleteMobileAgentPackageRequest extends TeaModel {
    /**
     * <p>The list of packages.</p>
     */
    @NameInMap("PackageIds")
    public java.util.List<String> packageIds;

    public static DeleteMobileAgentPackageRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMobileAgentPackageRequest self = new DeleteMobileAgentPackageRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMobileAgentPackageRequest setPackageIds(java.util.List<String> packageIds) {
        this.packageIds = packageIds;
        return this;
    }
    public java.util.List<String> getPackageIds() {
        return this.packageIds;
    }

}
