// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class IsSlsUserAuthrizedCodeupRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("aliyunSubUserId")
    public String aliyunSubUserId;

    @NameInMap("aliyunUserId")
    public String aliyunUserId;

    @NameInMap("codeupProjectId")
    public Long codeupProjectId;

    @NameInMap("slsLogStore")
    public String slsLogStore;

    @NameInMap("slsProject")
    public String slsProject;

    public static IsSlsUserAuthrizedCodeupRequest build(java.util.Map<String, ?> map) throws Exception {
        IsSlsUserAuthrizedCodeupRequest self = new IsSlsUserAuthrizedCodeupRequest();
        return TeaModel.build(map, self);
    }

    public IsSlsUserAuthrizedCodeupRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public IsSlsUserAuthrizedCodeupRequest setAliyunSubUserId(String aliyunSubUserId) {
        this.aliyunSubUserId = aliyunSubUserId;
        return this;
    }
    public String getAliyunSubUserId() {
        return this.aliyunSubUserId;
    }

    public IsSlsUserAuthrizedCodeupRequest setAliyunUserId(String aliyunUserId) {
        this.aliyunUserId = aliyunUserId;
        return this;
    }
    public String getAliyunUserId() {
        return this.aliyunUserId;
    }

    public IsSlsUserAuthrizedCodeupRequest setCodeupProjectId(Long codeupProjectId) {
        this.codeupProjectId = codeupProjectId;
        return this;
    }
    public Long getCodeupProjectId() {
        return this.codeupProjectId;
    }

    public IsSlsUserAuthrizedCodeupRequest setSlsLogStore(String slsLogStore) {
        this.slsLogStore = slsLogStore;
        return this;
    }
    public String getSlsLogStore() {
        return this.slsLogStore;
    }

    public IsSlsUserAuthrizedCodeupRequest setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

}
