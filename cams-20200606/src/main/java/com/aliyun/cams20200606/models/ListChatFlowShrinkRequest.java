// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatFlowShrinkRequest extends TeaModel {
    /**
     * <p>The business tenant code. Default value: ALICOM_OPAAS.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The business extension information. Default value: an empty collection.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("BizExtend")
    public String bizExtendShrink;

    /**
     * <p>The flow trigger type. Valid values:</p>
     * <ul>
     * <li>TriggeredManually</li>
     * <li>TriggeredByWhatsApp</li>
     * <li>TriggeredByInstagram</li>
     * <li>TriggeredByViber</li>
     * <li>TriggeredByMessenger</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>TriggeredByWhatsApp</p>
     */
    @NameInMap("FlowTriggerType")
    public String flowTriggerType;

    /**
     * <p>The search keyword. This parameter is used for fuzzy match of flow names.</p>
     * 
     * <strong>example:</strong>
     * <p>LLM</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>Specifies whether to return the online status. Valid values:</p>
     * <ul>
     * <li><p>true: Yes.</p>
     * </li>
     * <li><p>false: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ReturnWithOnlineVersion")
    public Boolean returnWithOnlineVersion;

    /**
     * <p>The flow status. Default value: NORMAL.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListChatFlowShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatFlowShrinkRequest self = new ListChatFlowShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListChatFlowShrinkRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public ListChatFlowShrinkRequest setBizExtendShrink(String bizExtendShrink) {
        this.bizExtendShrink = bizExtendShrink;
        return this;
    }
    public String getBizExtendShrink() {
        return this.bizExtendShrink;
    }

    public ListChatFlowShrinkRequest setFlowTriggerType(String flowTriggerType) {
        this.flowTriggerType = flowTriggerType;
        return this;
    }
    public String getFlowTriggerType() {
        return this.flowTriggerType;
    }

    public ListChatFlowShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListChatFlowShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListChatFlowShrinkRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListChatFlowShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListChatFlowShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListChatFlowShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListChatFlowShrinkRequest setReturnWithOnlineVersion(Boolean returnWithOnlineVersion) {
        this.returnWithOnlineVersion = returnWithOnlineVersion;
        return this;
    }
    public Boolean getReturnWithOnlineVersion() {
        return this.returnWithOnlineVersion;
    }

    public ListChatFlowShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
