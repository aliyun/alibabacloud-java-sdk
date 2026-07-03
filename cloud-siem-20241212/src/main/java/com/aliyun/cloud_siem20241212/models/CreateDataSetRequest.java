// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class CreateDataSetRequest extends TeaModel {
    /**
     * <p>The description of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>lmftest contains ip list</p>
     */
    @NameInMap("DataSetDescription")
    public String dataSetDescription;

    /**
     * <p>The name of the unique key for the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ip</p>
     */
    @NameInMap("DataSetFieldKeyName")
    public String dataSetFieldKeyName;

    /**
     * <p>The name of the uploaded dataset file.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudsiem-dataset/1358117679873357_17433*****.csv</p>
     */
    @NameInMap("DataSetFileName")
    public String dataSetFileName;

    /**
     * <p>The name of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lmftest</p>
     */
    @NameInMap("DataSetName")
    public String dataSetName;

    /**
     * <p>The status of the dataset. Valid values:</p>
     * <ul>
     * <li><p>0: deleted.</p>
     * </li>
     * <li><p>1: enabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSetStatus")
    public Integer dataSetStatus;

    /**
     * <p>The type of the dataset. Valid values:</p>
     * <ul>
     * <li><p>custom: custom.</p>
     * </li>
     * <li><p>preset: predefined.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("DataSetType")
    public String dataSetType;

    /**
     * <p>The list of recognizers.</p>
     */
    @NameInMap("IpWhitelistRecognizers")
    public java.util.List<CreateDataSetRequestIpWhitelistRecognizers> ipWhitelistRecognizers;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region of the Data Management center for threat analysis. Select a region based on where your assets are located. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Your assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Your assets are outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of the member whose permissions are used to perform the operation. This parameter is used when an administrator acts on behalf of a member.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
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
        /**
         * <p>The automatic detection status. Valid values:</p>
         * <ul>
         * <li><p>enabled: enabled.</p>
         * </li>
         * <li><p>disabled: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AutoRecognizeStatus")
        public String autoRecognizeStatus;

        /**
         * <p>The type of IP address that the recognizer detects. Valid values:</p>
         * <ul>
         * <li><p>sas_vulnerability_scanner_ip: The IP address of the Security Center web vulnerability scanner.</p>
         * </li>
         * <li><p>waf_back_source_ip: The back-to-origin IP address of Web Application Firewall (WAF).</p>
         * </li>
         * <li><p>ddos_back_source_ip: The back-to-origin IP address of Anti-DDoS.</p>
         * </li>
         * <li><p>esa_back_source_ip: The back-to-origin IP address of an Edge Security Acceleration (ESA) node.</p>
         * </li>
         * <li><p>ecs_public_ip: The public IP address of an Elastic Compute Service (ECS) instance.</p>
         * </li>
         * <li><p>slb_public_ip: The public IP address of a Server Load Balancer (SLB) instance.</p>
         * </li>
         * <li><p>vpc_eip: An Elastic IP Address (EIP).</p>
         * </li>
         * <li><p>cdn_back_source_ip: The back-to-origin IP address of a content delivery network (CDN).</p>
         * </li>
         * <li><p>ga_back_source_ip: The back-to-origin IP address of Global Accelerator (GA).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>waf_back_source_ip</p>
         */
        @NameInMap("IpWhitelistRecognizerType")
        public String ipWhitelistRecognizerType;

        /**
         * <p>The detection scope. Valid values:</p>
         * <ul>
         * <li><p>current_account: the current account only.</p>
         * </li>
         * <li><p>rd_accounts: all accounts in your resource directory.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>current_account</p>
         */
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
