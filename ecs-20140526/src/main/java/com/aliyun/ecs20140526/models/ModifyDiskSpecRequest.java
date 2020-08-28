// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskSpecRequest extends TeaModel {
    @NameInMap("DiskId")
    @Validation(required = true)
    public String diskId;

    @NameInMap("PerformanceLevel")
    public String performanceLevel;

    @NameInMap("DiskCategory")
    public String diskCategory;

    @NameInMap("DryRun")
    public Boolean dryRun;

    public static ModifyDiskSpecRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskSpecRequest self = new ModifyDiskSpecRequest();
        return TeaModel.build(map, self);
    }

}
