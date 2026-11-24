// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSetRequest extends TeaModel {
    @NameInMap("DataSetDescription")
    public String dataSetDescription;

    @NameInMap("DataSetFileName")
    public String dataSetFileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSetId")
    public String dataSetId;

    @NameInMap("DataSetName")
    public String dataSetName;

    @NameInMap("DataSetStatus")
    public Integer dataSetStatus;

    @NameInMap("IpWhitelistRecognizers")
    public java.util.List<UpdateDataSetRequestIpWhitelistRecognizers> ipWhitelistRecognizers;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static UpdateDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataSetRequest self = new UpdateDataSetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataSetRequest setDataSetDescription(String dataSetDescription) {
        this.dataSetDescription = dataSetDescription;
        return this;
    }
    public String getDataSetDescription() {
        return this.dataSetDescription;
    }

    public UpdateDataSetRequest setDataSetFileName(String dataSetFileName) {
        this.dataSetFileName = dataSetFileName;
        return this;
    }
    public String getDataSetFileName() {
        return this.dataSetFileName;
    }

    public UpdateDataSetRequest setDataSetId(String dataSetId) {
        this.dataSetId = dataSetId;
        return this;
    }
    public String getDataSetId() {
        return this.dataSetId;
    }

    public UpdateDataSetRequest setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
        return this;
    }
    public String getDataSetName() {
        return this.dataSetName;
    }

    public UpdateDataSetRequest setDataSetStatus(Integer dataSetStatus) {
        this.dataSetStatus = dataSetStatus;
        return this;
    }
    public Integer getDataSetStatus() {
        return this.dataSetStatus;
    }

    public UpdateDataSetRequest setIpWhitelistRecognizers(java.util.List<UpdateDataSetRequestIpWhitelistRecognizers> ipWhitelistRecognizers) {
        this.ipWhitelistRecognizers = ipWhitelistRecognizers;
        return this;
    }
    public java.util.List<UpdateDataSetRequestIpWhitelistRecognizers> getIpWhitelistRecognizers() {
        return this.ipWhitelistRecognizers;
    }

    public UpdateDataSetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateDataSetRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static class UpdateDataSetRequestIpWhitelistRecognizers extends TeaModel {
        @NameInMap("AutoRecognizeStatus")
        public String autoRecognizeStatus;

        @NameInMap("IpWhitelistRecognizerType")
        public String ipWhitelistRecognizerType;

        @NameInMap("RecognizeScope")
        public String recognizeScope;

        public static UpdateDataSetRequestIpWhitelistRecognizers build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataSetRequestIpWhitelistRecognizers self = new UpdateDataSetRequestIpWhitelistRecognizers();
            return TeaModel.build(map, self);
        }

        public UpdateDataSetRequestIpWhitelistRecognizers setAutoRecognizeStatus(String autoRecognizeStatus) {
            this.autoRecognizeStatus = autoRecognizeStatus;
            return this;
        }
        public String getAutoRecognizeStatus() {
            return this.autoRecognizeStatus;
        }

        public UpdateDataSetRequestIpWhitelistRecognizers setIpWhitelistRecognizerType(String ipWhitelistRecognizerType) {
            this.ipWhitelistRecognizerType = ipWhitelistRecognizerType;
            return this;
        }
        public String getIpWhitelistRecognizerType() {
            return this.ipWhitelistRecognizerType;
        }

        public UpdateDataSetRequestIpWhitelistRecognizers setRecognizeScope(String recognizeScope) {
            this.recognizeScope = recognizeScope;
            return this;
        }
        public String getRecognizeScope() {
            return this.recognizeScope;
        }

    }

}
