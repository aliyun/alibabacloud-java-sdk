// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class RemoveRuntimeModelTemplateResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<RemoveRuntimeModelTemplateResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static RemoveRuntimeModelTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemoveRuntimeModelTemplateResponseBody self = new RemoveRuntimeModelTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public RemoveRuntimeModelTemplateResponseBody setData(java.util.List<RemoveRuntimeModelTemplateResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<RemoveRuntimeModelTemplateResponseBodyData> getData() {
        return this.data;
    }

    public RemoveRuntimeModelTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RemoveRuntimeModelTemplateResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class RemoveRuntimeModelTemplateResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Runtime.NotFound</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>404</p>
         */
        @NameInMap("HttpStatusCode")
        public Integer httpStatusCode;

        /**
         * <strong>example:</strong>
         * <p>The runtime is not found.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>jvs-xxxxx</p>
         */
        @NameInMap("RuntimeId")
        public String runtimeId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static RemoveRuntimeModelTemplateResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RemoveRuntimeModelTemplateResponseBodyData self = new RemoveRuntimeModelTemplateResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RemoveRuntimeModelTemplateResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public RemoveRuntimeModelTemplateResponseBodyData setHttpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }
        public Integer getHttpStatusCode() {
            return this.httpStatusCode;
        }

        public RemoveRuntimeModelTemplateResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public RemoveRuntimeModelTemplateResponseBodyData setRuntimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }
        public String getRuntimeId() {
            return this.runtimeId;
        }

        public RemoveRuntimeModelTemplateResponseBodyData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

}
