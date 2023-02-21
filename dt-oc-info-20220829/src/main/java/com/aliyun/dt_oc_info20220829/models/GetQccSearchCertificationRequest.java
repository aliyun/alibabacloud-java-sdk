// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20220829.models;

import com.aliyun.tea.*;

public class GetQccSearchCertificationRequest extends TeaModel {
    @NameInMap("CertCategory")
    public String certCategory;

    @NameInMap("EntName")
    public String entName;

    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetQccSearchCertificationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetQccSearchCertificationRequest self = new GetQccSearchCertificationRequest();
        return TeaModel.build(map, self);
    }

    public GetQccSearchCertificationRequest setCertCategory(String certCategory) {
        this.certCategory = certCategory;
        return this;
    }
    public String getCertCategory() {
        return this.certCategory;
    }

    public GetQccSearchCertificationRequest setEntName(String entName) {
        this.entName = entName;
        return this;
    }
    public String getEntName() {
        return this.entName;
    }

    public GetQccSearchCertificationRequest setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public GetQccSearchCertificationRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
