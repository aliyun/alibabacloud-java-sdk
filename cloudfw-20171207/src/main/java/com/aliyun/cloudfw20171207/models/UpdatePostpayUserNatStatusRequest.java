// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class UpdatePostpayUserNatStatusRequest extends TeaModel {
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

    /**
     * <p>The operation type.</p>
     * <ul>
     * <li>Set the value to open.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("Operate")
    public String operate;

    public static UpdatePostpayUserNatStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePostpayUserNatStatusRequest self = new UpdatePostpayUserNatStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePostpayUserNatStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdatePostpayUserNatStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdatePostpayUserNatStatusRequest setOperate(String operate) {
        this.operate = operate;
        return this;
    }
    public String getOperate() {
        return this.operate;
    }

}
