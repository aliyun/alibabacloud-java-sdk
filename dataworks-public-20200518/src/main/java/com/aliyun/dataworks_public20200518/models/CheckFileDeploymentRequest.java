// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckFileDeploymentRequest extends TeaModel {
    @NameInMap("CheckerInstanceId")
    @Validation(required = true)
    public String checkerInstanceId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("CheckDetailUrl")
    public String checkDetailUrl;

    public static CheckFileDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckFileDeploymentRequest self = new CheckFileDeploymentRequest();
        return TeaModel.build(map, self);
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

    public CheckFileDeploymentRequest setCheckDetailUrl(String checkDetailUrl) {
        this.checkDetailUrl = checkDetailUrl;
        return this;
    }
    public String getCheckDetailUrl() {
        return this.checkDetailUrl;
    }

}
