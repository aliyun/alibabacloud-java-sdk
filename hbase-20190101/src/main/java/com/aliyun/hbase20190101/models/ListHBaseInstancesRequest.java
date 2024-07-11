// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class ListHBaseInstancesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-t4nx81tmlixcq5i****</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ListHBaseInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHBaseInstancesRequest self = new ListHBaseInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListHBaseInstancesRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
