// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class GetHotlineCallActionRequest extends TeaModel {
    /**
     * <p>Hotline Custom Parameter in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;time&quot;:1}</p>
     */
    @NameInMap("Acc")
    public String acc;

    /**
     * <p>Agent account name, which is the phone number or mailbox specified during account registration. It is unique within the instance.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("AccountName")
    public String accountName;

    /**
     * <p>Operation Type. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Hotline.</li>
     * <li><strong>2</strong>: Online.</li>
     * <li><strong>3</strong>: Ticket.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Act")
    public Integer act;

    /**
     * <p>Business Custom Parameter in JSON format.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;name&quot;:123}</p>
     */
    @NameInMap("Biz")
    public String biz;

    /**
     * <p>Unique ID of the customer request. Used for idempotency validation. You can generate it by using a UUID.</p>
     * 
     * <strong>example:</strong>
     * <p>46c1341e-2648-447a-9b11-70b6a298d9****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Source type. Valid values:</p>
     * <ul>
     * <li><strong>hotlinebs_out</strong>: Hotline.</li>
     * <li><strong>ticket_out</strong>: Ticket.</li>
     * <li><strong>other_system_out</strong>: Other system.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>hotlinebs_out</p>
     */
    @NameInMap("FromSource")
    public String fromSource;

    /**
     * <p>Artificial Intelligence Cloud Call Service (AICCS) instance ID.
     * You can obtain it from <strong>Instance Management</strong> in the left-side navigation pane of the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
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
