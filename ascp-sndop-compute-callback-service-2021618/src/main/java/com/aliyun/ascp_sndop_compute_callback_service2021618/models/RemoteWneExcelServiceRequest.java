// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneExcelServiceRequest extends TeaModel {
    // projectId
    @NameInMap("ProjectId")
    public Long projectId;

    // excelId
    @NameInMap("ExcelId")
    public Long excelId;

    public static RemoteWneExcelServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneExcelServiceRequest self = new RemoteWneExcelServiceRequest();
        return TeaModel.build(map, self);
    }

    public RemoteWneExcelServiceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RemoteWneExcelServiceRequest setExcelId(Long excelId) {
        this.excelId = excelId;
        return this;
    }
    public Long getExcelId() {
        return this.excelId;
    }

}
