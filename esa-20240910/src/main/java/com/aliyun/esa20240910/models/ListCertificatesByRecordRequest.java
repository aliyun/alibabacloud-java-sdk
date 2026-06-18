// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListCertificatesByRecordRequest extends TeaModel {
    /**
     * <p>Specifies whether to return certificate details. A value of <code>1</code> includes certificate details, whereas a value of <code>0</code> excludes them.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
     * <p>The site ID. To obtain this ID, call the <a href="~~ListSites~~">ListSites</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Specifies whether to return only valid certificates. A value of <code>1</code> returns only valid certificates, whereas <code>0</code> returns all matching certificates.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
