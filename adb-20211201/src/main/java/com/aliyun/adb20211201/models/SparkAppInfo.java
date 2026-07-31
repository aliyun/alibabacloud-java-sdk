// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkAppInfo extends TeaModel {
    /**
     * <p>The ID of the Spark application.</p>
     * 
     * <strong>example:</strong>
     * <p>s202207151211hz0c****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The name of the Spark application.</p>
     * 
     * <strong>example:</strong>
     * <p>SparkTest</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <p>The database ID.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-23xxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The information about the Spark application.</p>
     */
    @NameInMap("Detail")
    public Detail detail;

    /**
     * <p>The alert message returned, such as task execution failure or insufficient resources. If no alert occurs, null is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>WARN: Disk is full.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The priority of the Spark application.</p>
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

    public static SparkAppInfo build(java.util.Map<String, ?> map) throws Exception {
        SparkAppInfo self = new SparkAppInfo();
        return TeaModel.build(map, self);
    }

    public SparkAppInfo setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public SparkAppInfo setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public SparkAppInfo setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public SparkAppInfo setDetail(Detail detail) {
        this.detail = detail;
        return this;
    }
    public Detail getDetail() {
        return this.detail;
    }

    public SparkAppInfo setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SparkAppInfo setPriority(String priority) {
        this.priority = priority;
        return this;
    }
    public String getPriority() {
        return this.priority;
    }

    public SparkAppInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
