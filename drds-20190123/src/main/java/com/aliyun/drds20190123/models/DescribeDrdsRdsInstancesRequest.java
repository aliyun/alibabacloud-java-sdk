// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class DescribeDrdsRdsInstancesRequest extends TeaModel {
    /**
     * <p>The ID of the PolarDB-X instance.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/139284.html">DescribeDrdsInstances</a> operation to query the information about instances in the specified account, such as the IDs of the instances.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>drds*************</p>
     */
    @NameInMap("DrdsInstanceId")
    public String drdsInstanceId;

    public static DescribeDrdsRdsInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDrdsRdsInstancesRequest self = new DescribeDrdsRdsInstancesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDrdsRdsInstancesRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

}
