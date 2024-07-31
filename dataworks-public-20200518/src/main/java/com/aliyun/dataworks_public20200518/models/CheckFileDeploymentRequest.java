// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckFileDeploymentRequest extends TeaModel {
    /**
     * <p>This parameter is deprecated.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://result.aliyun.com/?checkerInstanceId=">https://result.aliyun.com/?checkerInstanceId=</a></p>
     */
    @NameInMap("CheckDetailUrl")
    public String checkDetailUrl;

    /**
     * <p>The ID of the instance to which the file checker belongs. You can obtain the ID from the CheckerInstanceId parameter in the check event logs returned by DataWorks.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>66_123455623_2</p>
     */
    @NameInMap("CheckerInstanceId")
    public String checkerInstanceId;

    /**
     * <p>The check status of the file that you want to deploy. Valid values:</p>
     * <ul>
     * <li>OK: The file passes the check.</li>
     * <li>WARN: The file passes the check, but an alert is reported.</li>
     * <li>FAIL: The file fails the check.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    public static CheckFileDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFileDeploymentRequest self = new CheckFileDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public CheckFileDeploymentRequest setCheckDetailUrl(String checkDetailUrl) {
        this.checkDetailUrl = checkDetailUrl;
        return this;
    }
    public String getCheckDetailUrl() {
        return this.checkDetailUrl;
    }

    public CheckFileDeploymentRequest setCheckerInstanceId(String checkerInstanceId) {
        this.checkerInstanceId = checkerInstanceId;
        return this;
    }
    public String getCheckerInstanceId() {
        return this.checkerInstanceId;
    }

    public CheckFileDeploymentRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
