// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitIProductionJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>5210DBB0-E327-4D45-ADBC-0B83C8796E26</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;Code&quot;:&quot;Success&quot;, &quot;Details&quot;:[], &quot;FunctionName&quot;:&quot;ImageCartoonize&quot;, &quot;JobId&quot;:&quot;39f8e0bc005e4f309379701645f4****&quot;, &quot;Message&quot;:&quot;success&quot;, &quot;State&quot;:&quot;Success&quot;, &quot;Type&quot;:&quot;IProduction&quot; }</p>
     */
    @NameInMap("Result")
    public String result;

    public static SubmitIProductionJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitIProductionJobResponseBody self = new SubmitIProductionJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitIProductionJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitIProductionJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitIProductionJobResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
