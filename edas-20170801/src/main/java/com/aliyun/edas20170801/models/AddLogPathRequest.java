// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AddLogPathRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplication](https://help.aliyun.com/document_detail/149390.html).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The absolute path of the log directory that you want to add. The value must start and end with a forward slash (`/`) and must contain `/log` or `/logs`. The following directories are the default log directories in Enterprise Distributed Application Service (EDAS):</p>
     * <br>
     * <p>*   /home/admin/edas-container/logs/</p>
     * <p>*   /home/admin/taobao-tomcat-7.0.59/logs/</p>
     * <p>*   /home/admin/taobao-tomcat-production-7.0.59.3/logs/</p>
     * <p>*   /home/admin/taobao-tomcat-production-7.0.70/logs/</p>
     * <p>*   /home/admin/edas-agent/logs/</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Path")
    public String path;

    public static AddLogPathRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLogPathRequest self = new AddLogPathRequest();
        return TeaModel.build(map, self);
    }

    public AddLogPathRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddLogPathRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
