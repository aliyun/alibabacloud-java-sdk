// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class VerifyMaterialRequest extends TeaModel {
    /**
     * <p>A unique ID that identifies a single authentication task, not exceeding 64 characters. For a single authentication task, the system supports unlimited submissions until the final authentication is passed and the task is completed.</p>
     * <blockquote>
     * <p>Different BizIds are required for different authentication tasks.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>39ecf51e-2f81-4dc5-90ee-ff86125b****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>Identifier for the business scenario using the real-person authentication service. Please refer to <a href="https://help.aliyun.com/document_detail/127885.html">Business Setup</a> and complete the creation in the console first.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RPMinTest</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <p>HTTP or HTTPS link to the frontal face image.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example.jpg</a></p>
     */
    @NameInMap("FaceImageUrl")
    public String faceImageUrl;

    /**
     * <p>HTTP or HTTPS link to the national emblem side of the ID card.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example3.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example3.jpg</a></p>
     */
    @NameInMap("IdCardBackImageUrl")
    public String idCardBackImageUrl;

    /**
     * <p>HTTP or HTTPS link to the portrait side of the ID card image.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://image-demo.img-cn-hangzhou.aliyuncs.com/example2.jpg">http://image-demo.img-cn-hangzhou.aliyuncs.com/example2.jpg</a></p>
     */
    @NameInMap("IdCardFrontImageUrl")
    public String idCardFrontImageUrl;

    /**
     * <p>ID number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>02343218901123****</p>
     */
    @NameInMap("IdCardNumber")
    public String idCardNumber;

    /**
     * <p>Name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the end user, such as the account ID of the end user.</p>
     * 
     * <strong>example:</strong>
     * <p>54sdj</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static VerifyMaterialRequest build(java.util.Map<String, ?> map) throws Exception {
        VerifyMaterialRequest self = new VerifyMaterialRequest();
        return TeaModel.build(map, self);
    }

    public VerifyMaterialRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public VerifyMaterialRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public VerifyMaterialRequest setFaceImageUrl(String faceImageUrl) {
        this.faceImageUrl = faceImageUrl;
        return this;
    }
    public String getFaceImageUrl() {
        return this.faceImageUrl;
    }

    public VerifyMaterialRequest setIdCardBackImageUrl(String idCardBackImageUrl) {
        this.idCardBackImageUrl = idCardBackImageUrl;
        return this;
    }
    public String getIdCardBackImageUrl() {
        return this.idCardBackImageUrl;
    }

    public VerifyMaterialRequest setIdCardFrontImageUrl(String idCardFrontImageUrl) {
        this.idCardFrontImageUrl = idCardFrontImageUrl;
        return this;
    }
    public String getIdCardFrontImageUrl() {
        return this.idCardFrontImageUrl;
    }

    public VerifyMaterialRequest setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
        return this;
    }
    public String getIdCardNumber() {
        return this.idCardNumber;
    }

    public VerifyMaterialRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public VerifyMaterialRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
