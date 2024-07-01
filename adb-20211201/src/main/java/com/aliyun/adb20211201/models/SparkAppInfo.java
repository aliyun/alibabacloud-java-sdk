// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkAppInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>s202207151211hz0cb4*****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>Spark Test</p>
     */
    @NameInMap("AppName")
    public String appName;

    /**
     * <strong>example:</strong>
     * <p>amv-23xxxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Detail")
    public Detail detail;

    /**
     * <strong>example:</strong>
     * <p>WARN: Disk is full</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("Priority")
    public String priority;

    /**
     * <strong>example:</strong>
     * <p>FAILED</p>
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
