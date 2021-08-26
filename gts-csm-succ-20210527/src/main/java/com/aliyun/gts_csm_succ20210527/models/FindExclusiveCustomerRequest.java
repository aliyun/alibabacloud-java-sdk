// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_csm_succ20210527.models;

import com.aliyun.tea.*;

public class FindExclusiveCustomerRequest extends TeaModel {
    @NameInMap("CidInfo")
    public String cidInfo;

    @NameInMap("EmpId")
    public String empId;

    public static FindExclusiveCustomerRequest build(java.util.Map<String, ?> map) throws Exception {
        FindExclusiveCustomerRequest self = new FindExclusiveCustomerRequest();
        return TeaModel.build(map, self);
    }

    public FindExclusiveCustomerRequest setCidInfo(String cidInfo) {
        this.cidInfo = cidInfo;
        return this;
    }
    public String getCidInfo() {
        return this.cidInfo;
    }

    public FindExclusiveCustomerRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

}
