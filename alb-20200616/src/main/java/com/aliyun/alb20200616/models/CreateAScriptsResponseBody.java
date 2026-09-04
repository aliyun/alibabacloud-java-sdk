// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateAScriptsResponseBody extends TeaModel {
    /**
     * <p>A list of programmable script IDs.</p>
     */
    @NameInMap("AScriptIds")
    public java.util.List<CreateAScriptsResponseBodyAScriptIds> AScriptIds;

    /**
     * <p>The ID of the asynchronous task.</p>
     * 
     * <strong>example:</strong>
     * <p>5c607642-535e-4e06-9d77-df53049b****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BF0FE763-9603-558F-A55B-0F4******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAScriptsResponseBody self = new CreateAScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAScriptsResponseBody setAScriptIds(java.util.List<CreateAScriptsResponseBodyAScriptIds> AScriptIds) {
        this.AScriptIds = AScriptIds;
        return this;
    }
    public java.util.List<CreateAScriptsResponseBodyAScriptIds> getAScriptIds() {
        return this.AScriptIds;
    }

    public CreateAScriptsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public CreateAScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateAScriptsResponseBodyAScriptIds extends TeaModel {
        /**
         * <p>The ID of the programmable script.</p>
         * 
         * <strong>example:</strong>
         * <p>as-xvq5igaa7uv6vr****</p>
         */
        @NameInMap("AScriptId")
        public String AScriptId;

        public static CreateAScriptsResponseBodyAScriptIds build(java.util.Map<String, ?> map) throws Exception {
            CreateAScriptsResponseBodyAScriptIds self = new CreateAScriptsResponseBodyAScriptIds();
            return TeaModel.build(map, self);
        }

        public CreateAScriptsResponseBodyAScriptIds setAScriptId(String AScriptId) {
            this.AScriptId = AScriptId;
            return this;
        }
        public String getAScriptId() {
            return this.AScriptId;
        }

    }

}
