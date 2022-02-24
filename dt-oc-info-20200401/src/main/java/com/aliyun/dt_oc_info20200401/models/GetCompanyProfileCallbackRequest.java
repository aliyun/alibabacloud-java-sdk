// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dt_oc_info20200401.models;

import com.aliyun.tea.*;

public class GetCompanyProfileCallbackRequest extends TeaModel {
    @NameInMap("CompanyGroupId")
    public String companyGroupId;

    @NameInMap("CompanyQueryUrl")
    public String companyQueryUrl;

    @NameInMap("FeatureCallbackUrl")
    public String featureCallbackUrl;

    @NameInMap("ProfileCallbackUrl")
    public String profileCallbackUrl;

    public static GetCompanyProfileCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyProfileCallbackRequest self = new GetCompanyProfileCallbackRequest();
        return TeaModel.build(map, self);
    }

    public GetCompanyProfileCallbackRequest setCompanyGroupId(String companyGroupId) {
        this.companyGroupId = companyGroupId;
        return this;
    }
    public String getCompanyGroupId() {
        return this.companyGroupId;
    }

    public GetCompanyProfileCallbackRequest setCompanyQueryUrl(String companyQueryUrl) {
        this.companyQueryUrl = companyQueryUrl;
        return this;
    }
    public String getCompanyQueryUrl() {
        return this.companyQueryUrl;
    }

    public GetCompanyProfileCallbackRequest setFeatureCallbackUrl(String featureCallbackUrl) {
        this.featureCallbackUrl = featureCallbackUrl;
        return this;
    }
    public String getFeatureCallbackUrl() {
        return this.featureCallbackUrl;
    }

    public GetCompanyProfileCallbackRequest setProfileCallbackUrl(String profileCallbackUrl) {
        this.profileCallbackUrl = profileCallbackUrl;
        return this;
    }
    public String getProfileCallbackUrl() {
        return this.profileCallbackUrl;
    }

}
