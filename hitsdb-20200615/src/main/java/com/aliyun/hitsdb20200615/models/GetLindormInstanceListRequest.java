// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return per page for paging in a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword used to perform a fuzzy search by instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QueryStr")
    public String queryStr;

    /**
     * <p>The region ID of the instance. You can call the <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> operation to query the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek3b63arvg27vi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The instance type. Valid values:</p>
     * <ul>
     * <li><strong>lindorm</strong>: Lindorm single-zone instance</li>
     * <li><strong>lindorm_multizone</strong>: Lindorm multi-zone instance</li>
     * <li><strong>serverless_lindorm</strong>: Lindorm Serverless instance</li>
     * <li><strong>lindorm_standalone</strong>: Lindorm single-node instance</li>
     * <li><strong>lts</strong>: Lindorm Tunnel Service</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The data engine types supported by the instance. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Search engine</li>
     * <li><strong>2</strong>: LindormTSDB</li>
     * <li><strong>4</strong>: LindormTable</li>
     * <li><strong>8</strong>: File engine</li>
     * </ul>
     * <blockquote>
     * <p>For example, if the value is 15 (15 = 8 + 4 + 2 + 1), the instance supports the search engine, LindormTSDB, LindormTable, and file engine. If the value is 6 (6 = 4 + 2), the instance supports LindormTSDB and LindormTable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("SupportEngine")
    public Integer supportEngine;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<GetLindormInstanceListRequestTag> tag;

    public static GetLindormInstanceListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLindormInstanceListRequest self = new GetLindormInstanceListRequest();
        return TeaModel.build(map, self);
    }

    public GetLindormInstanceListRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public GetLindormInstanceListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public GetLindormInstanceListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetLindormInstanceListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetLindormInstanceListRequest setQueryStr(String queryStr) {
        this.queryStr = queryStr;
        return this;
    }
    public String getQueryStr() {
        return this.queryStr;
    }

    public GetLindormInstanceListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLindormInstanceListRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public GetLindormInstanceListRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public GetLindormInstanceListRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public GetLindormInstanceListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public GetLindormInstanceListRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

    public GetLindormInstanceListRequest setSupportEngine(Integer supportEngine) {
        this.supportEngine = supportEngine;
        return this;
    }
    public Integer getSupportEngine() {
        return this.supportEngine;
    }

    public GetLindormInstanceListRequest setTag(java.util.List<GetLindormInstanceListRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<GetLindormInstanceListRequestTag> getTag() {
        return this.tag;
    }

    public static class GetLindormInstanceListRequestTag extends TeaModel {
        /**
         * <p>The tag key. Valid values of N: 1 to 20.</p>
         * <blockquote>
         * <p>You can specify multiple tag keys. For example, the first Key specifies the first tag key, and the second Key specifies the second tag key.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20.</p>
         * <blockquote>
         * <p>You can specify multiple tag values. For example, the first Value specifies the first tag value, and the second Value specifies the second tag value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2.2.18</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetLindormInstanceListRequestTag build(java.util.Map<String, ?> map) throws Exception {
            GetLindormInstanceListRequestTag self = new GetLindormInstanceListRequestTag();
            return TeaModel.build(map, self);
        }

        public GetLindormInstanceListRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetLindormInstanceListRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
