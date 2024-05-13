// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataExportShrinkRequest extends TeaModel {
    /**
     * <p>The parameters that are required to perform the operation:</p>
     * <br>
     * <p>```json</p>
     * <p>{</p>
     * <p>   "fileType": "CSV", // The format of the exported file.</p>
     * <p>   "encoding": "" // The encoding format.</p>
     * <p> }</p>
     * <p>```</p>
     */
    @NameInMap("ActionDetail")
    public String actionDetailShrink;

    /**
     * <p>The ID of the ticket.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>> : To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html).</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static ExecuteDataExportShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataExportShrinkRequest self = new ExecuteDataExportShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDataExportShrinkRequest setActionDetailShrink(String actionDetailShrink) {
        this.actionDetailShrink = actionDetailShrink;
        return this;
    }
    public String getActionDetailShrink() {
        return this.actionDetailShrink;
    }

    public ExecuteDataExportShrinkRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ExecuteDataExportShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
