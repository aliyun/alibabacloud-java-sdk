// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_csm_succ20210527.models;

import com.aliyun.tea.*;

public class AccessClueRequest extends TeaModel {
    @NameInMap("ServiceProduct")
    public String serviceProduct;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("UserName")
    public String userName;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("CidName")
    public String cidName;

    public static AccessClueRequest build(java.util.Map<String, ?> map) throws Exception {
        AccessClueRequest self = new AccessClueRequest();
        return TeaModel.build(map, self);
    }

    public AccessClueRequest setServiceProduct(String serviceProduct) {
        this.serviceProduct = serviceProduct;
        return this;
    }
    public String getServiceProduct() {
        return this.serviceProduct;
    }

    public AccessClueRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AccessClueRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public AccessClueRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public AccessClueRequest setCidName(String cidName) {
        this.cidName = cidName;
        return this;
    }
    public String getCidName() {
        return this.cidName;
    }

}
