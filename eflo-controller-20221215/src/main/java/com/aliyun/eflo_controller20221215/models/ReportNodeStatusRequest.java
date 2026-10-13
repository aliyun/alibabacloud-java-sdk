// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReportNodeStatusRequest extends TeaModel {
    /**
     * <p>The detailed description of the exception.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>GPU 0 reporting XID 79 (fallen off bus)</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The diagnosis type. Valid values:</p>
     * <ul>
     * <li>QUICK: quick diagnosis</li>
     * <li>COMPREHENSIVE: comprehensive diagnosis</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>COMPREHENSIVE</p>
     */
    @NameInMap("DiagnosisType")
    public String diagnosisType;

    /**
     * <p>The node ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e01-eowpxmsldd</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    public static ReportNodeStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportNodeStatusRequest self = new ReportNodeStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportNodeStatusRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ReportNodeStatusRequest setDiagnosisType(String diagnosisType) {
        this.diagnosisType = diagnosisType;
        return this;
    }
    public String getDiagnosisType() {
        return this.diagnosisType;
    }

    public ReportNodeStatusRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

}
