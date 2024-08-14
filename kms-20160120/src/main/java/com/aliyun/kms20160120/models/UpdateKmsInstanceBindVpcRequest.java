// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class UpdateKmsInstanceBindVpcRequest extends TeaModel {
    /**
     * <p>The VPC configuration. The configuration of each VPC contains the following content:</p>
     * <ul>
     * <li>VpcId: the ID of the VPC.</li>
     * <li>VSwitchId: the vSwitch in the VPC.</li>
     * <li>RegionID: the ID of the region to which the VPC belongs.</li>
     * <li>VpcOwnerId: the Alibaba Cloud account to which the VPC belongs.</li>
     * </ul>
     * <p>Format: <code>[{&quot;VpcId&quot;:&quot;${VpcId}&quot;,&quot;VSwitchId&quot;:&quot;${VSwitchId}&quot;,&quot;RegionId&quot;:&quot;${RegionId}&quot;,&quot;VpcOwnerId&quot;:${VpcOwnerId}},..]</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;VpcId&quot;:&quot;vpc-bp1go9qvmj78j4f4c****&quot;,&quot;VSwitchId&quot;:&quot;vsw-bp16c5pvvcf0fp5b9****&quot;,&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,&quot;VpcOwnerId&quot;:120708975881****},{&quot;VpcId&quot;:&quot;vpc-bp14c07ucxg6h1xjm****&quot;,&quot;VSwitchId&quot;:&quot;vsw-bp1wujtnspi1l3gvu****&quot;,&quot;RegionId&quot;:&quot;cn-hangzhou&quot;,&quot;VpcOwnerId&quot;:119285303511****}]</p>
     */
    @NameInMap("BindVpcs")
    public String bindVpcs;

    /**
     * <p>The ID of the KMS instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>kst-phzz64f722a1buamw0****</p>
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
