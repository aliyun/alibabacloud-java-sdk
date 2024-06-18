// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListFormRemarksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("formRemarkVoMap")
    public java.util.Map<String, ?> formRemarkVoMap;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
     */
    @NameInMap("vendorRequestId")
    public String vendorRequestId;

    /**
     * <strong>example:</strong>
     * <p>dingtalk</p>
     */
    @NameInMap("vendorType")
    public String vendorType;

    public static ListFormRemarksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListFormRemarksResponseBody self = new ListFormRemarksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListFormRemarksResponseBody setFormRemarkVoMap(java.util.Map<String, ?> formRemarkVoMap) {
        this.formRemarkVoMap = formRemarkVoMap;
        return this;
    }
    public java.util.Map<String, ?> getFormRemarkVoMap() {
        return this.formRemarkVoMap;
    }

    public ListFormRemarksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListFormRemarksResponseBody setVendorRequestId(String vendorRequestId) {
        this.vendorRequestId = vendorRequestId;
        return this;
    }
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    public ListFormRemarksResponseBody setVendorType(String vendorType) {
        this.vendorType = vendorType;
        return this;
    }
    public String getVendorType() {
        return this.vendorType;
    }

}
