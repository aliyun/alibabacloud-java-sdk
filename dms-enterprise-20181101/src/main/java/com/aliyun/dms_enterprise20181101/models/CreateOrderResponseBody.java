// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CreateOrderResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("CreateOrderResult")
    public CreateOrderResponseBodyCreateOrderResult createOrderResult;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>## PluginParam parameter</p>
     * <br>
     * <p>```</p>
     * <br>
     * <p># Change a schema design.</p>
     * <p> {</p>
     * <p>    "title": "test", // The name of the ticket.</p>
     * <p>    "description": "test", // The description of the ticket.</p>
     * <p>    "dbId": 11****, // The database to which changes are made.</p>
     * <p>    "logic": false, // Specifies whether the database is a logical database.</p>
     * <p>    "relatedIds": [], // The IDs of the stakeholders that are involved in the ticket.</p>
     * <p>  }</p>
     * <br>
     * <p># Export data.</p>
     * <p> {</p>
     * <p>  "classify": "Reason", // The purpose of the ticket.</p>
     * <p>  "dbId": 17****, // The ID of the database from which data is exported.</p>
     * <p>  "exeSQL": "select 1", // The SQL statement that is executed to export data.</p>
     * <p>  "logic": false, // Specifies whether the database is a logical database.</p>
     * <p>  "ignoreAffectRows": false, // Specifies whether to ignore the affected rows.</p>
     * <p>  "affectRows": 1, // The estimated number of affected rows.</p>
     * <p>  "ignoreAffectRowsReason": "" // The reason for ignoring the affected rows.</p>
     * <p> }</p>
     * <br>
     * <p>If you need to create more types of tickets, submit a ticket for consultation. </p>
     * <p>```</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponseBody self = new CreateOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponseBody setCreateOrderResult(CreateOrderResponseBodyCreateOrderResult createOrderResult) {
        this.createOrderResult = createOrderResult;
        return this;
    }
    public CreateOrderResponseBodyCreateOrderResult getCreateOrderResult() {
        return this.createOrderResult;
    }

    public CreateOrderResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateOrderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateOrderResponseBodyCreateOrderResult extends TeaModel {
        @NameInMap("OrderIds")
        public java.util.List<Long> orderIds;

        public static CreateOrderResponseBodyCreateOrderResult build(java.util.Map<String, ?> map) throws Exception {
            CreateOrderResponseBodyCreateOrderResult self = new CreateOrderResponseBodyCreateOrderResult();
            return TeaModel.build(map, self);
        }

        public CreateOrderResponseBodyCreateOrderResult setOrderIds(java.util.List<Long> orderIds) {
            this.orderIds = orderIds;
            return this;
        }
        public java.util.List<Long> getOrderIds() {
            return this.orderIds;
        }

    }

}
