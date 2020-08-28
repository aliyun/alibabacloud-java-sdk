// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ModifyDiskAttributeRequest extends TeaModel {
    @NameInMap("DiskId")
    public String diskId;

    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

    @NameInMap("DiskName")
    public String diskName;

    @NameInMap("Description")
    public String description;

    @NameInMap("DeleteWithInstance")
    public Boolean deleteWithInstance;

    @NameInMap("DeleteAutoSnapshot")
    public Boolean deleteAutoSnapshot;

    @NameInMap("EnableAutoSnapshot")
    public Boolean enableAutoSnapshot;

    public static ModifyDiskAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDiskAttributeRequest self = new ModifyDiskAttributeRequest();
        return TeaModel.build(map, self);
    }

}
