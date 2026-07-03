// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class UpdateDataSetRequest extends TeaModel {
    /**
     * <p>The description of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>lmftest desc</p>
     */
    @NameInMap("DataSetDescription")
    public String dataSetDescription;

    /**
     * <p>The name of the uploaded dataset file.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudsiem-dataset/1358117679873357_1743387731614.csv</p>
     */
    @NameInMap("DataSetFileName")
    public String dataSetFileName;

    /**
     * <p>The ID of the dataset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dataset-10iy8mbifnb4gniv****</p>
     */
    @NameInMap("DataSetId")
    public String dataSetId;

    /**
     * <p>The name of the dataset.</p>
     * 
     * <strong>example:</strong>
     * <p>lmftest</p>
     */
    @NameInMap("DataSetName")
    public String dataSetName;

    /**
     * <p>The status of the dataset. Valid values:</p>
     * <ul>
     * <li><p>0: Delete.</p>
     * </li>
     * <li><p>1: Enable.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DataSetStatus")
    public Integer dataSetStatus;

    /**
     * <p>The IP address types that the recognizer can detect.</p>
     */
    @NameInMap("IpWhitelistRecognizers")
    public java.util.List<UpdateDataSetRequestIpWhitelistRecognizers> ipWhitelistRecognizers;

    /**
     * <p>The language of the response message. Valid values:</p>
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
     * <p>The region where the Data Management center for threat analysis is located. Select a region based on the location of your assets. Valid values:</p>
     * <ul>
     * <li><p>cn-hangzhou: Assets are in the Chinese mainland.</p>
     * </li>
     * <li><p>ap-southeast-1: Assets are in a region outside China.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The user ID of a member. An administrator can use this parameter to switch to the member\&quot;s view.</p>
     * 
     * <strong>example:</strong>
     * <p>113091674488****</p>
     */
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
        /**
         * <p>The automatic detection status. Valid values:</p>
         * <ul>
         * <li><p>enabled: Enabled.</p>
         * </li>
         * <li><p>disabled: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("AutoRecognizeStatus")
        public String autoRecognizeStatus;

        /**
         * <p>The IP address type that the recognizer can detect. Valid values:</p>
         * <ul>
         * <li><p>sas_vulnerability_scanner_ip: The IP addresses of the Security Center web vulnerability scanner.</p>
         * </li>
         * <li><p>waf_back_source_ip: The back-to-origin IP addresses of Web Application Firewall (WAF).</p>
         * </li>
         * <li><p>ddos_back_source_ip: The back-to-origin IP addresses of Anti-DDoS.</p>
         * </li>
         * <li><p>esa_back_source_ip: The back-to-origin IP addresses of Edge Security Acceleration (ESA) nodes.</p>
         * </li>
         * <li><p>ecs_public_ip: The public IP addresses of Elastic Compute Service (ECS) instances.</p>
         * </li>
         * <li><p>slb_public_ip: The public IP addresses of Server Load Balancer (SLB).</p>
         * </li>
         * <li><p>vpc_eip: The elastic IP addresses (EIPs).</p>
         * </li>
         * <li><p>cdn_back_source_ip: The back-to-origin IP addresses of Alibaba Cloud CDN.</p>
         * </li>
         * <li><p>ga_back_source_ip: The back-to-origin IP addresses of Global Accelerator (GA).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cdn_back_source_ip</p>
         */
        @NameInMap("IpWhitelistRecognizerType")
        public String ipWhitelistRecognizerType;

        /**
         * <p>The detection scope. Valid values:</p>
         * <ul>
         * <li><p>current_account: The current account only.</p>
         * </li>
         * <li><p>rd_accounts: Multiple accounts are enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>current_account</p>
         */
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
