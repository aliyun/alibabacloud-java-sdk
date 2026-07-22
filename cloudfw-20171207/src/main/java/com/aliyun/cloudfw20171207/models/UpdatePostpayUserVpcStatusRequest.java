// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdatePostpayUserVpcStatusRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Firewall instance.</p>
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
     * <p>The operation type. Currently, only the activation operation is supported. Valid values:</p>
     * <ul>
     * <li>open: activation</li>
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
