// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentLoginRequest extends TeaModel {
    /**
     * <p>绑定电话</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>41008502</p>
     */
    @NameInMap("BindTel")
    public String bindTel;

    /**
     * <p>取值 1.普通电话,2.分机,3.webrtc </br>说明：绑定类型如果是分机则必须先让分机电话设备注册成功。如果绑定类型为webrtc，就算调用接口成功也是无法呼叫的。如果在企业设置页面开启了自适应绑定电话类型，则系统会根据绑定的号码来找到对应的绑定类型，使用系统找到的绑定类型，此处的设置优先级低。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BindType")
    public Long bindType;

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
     * <p>登录状态，1：置闲，2：置忙，默认为1</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LoginStatus")
    public Long loginStatus;

    /**
     * <p>置忙描述</p>
     * 
     * <strong>example:</strong>
     * <p>description</p>
     */
    @NameInMap("PauseDescription")
    public String pauseDescription;

    public static CloudAgentLoginRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentLoginRequest self = new CloudAgentLoginRequest();
        return TeaModel.build(map, self);
    }

    public CloudAgentLoginRequest setBindTel(String bindTel) {
        this.bindTel = bindTel;
        return this;
    }
    public String getBindTel() {
        return this.bindTel;
    }

    public CloudAgentLoginRequest setBindType(Long bindType) {
        this.bindType = bindType;
        return this;
    }
    public Long getBindType() {
        return this.bindType;
    }

    public CloudAgentLoginRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public CloudAgentLoginRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudAgentLoginRequest setLoginStatus(Long loginStatus) {
        this.loginStatus = loginStatus;
        return this;
    }
    public Long getLoginStatus() {
        return this.loginStatus;
    }

    public CloudAgentLoginRequest setPauseDescription(String pauseDescription) {
        this.pauseDescription = pauseDescription;
        return this;
    }
    public String getPauseDescription() {
        return this.pauseDescription;
    }

}
