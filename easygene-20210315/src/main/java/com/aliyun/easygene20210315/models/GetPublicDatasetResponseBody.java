// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315.models;

import com.aliyun.tea.*;

public class GetPublicDatasetResponseBody extends TeaModel {
    // 主机ID
    @NameInMap("HostId")
    public String hostId;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("HttpCode")
    public Integer httpCode;

    // 错误码
    @NameInMap("Code")
    public String code;

    // 错误消息
    @NameInMap("Message")
    public String message;

    // 是否调用成功
    @NameInMap("Success")
    public Boolean success;

    // 公共数据集描述
    @NameInMap("DatasetDescription")
    public String datasetDescription;

    // 公共数据集版权信息
    @NameInMap("Copyright")
    public String copyright;

    // 公共数据集访问要求
    @NameInMap("AccessRequirements")
    public String accessRequirements;

    // 关于公共数据集
    @NameInMap("About")
    public String about;

    // 公共数据集标签
    @NameInMap("Tags")
    public java.util.List<String> tags;

    // 公共数据集名称
    @NameInMap("DatasetName")
    public String datasetName;

    // 公共数据集更新频率
    @NameInMap("UpdateFrequency")
    public String updateFrequency;

    // 公共数据集可用区域
    @NameInMap("RegionIds")
    public java.util.List<String> regionIds;

    // 最后更新时间
    @NameInMap("LastModified")
    public String lastModified;

    public static GetPublicDatasetResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPublicDatasetResponseBody self = new GetPublicDatasetResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPublicDatasetResponseBody setHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }
    public String getHostId() {
        return this.hostId;
    }

    public GetPublicDatasetResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPublicDatasetResponseBody setHttpCode(Integer httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Integer getHttpCode() {
        return this.httpCode;
    }

    public GetPublicDatasetResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetPublicDatasetResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetPublicDatasetResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPublicDatasetResponseBody setDatasetDescription(String datasetDescription) {
        this.datasetDescription = datasetDescription;
        return this;
    }
    public String getDatasetDescription() {
        return this.datasetDescription;
    }

    public GetPublicDatasetResponseBody setCopyright(String copyright) {
        this.copyright = copyright;
        return this;
    }
    public String getCopyright() {
        return this.copyright;
    }

    public GetPublicDatasetResponseBody setAccessRequirements(String accessRequirements) {
        this.accessRequirements = accessRequirements;
        return this;
    }
    public String getAccessRequirements() {
        return this.accessRequirements;
    }

    public GetPublicDatasetResponseBody setAbout(String about) {
        this.about = about;
        return this;
    }
    public String getAbout() {
        return this.about;
    }

    public GetPublicDatasetResponseBody setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public GetPublicDatasetResponseBody setDatasetName(String datasetName) {
        this.datasetName = datasetName;
        return this;
    }
    public String getDatasetName() {
        return this.datasetName;
    }

    public GetPublicDatasetResponseBody setUpdateFrequency(String updateFrequency) {
        this.updateFrequency = updateFrequency;
        return this;
    }
    public String getUpdateFrequency() {
        return this.updateFrequency;
    }

    public GetPublicDatasetResponseBody setRegionIds(java.util.List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }
    public java.util.List<String> getRegionIds() {
        return this.regionIds;
    }

    public GetPublicDatasetResponseBody setLastModified(String lastModified) {
        this.lastModified = lastModified;
        return this;
    }
    public String getLastModified() {
        return this.lastModified;
    }

}
