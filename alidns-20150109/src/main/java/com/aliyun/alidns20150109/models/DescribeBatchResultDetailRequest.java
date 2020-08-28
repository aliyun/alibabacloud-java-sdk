// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeBatchResultDetailRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TaskId")
    public Long taskId;

    @NameInMap("BatchType")
    public String batchType;

    @NameInMap("Status")
    public String status;

    public static DescribeBatchResultDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBatchResultDetailRequest self = new DescribeBatchResultDetailRequest();
        return TeaModel.build(map, self);
    }

}
