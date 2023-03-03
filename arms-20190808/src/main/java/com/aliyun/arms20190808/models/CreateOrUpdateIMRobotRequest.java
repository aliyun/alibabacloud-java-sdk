// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIMRobotRequest extends TeaModel {
    /**
     * <p>The configurations of the alert card template.</p>
     */
    @NameInMap("CardTemplate")
    public String cardTemplate;

    /**
     * <p>Specifies whether to send daily statistics.</p>
     * <br>
     * <p>*   `false` (default): does not send statistics.</p>
     * <p>*   `true`: sends statistics. After you select `true`, **DailyNocTime** parameters are required.</p>
     */
    @NameInMap("DailyNoc")
    public Boolean dailyNoc;

    /**
     * <p>The time point at which the daily statistics are sent. Separate multiple sending time points with commas (,). The time point is in the HH:SS format. ARMS Alert Management sends the total number of alerts generated today, the number of resolved alerts, and the number of pending alerts at the specified time point.</p>
     */
    @NameInMap("DailyNocTime")
    public String dailyNocTime;

    /**
     * <p>The signature key of DingTalk. If you specify a signature key, DingTalk authentication is performed with the key. Otherwise, a whitelist is used for authentication by default. The keyword of the whitelist is** Alert**.</p>
     */
    @NameInMap("DingSignKey")
    public String dingSignKey;

    /**
     * <p>Specifies whether to enable the Outgoing feature.</p>
     */
    @NameInMap("EnableOutgoing")
    public Boolean enableOutgoing;

    /**
     * <p>The webhook address of the IM bot.</p>
     */
    @NameInMap("RobotAddress")
    public String robotAddress;

    /**
     * <p>The ID of the IM bot.</p>
     * <br>
     * <p>*   If you do not specify this parameter, a new IM bot is created.</p>
     * <p>*   Enter information that represents modifying the specified IM bot.</p>
     */
    @NameInMap("RobotId")
    public Long robotId;

    /**
     * <p>The name of the IM robot.</p>
     */
    @NameInMap("RobotName")
    public String robotName;

    /**
     * <p>The token required to enable the Outgoing feature.</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>IM Robot Type:</p>
     * <br>
     * <p>*   `dingding`: DingTalk robot.</p>
     * <p>*   `wechat`: Enterprise WeChat Robot.</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateOrUpdateIMRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateIMRobotRequest self = new CreateOrUpdateIMRobotRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateIMRobotRequest setCardTemplate(String cardTemplate) {
        this.cardTemplate = cardTemplate;
        return this;
    }
    public String getCardTemplate() {
        return this.cardTemplate;
    }

    public CreateOrUpdateIMRobotRequest setDailyNoc(Boolean dailyNoc) {
        this.dailyNoc = dailyNoc;
        return this;
    }
    public Boolean getDailyNoc() {
        return this.dailyNoc;
    }

    public CreateOrUpdateIMRobotRequest setDailyNocTime(String dailyNocTime) {
        this.dailyNocTime = dailyNocTime;
        return this;
    }
    public String getDailyNocTime() {
        return this.dailyNocTime;
    }

    public CreateOrUpdateIMRobotRequest setDingSignKey(String dingSignKey) {
        this.dingSignKey = dingSignKey;
        return this;
    }
    public String getDingSignKey() {
        return this.dingSignKey;
    }

    public CreateOrUpdateIMRobotRequest setEnableOutgoing(Boolean enableOutgoing) {
        this.enableOutgoing = enableOutgoing;
        return this;
    }
    public Boolean getEnableOutgoing() {
        return this.enableOutgoing;
    }

    public CreateOrUpdateIMRobotRequest setRobotAddress(String robotAddress) {
        this.robotAddress = robotAddress;
        return this;
    }
    public String getRobotAddress() {
        return this.robotAddress;
    }

    public CreateOrUpdateIMRobotRequest setRobotId(Long robotId) {
        this.robotId = robotId;
        return this;
    }
    public Long getRobotId() {
        return this.robotId;
    }

    public CreateOrUpdateIMRobotRequest setRobotName(String robotName) {
        this.robotName = robotName;
        return this;
    }
    public String getRobotName() {
        return this.robotName;
    }

    public CreateOrUpdateIMRobotRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public CreateOrUpdateIMRobotRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
