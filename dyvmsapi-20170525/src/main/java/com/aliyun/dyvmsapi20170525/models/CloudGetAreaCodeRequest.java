// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudGetAreaCodeRequest extends TeaModel {
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
     * <p>11位手机号；只能查询手机号</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>17750247753</p>
     */
    @NameInMap("Tel")
    public String tel;

    public static CloudGetAreaCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudGetAreaCodeRequest self = new CloudGetAreaCodeRequest();
        return TeaModel.build(map, self);
    }

    public CloudGetAreaCodeRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudGetAreaCodeRequest setTel(String tel) {
        this.tel = tel;
        return this;
    }
    public String getTel() {
        return this.tel;
    }

}
