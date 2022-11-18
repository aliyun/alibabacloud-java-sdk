// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetResponseBody extends TeaModel {
    @NameInMap("About")
    public String about;

    @NameInMap("AccessRequirements")
    public String accessRequirements;

    @NameInMap("Copyright")
    public String copyright;

    @NameInMap("DatasetDescription")
    public String datasetDescription;

    @NameInMap("DatasetName")
    public String datasetName;

    @NameInMap("HostId")
    public String hostId;

    @NameInMap("LastModified")
    public String lastModified;

    @NameInMap("Locations")
    public java.util.List<String> locations;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    @NameInMap("UpdateFrequency")
    public String updateFrequency;

    public static GetPublicDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublicDatasetResponseBody self = new GetPublicDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublicDatasetResponseBody setAbout(String about) {
        this.about = about;
        return this;
    }
    public String getAbout() {
        return this.about;
    }

    public GetPublicDatasetResponseBody setAccessRequirements(String accessRequirements) {
        this.accessRequirements = accessRequirements;
        return this;
    }
    public String getAccessRequirements() {
        return this.accessRequirements;
    }

    public GetPublicDatasetResponseBody setCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }
    public String getCopyright() {
        return this.copyright;
    }

    public GetPublicDatasetResponseBody setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public GetPublicDatasetResponseBody setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetPublicDatasetResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetPublicDatasetResponseBody setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

    public GetPublicDatasetResponseBody setLocations(java.util.List<String> locations) {
        this.locations = locations;
        return this;
    }
    public java.util.List<String> getLocations() {
        return this.locations;
    }

    public GetPublicDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPublicDatasetResponseBody setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public GetPublicDatasetResponseBody setUpdateFrequency(String updateFrequency) {
        this.updateFrequency = updateFrequency;
        return this;
    }
    public String getUpdateFrequency() {
        return this.updateFrequency;
    }

}
