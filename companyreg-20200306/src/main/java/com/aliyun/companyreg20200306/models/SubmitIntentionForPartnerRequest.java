// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20200306.models;

import com.aliyun.tea.*;

public class SubmitIntentionForPartnerRequest extends TeaModel {
    @NameInMap("Area")
    public String area;

    /**
     * <strong>example:</strong>
     * <p>esp.isp</p>
     */
    @NameInMap("BizType")
    public String bizType;

    /**
     * <strong>example:</strong>
     * <p>lingjun</p>
     */
    @NameInMap("Channel")
    public String channel;

    /**
     * <strong>example:</strong>
     * <p>Server</p>
     */
    @NameInMap("CommodityType")
    public String commodityType;

    @NameInMap("ContactName")
    public String contactName;

    /**
     * <strong>example:</strong>
     * <p>ceshi</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>{\&quot;beianServiceNumber\&quot;:\&quot;9969c666-0935-4c5b-8042-926ff546e39f\&quot;}</p>
     */
    @NameInMap("ExtInfo")
    public String extInfo;

    /**
     * <strong>example:</strong>
     * <p>country</p>
     */
    @NameInMap("Grade")
    public Integer grade;

    /**
     * <strong>example:</strong>
     * <p>18704330000</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    /**
     * <strong>example:</strong>
     * <p>1212312312312</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static SubmitIntentionForPartnerRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitIntentionForPartnerRequest self = new SubmitIntentionForPartnerRequest();
        return TeaModel.build(map, self);
    }

    public SubmitIntentionForPartnerRequest setArea(String area) {
        this.area = area;
        return this;
    }
    public String getArea() {
        return this.area;
    }

    public SubmitIntentionForPartnerRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public SubmitIntentionForPartnerRequest setChannel(String channel) {
        this.channel = channel;
        return this;
    }
    public String getChannel() {
        return this.channel;
    }

    public SubmitIntentionForPartnerRequest setCommodityType(String commodityType) {
        this.commodityType = commodityType;
        return this;
    }
    public String getCommodityType() {
        return this.commodityType;
    }

    public SubmitIntentionForPartnerRequest setContactName(String contactName) {
        this.contactName = contactName;
        return this;
    }
    public String getContactName() {
        return this.contactName;
    }

    public SubmitIntentionForPartnerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitIntentionForPartnerRequest setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public SubmitIntentionForPartnerRequest setGrade(Integer grade) {
        this.grade = grade;
        return this;
    }
    public Integer getGrade() {
        return this.grade;
    }

    public SubmitIntentionForPartnerRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public SubmitIntentionForPartnerRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
