// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetEdgeContainerLogsRequest extends TeaModel {
    /**
     * <p>The application ID. You can call the <a href="~~ListEdgeContainerApps~~">ListEdgeContainerApps</a> operation to obtain the application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app-88068867578379****</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The number of log lines to output.&gt;Notice: Valid values: 1 to 5000. If the value exceeds the upper limit, an error is returned.</notice>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("Lines")
    public Integer lines;

    public static GetEdgeContainerLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeContainerLogsRequest self = new GetEdgeContainerLogsRequest();
        return TeaModel.build(map, self);
    }

    public GetEdgeContainerLogsRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public GetEdgeContainerLogsRequest setLines(Integer lines) {
        this.lines = lines;
        return this;
    }
    public Integer getLines() {
        return this.lines;
    }

}
