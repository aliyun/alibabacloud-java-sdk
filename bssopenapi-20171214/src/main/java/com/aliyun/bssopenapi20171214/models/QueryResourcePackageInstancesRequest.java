// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class QueryResourcePackageInstancesRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("ExpiryTimeStart")
    public String expiryTimeStart;

    @NameInMap("ExpiryTimeEnd")
    public String expiryTimeEnd;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryResourcePackageInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryResourcePackageInstancesRequest self = new QueryResourcePackageInstancesRequest();
        return TeaModel.build(map, self);
    }

}
