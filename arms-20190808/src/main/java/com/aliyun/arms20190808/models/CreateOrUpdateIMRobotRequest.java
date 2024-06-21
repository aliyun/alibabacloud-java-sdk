// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateIMRobotRequest extends TeaModel {
    /**
     * <p>The configurations of the alert card template. For more information about the parameters in the template, see the following section.</p>
     * 
     * <strong>example:</strong>
     * <p>{     &quot;button&quot;: [         &quot;claim&quot;,         &quot;close&quot;,         &quot;follow&quot;,         &quot;send_itsm&quot;,         &quot;block&quot;,         &quot;unResolvedIncident&quot;     ],     &quot;field&quot;: [         {             &quot;fieldName&quot;: &quot;alarmName&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;notificationPolicy&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;alarmContent&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;alarmTime&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;seriesChart&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;includeEvent&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;assigned&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;similarAlarm&quot;,             &quot;visible&quot;: true         },         {             &quot;fieldName&quot;: &quot;operator&quot;,             &quot;visible&quot;: true         }     ] }</p>
     */
    @NameInMap("CardTemplate")
    public String cardTemplate;

    /**
     * <p>Specifies whether to send daily statistics. Valid values:</p>
     * <ul>
     * <li><code>false</code> (default): Daily statistics are not sent.</li>
     * <li><code>true</code>: Daily statistics are sent. If you set the value to <code>true</code>, the <strong>DailyNocTime</strong> parameter is required.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DailyNoc")
    public Boolean dailyNoc;

    /**
     * <p>The points in time at which the daily statistics are sent. Separate multiple points in time with commas (,). The points in time are in the HH:SS format. The information that ARMS sends at the specified points in time includes the total number of alerts generated on the current day, the number of cleared alerts, and the number of alerts to be cleared.</p>
     * 
     * <strong>example:</strong>
     * <p>09:30,17:00</p>
     */
    @NameInMap("DailyNocTime")
    public String dailyNocTime;

    /**
     * <p>The signature key of DingTalk. If you specify a signature key, DingTalk authentication is performed by using the signature key. If you do not specify a signature key, a whitelist is used for authentication by default. The keyword of the whitelist is <strong>Alert</strong>.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("DingSignKey")
    public String dingSignKey;

    /**
     * <p>Specifies whether to enable the Outgoing feature.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableOutgoing")
    public Boolean enableOutgoing;

    /**
     * <p>The webhook URL of the IM chatbot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=e1a049121">https://oapi.dingtalk.com/robot/send?access_token=e1a049121</a>******</p>
     */
    @NameInMap("RobotAddress")
    public String robotAddress;

    /**
     * <p>The ID of the IM chatbot.</p>
     * <blockquote>
     * <p>If you do not specify the parameter, a new IM chatbot is created.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("RobotId")
    public Long robotId;

    /**
     * <p>The name of the IM chatbot.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Chatbot name</p>
     */
    @NameInMap("RobotName")
    public String robotName;

    /**
     * <p>The token required to enable the Outgoing feature.</p>
     * 
     * <strong>example:</strong>
     * <p>1656558719183be1245ab44********</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The type of the IM chatbot. Valid values:</p>
     * <ul>
     * <li><code>dingding</code>: DingTalk chatbot</li>
     * <li><code>wechat</code>: WeCom chatbot</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>dingding</p>
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
