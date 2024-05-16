// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class DsgDesensPlanQueryListRequest extends TeaModel {
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SceneId")
    public Integer sceneId;

    @NameInMap("Status")
    public Integer status;

    public static DsgDesensPlanQueryListRequest build(java.util.Map<String, ?> map) throws Exception {
        DsgDesensPlanQueryListRequest self = new DsgDesensPlanQueryListRequest();
        return TeaModel.build(map, self);
    }

    public DsgDesensPlanQueryListRequest setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public DsgDesensPlanQueryListRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DsgDesensPlanQueryListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DsgDesensPlanQueryListRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DsgDesensPlanQueryListRequest setSceneId(Integer sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Integer getSceneId() {
        return this.sceneId;
    }

    public DsgDesensPlanQueryListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
