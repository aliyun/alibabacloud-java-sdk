// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListUserOrganizationRequest extends TeaModel {
    @NameInMap("RealPk")
    public String realPk;

    public static ListUserOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserOrganizationRequest self = new ListUserOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public ListUserOrganizationRequest setRealPk(String realPk) {
        this.realPk = realPk;
        return this;
    }
    public String getRealPk() {
        return this.realPk;
    }

}
