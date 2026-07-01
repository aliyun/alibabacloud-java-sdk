// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class UpdateRCSSignatureRequest extends TeaModel {
    /**
     * <p>背景图片ossKey</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("BackgroundImage")
    public String backgroundImage;

    /**
     * <p>气泡颜色</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("BubbleColor")
    public String bubbleColor;

    /**
     * <p>行业类型</p>
     * 
     * <strong>example:</strong>
     * <p>24</p>
     */
    @NameInMap("Category")
    public Long category;

    /**
     * <p>描述信息</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>纬度</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Latitude")
    public String latitude;

    /**
     * <p>logo图片ossKey</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Logo")
    public String logo;

    /**
     * <p>经度</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Longitude")
    public String longitude;

    /**
     * <p>办公地址</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("OfficeAddress")
    public String officeAddress;

    /**
     * <p>服务邮箱</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ServiceEmail")
    public String serviceEmail;

    /**
     * <p>服务电话</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ServicePhone")
    public String servicePhone;

    /**
     * <p>服务条款URL</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ServiceTerms")
    public String serviceTerms;

    /**
     * <p>服务官网URL</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("ServiceWebsite")
    public String serviceWebsite;

    /**
     * <p>签名名称（用于定位5G签名）</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("SignName")
    public String signName;

    public static UpdateRCSSignatureRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRCSSignatureRequest self = new UpdateRCSSignatureRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRCSSignatureRequest setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
        return this;
    }
    public String getBackgroundImage() {
        return this.backgroundImage;
    }

    public UpdateRCSSignatureRequest setBubbleColor(String bubbleColor) {
        this.bubbleColor = bubbleColor;
        return this;
    }
    public String getBubbleColor() {
        return this.bubbleColor;
    }

    public UpdateRCSSignatureRequest setCategory(Long category) {
        this.category = category;
        return this;
    }
    public Long getCategory() {
        return this.category;
    }

    public UpdateRCSSignatureRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateRCSSignatureRequest setLatitude(String latitude) {
        this.latitude = latitude;
        return this;
    }
    public String getLatitude() {
        return this.latitude;
    }

    public UpdateRCSSignatureRequest setLogo(String logo) {
        this.logo = logo;
        return this;
    }
    public String getLogo() {
        return this.logo;
    }

    public UpdateRCSSignatureRequest setLongitude(String longitude) {
        this.longitude = longitude;
        return this;
    }
    public String getLongitude() {
        return this.longitude;
    }

    public UpdateRCSSignatureRequest setOfficeAddress(String officeAddress) {
        this.officeAddress = officeAddress;
        return this;
    }
    public String getOfficeAddress() {
        return this.officeAddress;
    }

    public UpdateRCSSignatureRequest setServiceEmail(String serviceEmail) {
        this.serviceEmail = serviceEmail;
        return this;
    }
    public String getServiceEmail() {
        return this.serviceEmail;
    }

    public UpdateRCSSignatureRequest setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
        return this;
    }
    public String getServicePhone() {
        return this.servicePhone;
    }

    public UpdateRCSSignatureRequest setServiceTerms(String serviceTerms) {
        this.serviceTerms = serviceTerms;
        return this;
    }
    public String getServiceTerms() {
        return this.serviceTerms;
    }

    public UpdateRCSSignatureRequest setServiceWebsite(String serviceWebsite) {
        this.serviceWebsite = serviceWebsite;
        return this;
    }
    public String getServiceWebsite() {
        return this.serviceWebsite;
    }

    public UpdateRCSSignatureRequest setSignName(String signName) {
        this.signName = signName;
        return this;
    }
    public String getSignName() {
        return this.signName;
    }

}
