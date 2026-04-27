// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentLogoutRequest extends TeaModel {
    /**
     * <p>座席工号；取值3-10位正整数</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1111</p>
     */
    @NameInMap("Cno")
    public String cno;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>是否忽略重复下线报错；取值：0:不忽略 1:忽略 默认为0，不忽略</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IgnoreOffline")
    public Long ignoreOffline;

    /**
     * <p>是否给座席发生kickout事件；取值： 0:不发送， 1:发送 默认为1，发送</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsKickout")
    public Long isKickout;

    /**
     * <p>取值： 0:不解除绑定电话， 1:解除绑定电话 默认为0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RemoveBinding")
    public Long removeBinding;

    public static CloudAgentLogoutRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentLogoutRequest self = new CloudAgentLogoutRequest();
        return TeaModel.build(map, self);
    }

    public CloudAgentLogoutRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public CloudAgentLogoutRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudAgentLogoutRequest setIgnoreOffline(Long ignoreOffline) {
        this.ignoreOffline = ignoreOffline;
        return this;
    }
    public Long getIgnoreOffline() {
        return this.ignoreOffline;
    }

    public CloudAgentLogoutRequest setIsKickout(Long isKickout) {
        this.isKickout = isKickout;
        return this;
    }
    public Long getIsKickout() {
        return this.isKickout;
    }

    public CloudAgentLogoutRequest setRemoveBinding(Long removeBinding) {
        this.removeBinding = removeBinding;
        return this;
    }
    public Long getRemoveBinding() {
        return this.removeBinding;
    }

}
