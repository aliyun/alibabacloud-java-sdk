// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatFlowRequest extends TeaModel {
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
    public java.util.Map<String, ?> bizExtend;

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

    public static ListChatFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatFlowRequest self = new ListChatFlowRequest();
        return TeaModel.build(map, self);
    }

    public ListChatFlowRequest setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public ListChatFlowRequest setBizExtend(java.util.Map<String, ?> bizExtend) {
        this.bizExtend = bizExtend;
        return this;
    }
    public java.util.Map<String, ?> getBizExtend() {
        return this.bizExtend;
    }

    public ListChatFlowRequest setFlowTriggerType(String flowTriggerType) {
        this.flowTriggerType = flowTriggerType;
        return this;
    }
    public String getFlowTriggerType() {
        return this.flowTriggerType;
    }

    public ListChatFlowRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListChatFlowRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListChatFlowRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListChatFlowRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListChatFlowRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListChatFlowRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListChatFlowRequest setReturnWithOnlineVersion(Boolean returnWithOnlineVersion) {
        this.returnWithOnlineVersion = returnWithOnlineVersion;
        return this;
    }
    public Boolean getReturnWithOnlineVersion() {
        return this.returnWithOnlineVersion;
    }

    public ListChatFlowRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
