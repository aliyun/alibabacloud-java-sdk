// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddi20200617.models;

import com.aliyun.tea.*;

public class ListFlowNodeSqlResultRequest extends TeaModel {
    @NameInMap("Length")
    public Integer length;

    @NameInMap("NodeInstanceId")
    public String nodeInstanceId;

    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SqlIndex")
    public Integer sqlIndex;

    public static ListFlowNodeSqlResultRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowNodeSqlResultRequest self = new ListFlowNodeSqlResultRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowNodeSqlResultRequest setLength(Integer length) {
        this.length = length;
        return this;
    }
    public Integer getLength() {
        return this.length;
    }

    public ListFlowNodeSqlResultRequest setNodeInstanceId(String nodeInstanceId) {
        this.nodeInstanceId = nodeInstanceId;
        return this;
    }
    public String getNodeInstanceId() {
        return this.nodeInstanceId;
    }

    public ListFlowNodeSqlResultRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListFlowNodeSqlResultRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListFlowNodeSqlResultRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListFlowNodeSqlResultRequest setSqlIndex(Integer sqlIndex) {
        this.sqlIndex = sqlIndex;
        return this;
    }
    public Integer getSqlIndex() {
        return this.sqlIndex;
    }

}
