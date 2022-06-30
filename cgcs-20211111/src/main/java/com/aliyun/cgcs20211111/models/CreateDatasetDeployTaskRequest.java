// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class CreateDatasetDeployTaskRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("CustomParam")
    public String customParam;

    @NameInMap("NeedUnzip")
    public Boolean needUnzip;

    @NameInMap("OssBucket")
    public String ossBucket;

    @NameInMap("OssFilePath")
    public String ossFilePath;

    @NameInMap("OssRegionId")
    public String ossRegionId;

    @NameInMap("SourceType")
    public String sourceType;

    public static CreateDatasetDeployTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDatasetDeployTaskRequest self = new CreateDatasetDeployTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDatasetDeployTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateDatasetDeployTaskRequest setCustomParam(String customParam) {
        this.customParam = customParam;
        return this;
    }
    public String getCustomParam() {
        return this.customParam;
    }

    public CreateDatasetDeployTaskRequest setNeedUnzip(Boolean needUnzip) {
        this.needUnzip = needUnzip;
        return this;
    }
    public Boolean getNeedUnzip() {
        return this.needUnzip;
    }

    public CreateDatasetDeployTaskRequest setOssBucket(String ossBucket) {
        this.ossBucket = ossBucket;
        return this;
    }
    public String getOssBucket() {
        return this.ossBucket;
    }

    public CreateDatasetDeployTaskRequest setOssFilePath(String ossFilePath) {
        this.ossFilePath = ossFilePath;
        return this;
    }
    public String getOssFilePath() {
        return this.ossFilePath;
    }

    public CreateDatasetDeployTaskRequest setOssRegionId(String ossRegionId) {
        this.ossRegionId = ossRegionId;
        return this;
    }
    public String getOssRegionId() {
        return this.ossRegionId;
    }

    public CreateDatasetDeployTaskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
