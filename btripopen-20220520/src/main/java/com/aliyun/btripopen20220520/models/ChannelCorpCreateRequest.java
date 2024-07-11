// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class ChannelCorpCreateRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("administrator_name")
    public String administratorName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18378889782</p>
     */
    @NameInMap("administrator_phone")
    public String administratorPhone;

    @NameInMap("city")
    public String city;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("corp_name")
    public String corpName;

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

    public static ChannelCorpCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ChannelCorpCreateRequest self = new ChannelCorpCreateRequest();
        return TeaModel.build(map, self);
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

}
