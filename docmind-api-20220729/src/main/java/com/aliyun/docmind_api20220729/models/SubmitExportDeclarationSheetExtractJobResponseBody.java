// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitExportDeclarationSheetExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitExportDeclarationSheetExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitExportDeclarationSheetExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitExportDeclarationSheetExtractJobResponseBody self = new SubmitExportDeclarationSheetExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitExportDeclarationSheetExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitExportDeclarationSheetExtractJobResponseBody setData(SubmitExportDeclarationSheetExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitExportDeclarationSheetExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitExportDeclarationSheetExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitExportDeclarationSheetExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitExportDeclarationSheetExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitExportDeclarationSheetExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitExportDeclarationSheetExtractJobResponseBodyData self = new SubmitExportDeclarationSheetExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitExportDeclarationSheetExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
