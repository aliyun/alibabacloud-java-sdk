// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class TransferTaskApprovalCallbackRequest extends TeaModel {
    /**
     * <p>The name of the OSS bucket where the file resides.</p>
     * 
     * <strong>example:</strong>
     * <p>ed****-17337752804***</p>
     */
    @NameInMap("OssBucketName")
    public String ossBucketName;

    /**
     * <p>The region where the OSS bucket storing the file resides.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("OssBucketRegionId")
    public String ossBucketRegionId;

    /**
     * <p>The approval result.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Approved</li>
     * <li>Rejected</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Approved</p>
     */
    @NameInMap("Result")
    public String result;

    /**
     * <p>The ID of the transmission task.</p>
     * 
     * <strong>example:</strong>
     * <p>trt-msndfksm18fs****</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static TransferTaskApprovalCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferTaskApprovalCallbackRequest self = new TransferTaskApprovalCallbackRequest();
        return TeaModel.build(map, self);
    }

    public TransferTaskApprovalCallbackRequest setOssBucketName(String ossBucketName) {
        this.ossBucketName = ossBucketName;
        return this;
    }
    public String getOssBucketName() {
        return this.ossBucketName;
    }

    public TransferTaskApprovalCallbackRequest setOssBucketRegionId(String ossBucketRegionId) {
        this.ossBucketRegionId = ossBucketRegionId;
        return this;
    }
    public String getOssBucketRegionId() {
        return this.ossBucketRegionId;
    }

    public TransferTaskApprovalCallbackRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public TransferTaskApprovalCallbackRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
