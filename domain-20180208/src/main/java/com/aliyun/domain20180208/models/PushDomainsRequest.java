// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class PushDomainsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;example1.cn&quot;, &quot;example2.cn&quot;]</p>
     */
    @NameInMap("DomainList")
    public java.util.List<String> domainList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>NL123456</p>
     */
    @NameInMap("OutBizId")
    public String outBizId;

    /**
     * <strong>example:</strong>
     * <p>外站用户xxx转移</p>
     */
    @NameInMap("PublishRemark")
    public String publishRemark;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>破天荒的土豆</p>
     */
    @NameInMap("ReceiverAccount")
    public String receiverAccount;

    public static PushDomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDomainsRequest self = new PushDomainsRequest();
        return TeaModel.build(map, self);
    }

    public PushDomainsRequest setDomainList(java.util.List<String> domainList) {
        this.domainList = domainList;
        return this;
    }
    public java.util.List<String> getDomainList() {
        return this.domainList;
    }

    public PushDomainsRequest setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

    public PushDomainsRequest setPublishRemark(String publishRemark) {
        this.publishRemark = publishRemark;
        return this;
    }
    public String getPublishRemark() {
        return this.publishRemark;
    }

    public PushDomainsRequest setReceiverAccount(String receiverAccount) {
        this.receiverAccount = receiverAccount;
        return this;
    }
    public String getReceiverAccount() {
        return this.receiverAccount;
    }

}
