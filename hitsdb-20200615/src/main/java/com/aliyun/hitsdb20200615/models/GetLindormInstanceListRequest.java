// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>A keyword for a fuzzy search on instance names.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QueryStr")
    public String queryStr;

    /**
     * <p>The ID of the region where the instance is located. Call <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> to obtain the region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
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
     * <p>The type of the instance. Valid values:</p>
     * <ul>
     * <li><p><strong>lindorm</strong>: a single-zone Lindorm instance.</p>
     * </li>
     * <li><p><strong>lindorm_multizone</strong>: a multi-zone Lindorm instance.</p>
     * </li>
     * <li><p><strong>serverless_lindorm</strong>: a Lindorm Serverless instance.</p>
     * </li>
     * <li><p><strong>lindorm_standalone</strong>: a Lindorm standalone instance.</p>
     * </li>
     * <li><p><strong>lts</strong>: the Lindorm Tunnel Service (LTS) type.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The type of the engine supported by the instance that you want to query. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: search engine.</p>
     * </li>
     * <li><p><strong>2</strong>: LindormTSDB.</p>
     * </li>
     * <li><p><strong>4</strong>: LindormTable.</p>
     * </li>
     * <li><p><strong>8</strong>: file engine.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For example, a value of 15 (8 + 4 + 2 + 1) indicates that the instance supports the file engine, LindormTable, LindormTSDB, and the search engine. A value of 6 (4 + 2) indicates that the instance supports LindormTSDB and LindormTable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SupportEngine")
    public Integer supportEngine;

    /**
     * <p>A list of tags. You can specify up to 20 tags.</p>
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
         * <p>The key of the tag.</p>
         * <blockquote>
         * <p>You can pass in keys for multiple tags. For example, the Key in the first pair represents the key for the first tag. The Key in the second pair represents the key for the second tag.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * <blockquote>
         * <p>You can provide values for multiple tags. For example, the Value in the first pair is the value for the first tag. The Value in the second pair is the value for the second tag.</p>
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
