// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class PublishImageResponseBody extends TeaModel {
    /**
     * <p>The API request result.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;ProcessId&quot;: &quot;582d4896-d224-413b-b883-239eeebe0bc5&quot;, &quot;Success&quot;: true}</p>
     */
    @NameInMap("Data")
    public PublishImageResponseBodyData data;

    /**
     * <p>The ID of the request, which is used to locate logs and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static PublishImageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        PublishImageResponseBody self = new PublishImageResponseBody();
        return TeaModel.build(map, self);
    }

    public PublishImageResponseBody setData(PublishImageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public PublishImageResponseBodyData getData() {
        return this.data;
    }

    public PublishImageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public PublishImageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class PublishImageResponseBodyData extends TeaModel {
        /**
         * <p>The image publishing execution ID.</p>
         * 
         * <strong>example:</strong>
         * <p>582d4896-d224-413b-b883-239eeebe0bc5</p>
         */
        @NameInMap("ProcessId")
        public String processId;

        /**
         * <p>Indicates whether the operation was triggered successfully.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static PublishImageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            PublishImageResponseBodyData self = new PublishImageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public PublishImageResponseBodyData setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public PublishImageResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
