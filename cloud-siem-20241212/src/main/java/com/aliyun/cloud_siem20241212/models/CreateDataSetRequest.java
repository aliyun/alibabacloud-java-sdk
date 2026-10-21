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
     * <p>The unique key name of the dataset.</p>
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
     * <li>0: Deleted.</li>
     * <li>1: Enabled.</li>
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
     * <li>custom: custom.</li>
     * <li>preset: predefined.</li>
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
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.
     * Note: This parameter is required. If you do not specify this parameter, the API returns a 400 error: &quot;The specified Lang can not be empty.&quot;</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region where the threat analysis data management center resides. Specify the management center based on the region of your assets. Valid values:</p>
     * <ul>
     * <li>cn-hangzhou: Your assets reside in the Chinese mainland.</li>
     * <li>ap-southeast-1: Your assets reside outside China.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the member to which the administrator switches the view.</p>
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
         * <p>The automatic recognition status. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AutoRecognizeStatus")
        public String autoRecognizeStatus;

        /**
         * <p>The IP address type identified by the recognizer. Valid values:</p>
         * <ul>
         * <li>sas_vulnerability_scanner_ip: IP addresses of the Security Center vulnerability web scanner.</li>
         * <li>waf_back_source_ip: back-to-origin IP addresses of Web Application Firewall (WAF).</li>
         * <li>ddos_back_source_ip: back-to-origin IP addresses of Anti-DDoS.</li>
         * <li>esa_back_source_ip: back-to-origin node IP addresses of Edge secure acceleration (ESA).</li>
         * <li>ecs_public_ip: public IP addresses of Elastic Compute Service (ECS) instances.</li>
         * <li>slb_public_ip: public IP addresses of Server Load Balancer (SLB) instances.</li>
         * <li>vpc_eip: elastic IP addresses (EIPs).</li>
         * <li>cdn_back_source_ip: back-to-origin IP addresses of content delivery network (CDN).</li>
         * <li>ga_back_source_ip: back-to-origin IP addresses of Global Accelerator (GA).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>waf_back_source_ip</p>
         */
        @NameInMap("IpWhitelistRecognizerType")
        public String ipWhitelistRecognizerType;

        /**
         * <p>The recognition scope. Valid values:</p>
         * <ul>
         * <li>current_account: the current account only.</li>
         * <li>rd_accounts: multi-account mode enabled.</li>
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
