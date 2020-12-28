// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class PartitionError extends TeaModel {
    @NameInMap("ErrorDetail")
    public ErrorDetail errorDetail;

    @NameInMap("PartitionValues")
    public java.util.List<String> partitionValues;

    public static PartitionError build(java.util.Map<String, ?> map) throws Exception {
        PartitionError self = new PartitionError();
        return TeaModel.build(map, self);
    }

    public PartitionError setErrorDetail(ErrorDetail errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public ErrorDetail getErrorDetail() {
        return this.errorDetail;
    }

    public PartitionError setPartitionValues(java.util.List<String> partitionValues) {
        this.partitionValues = partitionValues;
        return this;
    }
    public java.util.List<String> getPartitionValues() {
        return this.partitionValues;
    }

}
