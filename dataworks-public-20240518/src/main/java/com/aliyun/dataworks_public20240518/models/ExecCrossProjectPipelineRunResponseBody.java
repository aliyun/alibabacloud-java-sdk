// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ExecCrossProjectPipelineRunResponseBody extends TeaModel {
    /**
     * <p>The business response.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;RequestId&quot;:&quot;735894D1-D5E5-50B8-8A6D-041C90A98B23&quot;}</p>
     */
    @NameInMap("Data")
    public ExecCrossProjectPipelineRunResponseBodyData data;

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

    public static ExecCrossProjectPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecCrossProjectPipelineRunResponseBody self = new ExecCrossProjectPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecCrossProjectPipelineRunResponseBody setData(ExecCrossProjectPipelineRunResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ExecCrossProjectPipelineRunResponseBodyData getData() {
        return this.data;
    }

    public ExecCrossProjectPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecCrossProjectPipelineRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecCrossProjectPipelineRunResponseBodyData extends TeaModel {
        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>735894D1-D5E5-50B8-8A6D-041C90A98B23</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        public static ExecCrossProjectPipelineRunResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ExecCrossProjectPipelineRunResponseBodyData self = new ExecCrossProjectPipelineRunResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ExecCrossProjectPipelineRunResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

    }

}
