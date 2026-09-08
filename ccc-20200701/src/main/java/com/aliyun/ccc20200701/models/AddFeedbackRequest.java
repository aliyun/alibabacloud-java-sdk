// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddFeedbackRequest extends TeaModel {
    /**
     * <p>The feedback provided by returning users.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;问题描述&quot;:&quot;客户询问沙发生产周期并尝试加快&quot;, &quot;客服方案&quot;:&quot;订单确认，建议联系在线客服&quot;, &quot;完成度判断&quot;:&quot;否&quot;}</p>
     */
    @NameInMap("Feedback")
    public String feedback;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Rating:</p>
     * <ul>
     * <li><p>thumbsDown: Thumbs down.</p>
     * </li>
     * <li><p>thumbsUp: Thumbs up.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>thumbsUp</p>
     */
    @NameInMap("Rating")
    public Integer rating;

    /**
     * <p>AI task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f780ade8-****-458b-b067-63077946a570</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>Task type.</p>
     * <ul>
     * <li><p>Abstract:fields (Field extraction)</p>
     * </li>
     * <li><p>Abstract:keywords (Hot keywords)</p>
     * </li>
     * <li><p>Abstract:title_summary (Summary)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Abstract:fields</p>
     */
    @NameInMap("TaskName")
    public String taskName;

    public static AddFeedbackRequest build(java.util.Map<String, ?> map) throws Exception {
        AddFeedbackRequest self = new AddFeedbackRequest();
        return TeaModel.build(map, self);
    }

    public AddFeedbackRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public AddFeedbackRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddFeedbackRequest setRating(Integer rating) {
        this.rating = rating;
        return this;
    }
    public Integer getRating() {
        return this.rating;
    }

    public AddFeedbackRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public AddFeedbackRequest setTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }
    public String getTaskName() {
        return this.taskName;
    }

}
