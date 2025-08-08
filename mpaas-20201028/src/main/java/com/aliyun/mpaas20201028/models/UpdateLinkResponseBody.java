// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateLinkResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>11E66B29-9E5E-5C10-B64E-B5A0E0F26355</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultContent")
    public UpdateLinkResponseBodyResultContent resultContent;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx/xxx">https://xxx/xxx</a></p>
         */
        @NameInMap("Data")
        public String data;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx/xxx/xxx">https://xxx/xxx/xxx</a></p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
