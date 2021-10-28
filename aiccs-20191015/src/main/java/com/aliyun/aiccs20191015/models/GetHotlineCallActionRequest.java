// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineCallActionRequest extends TeaModel {
    @NameInMap("Acc")
    public String acc;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("Act")
    public Integer act;

    @NameInMap("Biz")
    public String biz;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("FromSource")
    public String fromSource;

    @NameInMap("InstanceId")
    public String instanceId;

    public static GetHotlineCallActionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHotlineCallActionRequest self = new GetHotlineCallActionRequest();
        return TeaModel.build(map, self);
    }

    public GetHotlineCallActionRequest setAcc(String acc) {
        this.acc = acc;
        return this;
    }
    public String getAcc() {
        return this.acc;
    }

    public GetHotlineCallActionRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public GetHotlineCallActionRequest setAct(Integer act) {
        this.act = act;
        return this;
    }
    public Integer getAct() {
        return this.act;
    }

    public GetHotlineCallActionRequest setBiz(String biz) {
        this.biz = biz;
        return this;
    }
    public String getBiz() {
        return this.biz;
    }

    public GetHotlineCallActionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetHotlineCallActionRequest setFromSource(String fromSource) {
        this.fromSource = fromSource;
        return this;
    }
    public String getFromSource() {
        return this.fromSource;
    }

    public GetHotlineCallActionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
