// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateLinkResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public CreateLinkResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static CreateLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkResponseBody self = new CreateLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateLinkResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateLinkResponseBody setResultContent(CreateLinkResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public CreateLinkResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public CreateLinkResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class CreateLinkResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Target")
        public String target;

        @NameInMap("Version")
        public String version;

        public static CreateLinkResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            CreateLinkResponseBodyResultContent self = new CreateLinkResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public CreateLinkResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public CreateLinkResponseBodyResultContent setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public CreateLinkResponseBodyResultContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
