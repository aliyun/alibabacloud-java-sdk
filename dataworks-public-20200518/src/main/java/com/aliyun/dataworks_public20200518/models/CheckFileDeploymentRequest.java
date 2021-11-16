// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CheckFileDeploymentRequest extends TeaModel {
    @NameInMap("CheckDetailUrl")
    public String checkDetailUrl;

    @NameInMap("CheckerInstanceId")
    public String checkerInstanceId;

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
