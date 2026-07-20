// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ChannelCorpCreateRequest extends TeaModel {
    @NameInMap("administrator_email")
    public String administratorEmail;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("administrator_name")
    public String administratorName;

    /**
     * <strong>example:</strong>
     * <p>18378889782</p>
     */
    @NameInMap("administrator_phone")
    public String administratorPhone;

    @NameInMap("base_currency")
    public String baseCurrency;

    @NameInMap("btrip_region")
    public String btripRegion;

    /**
     * <strong>example:</strong>
     * <p>杭州市</p>
     */
    @NameInMap("city")
    public String city;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>阿里巴巴有限公司</p>
     */
    @NameInMap("corp_name")
    public String corpName;

    @NameInMap("corp_name_en")
    public String corpNameEn;

    @NameInMap("extend_field")
    public String extendField;

    /**
     * <strong>example:</strong>
     * <p>浙江省</p>
     */
    @NameInMap("province")
    public String province;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("scope")
    public Integer scope;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>00001</p>
     */
    @NameInMap("third_corp_id")
    public String thirdCorpId;

    /**
     * <strong>example:</strong>
     * <p>user_1234</p>
     */
    @NameInMap("user_id")
    public String userId;

    public static ChannelCorpCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ChannelCorpCreateRequest self = new ChannelCorpCreateRequest();
        return TeaModel.build(map, self);
    }

    public ChannelCorpCreateRequest setAdministratorEmail(String administratorEmail) {
        this.administratorEmail = administratorEmail;
        return this;
    }
    public String getAdministratorEmail() {
        return this.administratorEmail;
    }

    public ChannelCorpCreateRequest setAdministratorName(String administratorName) {
        this.administratorName = administratorName;
        return this;
    }
    public String getAdministratorName() {
        return this.administratorName;
    }

    public ChannelCorpCreateRequest setAdministratorPhone(String administratorPhone) {
        this.administratorPhone = administratorPhone;
        return this;
    }
    public String getAdministratorPhone() {
        return this.administratorPhone;
    }

    public ChannelCorpCreateRequest setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
        return this;
    }
    public String getBaseCurrency() {
        return this.baseCurrency;
    }

    public ChannelCorpCreateRequest setBtripRegion(String btripRegion) {
        this.btripRegion = btripRegion;
        return this;
    }
    public String getBtripRegion() {
        return this.btripRegion;
    }

    public ChannelCorpCreateRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public ChannelCorpCreateRequest setCorpName(String corpName) {
        this.corpName = corpName;
        return this;
    }
    public String getCorpName() {
        return this.corpName;
    }

    public ChannelCorpCreateRequest setCorpNameEn(String corpNameEn) {
        this.corpNameEn = corpNameEn;
        return this;
    }
    public String getCorpNameEn() {
        return this.corpNameEn;
    }

    public ChannelCorpCreateRequest setExtendField(String extendField) {
        this.extendField = extendField;
        return this;
    }
    public String getExtendField() {
        return this.extendField;
    }

    public ChannelCorpCreateRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public ChannelCorpCreateRequest setScope(Integer scope) {
        this.scope = scope;
        return this;
    }
    public Integer getScope() {
        return this.scope;
    }

    public ChannelCorpCreateRequest setThirdCorpId(String thirdCorpId) {
        this.thirdCorpId = thirdCorpId;
        return this;
    }
    public String getThirdCorpId() {
        return this.thirdCorpId;
    }

    public ChannelCorpCreateRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
