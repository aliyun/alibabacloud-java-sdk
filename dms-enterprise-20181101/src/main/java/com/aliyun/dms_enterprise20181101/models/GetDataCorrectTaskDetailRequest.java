// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDataCorrectTaskDetailRequest extends TeaModel {
    /**
     * <p>The ID of the ticket. You can call the <a href="https://help.aliyun.com/document_detail/208388.html">CreateDataCorrectOrder</a>, <a href="https://help.aliyun.com/document_detail/208387.html">CreateDataImportOrder</a>, or <a href="https://help.aliyun.com/document_detail/208386.html">CreateFreeLockCorrectOrder</a> operation to obtain the ticket ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12435523</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>: To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a> topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>14325432</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static GetDataCorrectTaskDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDataCorrectTaskDetailRequest self = new GetDataCorrectTaskDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDataCorrectTaskDetailRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public GetDataCorrectTaskDetailRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
