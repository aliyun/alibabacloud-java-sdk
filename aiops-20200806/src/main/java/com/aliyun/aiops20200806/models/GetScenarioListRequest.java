// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetScenarioListRequest extends TeaModel {
    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ScenarioName")
    public String scenarioName;

    @NameInMap("SceneSelectLabel")
    public String sceneSelectLabel;

    public static GetScenarioListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetScenarioListRequest self = new GetScenarioListRequest();
        return TeaModel.build(map, self);
    }

    public GetScenarioListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetScenarioListRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public GetScenarioListRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public GetScenarioListRequest setScenarioName(String scenarioName) {
        this.scenarioName = scenarioName;
        return this;
    }
    public String getScenarioName() {
        return this.scenarioName;
    }

    public GetScenarioListRequest setSceneSelectLabel(String sceneSelectLabel) {
        this.sceneSelectLabel = sceneSelectLabel;
        return this;
    }
    public String getSceneSelectLabel() {
        return this.sceneSelectLabel;
    }

}
