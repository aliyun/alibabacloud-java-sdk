// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class TestLargeModelShrinkRequest extends TeaModel {
    /**
     * <p>基础模型</p>
     */
    @NameInMap("BaseModel")
    public String baseModelShrink;

    /**
     * <p>场景ID</p>
     * 
     * <strong>example:</strong>
     * <p>1232</p>
     */
    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>用户对话内容</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("UserDialogContent")
    public String userDialogContent;

    public static TestLargeModelShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TestLargeModelShrinkRequest self = new TestLargeModelShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TestLargeModelShrinkRequest setBaseModelShrink(String baseModelShrink) {
        this.baseModelShrink = baseModelShrink;
        return this;
    }
    public String getBaseModelShrink() {
        return this.baseModelShrink;
    }

    public TestLargeModelShrinkRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public TestLargeModelShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TestLargeModelShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TestLargeModelShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TestLargeModelShrinkRequest setUserDialogContent(String userDialogContent) {
        this.userDialogContent = userDialogContent;
        return this;
    }
    public String getUserDialogContent() {
        return this.userDialogContent;
    }

}
