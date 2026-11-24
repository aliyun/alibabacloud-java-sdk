// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDataSetRequest extends TeaModel {
    @NameInMap("DataSetDescription")
    public String dataSetDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSetFieldKeyName")
    public String dataSetFieldKeyName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSetFileName")
    public String dataSetFileName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DataSetName")
    public String dataSetName;

    @NameInMap("DataSetStatus")
    public Integer dataSetStatus;

    @NameInMap("DataSetType")
    public String dataSetType;

    @NameInMap("IpWhitelistRecognizers")
    public java.util.List<CreateDataSetRequestIpWhitelistRecognizers> ipWhitelistRecognizers;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RoleFor")
    public Long roleFor;

    public static CreateDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDataSetRequest self = new CreateDataSetRequest();
        return TeaModel.build(map, self);
    }

    public CreateDataSetRequest setDataSetDescription(String dataSetDescription) {
        this.dataSetDescription = dataSetDescription;
        return this;
    }
    public String getDataSetDescription() {
        return this.dataSetDescription;
    }

    public CreateDataSetRequest setDataSetFieldKeyName(String dataSetFieldKeyName) {
        this.dataSetFieldKeyName = dataSetFieldKeyName;
        return this;
    }
    public String getDataSetFieldKeyName() {
        return this.dataSetFieldKeyName;
    }

    public CreateDataSetRequest setDataSetFileName(String dataSetFileName) {
        this.dataSetFileName = dataSetFileName;
        return this;
    }
    public String getDataSetFileName() {
        return this.dataSetFileName;
    }

    public CreateDataSetRequest setDataSetName(String dataSetName) {
        this.dataSetName = dataSetName;
        return this;
    }
    public String getDataSetName() {
        return this.dataSetName;
    }

    public CreateDataSetRequest setDataSetStatus(Integer dataSetStatus) {
        this.dataSetStatus = dataSetStatus;
        return this;
    }
    public Integer getDataSetStatus() {
        return this.dataSetStatus;
    }

    public CreateDataSetRequest setDataSetType(String dataSetType) {
        this.dataSetType = dataSetType;
        return this;
    }
    public String getDataSetType() {
        return this.dataSetType;
    }

    public CreateDataSetRequest setIpWhitelistRecognizers(java.util.List<CreateDataSetRequestIpWhitelistRecognizers> ipWhitelistRecognizers) {
        this.ipWhitelistRecognizers = ipWhitelistRecognizers;
        return this;
    }
    public java.util.List<CreateDataSetRequestIpWhitelistRecognizers> getIpWhitelistRecognizers() {
        return this.ipWhitelistRecognizers;
    }

    public CreateDataSetRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateDataSetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDataSetRequest setRoleFor(Long roleFor) {
        this.roleFor = roleFor;
        return this;
    }
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static class CreateDataSetRequestIpWhitelistRecognizers extends TeaModel {
        @NameInMap("AutoRecognizeStatus")
        public String autoRecognizeStatus;

        @NameInMap("IpWhitelistRecognizerType")
        public String ipWhitelistRecognizerType;

        @NameInMap("RecognizeScope")
        public String recognizeScope;

        public static CreateDataSetRequestIpWhitelistRecognizers build(java.util.Map<String, ?> map) throws Exception {
            CreateDataSetRequestIpWhitelistRecognizers self = new CreateDataSetRequestIpWhitelistRecognizers();
            return TeaModel.build(map, self);
        }

        public CreateDataSetRequestIpWhitelistRecognizers setAutoRecognizeStatus(String autoRecognizeStatus) {
            this.autoRecognizeStatus = autoRecognizeStatus;
            return this;
        }
        public String getAutoRecognizeStatus() {
            return this.autoRecognizeStatus;
        }

        public CreateDataSetRequestIpWhitelistRecognizers setIpWhitelistRecognizerType(String ipWhitelistRecognizerType) {
            this.ipWhitelistRecognizerType = ipWhitelistRecognizerType;
            return this;
        }
        public String getIpWhitelistRecognizerType() {
            return this.ipWhitelistRecognizerType;
        }

        public CreateDataSetRequestIpWhitelistRecognizers setRecognizeScope(String recognizeScope) {
            this.recognizeScope = recognizeScope;
            return this;
        }
        public String getRecognizeScope() {
            return this.recognizeScope;
        }

    }

}
