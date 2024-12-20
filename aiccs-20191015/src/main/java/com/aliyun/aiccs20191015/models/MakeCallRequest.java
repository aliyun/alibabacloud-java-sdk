// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class MakeCallRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>130****0000</p>
     */
    @NameInMap("CalledNumber")
    public String calledNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0571456****</p>
     */
    @NameInMap("CallingNumber")
    public String callingNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>outBound_Call</p>
     */
    @NameInMap("CommandCode")
    public String commandCode;

    /**
     * <strong>example:</strong>
     * <p>{&quot;bizId&quot;: 23323}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("OuterAccountId")
    public String outerAccountId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALIPAY</p>
     */
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
