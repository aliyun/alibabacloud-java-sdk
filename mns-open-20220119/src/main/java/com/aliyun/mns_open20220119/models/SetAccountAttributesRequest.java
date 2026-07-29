// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mns_open20220119.models;

import com.aliyun.tea.*;

public class SetAccountAttributesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>06273500-249</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("LogEnabled")
    public Boolean logEnabled;

    /**
     * <strong>example:</strong>
     * <p>test-logstore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("MessageTraceEnabled")
    public Boolean messageTraceEnabled;

    /**
     * <strong>example:</strong>
     * <p>test-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    public static SetAccountAttributesRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAccountAttributesRequest self = new SetAccountAttributesRequest();
        return TeaModel.build(map, self);
    }

    public SetAccountAttributesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SetAccountAttributesRequest setLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
        return this;
    }
    public Boolean getLogEnabled() {
        return this.logEnabled;
    }

    public SetAccountAttributesRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public SetAccountAttributesRequest setMessageTraceEnabled(Boolean messageTraceEnabled) {
        this.messageTraceEnabled = messageTraceEnabled;
        return this;
    }
    public Boolean getMessageTraceEnabled() {
        return this.messageTraceEnabled;
    }

    public SetAccountAttributesRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

}
