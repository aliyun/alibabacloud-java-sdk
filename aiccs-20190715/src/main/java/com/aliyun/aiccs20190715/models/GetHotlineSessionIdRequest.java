// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715.models;

import com.aliyun.tea.*;

public class GetHotlineSessionIdRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("CalledNumber")
    public String calledNumber;

    @NameInMap("CallingNumber")
    public String callingNumber;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetHotlineSessionIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineSessionIdRequest self = new GetHotlineSessionIdRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineSessionIdRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetHotlineSessionIdRequest setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
        return this;
    }
    public String getCalledNumber() {
        return this.calledNumber;
    }

    public GetHotlineSessionIdRequest setCallingNumber(String callingNumber) {
        this.callingNumber = callingNumber;
        return this;
    }
    public String getCallingNumber() {
        return this.callingNumber;
    }

    public GetHotlineSessionIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
