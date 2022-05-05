// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class AlgorithmCreateBuildResponseBody extends TeaModel {
    @NameInMap("Content")
    public AlgorithmCreateBuildResponseBodyContent content;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AlgorithmCreateBuildResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AlgorithmCreateBuildResponseBody self = new AlgorithmCreateBuildResponseBody();
        return TeaModel.build(map, self);
    }

    public AlgorithmCreateBuildResponseBody setContent(AlgorithmCreateBuildResponseBodyContent content) {
        this.content = content;
        return this;
    }
    public AlgorithmCreateBuildResponseBodyContent getContent() {
        return this.content;
    }

    public AlgorithmCreateBuildResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AlgorithmCreateBuildResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AlgorithmCreateBuildResponseBodyContent extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CodeMsg")
        public String codeMsg;

        @NameInMap("RequestNumber")
        public String requestNumber;

        public static AlgorithmCreateBuildResponseBodyContent build(java.util.Map<String, ?> map) throws Exception {
            AlgorithmCreateBuildResponseBodyContent self = new AlgorithmCreateBuildResponseBodyContent();
            return TeaModel.build(map, self);
        }

        public AlgorithmCreateBuildResponseBodyContent setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AlgorithmCreateBuildResponseBodyContent setCodeMsg(String codeMsg) {
            this.codeMsg = codeMsg;
            return this;
        }
        public String getCodeMsg() {
            return this.codeMsg;
        }

        public AlgorithmCreateBuildResponseBodyContent setRequestNumber(String requestNumber) {
            this.requestNumber = requestNumber;
            return this;
        }
        public String getRequestNumber() {
            return this.requestNumber;
        }

    }

}
