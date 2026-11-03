// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdatePostpayUserVpcStatusRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Firewall instance. This parameter is required. If you do not specify this parameter, the API returns a 400 error. You can call the DescribeUserBuyVersion operation to obtain the Cloud Firewall instance ID of the current account.</p>
     * 
     * <strong>example:</strong>
     * <p>cfw_elasticity_public_cn-************</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The operation type. Only the enable operation is supported. Valid values:</p>
     * <ul>
     * <li>open: Enables the module.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Operate")
    public String operate;

    public static UpdatePostpayUserVpcStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostpayUserVpcStatusRequest self = new UpdatePostpayUserVpcStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePostpayUserVpcStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdatePostpayUserVpcStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdatePostpayUserVpcStatusRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

}
