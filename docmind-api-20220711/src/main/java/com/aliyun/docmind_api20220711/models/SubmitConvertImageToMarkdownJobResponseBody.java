// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.docmind_api20220711.models;

import com.aliyun.tea.*;

public class SubmitConvertImageToMarkdownJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public SubmitConvertImageToMarkdownJobResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitConvertImageToMarkdownJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitConvertImageToMarkdownJobResponseBody self = new SubmitConvertImageToMarkdownJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitConvertImageToMarkdownJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitConvertImageToMarkdownJobResponseBody setData(SubmitConvertImageToMarkdownJobResponseBodyData data) {
        this.data = data;
        return this;
    }
    public SubmitConvertImageToMarkdownJobResponseBodyData getData() {
        return this.data;
    }

    public SubmitConvertImageToMarkdownJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitConvertImageToMarkdownJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitConvertImageToMarkdownJobResponseBodyData extends TeaModel {
        @NameInMap("Id")
        public String id;

        public static SubmitConvertImageToMarkdownJobResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SubmitConvertImageToMarkdownJobResponseBodyData self = new SubmitConvertImageToMarkdownJobResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SubmitConvertImageToMarkdownJobResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
