// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class DeleteReportDefinitionRequest extends TeaModel {
    /**
     * <p>The ID of the primary sales channel. If this parameter is left empty, the ID of the sales channel to which the current user belongs is used by default.</p>
     * 
     * <strong>example:</strong>
     * <p>2684201000001</p>
     */
    @NameInMap("Nbid")
    public String nbid;

    /**
     * <p>The ID of the bill subscription task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123123</p>
     */
    @NameInMap("ReportTaskId")
    public Long reportTaskId;

    public static DeleteReportDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteReportDefinitionRequest self = new DeleteReportDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteReportDefinitionRequest setNbid(String nbid) {
        this.nbid = nbid;
        return this;
    }
    public String getNbid() {
        return this.nbid;
    }

    public DeleteReportDefinitionRequest setReportTaskId(Long reportTaskId) {
        this.reportTaskId = reportTaskId;
        return this;
    }
    public Long getReportTaskId() {
        return this.reportTaskId;
    }

}
