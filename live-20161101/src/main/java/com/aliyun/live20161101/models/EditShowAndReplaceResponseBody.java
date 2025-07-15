// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class EditShowAndReplaceResponseBody extends TeaModel {
    /**
     * <p>The information about the editing task. The following fields are included:</p>
     * <ul>
     * <li><strong>vodId</strong>: the ID of the VOD file.</li>
     * <li><strong>mediaid</strong>: the ID of the media file.</li>
     * <li><strong>jobId</strong>: the ID of the editing task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{         &quot;vodId&quot;: &quot;3e34733b40b9a96ccf5c1ff6f69****&quot;,         &quot;mediaid&quot;: &quot;eb1861d2c9a842340e989dd56****&quot;,         &quot;jobId&quot;: &quot;7d2fbc380b0e08e55fe98733764****&quot;     }</p>
     */
    @NameInMap("JobInfo")
    public String jobInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static EditShowAndReplaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditShowAndReplaceResponseBody self = new EditShowAndReplaceResponseBody();
        return TeaModel.build(map, self);
    }

    public EditShowAndReplaceResponseBody setJobInfo(String jobInfo) {
        this.jobInfo = jobInfo;
        return this;
    }
    public String getJobInfo() {
        return this.jobInfo;
    }

    public EditShowAndReplaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
