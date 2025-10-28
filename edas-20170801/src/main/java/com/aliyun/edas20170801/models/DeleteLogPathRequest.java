// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteLogPathRequest extends TeaModel {
    /**
     * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3616cdca-4f92-4413**********</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The absolute path of the log directory that you want to remove. The value must start and end with a forward slash (<code>/</code>) and must contain <code>/log</code> or <code>/logs</code>. The following directories are the default log directories in Enterprise Distributed Application Service (EDAS):</p>
     * <ul>
     * <li>/home/admin/edas-container/logs/</li>
     * <li>/home/admin/taobao-tomcat-7.0.59/logs/</li>
     * <li>/home/admin/taobao-tomcat-production-7.0.59.3/logs/</li>
     * <li>/home/admin/taobao-tomcat-production-7.0.70/logs/</li>
     * <li>/home/admin/edas-agent/logs/</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>/temp/log/</p>
     */
    @NameInMap("Path")
    public String path;

    public static DeleteLogPathRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLogPathRequest self = new DeleteLogPathRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLogPathRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteLogPathRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

}
