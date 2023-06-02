// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220729.models;

import com.aliyun.tea.*;

public class SubmitImportDeclarationSheetExtractJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitImportDeclarationSheetExtractJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitImportDeclarationSheetExtractJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitImportDeclarationSheetExtractJobResponseBody self = new SubmitImportDeclarationSheetExtractJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitImportDeclarationSheetExtractJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitImportDeclarationSheetExtractJobResponseBody setData(SubmitImportDeclarationSheetExtractJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitImportDeclarationSheetExtractJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitImportDeclarationSheetExtractJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitImportDeclarationSheetExtractJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitImportDeclarationSheetExtractJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitImportDeclarationSheetExtractJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitImportDeclarationSheetExtractJobResponseBodyData self = new SubmitImportDeclarationSheetExtractJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitImportDeclarationSheetExtractJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
