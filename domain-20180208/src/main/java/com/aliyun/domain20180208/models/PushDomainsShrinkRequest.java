// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208.models;

import com.aliyun.tea.*;

public class PushDomainsShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;example1.cn&quot;, &quot;example2.cn&quot;]</p>
     */
    @NameInMap("DomainList")
    public String domainListShrink;

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

    public static PushDomainsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        PushDomainsShrinkRequest self = new PushDomainsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public PushDomainsShrinkRequest setDomainListShrink(String domainListShrink) {
        this.domainListShrink = domainListShrink;
        return this;
    }
    public String getDomainListShrink() {
        return this.domainListShrink;
    }

    public PushDomainsShrinkRequest setOutBizId(String outBizId) {
        this.outBizId = outBizId;
        return this;
    }
    public String getOutBizId() {
        return this.outBizId;
    }

    public PushDomainsShrinkRequest setPublishRemark(String publishRemark) {
        this.publishRemark = publishRemark;
        return this;
    }
    public String getPublishRemark() {
        return this.publishRemark;
    }

    public PushDomainsShrinkRequest setReceiverAccount(String receiverAccount) {
        this.receiverAccount = receiverAccount;
        return this;
    }
    public String getReceiverAccount() {
        return this.receiverAccount;
    }

}
