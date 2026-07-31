// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkAttemptInfo extends TeaModel {
    /**
     * <p>The attempt ID of the Spark application.</p>
     * 
     * <strong>example:</strong>
     * <p>s202207151211hz****-0001</p>
     */
    @NameInMap("AttemptId")
    public String attemptId;

    /**
     * <p>The information about the Spark application.</p>
     */
    @NameInMap("Detail")
    public Detail detail;

    /**
     * <p>The alert message returned, such as task execution failure or insufficient resources. If no alert occurs, null is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>WARN: Disk is full</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The attempt priority of the Spark application.</p>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <p>The state of the Spark application. Valid values:</p>
     * <ul>
     * <li><strong>SUBMITTED</strong></li>
     * <li><strong>STARTING</strong></li>
     * <li><strong>RUNNING</strong></li>
     * <li><strong>FAILING</strong></li>
     * <li><strong>FAILED</strong></li>
     * <li><strong>KILLING</strong></li>
     * <li><strong>KILLED</strong></li>
     * <li><strong>SUCCEEDING</strong></li>
     * <li><strong>COMPLETED</strong></li>
     * <li><strong>FATAL</strong></li>
     * <li><strong>UNKNOWN</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUBMITTED</p>
     */
    @NameInMap("State")
    public String state;

    public static SparkAttemptInfo build(java.util.Map<String, ?> map) throws Exception {
        SparkAttemptInfo self = new SparkAttemptInfo();
        return TeaModel.build(map, self);
    }

    public SparkAttemptInfo setAttemptId(String attemptId) {
        this.attemptId = attemptId;
        return this;
    }
    public String getAttemptId() {
        return this.attemptId;
    }

    public SparkAttemptInfo setDetail(Detail detail) {
        this.detail = detail;
        return this;
    }
    public Detail getDetail() {
        return this.detail;
    }

    public SparkAttemptInfo setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SparkAttemptInfo setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public SparkAttemptInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
