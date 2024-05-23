// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20171016.models;

import com.aliyun.tea.*;

public class DescribeDrdsInstanceNetInfoForInnerRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DescribeDrdsInstanceNetInfoForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsInstanceNetInfoForInnerRequest self = new DescribeDrdsInstanceNetInfoForInnerRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsInstanceNetInfoForInnerRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
