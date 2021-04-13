// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.babel20160715.models;

import com.aliyun.tea.*;

public class NotifyUserBusinessCommandRequest extends TeaModel {
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("CallerType")
    public String callerType;

    @NameInMap("EmpId")
    public String empId;

    @NameInMap("Uid")
    public String uid;

    @NameInMap("CommandBody")
    public String commandBody;

    @NameInMap("ClientToken")
    public String clientToken;

    public static NotifyUserBusinessCommandRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyUserBusinessCommandRequest self = new NotifyUserBusinessCommandRequest();
        return TeaModel.build(map, self);
    }

    public NotifyUserBusinessCommandRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public NotifyUserBusinessCommandRequest setCallerType(String callerType) {
        this.callerType = callerType;
        return this;
    }
    public String getCallerType() {
        return this.callerType;
    }

    public NotifyUserBusinessCommandRequest setEmpId(String empId) {
        this.empId = empId;
        return this;
    }
    public String getEmpId() {
        return this.empId;
    }

    public NotifyUserBusinessCommandRequest setUid(String uid) {
        this.uid = uid;
        return this;
    }
    public String getUid() {
        return this.uid;
    }

    public NotifyUserBusinessCommandRequest setCommandBody(String commandBody) {
        this.commandBody = commandBody;
        return this;
    }
    public String getCommandBody() {
        return this.commandBody;
    }

    public NotifyUserBusinessCommandRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
