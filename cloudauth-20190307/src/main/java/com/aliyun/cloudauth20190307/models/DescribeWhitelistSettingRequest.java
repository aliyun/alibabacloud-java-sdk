// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistSettingRequest extends TeaModel {
    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ServiceCode")
    @Validation(required = true)
    public String serviceCode;

    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("CertNo")
    public String certNo;

    @NameInMap("ValidStartDate")
    public Long validStartDate;

    @NameInMap("ValidEndDate")
    public Long validEndDate;

    @NameInMap("Status")
    public String status;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    public static DescribeWhitelistSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeWhitelistSettingRequest self = new DescribeWhitelistSettingRequest();
        return TeaModel.build(map, self);
    }

    public DescribeWhitelistSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeWhitelistSettingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeWhitelistSettingRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeWhitelistSettingRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public DescribeWhitelistSettingRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public DescribeWhitelistSettingRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public DescribeWhitelistSettingRequest setValidStartDate(Long validStartDate) {
        this.validStartDate = validStartDate;
        return this;
    }
    public Long getValidStartDate() {
        return this.validStartDate;
    }

    public DescribeWhitelistSettingRequest setValidEndDate(Long validEndDate) {
        this.validEndDate = validEndDate;
        return this;
    }
    public Long getValidEndDate() {
        return this.validEndDate;
    }

    public DescribeWhitelistSettingRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeWhitelistSettingRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeWhitelistSettingRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

}
