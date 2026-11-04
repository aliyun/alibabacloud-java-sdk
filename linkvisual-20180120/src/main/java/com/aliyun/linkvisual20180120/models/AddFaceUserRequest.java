// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class AddFaceUserRequest extends TeaModel {
    /**
     * <p>The user identification ID. It supports any uppercase letter and digits. Recommended Settings: the user\&quot;s ID card number, student ID, or similar identifier.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890</p>
     */
    @NameInMap("CustomUserId")
    public String customUserId;

    /**
     * <p>The URL for downloading the user\&quot;s face image. Only JPEG and JPG image formats are supported, and the image URL cannot contain Chinese characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/test.jpeg">https://example.com/test.jpeg</a></p>
     */
    @NameInMap("FacePicUrl")
    public String facePicUrl;

    /**
     * <p>The business isolation ID. It is used for data isolation between different business applications under the same Alibaba Cloud account. It supports uppercase and lowercase English letters and digits.</p>
     * <p>For example, if you have face recognition businesses in Region A and Region B, you can set different business isolation IDs to distinguish the face recognition businesses in Region A and Region B.</p>
     * <blockquote>
     * <p>Notice: 
     * Save the business isolation ID properly for use in subsequent calls to other API operations in this business isolation zone.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ZheJiangHZ</p>
     */
    @NameInMap("IsolationId")
    public String isolationId;

    /**
     * <p>The username. It supports Chinese characters, uppercase and lowercase English letters, digits, underscores (_), and hyphens (-). The length cannot exceed 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Tony</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The custom user parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;key1&quot;:&quot;value1&quot;, &quot;key2&quot;:&quot;value2&quot;}</p>
     */
    @NameInMap("Params")
    public String params;

    public static AddFaceUserRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFaceUserRequest self = new AddFaceUserRequest();
        return TeaModel.build(map, self);
    }

    public AddFaceUserRequest setCustomUserId(String customUserId) {
        this.customUserId = customUserId;
        return this;
    }
    public String getCustomUserId() {
        return this.customUserId;
    }

    public AddFaceUserRequest setFacePicUrl(String facePicUrl) {
        this.facePicUrl = facePicUrl;
        return this;
    }
    public String getFacePicUrl() {
        return this.facePicUrl;
    }

    public AddFaceUserRequest setIsolationId(String isolationId) {
        this.isolationId = isolationId;
        return this;
    }
    public String getIsolationId() {
        return this.isolationId;
    }

    public AddFaceUserRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddFaceUserRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
