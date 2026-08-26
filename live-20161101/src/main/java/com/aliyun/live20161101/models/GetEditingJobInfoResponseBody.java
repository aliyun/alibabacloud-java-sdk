// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEditingJobInfoResponseBody extends TeaModel {
    /**
     * <p>The production studio ID.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The video clip task information. This includes:</p>
     * <ul>
     * <li><p><strong>OutputVodId</strong>: The ID of the output video-on-demand file.</p>
     * </li>
     * <li><p><strong>TaskStatus</strong>: The status of the video clip task. (-1: failed. 0: task initialized. 1: clipping in progress. 2: uploading. 3: task succeeded.)</p>
     * </li>
     * <li><p><strong>StorageLocation</strong>: The video-on-demand storage address.</p>
     * </li>
     * <li><p><strong>FileName</strong>: The name of the clipped file.</p>
     * </li>
     * <li><p><strong>ShowId</strong>: The show ID.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;EditingTasksInfo&quot;: {     &quot;OutputVodId&quot;: &quot;3e34733b40b9a96ccf5c1ff6f69****&quot;,     &quot;TaskStatus&quot;: 1,     &quot;StorageInfo&quot;: {       &quot;StorageLocation&quot;: &quot;<em><strong>bucket</strong></em>&quot;,       &quot;FileName&quot;: &quot;EditFile****&quot;     },     &quot;ShowId&quot;: &quot;42200b81-b761-4c10-842a-a0726d97****&quot;   },</p>
     */
    @NameInMap("EditingTasksInfo")
    public String editingTasksInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetEditingJobInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEditingJobInfoResponseBody self = new GetEditingJobInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEditingJobInfoResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public GetEditingJobInfoResponseBody setEditingTasksInfo(String editingTasksInfo) {
        this.editingTasksInfo = editingTasksInfo;
        return this;
    }
    public String getEditingTasksInfo() {
        return this.editingTasksInfo;
    }

    public GetEditingJobInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
