// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateFaceUserRequest extends TeaModel {
    /**
     * <p>The unique ID of the user in the caller\&quot;s business system, such as an ID card number or student ID.</p>
     * 
     * <strong>example:</strong>
     * <p>52242819650301xxxx</p>
     */
    @NameInMap("CustomUserId")
    public String customUserId;

    /**
     * <p>The image download URL. Currently, JPG and JPEG formats are supported.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://test.com/test.jpg">https://test.com/test.jpg</a></p>
     */
    @NameInMap("FacePicUrl")
    public String facePicUrl;

    /**
     * <p>The isolation ID.<br>It is used for data isolation between different applications under a tenant. For example, if a user has business operations in both Zhejiang and Shaanxi, you can create two isolation IDs for the operations in Zhejiang and Xi\&quot;an respectively.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TestIsolati****</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The username.</p>
     * 
     * <strong>example:</strong>
     * <p>ZhangSan</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The user information.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;age&quot;:28, &quot;sex&quot;:&quot;male&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    /**
     * <p>The user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tibce3fsgqel****</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static UpdateFaceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFaceUserRequest self = new UpdateFaceUserRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFaceUserRequest setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
        return this;
    }
    public String getCustomUserId() {
        return this.customUserId;
    }

    public UpdateFaceUserRequest setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
        return this;
    }
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

    public UpdateFaceUserRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public UpdateFaceUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFaceUserRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public UpdateFaceUserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
