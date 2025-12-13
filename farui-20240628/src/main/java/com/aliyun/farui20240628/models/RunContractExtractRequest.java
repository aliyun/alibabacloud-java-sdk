// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.farui20240628.models;

import com.aliyun.tea.*;

public class RunContractExtractRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>farui</p>
     */
    @NameInMap("appId")
    public String appId;

    @NameInMap("fieldsToExtract")
    public java.util.List<RunContractExtractRequestFieldsToExtract> fieldsToExtract;

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

    public static RunContractExtractRequest build(java.util.Map<String, ?> map) throws Exception {
        RunContractExtractRequest self = new RunContractExtractRequest();
        return TeaModel.build(map, self);
    }

    public RunContractExtractRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public RunContractExtractRequest setFieldsToExtract(java.util.List<RunContractExtractRequestFieldsToExtract> fieldsToExtract) {
        this.fieldsToExtract = fieldsToExtract;
        return this;
    }
    public java.util.List<RunContractExtractRequestFieldsToExtract> getFieldsToExtract() {
        return this.fieldsToExtract;
    }

    public RunContractExtractRequest setFileOssUrl(String fileOssUrl) {
        this.fileOssUrl = fileOssUrl;
        return this;
    }
    public String getFileOssUrl() {
        return this.fileOssUrl;
    }

    public RunContractExtractRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class RunContractExtractRequestFieldsToExtract extends TeaModel {
        @NameInMap("desc")
        public String desc;

        @NameInMap("extractItem")
        public String extractItem;

        @NameInMap("option")
        public java.util.List<String> option;

        public static RunContractExtractRequestFieldsToExtract build(java.util.Map<String, ?> map) throws Exception {
            RunContractExtractRequestFieldsToExtract self = new RunContractExtractRequestFieldsToExtract();
            return TeaModel.build(map, self);
        }

        public RunContractExtractRequestFieldsToExtract setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public RunContractExtractRequestFieldsToExtract setExtractItem(String extractItem) {
            this.extractItem = extractItem;
            return this;
        }
        public String getExtractItem() {
            return this.extractItem;
        }

        public RunContractExtractRequestFieldsToExtract setOption(java.util.List<String> option) {
            this.option = option;
            return this;
        }
        public java.util.List<String> getOption() {
            return this.option;
        }

    }

}
