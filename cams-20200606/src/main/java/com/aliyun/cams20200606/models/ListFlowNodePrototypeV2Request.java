// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListFlowNodePrototypeV2Request extends TeaModel {
    /**
     * <p>The business tenant code. The default value is ALICOM_OPAAS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ALICOM_OPAAS</p>
     */
    @NameInMap("BizCode")
    public String bizCode;

    /**
     * <p>The code for the component group. Valid values:</p>
     * <ul>
     * <li><p>Messaging: Message components.</p>
     * </li>
     * <li><p>Core: Core components.</p>
     * </li>
     * <li><p>Intelligence: Intelligence components.</p>
     * </li>
     * <li><p>Contact: Contact management components.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Core</p>
     */
    @NameInMap("GroupCode")
    public String groupCode;

    /**
     * <p>The search keyword. This parameter is used to perform a fuzzy query by flow component name.</p>
     * 
     * <strong>example:</strong>
     * <p>WhatsApp</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
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

    public static ListFlowNodePrototypeV2Request build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodePrototypeV2Request self = new ListFlowNodePrototypeV2Request();
        return TeaModel.build(map, self);
    }

    public ListFlowNodePrototypeV2Request setBizCode(String bizCode) {
        this.bizCode = bizCode;
        return this;
    }
    public String getBizCode() {
        return this.bizCode;
    }

    public ListFlowNodePrototypeV2Request setGroupCode(String groupCode) {
        this.groupCode = groupCode;
        return this;
    }
    public String getGroupCode() {
        return this.groupCode;
    }

    public ListFlowNodePrototypeV2Request setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListFlowNodePrototypeV2Request setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListFlowNodePrototypeV2Request setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public ListFlowNodePrototypeV2Request setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListFlowNodePrototypeV2Request setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListFlowNodePrototypeV2Request setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
