// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>This is description about dataset.</p>
     */
    @NameInMap("About")
    public String about;

    /**
     * <strong>example:</strong>
     * <p>This are dataset access requirements.</p>
     */
    @NameInMap("AccessRequirements")
    public String accessRequirements;

    /**
     * <strong>example:</strong>
     * <p>This is dataset copyright.</p>
     */
    @NameInMap("Copyright")
    public String copyright;

    /**
     * <strong>example:</strong>
     * <p>This is dataset description.</p>
     */
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    /**
     * <strong>example:</strong>
     * <p>西蒙斯基因组多样性计划</p>
     */
    @NameInMap("DatasetName")
    public String datasetName;

    /**
     * <strong>example:</strong>
     * <p>easygene.cn-beijing.aliyuncs.com</p>
     */
    @NameInMap("HostId")
    public String hostId;

    /**
     * <strong>example:</strong>
     * <p>yyyy/MM/dd HH:mm:ss</p>
     */
    @NameInMap("LastModified")
    public String lastModified;

    @NameInMap("Locations")
    public java.util.List<String> locations;

    /**
     * <strong>example:</strong>
     * <p>DA980AD0-158F-44F3-847D-5EAB96C0EB6B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tags")
    public java.util.List<String> tags;

    /**
     * <strong>example:</strong>
     * <p>源站更新后及时同步</p>
     */
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
