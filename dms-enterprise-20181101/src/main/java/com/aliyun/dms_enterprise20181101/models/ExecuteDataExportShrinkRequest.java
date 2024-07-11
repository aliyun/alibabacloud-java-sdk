// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataExportShrinkRequest extends TeaModel {
    /**
     * <p>The parameters that are required to perform the operation:</p>
     * <pre><code class="language-json">{
     *    &quot;fileType&quot;: &quot;CSV&quot;, // The format of the exported file.
     *    &quot;encoding&quot;: &quot;&quot; // The encoding format.
     *  }
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{    &quot;fileType&quot;: &quot;CSV&quot;,    &quot;encoding&quot;: &quot;&quot;  }</p>
     */
    @NameInMap("ActionDetail")
    public String actionDetailShrink;

    /**
     * <p>The ID of the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RealLoginUserUid")
    public String realLoginUserUid;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>: To view the ID of the tenant, log on to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>-1</p>
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

    public ExecuteDataExportShrinkRequest setRealLoginUserUid(String realLoginUserUid) {
        this.realLoginUserUid = realLoginUserUid;
        return this;
    }
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
    }

    public ExecuteDataExportShrinkRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
