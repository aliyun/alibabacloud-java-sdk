// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class ListOpenAccountLinksRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("IdentityId")
    public String identityId;

    @NameInMap("Idp")
    public String idp;

    @NameInMap("OpenId")
    public String openId;

    public static ListOpenAccountLinksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOpenAccountLinksRequest self = new ListOpenAccountLinksRequest();
        return TeaModel.build(map, self);
    }

    public ListOpenAccountLinksRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListOpenAccountLinksRequest setIdentityId(String identityId) {
        this.identityId = identityId;
        return this;
    }
    public String getIdentityId() {
        return this.identityId;
    }

    public ListOpenAccountLinksRequest setIdp(String idp) {
        this.idp = idp;
        return this;
    }
    public String getIdp() {
        return this.idp;
    }

    public ListOpenAccountLinksRequest setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

}
