// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCertificatesByRecordRequest extends TeaModel {
    /**
     * <p>Specifies whether to return certificate details.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Detail")
    public Boolean detail;

    /**
     * <p>The record name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("RecordName")
    public String recordName;

    /**
     * <p>The site ID. You can call the <a href="~~ListSites~~">ListSites</a> operation to query the site ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Specifies whether to return only valid certificates.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ValidOnly")
    public Boolean validOnly;

    public static ListCertificatesByRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCertificatesByRecordRequest self = new ListCertificatesByRecordRequest();
        return TeaModel.build(map, self);
    }

    public ListCertificatesByRecordRequest setDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }
    public Boolean getDetail() {
        return this.detail;
    }

    public ListCertificatesByRecordRequest setRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }
    public String getRecordName() {
        return this.recordName;
    }

    public ListCertificatesByRecordRequest setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public ListCertificatesByRecordRequest setValidOnly(Boolean validOnly) {
        this.validOnly = validOnly;
        return this;
    }
    public Boolean getValidOnly() {
        return this.validOnly;
    }

}
