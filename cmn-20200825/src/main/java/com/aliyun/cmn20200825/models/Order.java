// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class Order extends TeaModel {
    // 创建时间
    @NameInMap("GmtCreate")
    public String gmtCreate;

    // 修改时间
    @NameInMap("GmtModify")
    public String gmtModify;

    // 工单id
    @NameInMap("OrderId")
    public String orderId;

    // 工单返回
    @NameInMap("Output")
    public String output;

    // 工单参数
    @NameInMap("Params")
    public String params;

    // 方案id
    @NameInMap("SchemeId")
    public String schemeId;

    // 方案名
    @NameInMap("SchemeName")
    public String schemeName;

    // 任务状态
    @NameInMap("Status")
    public String status;

    // 工单标题
    @NameInMap("Title")
    public String title;

    public static Order build(java.util.Map<String, ?> map) throws Exception {
        Order self = new Order();
        return TeaModel.build(map, self);
    }

    public Order setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public Order setGmtModify(String gmtModify) {
        this.gmtModify = gmtModify;
        return this;
    }
    public String getGmtModify() {
        return this.gmtModify;
    }

    public Order setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public Order setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

    public Order setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public Order setSchemeId(String schemeId) {
        this.schemeId = schemeId;
        return this;
    }
    public String getSchemeId() {
        return this.schemeId;
    }

    public Order setSchemeName(String schemeName) {
        this.schemeName = schemeName;
        return this;
    }
    public String getSchemeName() {
        return this.schemeName;
    }

    public Order setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Order setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
