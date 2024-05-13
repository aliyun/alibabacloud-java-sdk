// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.antiddos_public20170518.models;

import com.aliyun.tea.*;

public class DescribeDdosCreditRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     * <br>
     * <p>> You can call the [DescribeRegions](https://help.aliyun.com/document_detail/353250.html) operation to query the most recent region list.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
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
