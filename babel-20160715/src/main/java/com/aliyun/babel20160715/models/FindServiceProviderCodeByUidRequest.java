// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class FindServiceProviderCodeByUidRequest extends TeaModel {
    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("EmpId")
    public String empId;

    @NameInMap("Uid")
    public String uid;

    public static FindServiceProviderCodeByUidRequest build(java.util.Map<String, ?> map) throws Exception {
        FindServiceProviderCodeByUidRequest self = new FindServiceProviderCodeByUidRequest();
        return TeaModel.build(map, self);
    }

    public FindServiceProviderCodeByUidRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public FindServiceProviderCodeByUidRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public FindServiceProviderCodeByUidRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

}
