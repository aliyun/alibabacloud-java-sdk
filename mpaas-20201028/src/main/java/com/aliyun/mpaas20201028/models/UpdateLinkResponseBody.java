// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateLinkResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public UpdateLinkResponseBodyResultContent resultContent;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static UpdateLinkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkResponseBody self = new UpdateLinkResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkResponseBody setResultContent(UpdateLinkResponseBodyResultContent resultContent) {
        this.resultContent = resultContent;
        return this;
    }
    public UpdateLinkResponseBodyResultContent getResultContent() {
        return this.resultContent;
    }

    public UpdateLinkResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class UpdateLinkResponseBodyResultContent extends TeaModel {
        @NameInMap("Data")
        public String data;

        @NameInMap("Target")
        public String target;

        @NameInMap("Version")
        public String version;

        public static UpdateLinkResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkResponseBodyResultContent self = new UpdateLinkResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public UpdateLinkResponseBodyResultContent setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public UpdateLinkResponseBodyResultContent setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public UpdateLinkResponseBodyResultContent setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

}
