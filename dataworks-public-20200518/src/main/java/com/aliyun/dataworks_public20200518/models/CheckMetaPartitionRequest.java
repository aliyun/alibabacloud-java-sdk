// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckMetaPartitionRequest extends TeaModel {
    @NameInMap("TableGuid")
    @Validation(required = true)
    public String tableGuid;

    @NameInMap("Partition")
    @Validation(required = true)
    public String partition;

    public static CheckMetaPartitionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckMetaPartitionRequest self = new CheckMetaPartitionRequest();
        return TeaModel.build(map, self);
    }

}
