// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudAgentSetUserDataRequest extends TeaModel {
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
     * <p>随路数据方向；取值说明：1： 座席侧，2： 非座席侧</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Direction")
    public Long direction;

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
     * <p>json格式字符串,传入的值会打入通道变量,格式：json字符串{&quot;key&quot;:&quot;value&quot;} 随路数据数据格式：key=value,不支持数组，嵌套。</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key&quot;:&quot;value&quot;}</p>
     */
    @NameInMap("UserData")
    public String userData;

    public static CloudAgentSetUserDataRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudAgentSetUserDataRequest self = new CloudAgentSetUserDataRequest();
        return TeaModel.build(map, self);
    }

    public CloudAgentSetUserDataRequest setCno(String cno) {
        this.cno = cno;
        return this;
    }
    public String getCno() {
        return this.cno;
    }

    public CloudAgentSetUserDataRequest setDirection(Long direction) {
        this.direction = direction;
        return this;
    }
    public Long getDirection() {
        return this.direction;
    }

    public CloudAgentSetUserDataRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudAgentSetUserDataRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
