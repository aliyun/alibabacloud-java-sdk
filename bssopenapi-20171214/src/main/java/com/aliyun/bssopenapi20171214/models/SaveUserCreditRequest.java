// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SaveUserCreditRequest extends TeaModel {
    @NameInMap("AvoidExpiration")
    public Boolean avoidExpiration;

    @NameInMap("AvoidNotification")
    public Boolean avoidNotification;

    @NameInMap("AvoidPrepaidExpiration")
    public Boolean avoidPrepaidExpiration;

    @NameInMap("AvoidPrepaidNotification")
    public Boolean avoidPrepaidNotification;

    @NameInMap("CreditType")
    public String creditType;

    @NameInMap("CreditValue")
    public String creditValue;

    @NameInMap("Description")
    public String description;

    @NameInMap("Operator")
    public String operator;

    public static SaveUserCreditRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveUserCreditRequest self = new SaveUserCreditRequest();
        return TeaModel.build(map, self);
    }

    public SaveUserCreditRequest setAvoidExpiration(Boolean avoidExpiration) {
        this.avoidExpiration = avoidExpiration;
        return this;
    }
    public Boolean getAvoidExpiration() {
        return this.avoidExpiration;
    }

    public SaveUserCreditRequest setAvoidNotification(Boolean avoidNotification) {
        this.avoidNotification = avoidNotification;
        return this;
    }
    public Boolean getAvoidNotification() {
        return this.avoidNotification;
    }

    public SaveUserCreditRequest setAvoidPrepaidExpiration(Boolean avoidPrepaidExpiration) {
        this.avoidPrepaidExpiration = avoidPrepaidExpiration;
        return this;
    }
    public Boolean getAvoidPrepaidExpiration() {
        return this.avoidPrepaidExpiration;
    }

    public SaveUserCreditRequest setAvoidPrepaidNotification(Boolean avoidPrepaidNotification) {
        this.avoidPrepaidNotification = avoidPrepaidNotification;
        return this;
    }
    public Boolean getAvoidPrepaidNotification() {
        return this.avoidPrepaidNotification;
    }

    public SaveUserCreditRequest setCreditType(String creditType) {
        this.creditType = creditType;
        return this;
    }
    public String getCreditType() {
        return this.creditType;
    }

    public SaveUserCreditRequest setCreditValue(String creditValue) {
        this.creditValue = creditValue;
        return this;
    }
    public String getCreditValue() {
        return this.creditValue;
    }

    public SaveUserCreditRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SaveUserCreditRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
