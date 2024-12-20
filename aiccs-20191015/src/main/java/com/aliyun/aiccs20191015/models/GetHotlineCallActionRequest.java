// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineCallActionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;time&quot;:1}</p>
     */
    @NameInMap("Acc")
    public String acc;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Act")
    public Integer act;

    /**
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:123}</p>
     */
    @NameInMap("Biz")
    public String biz;

    /**
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d9****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>hotlinebs_out</p>
     */
    @NameInMap("FromSource")
    public String fromSource;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
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
