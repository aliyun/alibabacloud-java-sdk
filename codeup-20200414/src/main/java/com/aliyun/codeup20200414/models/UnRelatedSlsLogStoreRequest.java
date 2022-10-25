// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class UnRelatedSlsLogStoreRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("aliyunUserId")
    public String aliyunUserId;

    @NameInMap("codeupProjectId")
    public Long codeupProjectId;

    @NameInMap("slsLogStore")
    public String slsLogStore;

    @NameInMap("slsProject")
    public String slsProject;

    public static UnRelatedSlsLogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        UnRelatedSlsLogStoreRequest self = new UnRelatedSlsLogStoreRequest();
        return TeaModel.build(map, self);
    }

    public UnRelatedSlsLogStoreRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public UnRelatedSlsLogStoreRequest setAliyunUserId(String aliyunUserId) {
        this.aliyunUserId = aliyunUserId;
        return this;
    }
    public String getAliyunUserId() {
        return this.aliyunUserId;
    }

    public UnRelatedSlsLogStoreRequest setCodeupProjectId(Long codeupProjectId) {
        this.codeupProjectId = codeupProjectId;
        return this;
    }
    public Long getCodeupProjectId() {
        return this.codeupProjectId;
    }

    public UnRelatedSlsLogStoreRequest setSlsLogStore(String slsLogStore) {
        this.slsLogStore = slsLogStore;
        return this;
    }
    public String getSlsLogStore() {
        return this.slsLogStore;
    }

    public UnRelatedSlsLogStoreRequest setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

}
