// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class SubmitInternalPurchaseChargeDataRequest extends TeaModel {
    @NameInMap("UserActivationRate")
    public Float userActivationRate;

    @NameInMap("NewUserRetentionRateOneDay")
    @Validation(required = true)
    public Float newUserRetentionRateOneDay;

    @NameInMap("ActiveUserRetentionRateOneDay")
    @Validation(required = true)
    public Float activeUserRetentionRateOneDay;

    @NameInMap("NewUserRetentionRateSevenDay")
    @Validation(required = true)
    public Float newUserRetentionRateSevenDay;

    @NameInMap("ActiveUserRetentionRateSevenDay")
    @Validation(required = true)
    public Float activeUserRetentionRateSevenDay;

    @NameInMap("PaymentConversionRate")
    @Validation(required = true)
    public Float paymentConversionRate;

    @NameInMap("Dau")
    @Validation(required = true)
    public Long dau;

    @NameInMap("Mau")
    @Validation(required = true)
    public Long mau;

    @NameInMap("PlayTimeRangeOneDay")
    @Validation(required = true)
    public String playTimeRangeOneDay;

    @NameInMap("PlayTimeRangeThirtyDay")
    @Validation(required = true)
    public String playTimeRangeThirtyDay;

    @NameInMap("Arpu")
    @Validation(required = true)
    public Float arpu;

    @NameInMap("GameId")
    @Validation(required = true)
    public String gameId;

    @NameInMap("ChargeDate")
    @Validation(required = true)
    public String chargeDate;

    @NameInMap("NewUserRetentionRateThirtyDay")
    @Validation(required = true)
    public Float newUserRetentionRateThirtyDay;

    @NameInMap("ActiveUserRetentionRateThirtyDay")
    @Validation(required = true)
    public Float activeUserRetentionRateThirtyDay;

    @NameInMap("PlayTimeAverageOneDay")
    @Validation(required = true)
    public Float playTimeAverageOneDay;

    @NameInMap("PlayTimeAverageThirtyDay")
    @Validation(required = true)
    public Float playTimeAverageThirtyDay;

    @NameInMap("PlayTimeNinetyPointsOneDay")
    @Validation(required = true)
    public Float playTimeNinetyPointsOneDay;

    @NameInMap("PlayTimeNinetyPointsThirtyDay")
    @Validation(required = true)
    public Float playTimeNinetyPointsThirtyDay;

    public static SubmitInternalPurchaseChargeDataRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInternalPurchaseChargeDataRequest self = new SubmitInternalPurchaseChargeDataRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInternalPurchaseChargeDataRequest setUserActivationRate(Float userActivationRate) {
        this.userActivationRate = userActivationRate;
        return this;
    }
    public Float getUserActivationRate() {
        return this.userActivationRate;
    }

    public SubmitInternalPurchaseChargeDataRequest setNewUserRetentionRateOneDay(Float newUserRetentionRateOneDay) {
        this.newUserRetentionRateOneDay = newUserRetentionRateOneDay;
        return this;
    }
    public Float getNewUserRetentionRateOneDay() {
        return this.newUserRetentionRateOneDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setActiveUserRetentionRateOneDay(Float activeUserRetentionRateOneDay) {
        this.activeUserRetentionRateOneDay = activeUserRetentionRateOneDay;
        return this;
    }
    public Float getActiveUserRetentionRateOneDay() {
        return this.activeUserRetentionRateOneDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setNewUserRetentionRateSevenDay(Float newUserRetentionRateSevenDay) {
        this.newUserRetentionRateSevenDay = newUserRetentionRateSevenDay;
        return this;
    }
    public Float getNewUserRetentionRateSevenDay() {
        return this.newUserRetentionRateSevenDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setActiveUserRetentionRateSevenDay(Float activeUserRetentionRateSevenDay) {
        this.activeUserRetentionRateSevenDay = activeUserRetentionRateSevenDay;
        return this;
    }
    public Float getActiveUserRetentionRateSevenDay() {
        return this.activeUserRetentionRateSevenDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setPaymentConversionRate(Float paymentConversionRate) {
        this.paymentConversionRate = paymentConversionRate;
        return this;
    }
    public Float getPaymentConversionRate() {
        return this.paymentConversionRate;
    }

    public SubmitInternalPurchaseChargeDataRequest setDau(Long dau) {
        this.dau = dau;
        return this;
    }
    public Long getDau() {
        return this.dau;
    }

    public SubmitInternalPurchaseChargeDataRequest setMau(Long mau) {
        this.mau = mau;
        return this;
    }
    public Long getMau() {
        return this.mau;
    }

    public SubmitInternalPurchaseChargeDataRequest setPlayTimeRangeOneDay(String playTimeRangeOneDay) {
        this.playTimeRangeOneDay = playTimeRangeOneDay;
        return this;
    }
    public String getPlayTimeRangeOneDay() {
        return this.playTimeRangeOneDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setPlayTimeRangeThirtyDay(String playTimeRangeThirtyDay) {
        this.playTimeRangeThirtyDay = playTimeRangeThirtyDay;
        return this;
    }
    public String getPlayTimeRangeThirtyDay() {
        return this.playTimeRangeThirtyDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setArpu(Float arpu) {
        this.arpu = arpu;
        return this;
    }
    public Float getArpu() {
        return this.arpu;
    }

    public SubmitInternalPurchaseChargeDataRequest setGameId(String gameId) {
        this.gameId = gameId;
        return this;
    }
    public String getGameId() {
        return this.gameId;
    }

    public SubmitInternalPurchaseChargeDataRequest setChargeDate(String chargeDate) {
        this.chargeDate = chargeDate;
        return this;
    }
    public String getChargeDate() {
        return this.chargeDate;
    }

    public SubmitInternalPurchaseChargeDataRequest setNewUserRetentionRateThirtyDay(Float newUserRetentionRateThirtyDay) {
        this.newUserRetentionRateThirtyDay = newUserRetentionRateThirtyDay;
        return this;
    }
    public Float getNewUserRetentionRateThirtyDay() {
        return this.newUserRetentionRateThirtyDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setActiveUserRetentionRateThirtyDay(Float activeUserRetentionRateThirtyDay) {
        this.activeUserRetentionRateThirtyDay = activeUserRetentionRateThirtyDay;
        return this;
    }
    public Float getActiveUserRetentionRateThirtyDay() {
        return this.activeUserRetentionRateThirtyDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setPlayTimeAverageOneDay(Float playTimeAverageOneDay) {
        this.playTimeAverageOneDay = playTimeAverageOneDay;
        return this;
    }
    public Float getPlayTimeAverageOneDay() {
        return this.playTimeAverageOneDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setPlayTimeAverageThirtyDay(Float playTimeAverageThirtyDay) {
        this.playTimeAverageThirtyDay = playTimeAverageThirtyDay;
        return this;
    }
    public Float getPlayTimeAverageThirtyDay() {
        return this.playTimeAverageThirtyDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setPlayTimeNinetyPointsOneDay(Float playTimeNinetyPointsOneDay) {
        this.playTimeNinetyPointsOneDay = playTimeNinetyPointsOneDay;
        return this;
    }
    public Float getPlayTimeNinetyPointsOneDay() {
        return this.playTimeNinetyPointsOneDay;
    }

    public SubmitInternalPurchaseChargeDataRequest setPlayTimeNinetyPointsThirtyDay(Float playTimeNinetyPointsThirtyDay) {
        this.playTimeNinetyPointsThirtyDay = playTimeNinetyPointsThirtyDay;
        return this;
    }
    public Float getPlayTimeNinetyPointsThirtyDay() {
        return this.playTimeNinetyPointsThirtyDay;
    }

}
