// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CompanyListByConditionRequest extends TeaModel {
    @NameInMap("AliyunJwt")
    public String aliyunJwt;

    @NameInMap("CustomSeeSelf")
    public Boolean customSeeSelf;

    @NameInMap("IsvType")
    public String isvType;

    @NameInMap("SupportType")
    public String supportType;

    public static CompanyListByConditionRequest build(java.util.Map<String, ?> map) throws Exception {
        CompanyListByConditionRequest self = new CompanyListByConditionRequest();
        return TeaModel.build(map, self);
    }

    public CompanyListByConditionRequest setAliyunJwt(String aliyunJwt) {
        this.aliyunJwt = aliyunJwt;
        return this;
    }
    public String getAliyunJwt() {
        return this.aliyunJwt;
    }

    public CompanyListByConditionRequest setCustomSeeSelf(Boolean customSeeSelf) {
        this.customSeeSelf = customSeeSelf;
        return this;
    }
    public Boolean getCustomSeeSelf() {
        return this.customSeeSelf;
    }

    public CompanyListByConditionRequest setIsvType(String isvType) {
        this.isvType = isvType;
        return this;
    }
    public String getIsvType() {
        return this.isvType;
    }

    public CompanyListByConditionRequest setSupportType(String supportType) {
        this.supportType = supportType;
        return this;
    }
    public String getSupportType() {
        return this.supportType;
    }

}
