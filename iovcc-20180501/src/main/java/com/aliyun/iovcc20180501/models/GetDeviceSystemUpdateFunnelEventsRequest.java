// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetDeviceSystemUpdateFunnelEventsRequest extends TeaModel {
    @NameInMap("OriginalId")
    public String originalId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TargetVersion")
    public String targetVersion;

    @NameInMap("IdType")
    public String idType;

    public static GetDeviceSystemUpdateFunnelEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceSystemUpdateFunnelEventsRequest self = new GetDeviceSystemUpdateFunnelEventsRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceSystemUpdateFunnelEventsRequest setOriginalId(String originalId) {
        this.originalId = originalId;
        return this;
    }
    public String getOriginalId() {
        return this.originalId;
    }

    public GetDeviceSystemUpdateFunnelEventsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetDeviceSystemUpdateFunnelEventsRequest setTargetVersion(String targetVersion) {
        this.targetVersion = targetVersion;
        return this;
    }
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public GetDeviceSystemUpdateFunnelEventsRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

}
