// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractExtractShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("fieldsToExtract")
    public String fieldsToExtractShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ttps://xxxxx.oss-cn-hangzhou.aliyuncs.com/legalmind/userdownload/4a83e0fe-baee-41d5-89f6-e33c8d462839/contract/report/9ce843d2-a05e-4351-9d69-15ae96bd910a_1713348901026.pdf</p>
     */
    @NameInMap("fileOssUrl")
    public String fileOssUrl;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regionId")
    public String regionId;

    public static RunContractExtractShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RunContractExtractShrinkRequest self = new RunContractExtractShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RunContractExtractShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunContractExtractShrinkRequest setFieldsToExtractShrink(String fieldsToExtractShrink) {
        this.fieldsToExtractShrink = fieldsToExtractShrink;
        return this;
    }
    public String getFieldsToExtractShrink() {
        return this.fieldsToExtractShrink;
    }

    public RunContractExtractShrinkRequest setFileOssUrl(String fileOssUrl) {
        this.fileOssUrl = fileOssUrl;
        return this;
    }
    public String getFileOssUrl() {
        return this.fileOssUrl;
    }

    public RunContractExtractShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
