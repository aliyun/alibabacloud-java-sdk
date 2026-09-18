// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateAlertRobotRequest extends TeaModel {
    /**
     * <p>The name of the digital employee.</p>
     * 
     * <strong>example:</strong>
     * <p>apsara-ops</p>
     */
    @NameInMap("digitalEmployeeName")
    public String digitalEmployeeName;

    /**
     * <p>The language.</p>
     * 
     * <strong>example:</strong>
     * <p>zh_CN</p>
     */
    @NameInMap("lang")
    public String lang;

    /**
     * <p>The name of the robot.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The signature key of the robot.</p>
     * 
     * <strong>example:</strong>
     * <p>abc123</p>
     */
    @NameInMap("robotSignKey")
    public String robotSignKey;

    /**
     * <p>The type of the robot.</p>
     * 
     * <strong>example:</strong>
     * <p>DING</p>
     */
    @NameInMap("type")
    public String type;

    /**
     * <p>The webhook URL of the robot.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=">https://oapi.dingtalk.com/robot/send?access_token=</a>**************</p>
     */
    @NameInMap("url")
    public String url;

    public static UpdateAlertRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRobotRequest self = new UpdateAlertRobotRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRobotRequest setDigitalEmployeeName(String digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public UpdateAlertRobotRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateAlertRobotRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateAlertRobotRequest setRobotSignKey(String robotSignKey) {
        this.robotSignKey = robotSignKey;
        return this;
    }
    public String getRobotSignKey() {
        return this.robotSignKey;
    }

    public UpdateAlertRobotRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateAlertRobotRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
