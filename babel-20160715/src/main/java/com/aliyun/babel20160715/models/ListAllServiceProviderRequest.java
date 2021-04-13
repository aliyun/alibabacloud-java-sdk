// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class ListAllServiceProviderRequest extends TeaModel {
    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("EmpId")
    public String empId;

    public static ListAllServiceProviderRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllServiceProviderRequest self = new ListAllServiceProviderRequest();
        return TeaModel.build(map, self);
    }

    public ListAllServiceProviderRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public ListAllServiceProviderRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

}
