// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CheckSiteProjectNameResponseBody extends TeaModel {
    /**
     * <p>Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Can be added.</li>
     * <li><strong>false</strong>: Cannot be added.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Check")
    public Boolean check;

    /**
     * <p>The result description.</p>
     * 
     * <strong>example:</strong>
     * <p>project name pass the check</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The real-time log project name.</p>
     * 
     * <strong>example:</strong>
     * <p>dcdn_waf_userAccount_log</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>34DCBC8A-<strong><strong>-</strong></strong>-****-6DAA11D7DDBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckSiteProjectNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckSiteProjectNameResponseBody self = new CheckSiteProjectNameResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckSiteProjectNameResponseBody setCheck(Boolean check) {
        this.check = check;
        return this;
    }
    public Boolean getCheck() {
        return this.check;
    }

    public CheckSiteProjectNameResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CheckSiteProjectNameResponseBody setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CheckSiteProjectNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
