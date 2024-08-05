// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetVpcAccessResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CEF72CEB-54B6-4AE8-B225-F876FF7BZ015</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the VPC access authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>4c68e061860f441ab72af7404137440e</p>
     */
    @NameInMap("VpcAccessId")
    public String vpcAccessId;

    public static SetVpcAccessResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetVpcAccessResponseBody self = new SetVpcAccessResponseBody();
        return TeaModel.build(map, self);
    }

    public SetVpcAccessResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SetVpcAccessResponseBody setVpcAccessId(String vpcAccessId) {
        this.vpcAccessId = vpcAccessId;
        return this;
    }
    public String getVpcAccessId() {
        return this.vpcAccessId;
    }

}
