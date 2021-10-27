// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeWhitelistSettingRequest extends TeaModel {
    @NameInMap("CertNo")
    public String certNo;

    @NameInMap("CertifyId")
    public String certifyId;

    @NameInMap("CurrentPage")
    @Validation(required = true)
    public Integer currentPage;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("SceneId")
    public Long sceneId;

    @NameInMap("ServiceCode")
    @Validation(required = true)
    public String serviceCode;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Status")
    public String status;

    @NameInMap("ValidEndDate")
    public Long validEndDate;

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
