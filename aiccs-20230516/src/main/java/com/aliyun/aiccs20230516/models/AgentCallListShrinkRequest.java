// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AgentCallListShrinkRequest extends TeaModel {
    /**
     * <p>坐席ID</p>
     * 
     * <strong>example:</strong>
     * <p>51</p>
     */
    @NameInMap("AgentId")
    public Long agentId;

    /**
     * <p>坐席标签</p>
     * 
     * <strong>example:</strong>
     * <p>abcd</p>
     */
    @NameInMap("AgentTag")
    public String agentTag;

    /**
     * <p>开始外呼时间</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-06 10:10:10</p>
     */
    @NameInMap("CallDate")
    public String callDate;

    /**
     * <p>结束外呼时间</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-03-07 10:10:10</p>
     */
    @NameInMap("EndCallDate")
    public String endCallDate;

    /**
     * <p>号码MD5列表</p>
     */
    @NameInMap("NumberMD5s")
    public String numberMD5sShrink;

    /**
     * <p>号码列表</p>
     */
    @NameInMap("Numbers")
    public String numbersShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>页数</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Page")
    public Long page;

    /**
     * <p>每页外呼记录数</p>
     * 
     * <strong>example:</strong>
     * <p>14</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>用户自定义标签列表</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static AgentCallListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AgentCallListShrinkRequest self = new AgentCallListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AgentCallListShrinkRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public AgentCallListShrinkRequest setAgentTag(String agentTag) {
        this.agentTag = agentTag;
        return this;
    }
    public String getAgentTag() {
        return this.agentTag;
    }

    public AgentCallListShrinkRequest setCallDate(String callDate) {
        this.callDate = callDate;
        return this;
    }
    public String getCallDate() {
        return this.callDate;
    }

    public AgentCallListShrinkRequest setEndCallDate(String endCallDate) {
        this.endCallDate = endCallDate;
        return this;
    }
    public String getEndCallDate() {
        return this.endCallDate;
    }

    public AgentCallListShrinkRequest setNumberMD5sShrink(String numberMD5sShrink) {
        this.numberMD5sShrink = numberMD5sShrink;
        return this;
    }
    public String getNumberMD5sShrink() {
        return this.numberMD5sShrink;
    }

    public AgentCallListShrinkRequest setNumbersShrink(String numbersShrink) {
        this.numbersShrink = numbersShrink;
        return this;
    }
    public String getNumbersShrink() {
        return this.numbersShrink;
    }

    public AgentCallListShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AgentCallListShrinkRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public AgentCallListShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public AgentCallListShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AgentCallListShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AgentCallListShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
