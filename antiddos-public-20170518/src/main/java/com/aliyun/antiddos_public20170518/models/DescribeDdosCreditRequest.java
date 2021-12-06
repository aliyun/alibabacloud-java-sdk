// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosCreditRequest extends TeaModel {
    @NameInMap("DdosRegionId")
    public String ddosRegionId;

    public static DescribeDdosCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosCreditRequest self = new DescribeDdosCreditRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDdosCreditRequest setDdosRegionId(String ddosRegionId) {
        this.ddosRegionId = ddosRegionId;
        return this;
    }
    public String getDdosRegionId() {
        return this.ddosRegionId;
    }

}
