// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class PreviewGtmRecoveryPlanRequest extends TeaModel {
    /**
     * <p>The language used by the user.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on per page. Maximum value: <strong>20</strong>. Default value: <strong>5</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the disaster recovery plan that you want to preview.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RecoveryPlanId")
    public Long recoveryPlanId;

    public static PreviewGtmRecoveryPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewGtmRecoveryPlanRequest self = new PreviewGtmRecoveryPlanRequest();
        return TeaModel.build(map, self);
    }

    public PreviewGtmRecoveryPlanRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public PreviewGtmRecoveryPlanRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public PreviewGtmRecoveryPlanRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PreviewGtmRecoveryPlanRequest setRecoveryPlanId(Long recoveryPlanId) {
        this.recoveryPlanId = recoveryPlanId;
        return this;
    }
    public Long getRecoveryPlanId() {
        return this.recoveryPlanId;
    }

}
