// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class AbolishCrossProjectPipelineRunResponseBody extends TeaModel {
    /**
     * <p>The business response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;}</p>
     */
    @NameInMap("Data")
    public AbolishCrossProjectPipelineRunResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate and troubleshoot this API call.</p>
     * 
     * <strong>example:</strong>
     * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static AbolishCrossProjectPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AbolishCrossProjectPipelineRunResponseBody self = new AbolishCrossProjectPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public AbolishCrossProjectPipelineRunResponseBody setData(AbolishCrossProjectPipelineRunResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AbolishCrossProjectPipelineRunResponseBodyData getData() {
        return this.data;
    }

    public AbolishCrossProjectPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AbolishCrossProjectPipelineRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AbolishCrossProjectPipelineRunResponseBodyData extends TeaModel {
        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static AbolishCrossProjectPipelineRunResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AbolishCrossProjectPipelineRunResponseBodyData self = new AbolishCrossProjectPipelineRunResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AbolishCrossProjectPipelineRunResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
