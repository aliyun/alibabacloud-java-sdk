// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribePostpayUserVpcStatusRequest extends TeaModel {
    /**
     * <p>The instance ID of Cloud Firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>cfw_elasticity_public_cn-************</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the content within the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default)</li>
     * <li><strong>en</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribePostpayUserVpcStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePostpayUserVpcStatusRequest self = new DescribePostpayUserVpcStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribePostpayUserVpcStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribePostpayUserVpcStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
