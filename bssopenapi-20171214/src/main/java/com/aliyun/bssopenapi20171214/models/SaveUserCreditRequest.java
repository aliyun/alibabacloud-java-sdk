// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SaveUserCreditRequest extends TeaModel {
    @NameInMap("AvoidExpiration")
    @Validation(required = true)
    public Boolean avoidExpiration;

    @NameInMap("AvoidPrepaidNotification")
    @Validation(required = true)
    public Boolean avoidPrepaidNotification;

    @NameInMap("Description")
    @Validation(required = true)
    public String description;

    @NameInMap("AvoidNotification")
    @Validation(required = true)
    public Boolean avoidNotification;

    @NameInMap("CreditValue")
    @Validation(required = true)
    public String creditValue;

    @NameInMap("AvoidPrepaidExpiration")
    @Validation(required = true)
    public Boolean avoidPrepaidExpiration;

    @NameInMap("Operator")
    @Validation(required = true)
    public String operator;

    @NameInMap("CreditType")
    @Validation(required = true)
    public String creditType;

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

    public SaveUserCreditRequest setAvoidPrepaidNotification(Boolean avoidPrepaidNotification) {
        this.avoidPrepaidNotification = avoidPrepaidNotification;
        return this;
    }
    public Boolean getAvoidPrepaidNotification() {
        return this.avoidPrepaidNotification;
    }

    public SaveUserCreditRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SaveUserCreditRequest setAvoidNotification(Boolean avoidNotification) {
        this.avoidNotification = avoidNotification;
        return this;
    }
    public Boolean getAvoidNotification() {
        return this.avoidNotification;
    }

    public SaveUserCreditRequest setCreditValue(String creditValue) {
        this.creditValue = creditValue;
        return this;
    }
    public String getCreditValue() {
        return this.creditValue;
    }

    public SaveUserCreditRequest setAvoidPrepaidExpiration(Boolean avoidPrepaidExpiration) {
        this.avoidPrepaidExpiration = avoidPrepaidExpiration;
        return this;
    }
    public Boolean getAvoidPrepaidExpiration() {
        return this.avoidPrepaidExpiration;
    }

    public SaveUserCreditRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public SaveUserCreditRequest setCreditType(String creditType) {
        this.creditType = creditType;
        return this;
    }
    public String getCreditType() {
        return this.creditType;
    }

}
