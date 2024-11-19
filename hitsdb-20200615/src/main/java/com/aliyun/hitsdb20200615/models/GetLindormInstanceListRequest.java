// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class GetLindormInstanceListRequest extends TeaModel {
    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The number of the pages to return,</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of instances to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The keyword contained in the names of Lindorm instances you want to query. Fuzzy queries based on the keyword is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("QueryStr")
    public String queryStr;

    /**
     * <p>The ID of the region in which the instances that you want to query is located. You can call the <a href="https://help.aliyun.com/document_detail/426062.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group to which the instance belongs.</p>
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
     * <p>The series of instances that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>lindorm</strong>: The instance is a single-zone Lindorm instance.</li>
     * <li><strong>lindorm_multizone</strong>: The instance is a multi-zone Lindorm instance.</li>
     * <li><strong>serverless_lindorm</strong>: The instance is a Lindorm Serverless instance.</li>
     * <li><strong>lindorm_standalone</strong>: The instance is a single-node Lindorm instance.</li>
     * <li><strong>lts</strong>: The instance is an LTS instance.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>lindorm</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    /**
     * <p>The engine supported by the instances that you want to query. The engines are indicated by different numbers:</p>
     * <ul>
     * <li><strong>1</strong>: LindormSearch.</li>
     * <li><strong>2</strong>: LindormTSDB.</li>
     * <li><strong>4</strong>: LindormTable.</li>
     * <li><strong>8</strong>: LindormDFS.</li>
     * </ul>
     * <blockquote>
     * <p>The value of this parameter is the sum of all numbers that indicate the engines supported by the instance. For example, if you set the value of this parameter to 15, which is the sum of 1, 2, 4, and 8, this operation queries instances that support all four engines. If you set the value of this parameter to 6, which is the sum of 2 and 4, this operation queries instances that support LindormTSDB and LindormTable.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("SupportEngine")
    public Integer supportEngine;

    /**
     * <p>The list of tags associated with the specified instances.</p>
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
         * <p>The key of tag N of the instances you want to query. You can specify 1 to 20 tag keys.</p>
         * <blockquote>
         * <p>You can specify the keys of multiple tags. For example, you can specify the key of the first tag in the first key-value pair contained in the value of this parameter and specify the key of the second tag in the second key-value pair.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N of the instances you want to query. You can specify 1 to 20 tag values.</p>
         * <blockquote>
         * <p>You can specify the values of multiple tags. For example, you can specify the value of the first tag in the first key-value pair contained in the value of this parameter and specify the value of the second tag in the second key-value pair.</p>
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
