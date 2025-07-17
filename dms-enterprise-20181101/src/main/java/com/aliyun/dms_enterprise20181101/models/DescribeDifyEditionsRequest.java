// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class DescribeDifyEditionsRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DataRegion")
    public String dataRegion;

    public static DescribeDifyEditionsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDifyEditionsRequest self = new DescribeDifyEditionsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDifyEditionsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeDifyEditionsRequest setDataRegion(String dataRegion) {
        this.dataRegion = dataRegion;
        return this;
    }
    public String getDataRegion() {
        return this.dataRegion;
    }

}
