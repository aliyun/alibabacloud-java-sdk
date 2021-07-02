// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneExcelServiceSubmitShrinkRequest extends TeaModel {
    @NameInMap("WneSubmitReqs")
    public String wneSubmitReqsShrink;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ExcelMetaId")
    public Long excelMetaId;

    public static RemoteWneExcelServiceSubmitShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneExcelServiceSubmitShrinkRequest self = new RemoteWneExcelServiceSubmitShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoteWneExcelServiceSubmitShrinkRequest setWneSubmitReqsShrink(String wneSubmitReqsShrink) {
        this.wneSubmitReqsShrink = wneSubmitReqsShrink;
        return this;
    }
    public String getWneSubmitReqsShrink() {
        return this.wneSubmitReqsShrink;
    }

    public RemoteWneExcelServiceSubmitShrinkRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RemoteWneExcelServiceSubmitShrinkRequest setExcelMetaId(Long excelMetaId) {
        this.excelMetaId = excelMetaId;
        return this;
    }
    public Long getExcelMetaId() {
        return this.excelMetaId;
    }

}
