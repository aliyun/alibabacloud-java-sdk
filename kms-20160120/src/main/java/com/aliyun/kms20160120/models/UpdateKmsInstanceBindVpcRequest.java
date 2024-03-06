// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateKmsInstanceBindVpcRequest extends TeaModel {
    /**
     * <p>The VPC configuration. The configuration of each VPC contains the following content:</p>
     * <br>
     * <p>*   VpcId: the ID of the VPC.</p>
     * <p>*   VSwitchId: the vSwitch in the VPC.</p>
     * <p>*   RegionID: the ID of the region to which the VPC belongs.</p>
     * <p>*   VpcOwnerId: the Alibaba Cloud account to which the VPC belongs.</p>
     * <br>
     * <p>Format: `[{"VpcId":"${VpcId}","VSwitchId":"${VSwitchId}","RegionId":"${RegionId}","VpcOwnerId":${VpcOwnerId}},..]`.</p>
     */
    @NameInMap("BindVpcs")
    public String bindVpcs;

    /**
     * <p>The ID of the KMS instance.</p>
     */
    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    public static UpdateKmsInstanceBindVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateKmsInstanceBindVpcRequest self = new UpdateKmsInstanceBindVpcRequest();
        return TeaModel.build(map, self);
    }

    public UpdateKmsInstanceBindVpcRequest setBindVpcs(String bindVpcs) {
        this.bindVpcs = bindVpcs;
        return this;
    }
    public String getBindVpcs() {
        return this.bindVpcs;
    }

    public UpdateKmsInstanceBindVpcRequest setKmsInstanceId(String kmsInstanceId) {
        this.kmsInstanceId = kmsInstanceId;
        return this;
    }
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

}
