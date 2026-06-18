// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class TestLargeModelRequest extends TeaModel {
    /**
     * <p>The base models.</p>
     */
    @NameInMap("BaseModel")
    public java.util.List<String> baseModel;

    /**
     * <p>The ID of the test scenario.</p>
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
     * <p>The user dialog content.</p>
     * 
     * <strong>example:</strong>
     * <p>你好。</p>
     */
    @NameInMap("UserDialogContent")
    public String userDialogContent;

    public static TestLargeModelRequest build(java.util.Map<String, ?> map) throws Exception {
        TestLargeModelRequest self = new TestLargeModelRequest();
        return TeaModel.build(map, self);
    }

    public TestLargeModelRequest setBaseModel(java.util.List<String> baseModel) {
        this.baseModel = baseModel;
        return this;
    }
    public java.util.List<String> getBaseModel() {
        return this.baseModel;
    }

    public TestLargeModelRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public TestLargeModelRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public TestLargeModelRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public TestLargeModelRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public TestLargeModelRequest setUserDialogContent(String userDialogContent) {
        this.userDialogContent = userDialogContent;
        return this;
    }
    public String getUserDialogContent() {
        return this.userDialogContent;
    }

}
