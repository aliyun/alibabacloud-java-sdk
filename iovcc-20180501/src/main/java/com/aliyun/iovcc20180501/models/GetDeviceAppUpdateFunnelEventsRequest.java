// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetDeviceAppUpdateFunnelEventsRequest extends TeaModel {
    @NameInMap("PackageName")
    public String packageName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TargetVersionCode")
    public String targetVersionCode;

    @NameInMap("IdType")
    public String idType;

    @NameInMap("OriginalId")
    public String originalId;

    public static GetDeviceAppUpdateFunnelEventsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeviceAppUpdateFunnelEventsRequest self = new GetDeviceAppUpdateFunnelEventsRequest();
        return TeaModel.build(map, self);
    }

    public GetDeviceAppUpdateFunnelEventsRequest setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }
    public String getPackageName() {
        return this.packageName;
    }

    public GetDeviceAppUpdateFunnelEventsRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetDeviceAppUpdateFunnelEventsRequest setTargetVersionCode(String targetVersionCode) {
        this.targetVersionCode = targetVersionCode;
        return this;
    }
    public String getTargetVersionCode() {
        return this.targetVersionCode;
    }

    public GetDeviceAppUpdateFunnelEventsRequest setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public GetDeviceAppUpdateFunnelEventsRequest setOriginalId(String originalId) {
        this.originalId = originalId;
        return this;
    }
    public String getOriginalId() {
        return this.originalId;
    }

}
