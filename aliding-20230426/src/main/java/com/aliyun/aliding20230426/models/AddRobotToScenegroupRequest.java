// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AddRobotToScenegroupRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cidt*****Xa4K10w==</p>
     */
    @NameInMap("OpenConversationId")
    public String openConversationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dingxxxxxxxxxxxx</p>
     */
    @NameInMap("RobotCode")
    public String robotCode;

    public static AddRobotToScenegroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRobotToScenegroupRequest self = new AddRobotToScenegroupRequest();
        return TeaModel.build(map, self);
    }

    public AddRobotToScenegroupRequest setOpenConversationId(String openConversationId) {
        this.openConversationId = openConversationId;
        return this;
    }
    public String getOpenConversationId() {
        return this.openConversationId;
    }

    public AddRobotToScenegroupRequest setRobotCode(String robotCode) {
        this.robotCode = robotCode;
        return this;
    }
    public String getRobotCode() {
        return this.robotCode;
    }

}
