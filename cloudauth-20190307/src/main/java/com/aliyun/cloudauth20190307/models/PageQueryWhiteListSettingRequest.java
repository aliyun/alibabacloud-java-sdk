// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class PageQueryWhiteListSettingRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>330103xxxxxxxxxxxx</p>
     */
    @NameInMap("CertNo")
    public String certNo;

    /**
     * <strong>example:</strong>
     * <p>sha75b4e19a1ddda059b920757b0e12b</p>
     */
    @NameInMap("CertifyId")
    public String certifyId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1000000xxx</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    /**
     * <strong>example:</strong>
     * <p>antcloudauth</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <strong>example:</strong>
     * <p>VALID</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>1725379200000</p>
     */
    @NameInMap("ValidEndDate")
    public String validEndDate;

    /**
     * <strong>example:</strong>
     * <p>1725120000000</p>
     */
    @NameInMap("ValidStartDate")
    public String validStartDate;

    public static PageQueryWhiteListSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        PageQueryWhiteListSettingRequest self = new PageQueryWhiteListSettingRequest();
        return TeaModel.build(map, self);
    }

    public PageQueryWhiteListSettingRequest setCertNo(String certNo) {
        this.certNo = certNo;
        return this;
    }
    public String getCertNo() {
        return this.certNo;
    }

    public PageQueryWhiteListSettingRequest setCertifyId(String certifyId) {
        this.certifyId = certifyId;
        return this;
    }
    public String getCertifyId() {
        return this.certifyId;
    }

    public PageQueryWhiteListSettingRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public PageQueryWhiteListSettingRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PageQueryWhiteListSettingRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

    public PageQueryWhiteListSettingRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public PageQueryWhiteListSettingRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public PageQueryWhiteListSettingRequest setValidEndDate(String validEndDate) {
        this.validEndDate = validEndDate;
        return this;
    }
    public String getValidEndDate() {
        return this.validEndDate;
    }

    public PageQueryWhiteListSettingRequest setValidStartDate(String validStartDate) {
        this.validStartDate = validStartDate;
        return this;
    }
    public String getValidStartDate() {
        return this.validStartDate;
    }

}
