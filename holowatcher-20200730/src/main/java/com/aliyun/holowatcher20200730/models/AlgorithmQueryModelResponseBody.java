// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AlgorithmQueryModelResponseBody extends TeaModel {
    @NameInMap("Content")
    public AlgorithmQueryModelResponseBodyContent content;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AlgorithmQueryModelResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmQueryModelResponseBody self = new AlgorithmQueryModelResponseBody();
        return TeaModel.build(map, self);
    }

    public AlgorithmQueryModelResponseBody setContent(AlgorithmQueryModelResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public AlgorithmQueryModelResponseBodyContent getContent() {
        return this.content;
    }

    public AlgorithmQueryModelResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AlgorithmQueryModelResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AlgorithmQueryModelResponseBodyContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CodeMsg")
        public String codeMsg;

        @NameInMap("FileUrl")
        public String fileUrl;

        public static AlgorithmQueryModelResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            AlgorithmQueryModelResponseBodyContent self = new AlgorithmQueryModelResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public AlgorithmQueryModelResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AlgorithmQueryModelResponseBodyContent setCodeMsg(String codeMsg) {
            this.codeMsg = codeMsg;
            return this;
        }
        public String getCodeMsg() {
            return this.codeMsg;
        }

        public AlgorithmQueryModelResponseBodyContent setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

    }

}
