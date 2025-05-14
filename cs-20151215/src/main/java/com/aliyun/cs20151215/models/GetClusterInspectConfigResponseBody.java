// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class GetClusterInspectConfigResponseBody extends TeaModel {
    /**
     * <p>The list of disabled inspection items.</p>
     */
    @NameInMap("disabledCheckItems")
    public java.util.List<String> disabledCheckItems;

    /**
     * <p>Specifies whether to enable inspection.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enabled")
    public Boolean enabled;

    /**
     * <p>The inspection schedule defined through the RFC5545 Recurrence Rule syntax. You must specify BYHOUR and BYMINUTE. Only FREQ=DAILY is supported. COUNT and UNTIL are not supported.</p>
     * 
     * <strong>example:</strong>
     * <p>FREQ=DAILY;BYHOUR=10;BYMINUTE=15</p>
     */
    @NameInMap("recurrence")
    public String recurrence;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>49511F2D-D56A-5C24-B9AE-C8491E09B095</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetClusterInspectConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClusterInspectConfigResponseBody self = new GetClusterInspectConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClusterInspectConfigResponseBody setDisabledCheckItems(java.util.List<String> disabledCheckItems) {
        this.disabledCheckItems = disabledCheckItems;
        return this;
    }
    public java.util.List<String> getDisabledCheckItems() {
        return this.disabledCheckItems;
    }

    public GetClusterInspectConfigResponseBody setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return this.enabled;
    }

    public GetClusterInspectConfigResponseBody setRecurrence(String recurrence) {
        this.recurrence = recurrence;
        return this;
    }
    public String getRecurrence() {
        return this.recurrence;
    }

    public GetClusterInspectConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
