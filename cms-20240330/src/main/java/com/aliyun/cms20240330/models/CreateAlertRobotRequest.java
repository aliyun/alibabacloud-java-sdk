// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class CreateAlertRobotRequest extends TeaModel {
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
     * <p>The unique ID of the robot.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("robotId")
    public String robotId;

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
     * <p>This parameter is required.</p>
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

    /**
     * <p>The workspace name.</p>
     * 
     * <strong>example:</strong>
     * <p>default-cms-1423134313712421-cn-shanghai</p>
     */
    @NameInMap("workspace")
    public String workspace;

    public static CreateAlertRobotRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertRobotRequest self = new CreateAlertRobotRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertRobotRequest setDigitalEmployeeName(String digitalEmployeeName) {
        this.digitalEmployeeName = digitalEmployeeName;
        return this;
    }
    public String getDigitalEmployeeName() {
        return this.digitalEmployeeName;
    }

    public CreateAlertRobotRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateAlertRobotRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAlertRobotRequest setRobotId(String robotId) {
        this.robotId = robotId;
        return this;
    }
    public String getRobotId() {
        return this.robotId;
    }

    public CreateAlertRobotRequest setRobotSignKey(String robotSignKey) {
        this.robotSignKey = robotSignKey;
        return this;
    }
    public String getRobotSignKey() {
        return this.robotSignKey;
    }

    public CreateAlertRobotRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateAlertRobotRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public CreateAlertRobotRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
