// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistSettingRequest extends TeaModel {
    /**
     * <p>ID Number</p>
     * 
     * <strong>example:</strong>
     * <p>320321XXXXXXXX701X</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <p>Certification ID</p>
     * 
     * <strong>example:</strong>
     * <p>shsf57a4e0d9981c3bd66dc754f3d3cd</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <p>Pagination parameter: current page number, default value is 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specify the language to query. Values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Number of items per page for pagination.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Scene ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1000004530</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <p>Service Code:</p>
     * <ul>
     * <li><strong>Enhanced Financial Grade</strong>: cloudauthst</li>
     * <li><strong>Financial Grade</strong>: antcloudauth</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>Visitor\&quot;s source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>113.140.85.74</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>Whitelist status:</p>
     * <ul>
     * <li><strong>VALID</strong>: Valid</li>
     * <li><strong>INVALID</strong>: Invalid</li>
     * <li><strong>DELETED</strong>: Deleted</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VALID</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>Expiration date.</p>
     * 
     * <strong>example:</strong>
     * <p>1730304000000</p>
     */
    @NameInMap("ValidEndDate")
    public Long validEndDate;

    /**
     * <p>Effective start time (in seconds timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1759939200000</p>
     */
    @NameInMap("ValidStartDate")
    public Long validStartDate;

    public static DescribeWhitelistSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistSettingRequest self = new DescribeWhitelistSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistSettingRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public DescribeWhitelistSettingRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public DescribeWhitelistSettingRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeWhitelistSettingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWhitelistSettingRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhitelistSettingRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public DescribeWhitelistSettingRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeWhitelistSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWhitelistSettingRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeWhitelistSettingRequest setValidEndDate(Long validEndDate) {
        this.validEndDate = validEndDate;
        return this;
    }
    public Long getValidEndDate() {
        return this.validEndDate;
    }

    public DescribeWhitelistSettingRequest setValidStartDate(Long validStartDate) {
        this.validStartDate = validStartDate;
        return this;
    }
    public Long getValidStartDate() {
        return this.validStartDate;
    }

}
