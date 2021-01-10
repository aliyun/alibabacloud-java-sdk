// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DescribeOpenAccountRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("IdentityId")
    public String identityId;

    @NameInMap("Idp")
    public String idp;

    @NameInMap("IdToken")
    public String idToken;

    @NameInMap("OpenId")
    public String openId;

    public static DescribeOpenAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenAccountRequest self = new DescribeOpenAccountRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOpenAccountRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeOpenAccountRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public DescribeOpenAccountRequest setIdp(String idp) {
        this.idp = idp;
        return this;
    }
    public String getIdp() {
        return this.idp;
    }

    public DescribeOpenAccountRequest setIdToken(String idToken) {
        this.idToken = idToken;
        return this;
    }
    public String getIdToken() {
        return this.idToken;
    }

    public DescribeOpenAccountRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

}
