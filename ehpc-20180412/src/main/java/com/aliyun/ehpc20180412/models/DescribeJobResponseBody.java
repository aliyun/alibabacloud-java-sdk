// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class DescribeJobResponseBody extends TeaModel {
    /**
     * <p>The list of returned job information.</p>
     */
    @NameInMap("Message")
    public DescribeJobResponseBodyMessage message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9697AD8D-56FA-4C8E-B46C-00AC9***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeJobResponseBody self = new DescribeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeJobResponseBody setMessage(DescribeJobResponseBodyMessage message) {
        this.message = message;
        return this;
    }
    public DescribeJobResponseBodyMessage getMessage() {
        return this.message;
    }

    public DescribeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeJobResponseBodyMessage extends TeaModel {
        /**
         * <p>The details of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;2.scheduler&quot;: {&quot;egroup&quot;: &quot;users&quot;,&quot;Stageout_status&quot;: 1,&quot;Keep_Files&quot;: &quot;n&quot;,&quot;server&quot;: &quot;scheduler&quot;,&quot;queue&quot;: &quot;workq&quot;}}</p>
         */
        @NameInMap("JobInfo")
        public String jobInfo;

        public static DescribeJobResponseBodyMessage build(java.util.Map<String, ?> map) throws Exception {
            DescribeJobResponseBodyMessage self = new DescribeJobResponseBodyMessage();
            return TeaModel.build(map, self);
        }

        public DescribeJobResponseBodyMessage setJobInfo(String jobInfo) {
            this.jobInfo = jobInfo;
            return this;
        }
        public String getJobInfo() {
            return this.jobInfo;
        }

    }

}
