// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class CloudListSkillRequest extends TeaModel {
    /**
     * <p>描述</p>
     * 
     * <strong>example:</strong>
     * <p>comment1</p>
     */
    @NameInMap("Comment")
    public String comment;

    /**
     * <p>呼叫中心 id</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7000002</p>
     */
    @NameInMap("EnterpriseId")
    public Long enterpriseId;

    /**
     * <p>条数；正整数，默认值是10，最大值是500</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Limit")
    public String limit;

    /**
     * <p>技能名称</p>
     * 
     * <strong>example:</strong>
     * <p>name1</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>从第几条开始；正整数，默认值是0</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Offset")
    public String offset;

    /**
     * <p>排序方式,按照创建时间排序；0正序 1倒序</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Order")
    public Long order;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static CloudListSkillRequest build(java.util.Map<String, ?> map) throws Exception {
        CloudListSkillRequest self = new CloudListSkillRequest();
        return TeaModel.build(map, self);
    }

    public CloudListSkillRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public CloudListSkillRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public CloudListSkillRequest setLimit(String limit) {
        this.limit = limit;
        return this;
    }
    public String getLimit() {
        return this.limit;
    }

    public CloudListSkillRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CloudListSkillRequest setOffset(String offset) {
        this.offset = offset;
        return this;
    }
    public String getOffset() {
        return this.offset;
    }

    public CloudListSkillRequest setOrder(Long order) {
        this.order = order;
        return this;
    }
    public Long getOrder() {
        return this.order;
    }

    public CloudListSkillRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CloudListSkillRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CloudListSkillRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
