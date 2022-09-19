// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class SparkAttemptInfo extends TeaModel {
    @NameInMap("AttemptId")
    public String attemptId;

    @NameInMap("Detail")
    public Detail detail;

    @NameInMap("Message")
    public String message;

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

    public SparkAttemptInfo setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
