// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class MarkOssV2ResultRequest extends TeaModel {
    /**
     * <p>The end time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-21 16:08:38 +0800</p>
     */
    @NameInMap("EndDate")
    public String endDate;

    /**
     * <p>The freeze type. This parameter is required when Operation is set to freeze. Valid values:</p>
     * <ul>
     * <li>ACL: Modify file permissions.</li>
     * <li>COPY: Move the file to a directory. The destination directory is determined as follows: 1. The directory selected when the task was created takes priority. 2. If automatic freezing was not enabled during creation, or ACL freezing was configured, the directory selected during freezing in the console is used. 3. The default directory is alicip_riskfile_backup/.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACL</p>
     */
    @NameInMap("FreezeType")
    public String freezeType;

    /**
     * <p>The processing operation. Valid values:</p>
     * <ul>
     * <li>freeze: freeze.</li>
     * <li>unfreeze: unfreeze.</li>
     * <li>misreport: false positive (not in violation).</li>
     * <li>missOut: missed violation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>freeze</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("RequestIds")
    public String requestIds;

    /**
     * <p>The start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-21 16:08:38 +0800</p>
     */
    @NameInMap("StartDate")
    public String startDate;

    /**
     * <p>The task name.</p>
     * 
     * <strong>example:</strong>
     * <p>Image stock task 20240914100517757</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static MarkOssV2ResultRequest build(java.util.Map<String, ?> map) throws Exception {
        MarkOssV2ResultRequest self = new MarkOssV2ResultRequest();
        return TeaModel.build(map, self);
    }

    public MarkOssV2ResultRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public MarkOssV2ResultRequest setFreezeType(String freezeType) {
        this.freezeType = freezeType;
        return this;
    }
    public String getFreezeType() {
        return this.freezeType;
    }

    public MarkOssV2ResultRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public MarkOssV2ResultRequest setRequestIds(String requestIds) {
        this.requestIds = requestIds;
        return this;
    }
    public String getRequestIds() {
        return this.requestIds;
    }

    public MarkOssV2ResultRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public MarkOssV2ResultRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
