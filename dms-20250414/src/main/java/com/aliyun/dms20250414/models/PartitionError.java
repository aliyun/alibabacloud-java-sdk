// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class PartitionError extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>auth failed</p>
     */
    @NameInMap("ErrorDetail")
    public String errorDetail;

    @NameInMap("Values")
    public java.util.List<String> values;

    public static PartitionError build(java.util.Map<String, ?> map) throws Exception {
        PartitionError self = new PartitionError();
        return TeaModel.build(map, self);
    }

    public PartitionError setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
        return this;
    }
    public String getErrorDetail() {
        return this.errorDetail;
    }

    public PartitionError setValues(java.util.List<String> values) {
        this.values = values;
        return this;
    }
    public java.util.List<String> getValues() {
        return this.values;
    }

}
