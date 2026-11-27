// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class InsertAiOutboundPhoneNumsShrinkRequest extends TeaModel {
    /**
     * <p>The task batch number.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the numbers are imported to the default batch.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("BatchVersion")
    public Integer batchVersion;

    /**
     * <p>The number details.</p>
     * <blockquote>
     * <p>A maximum of 30 entries are supported.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Details")
    public String detailsShrink;

    /**
     * <p>The AICCS instance ID.
     * You can obtain the instance ID in the <b>Instances</b> section of the left-side navigation pane in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The task ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/312260.html">CreateAiOutboundTask</a> operation and view the <strong>Data</strong> response parameter, or call the <a href="https://help.aliyun.com/document_detail/2718026.html">GetAiOutboundTaskList</a> operation and view the <strong>TaskId</strong> response parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("TaskId")
    public Long taskId;

    public static InsertAiOutboundPhoneNumsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertAiOutboundPhoneNumsShrinkRequest self = new InsertAiOutboundPhoneNumsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public InsertAiOutboundPhoneNumsShrinkRequest setBatchVersion(Integer batchVersion) {
        this.batchVersion = batchVersion;
        return this;
    }
    public Integer getBatchVersion() {
        return this.batchVersion;
    }

    public InsertAiOutboundPhoneNumsShrinkRequest setDetailsShrink(String detailsShrink) {
        this.detailsShrink = detailsShrink;
        return this;
    }
    public String getDetailsShrink() {
        return this.detailsShrink;
    }

    public InsertAiOutboundPhoneNumsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public InsertAiOutboundPhoneNumsShrinkRequest setTaskId(Long taskId) {
        this.taskId = taskId;
        return this;
    }
    public Long getTaskId() {
        return this.taskId;
    }

}
