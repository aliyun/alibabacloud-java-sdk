// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20180601.models;

import com.aliyun.tea.*;

public class CreateManualDagRequest extends TeaModel {
    @NameInMap("Bizdate")
    public String bizdate;

    @NameInMap("DagPara")
    public String dagPara;

    @NameInMap("FlowName")
    public String flowName;

    @NameInMap("NodePara")
    public String nodePara;

    @NameInMap("ProjectName")
    public String projectName;

    public static CreateManualDagRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateManualDagRequest self = new CreateManualDagRequest();
        return TeaModel.build(map, self);
    }

    public CreateManualDagRequest setBizdate(String bizdate) {
        this.bizdate = bizdate;
        return this;
    }
    public String getBizdate() {
        return this.bizdate;
    }

    public CreateManualDagRequest setDagPara(String dagPara) {
        this.dagPara = dagPara;
        return this;
    }
    public String getDagPara() {
        return this.dagPara;
    }

    public CreateManualDagRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public CreateManualDagRequest setNodePara(String nodePara) {
        this.nodePara = nodePara;
        return this;
    }
    public String getNodePara() {
        return this.nodePara;
    }

    public CreateManualDagRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
