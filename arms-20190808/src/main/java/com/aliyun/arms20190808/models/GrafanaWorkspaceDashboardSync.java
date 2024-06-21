// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GrafanaWorkspaceDashboardSync extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>testTitle</p>
     */
    @NameInMap("dashboardTitle")
    public String dashboardTitle;

    /**
     * <strong>example:</strong>
     * <p><a href="https://g.console.aliyun.com/d/1098370038733503-14960236-422-3/ack-pro-apiserver">https://g.console.aliyun.com/d/1098370038733503-14960236-422-3/ack-pro-apiserver</a></p>
     */
    @NameInMap("dashboardURL")
    public String dashboardURL;

    /**
     * <strong>example:</strong>
     * <p>xxxdvxsea</p>
     */
    @NameInMap("dashboardUid")
    public String dashboardUid;

    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("folderId")
    public String folderId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("folderTitle")
    public String folderTitle;

    /**
     * <strong>example:</strong>
     * <p><a href="https://g.console.aliyun.com/d/1098370038733503-14960236-422-3/ack-pro-apiserver">https://g.console.aliyun.com/d/1098370038733503-14960236-422-3/ack-pro-apiserver</a></p>
     */
    @NameInMap("folderURL")
    public String folderURL;

    /**
     * <strong>example:</strong>
     * <p>vxeupqn</p>
     */
    @NameInMap("folderUid")
    public String folderUid;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("orgId")
    public String orgId;

    /**
     * <strong>example:</strong>
     * <p>user123</p>
     */
    @NameInMap("orgName")
    public String orgName;

    /**
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("type")
    public String type;

    public static GrafanaWorkspaceDashboardSync build(java.util.Map<String, ?> map) throws Exception {
        GrafanaWorkspaceDashboardSync self = new GrafanaWorkspaceDashboardSync();
        return TeaModel.build(map, self);
    }

    public GrafanaWorkspaceDashboardSync setDashboardTitle(String dashboardTitle) {
        this.dashboardTitle = dashboardTitle;
        return this;
    }
    public String getDashboardTitle() {
        return this.dashboardTitle;
    }

    public GrafanaWorkspaceDashboardSync setDashboardURL(String dashboardURL) {
        this.dashboardURL = dashboardURL;
        return this;
    }
    public String getDashboardURL() {
        return this.dashboardURL;
    }

    public GrafanaWorkspaceDashboardSync setDashboardUid(String dashboardUid) {
        this.dashboardUid = dashboardUid;
        return this;
    }
    public String getDashboardUid() {
        return this.dashboardUid;
    }

    public GrafanaWorkspaceDashboardSync setFolderId(String folderId) {
        this.folderId = folderId;
        return this;
    }
    public String getFolderId() {
        return this.folderId;
    }

    public GrafanaWorkspaceDashboardSync setFolderTitle(String folderTitle) {
        this.folderTitle = folderTitle;
        return this;
    }
    public String getFolderTitle() {
        return this.folderTitle;
    }

    public GrafanaWorkspaceDashboardSync setFolderURL(String folderURL) {
        this.folderURL = folderURL;
        return this;
    }
    public String getFolderURL() {
        return this.folderURL;
    }

    public GrafanaWorkspaceDashboardSync setFolderUid(String folderUid) {
        this.folderUid = folderUid;
        return this;
    }
    public String getFolderUid() {
        return this.folderUid;
    }

    public GrafanaWorkspaceDashboardSync setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }
    public String getOrgId() {
        return this.orgId;
    }

    public GrafanaWorkspaceDashboardSync setOrgName(String orgName) {
        this.orgName = orgName;
        return this;
    }
    public String getOrgName() {
        return this.orgName;
    }

    public GrafanaWorkspaceDashboardSync setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
