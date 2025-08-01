// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class GetSupabaseProjectDashboardAccountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xxpassword</p>
     */
    @NameInMap("DashboardPassword")
    public String dashboardPassword;

    /**
     * <strong>example:</strong>
     * <p>xxuser</p>
     */
    @NameInMap("DashboardUsername")
    public String dashboardUsername;

    /**
     * <strong>example:</strong>
     * <p>sbp-twmoe9bakow</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>supabase_prod</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <strong>example:</strong>
     * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetSupabaseProjectDashboardAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSupabaseProjectDashboardAccountResponseBody self = new GetSupabaseProjectDashboardAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSupabaseProjectDashboardAccountResponseBody setDashboardPassword(String dashboardPassword) {
        this.dashboardPassword = dashboardPassword;
        return this;
    }
    public String getDashboardPassword() {
        return this.dashboardPassword;
    }

    public GetSupabaseProjectDashboardAccountResponseBody setDashboardUsername(String dashboardUsername) {
        this.dashboardUsername = dashboardUsername;
        return this;
    }
    public String getDashboardUsername() {
        return this.dashboardUsername;
    }

    public GetSupabaseProjectDashboardAccountResponseBody setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetSupabaseProjectDashboardAccountResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public GetSupabaseProjectDashboardAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
