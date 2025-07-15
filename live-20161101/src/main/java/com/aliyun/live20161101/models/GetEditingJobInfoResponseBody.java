// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class GetEditingJobInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>53200b81-b761-4c10-842a-a0726d97****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The information about editing tasks. The following fields are returned for each editing task:</p>
     * <ul>
     * <li><strong>OutputVodId</strong>: the ID of the output video-on-demand (VOD) file.</li>
     * <li><strong>TaskStatus</strong>: the status of the editing task. Valid values: -1, 0, 1, 2, and 3. A value of -1 indicates that the editing task fails. A value of 0 indicates that the editing task is being initialized. A value of 1 indicates that editing is in progress. A value of 2 indicates that the output VOD file is being uploaded. A value of 3 indicates that the editing task is successful.</li>
     * <li><strong>StorageLocation</strong>: the storage location in ApsaraVideo VOD.</li>
     * <li><strong>FileName</strong>: the name of the file that is edited.</li>
     * <li><strong>ShowId</strong>: the ID of the episode.</li>
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
