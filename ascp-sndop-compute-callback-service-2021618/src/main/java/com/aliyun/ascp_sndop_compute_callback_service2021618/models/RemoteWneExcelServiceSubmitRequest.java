// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneExcelServiceSubmitRequest extends TeaModel {
    @NameInMap("WneSubmitReqs")
    public java.util.List<RemoteWneExcelServiceSubmitRequestWneSubmitReqs> wneSubmitReqs;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("ExcelMetaId")
    public Long excelMetaId;

    public static RemoteWneExcelServiceSubmitRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneExcelServiceSubmitRequest self = new RemoteWneExcelServiceSubmitRequest();
        return TeaModel.build(map, self);
    }

    public RemoteWneExcelServiceSubmitRequest setWneSubmitReqs(java.util.List<RemoteWneExcelServiceSubmitRequestWneSubmitReqs> wneSubmitReqs) {
        this.wneSubmitReqs = wneSubmitReqs;
        return this;
    }
    public java.util.List<RemoteWneExcelServiceSubmitRequestWneSubmitReqs> getWneSubmitReqs() {
        return this.wneSubmitReqs;
    }

    public RemoteWneExcelServiceSubmitRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public RemoteWneExcelServiceSubmitRequest setExcelMetaId(Long excelMetaId) {
        this.excelMetaId = excelMetaId;
        return this;
    }
    public Long getExcelMetaId() {
        return this.excelMetaId;
    }

    public static class RemoteWneExcelServiceSubmitRequestWneSubmitReqs extends TeaModel {
        @NameInMap("SheetNo")
        public Long sheetNo;

        @NameInMap("TableId")
        public Long tableId;

        @NameInMap("UpdTableJSONText")
        public String updTableJSONText;

        public static RemoteWneExcelServiceSubmitRequestWneSubmitReqs build(java.util.Map<String, ?> map) throws Exception {
            RemoteWneExcelServiceSubmitRequestWneSubmitReqs self = new RemoteWneExcelServiceSubmitRequestWneSubmitReqs();
            return TeaModel.build(map, self);
        }

        public RemoteWneExcelServiceSubmitRequestWneSubmitReqs setSheetNo(Long sheetNo) {
            this.sheetNo = sheetNo;
            return this;
        }
        public Long getSheetNo() {
            return this.sheetNo;
        }

        public RemoteWneExcelServiceSubmitRequestWneSubmitReqs setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public RemoteWneExcelServiceSubmitRequestWneSubmitReqs setUpdTableJSONText(String updTableJSONText) {
            this.updTableJSONText = updTableJSONText;
            return this;
        }
        public String getUpdTableJSONText() {
            return this.updTableJSONText;
        }

    }

}
