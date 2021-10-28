// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class MakeCallRequest extends TeaModel {
    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("CommandCode")
    public String commandCode;

    @NameInMap("ExtInfo")
    public String extInfo;

    @NameInMap("OuterAccountId")
    public String outerAccountId;

    @NameInMap("OuterAccountType")
    public String outerAccountType;

    public static MakeCallRequest build(java.util.Map<String, ?> map) throws Exception {
        MakeCallRequest self = new MakeCallRequest();
        return TeaModel.build(map, self);
    }

    public MakeCallRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public MakeCallRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public MakeCallRequest setCommandCode(String commandCode) {
        this.commandCode = commandCode;
        return this;
    }
    public String getCommandCode() {
        return this.commandCode;
    }

    public MakeCallRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public MakeCallRequest setOuterAccountId(String outerAccountId) {
        this.outerAccountId = outerAccountId;
        return this;
    }
    public String getOuterAccountId() {
        return this.outerAccountId;
    }

    public MakeCallRequest setOuterAccountType(String outerAccountType) {
        this.outerAccountType = outerAccountType;
        return this;
    }
    public String getOuterAccountType() {
        return this.outerAccountType;
    }

}
