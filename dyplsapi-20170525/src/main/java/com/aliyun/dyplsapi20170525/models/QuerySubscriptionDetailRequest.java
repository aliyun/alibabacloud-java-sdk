// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class QuerySubscriptionDetailRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The privacy number in the binding relationship, which is the X number.</p>
     * <p>Logon to the privacy protection console and go to the <a href="https://dyplsnext.console.aliyun.com/number/list">Number Management</a> page to obtain the X number. Alternatively, check the <strong>SecretNo</strong> in the response parameters when you invoke number binding API operations such as <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-bindaxb">BindAxb</a>.</p>
     * <blockquote>
     * <p>When specifying the X number, make sure it is associated with the <strong>SubsId</strong> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>139****1111</p>
     */
    @NameInMap("PhoneNoX")
    public String phoneNoX;

    /**
     * <p>The key of the number pool.</p>
     * <p>Log on to the privacy protection console and go to the <a href="https://dyplsnext.console.aliyun.com/number-pool?spm=a2c4g.11186623.0.0.7e6449bbtiHP8m">Number Pool Management</a> page to obtain the <strong>Number Pool Key</strong>.</p>
     * <blockquote>
     * <p>This parameter is required when <strong>ProductType</strong> is left empty.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>FC10000012345****</p>
     */
    @NameInMap("PoolKey")
    public String poolKey;

    /**
     * <p>The product type. Valid values:</p>
     * <ul>
     * <li><strong>AXB_170</strong></li>
     * <li><strong>AXN_170</strong></li>
     * <li><strong>AXN_95</strong></li>
     * <li><strong>AXN_EXTENSION_REUSE</strong></li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>This parameter is applicable to former Alibaba Dayu users. Alibaba Cloud users can ignore this parameter.</li>
     * <li>This parameter is required when <strong>PoolKey</strong> is left empty.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>AXB_170</p>
     */
    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The binding relationship ID.</p>
     * <p>Logon to the privacy protection console, go to the <a href="https://dyplsnext.console.aliyun.com/number/list">Number Management</a> page, filter the numbers, and click <strong>Details</strong> to view the binding relationship ID. Alternatively, check the <strong>SubsId</strong> in the response parameters when you invoke number binding API operations such as <a href="https://www.alibabacloud.com/help/en/pnp/developer-reference/api-dyplsapi-2017-05-25-bindaxb">BindAxb</a>.</p>
     * <blockquote>
     * <p>When specifying the binding relationship ID, make sure it is associated with the <strong>PhoneNoX</strong> parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000076879****</p>
     */
    @NameInMap("SubsId")
    public String subsId;

    public static QuerySubscriptionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySubscriptionDetailRequest self = new QuerySubscriptionDetailRequest();
        return TeaModel.build(map, self);
    }

    public QuerySubscriptionDetailRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public QuerySubscriptionDetailRequest setPhoneNoX(String phoneNoX) {
        this.phoneNoX = phoneNoX;
        return this;
    }
    public String getPhoneNoX() {
        return this.phoneNoX;
    }

    public QuerySubscriptionDetailRequest setPoolKey(String poolKey) {
        this.poolKey = poolKey;
        return this;
    }
    public String getPoolKey() {
        return this.poolKey;
    }

    public QuerySubscriptionDetailRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public QuerySubscriptionDetailRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public QuerySubscriptionDetailRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public QuerySubscriptionDetailRequest setSubsId(String subsId) {
        this.subsId = subsId;
        return this;
    }
    public String getSubsId() {
        return this.subsId;
    }

}
