// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class GetIoTCloudConnectorAccessLogResponseBody extends TeaModel {
    @NameInMap("AccessLogSlsLogStore")
    public String accessLogSlsLogStore;

    @NameInMap("AccessLogSlsProject")
    public String accessLogSlsProject;

    @NameInMap("AccessLogStatus")
    public String accessLogStatus;

    @NameInMap("RequestId")
    public String requestId;

    public static GetIoTCloudConnectorAccessLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetIoTCloudConnectorAccessLogResponseBody self = new GetIoTCloudConnectorAccessLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetIoTCloudConnectorAccessLogResponseBody setAccessLogSlsLogStore(String accessLogSlsLogStore) {
        this.accessLogSlsLogStore = accessLogSlsLogStore;
        return this;
    }
    public String getAccessLogSlsLogStore() {
        return this.accessLogSlsLogStore;
    }

    public GetIoTCloudConnectorAccessLogResponseBody setAccessLogSlsProject(String accessLogSlsProject) {
        this.accessLogSlsProject = accessLogSlsProject;
        return this;
    }
    public String getAccessLogSlsProject() {
        return this.accessLogSlsProject;
    }

    public GetIoTCloudConnectorAccessLogResponseBody setAccessLogStatus(String accessLogStatus) {
        this.accessLogStatus = accessLogStatus;
        return this;
    }
    public String getAccessLogStatus() {
        return this.accessLogStatus;
    }

    public GetIoTCloudConnectorAccessLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
