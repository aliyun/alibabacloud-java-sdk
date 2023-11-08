// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class ListFormRemarksResponseBody extends TeaModel {
    @NameInMap("formRemarkVoMap")
    public java.util.Map<String, ?> formRemarkVoMap;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("vendorRequestId")
    public String vendorRequestId;

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
