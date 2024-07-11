// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteDataCorrectRequest extends TeaModel {
    /**
     * <p>The parameters that are required to perform the data change.</p>
     * <pre><code>
     * json
     * &quot;actionDetail&quot; : {
     *     &quot;startTime&quot; :&quot;2021-07-01 00:00:00&quot;, // Specify the start time to change data. If you want to immediately change data, you do not need to set this parameter. 
     *     &quot;endTime&quot; : &quot;2021-07-01 01:00:00&quot;, // Specify the end time to change data. If you want to immediately change data, you do not need to set this parameter. 
     *     &quot;transaction&quot; : false, // Specify whether to change data as a transaction. 
     *     &quot;backupData&quot; : true // Specify whether to back up data. 
     *   }
     * </code></pre>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;startTime&quot; : &quot;2021-07-01 00:00:00&quot;, &quot;endTime&quot; : &quot;2021-07-01 01:00:00&quot;, &quot;transaction&quot; : false, &quot;backupData&quot; : true }</p>
     */
    @NameInMap("ActionDetail")
    public java.util.Map<String, ?> actionDetail;

    /**
     * <p>The ID of the ticket. You can call the <a href="https://help.aliyun.com/document_detail/144643.html">ListOrders</a> operation to query the ID of the ticket.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>406****</p>
     */
    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("RealLoginUserUid")
    public String realLoginUserUid;

    /**
     * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public String tid;

    public static ExecuteDataCorrectRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteDataCorrectRequest self = new ExecuteDataCorrectRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteDataCorrectRequest setActionDetail(java.util.Map<String, ?> actionDetail) {
        this.actionDetail = actionDetail;
        return this;
    }
    public java.util.Map<String, ?> getActionDetail() {
        return this.actionDetail;
    }

    public ExecuteDataCorrectRequest setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ExecuteDataCorrectRequest setRealLoginUserUid(String realLoginUserUid) {
        this.realLoginUserUid = realLoginUserUid;
        return this;
    }
    public String getRealLoginUserUid() {
        return this.realLoginUserUid;
    }

    public ExecuteDataCorrectRequest setTid(String tid) {
        this.tid = tid;
        return this;
    }
    public String getTid() {
        return this.tid;
    }

}
