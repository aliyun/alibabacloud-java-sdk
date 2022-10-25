// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class RelatedSlsLogStoreRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("aliyunUserId")
    public String aliyunUserId;

    @NameInMap("codeupProjectId")
    public Long codeupProjectId;

    @NameInMap("defaultViewer")
    public Boolean defaultViewer;

    @NameInMap("slsLogStore")
    public String slsLogStore;

    @NameInMap("slsProject")
    public String slsProject;

    public static RelatedSlsLogStoreRequest build(java.util.Map<String, ?> map) throws Exception {
        RelatedSlsLogStoreRequest self = new RelatedSlsLogStoreRequest();
        return TeaModel.build(map, self);
    }

    public RelatedSlsLogStoreRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public RelatedSlsLogStoreRequest setAliyunUserId(String aliyunUserId) {
        this.aliyunUserId = aliyunUserId;
        return this;
    }
    public String getAliyunUserId() {
        return this.aliyunUserId;
    }

    public RelatedSlsLogStoreRequest setCodeupProjectId(Long codeupProjectId) {
        this.codeupProjectId = codeupProjectId;
        return this;
    }
    public Long getCodeupProjectId() {
        return this.codeupProjectId;
    }

    public RelatedSlsLogStoreRequest setDefaultViewer(Boolean defaultViewer) {
        this.defaultViewer = defaultViewer;
        return this;
    }
    public Boolean getDefaultViewer() {
        return this.defaultViewer;
    }

    public RelatedSlsLogStoreRequest setSlsLogStore(String slsLogStore) {
        this.slsLogStore = slsLogStore;
        return this;
    }
    public String getSlsLogStore() {
        return this.slsLogStore;
    }

    public RelatedSlsLogStoreRequest setSlsProject(String slsProject) {
        this.slsProject = slsProject;
        return this;
    }
    public String getSlsProject() {
        return this.slsProject;
    }

}
