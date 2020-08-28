// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edasmsc20200323.models;

import com.aliyun.tea.*;

public class GetOutlierApplicationListRequest extends TeaModel {
    @NameInMap("Region")
    @Validation(required = true)
    public String region;

    @NameInMap("Source")
    @Validation(required = true)
    public String source;

    @NameInMap("RpcType")
    @Validation(required = true)
    public String rpcType;

    public static GetOutlierApplicationListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetOutlierApplicationListRequest self = new GetOutlierApplicationListRequest();
        return TeaModel.build(map, self);
    }

}
