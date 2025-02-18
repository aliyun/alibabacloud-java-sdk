// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class UnbindRequest extends TeaModel {
    /**
     * <p>The ID of the delivery group. You can call the <a href="https://help.aliyun.com/zh/wuying-appstreaming/developer-reference/api-appstream-center-2021-09-01-getconnectionticket">GetConnectionTicket</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aig-9ciijz60n4xsv****</p>
     */
    @NameInMap("AppInstanceGroupId")
    public String appInstanceGroupId;

    /**
     * <p>The session ID. You can call the <a href="https://help.aliyun.com/zh/wuying-appstreaming/developer-reference/api-appstream-center-2021-09-01-getconnectionticket">GetConnectionTicket</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>ai-d297eyf83g5ni****</p>
     */
    @NameInMap("AppInstanceId")
    public String appInstanceId;

    /**
     * <p>The ID of the persistent session. You can call the <a href="https://help.aliyun.com/zh/wuying-appstreaming/developer-reference/api-appstream-center-2021-09-01-getconnectionticket">GetConnectionTicket</a> operation to obtain the ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p-0bxls9m3cl7s****</p>
     */
    @NameInMap("AppInstancePersistentId")
    public String appInstancePersistentId;

    /**
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("EndUserId")
    public String endUserId;

    /**
     * <p>The product type.</p>
     * <p>Valid value:</p>
     * <ul>
     * <li>CloudApp: App Streaming</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CloudApp</p>
     */
    @NameInMap("ProductType")
    public String productType;

    public static UnbindRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindRequest self = new UnbindRequest();
        return TeaModel.build(map, self);
    }

    public UnbindRequest setAppInstanceGroupId(String appInstanceGroupId) {
        this.appInstanceGroupId = appInstanceGroupId;
        return this;
    }
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    public UnbindRequest setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    public UnbindRequest setAppInstancePersistentId(String appInstancePersistentId) {
        this.appInstancePersistentId = appInstancePersistentId;
        return this;
    }
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    public UnbindRequest setEndUserId(String endUserId) {
        this.endUserId = endUserId;
        return this;
    }
    public String getEndUserId() {
        return this.endUserId;
    }

    public UnbindRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

}
