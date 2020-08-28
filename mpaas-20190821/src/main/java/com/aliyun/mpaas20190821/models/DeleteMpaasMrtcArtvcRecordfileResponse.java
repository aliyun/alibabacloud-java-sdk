// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class DeleteMpaasMrtcArtvcRecordfileResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("ResultCode")
    @Validation(required = true)
    public String resultCode;

    @NameInMap("ResultMessage")
    @Validation(required = true)
    public String resultMessage;

    @NameInMap("MrtcApiRecordFileQueryWrapResp")
    @Validation(required = true)
    public DeleteMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapResp mrtcApiRecordFileQueryWrapResp;

    public static DeleteMpaasMrtcArtvcRecordfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMpaasMrtcArtvcRecordfileResponse self = new DeleteMpaasMrtcArtvcRecordfileResponse();
        return TeaModel.build(map, self);
    }

    public static class DeleteMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapRespData extends TeaModel {
        @NameInMap("BizRequestId")
        @Validation(required = true)
        public String bizRequestId;

        @NameInMap("FilePath")
        @Validation(required = true)
        public String filePath;

        @NameInMap("FileType")
        @Validation(required = true)
        public String fileType;

        @NameInMap("RecordStartTime")
        @Validation(required = true)
        public String recordStartTime;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        public static DeleteMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapRespData build(java.util.Map<String, ?> map) throws Exception {
            DeleteMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapRespData self = new DeleteMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapRespData();
            return TeaModel.build(map, self);
        }

    }

    public static class DeleteMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapResp extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Msg")
        @Validation(required = true)
        public String msg;

        @NameInMap("Data")
        @Validation(required = true)
        public DeleteMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapRespData data;

        public static DeleteMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapResp build(java.util.Map<String, ?> map) throws Exception {
            DeleteMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapResp self = new DeleteMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapResp();
            return TeaModel.build(map, self);
        }

    }

}
