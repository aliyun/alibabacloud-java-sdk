// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214.models;

import com.aliyun.tea.*;

public class SaveUserCreditRequest extends TeaModel {
    /**
     * <p>Specifies whether to enable service suspension protection for pay-as-you-go services.</p>
     */
    @NameInMap("AvoidExpiration")
    public Boolean avoidExpiration;

    /**
     * <p>Specifies whether to allow the use of pay-as-you-go services without the need to send notifications.</p>
     */
    @NameInMap("AvoidNotification")
    public Boolean avoidNotification;

    /**
     * <p>Specifies whether to enable service suspension protection for subscription services.</p>
     */
    @NameInMap("AvoidPrepaidExpiration")
    public Boolean avoidPrepaidExpiration;

    /**
     * <p>Specifies whether to allow the use of subscription services without the need to send notifications.</p>
     */
    @NameInMap("AvoidPrepaidNotification")
    public Boolean avoidPrepaidNotification;

    /**
     * <p>The type of the credit.</p>
     */
    @NameInMap("CreditType")
    public String creditType;

    /**
     * <p>The value of the credit.</p>
     */
    @NameInMap("CreditValue")
    public String creditValue;

    /**
     * <p>Description</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The operator who performs the action.</p>
     */
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
