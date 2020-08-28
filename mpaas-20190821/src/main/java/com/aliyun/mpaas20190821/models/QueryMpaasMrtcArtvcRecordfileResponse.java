// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20190821.models;

import com.aliyun.tea.*;

public class QueryMpaasMrtcArtvcRecordfileResponse extends TeaModel {
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
    public QueryMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapResp mrtcApiRecordFileQueryWrapResp;

    public static QueryMpaasMrtcArtvcRecordfileResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMpaasMrtcArtvcRecordfileResponse self = new QueryMpaasMrtcArtvcRecordfileResponse();
        return TeaModel.build(map, self);
    }

    public static class QueryMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapRespData extends TeaModel {
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

        public static QueryMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapRespData build(java.util.Map<String, ?> map) throws Exception {
            QueryMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapRespData self = new QueryMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapRespData();
            return TeaModel.build(map, self);
        }

    }

    public static class QueryMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapResp extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Msg")
        @Validation(required = true)
        public String msg;

        @NameInMap("Data")
        @Validation(required = true)
        public QueryMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapRespData data;

        public static QueryMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapResp build(java.util.Map<String, ?> map) throws Exception {
            QueryMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapResp self = new QueryMpaasMrtcArtvcRecordfileResponseMrtcApiRecordFileQueryWrapResp();
            return TeaModel.build(map, self);
        }

    }

}
