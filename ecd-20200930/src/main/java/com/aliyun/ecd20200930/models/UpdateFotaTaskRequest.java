// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class UpdateFotaTaskRequest extends TeaModel {
    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the image update task. You can call the <a href="https://help.aliyun.com/document_detail/437001.html">DescribeFotaTasks</a> operation to obtain the value of this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aot-c4khwrp9ocml4****</p>
     */
    @NameInMap("TaskUid")
    public String taskUid;

    /**
     * <p>Specifies whether to automatically push the image update task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Running: automatically pushes the image update task.</li>
     * <li>Pending: does not automatically push the image update task.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Pending</p>
     */
    @NameInMap("UserStatus")
    public String userStatus;

    public static UpdateFotaTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFotaTaskRequest self = new UpdateFotaTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFotaTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateFotaTaskRequest setTaskUid(String taskUid) {
        this.taskUid = taskUid;
        return this;
    }
    public String getTaskUid() {
        return this.taskUid;
    }

    public UpdateFotaTaskRequest setUserStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public String getUserStatus() {
        return this.userStatus;
    }

}
