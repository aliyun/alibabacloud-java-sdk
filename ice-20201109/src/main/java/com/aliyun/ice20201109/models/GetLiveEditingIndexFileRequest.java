// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetLiveEditingIndexFileRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("StreamName")
    public String streamName;

    public static GetLiveEditingIndexFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLiveEditingIndexFileRequest self = new GetLiveEditingIndexFileRequest();
        return TeaModel.build(map, self);
    }

    public GetLiveEditingIndexFileRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLiveEditingIndexFileRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public GetLiveEditingIndexFileRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLiveEditingIndexFileRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetLiveEditingIndexFileRequest setStreamName(String streamName) {
        this.streamName = streamName;
        return this;
    }
    public String getStreamName() {
        return this.streamName;
    }

}
