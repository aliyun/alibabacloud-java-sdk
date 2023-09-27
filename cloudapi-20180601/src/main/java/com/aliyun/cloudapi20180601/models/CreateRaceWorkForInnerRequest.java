// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class CreateRaceWorkForInnerRequest extends TeaModel {
    @NameInMap("CommodityCode")
    public String commodityCode;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("Keywords")
    public String keywords;

    @NameInMap("LogoUrl")
    public String logoUrl;

    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("ShortDescription")
    public String shortDescription;

    @NameInMap("WorkName")
    public String workName;

    public static CreateRaceWorkForInnerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRaceWorkForInnerRequest self = new CreateRaceWorkForInnerRequest();
        return TeaModel.build(map, self);
    }

    public CreateRaceWorkForInnerRequest setCommodityCode(String commodityCode) {
        this.commodityCode = commodityCode;
        return this;
    }
    public String getCommodityCode() {
        return this.commodityCode;
    }

    public CreateRaceWorkForInnerRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public CreateRaceWorkForInnerRequest setKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }
    public String getKeywords() {
        return this.keywords;
    }

    public CreateRaceWorkForInnerRequest setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }
    public String getLogoUrl() {
        return this.logoUrl;
    }

    public CreateRaceWorkForInnerRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public CreateRaceWorkForInnerRequest setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
        return this;
    }
    public String getShortDescription() {
        return this.shortDescription;
    }

    public CreateRaceWorkForInnerRequest setWorkName(String workName) {
        this.workName = workName;
        return this;
    }
    public String getWorkName() {
        return this.workName;
    }

}
